package medium;

import com.sun.jdi.Value;

import java.util.Objects;
import java.util.Stack;

/**
 * Given a balanced parentheses string s, return the score of the string.
 * The score of a balanced parentheses string is based on the following rule:
 * "()" has score 1.
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 */
public class _856_ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        // return solution_2(s);
        return solution_1(s);
    }

    private int solution_2(String s) {
        String str = s.replace("()", "1");

        Stack<String> stack = new Stack<>();
        int score = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push("(");
            } else {
                int innerScore = 0;
                // ')' or numbers
                if (str.charAt(i) == ')') {
                    while (stack.peek() != "(") {
                        innerScore += Integer.parseInt(stack.peek());
                        stack.pop();
                    }
                    stack.pop(); //"("
                    stack.push(String.valueOf(2 * innerScore));
                } else {
                    stack.push(str.substring(i, i + 1));
                }
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == "(") {
                score *= score;
            } else {
                score += Integer.parseInt(stack.peek());
                stack.pop();
            }
        }

        return score;
    }

    private int solution_1(String s) {
        // stack
        Stack<String> stack = new Stack<>();
        int score = 0;

        //"(()(()))" => "(1(1))"
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");    // ((   => (1((
            } else {
                // read a ')' => check the top of stack for scoring
                if (stack.peek() == "(") {
                    // 1. top of stack == '(', replace the top of stack into 1
                    stack.pop();
                    stack.push("1");    // (1   => (1(1
                } else {
                    // 2. top of stack == ')', it's like (*(***)) => there is/are number(s) between after a '('
                    // remove the top of stack after adding it
                    int innerScore = 0;
                    while (stack.peek() != "(") {       // (1(1)
                        innerScore += Integer.parseInt(stack.peek());    // innerScore = 1, (1(
                        stack.pop();
                    }
                    // replace '(' by the value twice of the inner score
                    stack.pop();                                        // (1
                    stack.push(String.valueOf(2 * innerScore));                 // (12
                }
            }
        }
        // calculate stack again    (12
        while (!stack.isEmpty()) {
            if (stack.peek() != "(") {
                score += Integer.parseInt(stack.peek());
                stack.pop();
            } else {
                score *= 2;
            }
        }
        return score;
    }
}
