package easy;

import java.util.ArrayList;
import java.util.List;

/** Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *  Constraints:
 *      0 <= rowIndex <= 33
 */
public class _119_PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        while (list.size() < rowIndex + 1)
        {
            int prev = 1, next = 0;
            // replace items in original list
            for (int i = 0; i < list.size() - 1; i++)
            {
                next = list.get(i + 1);
                list.set(i + 1, prev + list.get(i + 1));
                prev = next;
            }
            list.add(1);
            // add the last item which is always zero
        }

        return list;
    }
}
