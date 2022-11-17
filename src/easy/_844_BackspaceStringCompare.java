package easy;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given two strings s and t, return true if they are equal
 * when both are typed into empty text editors. '#' means a backspace character.
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class _844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return solution_arrayList(s, t);
        //return solution_stack(s, t);
    }

    private boolean solution_arrayList(String s, String t) {
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();

        l1 = executeString(s, l1);
        l2 = executeString(t, l2);

        if (l1.size() != l2.size()) {
            return false;
        }

        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != l2.get(i)) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Character> executeString(String str, ArrayList<Character> l) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (l.size() > 0) {
                    l.remove(l.size() - 1);
                }
            } else {
                l.add(str.charAt(i));
            }
        }
        return l;
    }

    private boolean solution_stack(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        stack1 = createStack(s, stack1);
        stack2 = createStack(t, stack2);
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.peek() != stack2.peek()) {
                return false;
            }
            stack1.pop();
            stack2.pop();
        }
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private Stack<Character> createStack(String str, Stack<Character> stack) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        return stack;
    }
}
