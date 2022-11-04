package easy;

import java.util.ArrayList;
import java.util.List;

/** Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 */
public class _118_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if (numRows == 0)
            return null;

        list.add(1);

        getElementEachLayer(result, list, numRows, 1);

        return result;
    }

    private void getElementEachLayer(List<List<Integer>> result, List<Integer> list, int numRows, int counter) {
        if (counter < numRows + 1)
        {
            if (counter > 1)
            {
                int prev = 0, next = 0;
                for ( int i = 0; i < list.size() - 1; i++ )
                {
                    next = list.get(i + 1);
                    if (i == 0)
                        list.set(i + 1, list.get(i) + list.get(i + 1));
                    else
                        list.set(i + 1, prev + list.get(i + 1));
                    prev = next;
                }
                list.add(1);

            }
            result.add(new ArrayList(list));
            counter++;
            getElementEachLayer(result, list, numRows, counter);
        }
    }
}
