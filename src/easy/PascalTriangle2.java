package easy;

import java.util.ArrayList;
import java.util.List;

/** Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *  Constraints:
 *      0 <= rowIndex <= 33
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        getElementEachLayer(list, rowIndex, 0);

        return list;
    }

    private void getElementEachLayer( List<Integer> list, int rowIndex, int counter) {
        if (counter == 0)
            list.add(1);

        if (counter < rowIndex)
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
                counter++;
            }

            getElementEachLayer(list, rowIndex, counter);
        }
    }
}
