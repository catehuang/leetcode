package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 *
 * An integer x. Record a new score of x.
 * '+'. Record a new score that is the sum of the previous two scores.
 * 'D'. Record a new score that is the double of the previous score.
 * 'C'. Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 *
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 */
public class _682_BaseballGame {
    public int calPoints(String[] operations) {
        List<String> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].matches("[-]?[\\d]+")) {
                result.add(operations[i]);
            } else if (operations[i].equals("C")) {
                result.remove(result.size() - 1);
            } else if (operations[i].equals("D")) {
                int t = Integer.parseInt(result.get(result.size() - 1)) * 2;
                result.add(String.valueOf(t));
            } else if (operations[i].equals("+")) {
                int s = Integer.parseInt(result.get(result.size() - 1)) + Integer.parseInt(result.get(result.size() - 2));
                result.add(String.valueOf(s));
            }
        }

        for (String s: result) {
            sum += Integer.parseInt(s);
        }
        return sum;
        //return solutionSlow(operations);
    }

    private int solutionSlow(String[] operations) {
        // walk through all items
        // stack would be a good choice
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                if (i > 0) {
                    result.pop();
                }
            } else if (operations[i].equals("D")) {
                if (i > 0) {
                    result.add(2 * (int) result.peek());
                }
            } else if (operations[i].equals("+")) {
                int current = (int) result.pop();
                int prev = (int) result.pop();;
                result.push(prev);
                result.push((current));
                result.push(current + prev);
            } else if (operations[i].matches("[-]?[\\d]+")) {
                result.push(Integer.parseInt(operations[i]));
            }
        }
        return sum(result);
    }

    private int sum(Stack<Integer> result) {
        if (result.isEmpty()) {
            return 0;
        }
        return (int) result.pop() + sum(result);
    }
}
