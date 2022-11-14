package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Given an array of intervals where intervals[i] = [starti, endi],
 * merge all overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 */
public class _56_MergeIntervals {
    public int[][] merge(int[][] intervals) {

        //return solution_1_slower_less_memory(intervals);
        return solution_2_faster_more_memory(intervals);

    }

    private int[][] solution_2_faster_more_memory(int[][] intervals) {
        // faster than 83% of solutions, but use more memory (only beats 30% of solutions)
        final int NUMBER_OF_INTERVALS = intervals.length;

        ArrayList<Character> band = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        // walk through all intervals
        for (int j = 0; j < NUMBER_OF_INTERVALS; j++) {
            // to mark the position and find out effective range
            for (int i = intervals[j][0]; i <= intervals[j][1]; i++) {
                if (intervals[j][0] < start) {
                    start = intervals[j][0];
                }
                if (intervals[j][1] > end) {
                    end = intervals[j][1];
                }
                fillBand(band, end);
                if (intervals[j][0] == intervals[j][1]) {
                    if (band.get(i) == '0') {
                        band.set(i, '-');
                    }
                }
                else {
                    if (i == intervals[j][1]) {
                        // override character in the middle of serial 1
                        if (band.get(i) == '0') {
                            band.set(i, '-');
                        }
                    } else {
                        band.set(i, '1');
                    }
                }
            }
        }
        boolean isStarted = true;
        int intervalStart = start;
        int intervalEnd = 0;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (band.get(num) == '1') {
                if (!isStarted) {
                    isStarted = true;
                    intervalStart = num;
                }
            }
            if (band.get(num) == '-') {
                if (isStarted) {
                    isStarted = false;
                } else {
                    // the start and end at the same point
                    intervalStart = num;
                }
                intervalEnd = num;
                tmp.add(new int[] {intervalStart, intervalEnd});
            }
        }

        int[][] result = new int[tmp.size()][2];
        for (int i = 0; i < tmp.size(); i++) {
            result[i] = tmp.get(i);
        }
        return result;
    }

    private int[][] solution_1_slower_less_memory(int[][] intervals) {
        // Method 1 - slower than 95% of solutions but less memory (beats 97% of solutions)

        final int NUMBER_OF_INTERVALS = intervals.length;
        int[] tmp = new int[2];

        // sort intervals by the lower number
        tmp = intervals[0];
        for (int j = 0; j < NUMBER_OF_INTERVALS - 1; j++) {
            for (int i = j + 1; i < NUMBER_OF_INTERVALS; i++) {
                if (intervals[j][0] > intervals[i][0]) {
                    tmp = intervals[j];
                    intervals[j] = intervals[i];
                    intervals[i] = tmp;
                }
            }
        }

        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        boolean isAdded = false;
        for (int i = 1; i < NUMBER_OF_INTERVALS; i++) {
            // overlapping?
            // if yes, merge them. then replace the range (start and end)
            if (intervals[i][0] <= end && intervals[i][0] >= start ||
                    intervals[i][1] <= end && intervals[i][1] >= start ||
                    intervals[i][0] <= end && intervals[i][1] >= end ||
                    intervals[i][0] >= start && intervals[i][1] <= end) {
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }
            else {
                // not overlapping? good! put previous range into list
                list.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // add the last range
        list.add(new int[]{start, end});
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void fillBand(ArrayList<Character> band, int end) {
        if (band.size() < end + 1) {
            for (int i = band.size(); i < end + 1; i++) {
                band.add('0');
            }
        }
    }
}
