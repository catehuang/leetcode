package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi]
 * represent the start and the end of the ith interval and intervals is sorted in ascending order by starti.
 * You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and
 * intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 */
public class _57_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // combine all intervals with sorting
        int[][] allIntervals = new int[intervals.length + 1][2];
        int counter = 0;
        boolean done = false;
        for (int i = 0; i < allIntervals.length; i++)
        {
            if (done)
            {
                allIntervals[i] = intervals[counter];
                counter++;
            }
            else
            {
                if (counter < intervals.length && intervals[counter][0] < newInterval[0])
                {
                    allIntervals[i] = intervals[counter];
                    counter++;
                }
                else
                {
                    allIntervals[i] = newInterval;
                    done = true;
                }
            }
        }
        // store intervals
        List<List<Integer>> lists = new ArrayList<>();

        // walk through all intervals
        for (int[] interval: allIntervals)
        {
            if (lists.isEmpty())
            {
                lists.add(Arrays.asList(interval[0], interval[1]));
            }
            else
            {
                // compare current interval to the last interval of lists
                int prev_min = lists.get(lists.size() - 1).get(0);
                int prev_max = lists.get(lists.size() - 1).get(1);
                // the start of the current interval > the end of the previous interval of the lists => non-overlapping
                // => add current interval into lists
                if (interval[0] > prev_max)
                {
                    lists.add(Arrays.asList(interval[0], interval[1]));
                }
                else
                // overlapping => update the range
                {
                    int min = Math.min(prev_min, interval[0]);
                    int max = Math.max(prev_max, interval[1]);
                    lists.remove(lists.size() - 1);
                    lists.add(Arrays.asList(min, max));
                }
            }
        }

        int[][] result = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++)
        {
            result[i] = new int[] {lists.get(i).get(0), lists.get(i).get(1)};
        }

        return result;
    }
}
