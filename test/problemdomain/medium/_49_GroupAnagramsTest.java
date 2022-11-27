package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class _49_GroupAnagramsTest {

    _49_GroupAnagrams groupAnagrams;

    @BeforeEach
    public void setUp() {
        groupAnagrams = new _49_GroupAnagrams();
    }

    @Test
    public void groupAnagrams_case_1() throws Exception {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> outputs = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        item1.add("bat");
        outputs.add(item1);

        List<String> item2 = new ArrayList<>();
        item2.add("nat");
        item2.add("tan");
        outputs.add(item2);

        List<String> item3 = new ArrayList<>();
        item3.add("ate");
        item3.add("eat");
        item3.add("tea");
        outputs.add(item3);

        List<List<String>> results = groupAnagrams.groupAnagrams(strs);
        for (List<String> list: results) {
            Collections.sort(list);
        }

        assertFalse(!equalsHelper(outputs, results));

    }

    private boolean equalsHelper(List<List<String>> one, List<List<String>> two) {
        for (int i = 0; i < one.size(); i++) {
            boolean isEqaul = false;
            for (int j = 0; j < two.size(); j++) {
                if (one.get(i).equals(two.get(j))) {
                    two.remove(one.get(i));
                    isEqaul = true;
                }
            }
            if (!isEqaul) {
                return false;
            }
        }
        return true;
    }

    private boolean equalsLists(List<String> one, List<String> two) {
        if (one == null && two == null) {
            return true;
        }
        // check size
        if (one.size() != two.size()) {
            return false;
        }

        // sort lists then compare
        Collections.sort(one);
        Collections.sort(two);
        return one.equals(two);
    }


    @Test
    public void groupAnagrams_case_2() throws Exception {
        String[] strs = {};
        List<List<String>> outputs = new ArrayList<>();
        assertEquals(outputs, groupAnagrams.groupAnagrams(strs));
    }

    @Test
    public void groupAnagrams_case_3() throws Exception {
        String[] strs = {"a"};
        List<List<String>> outputs = new ArrayList<>();
        List<String> item = new ArrayList<>();
        item.add("a");
        outputs.add(item);
        assertEquals(outputs, groupAnagrams.groupAnagrams(strs));
    }
}