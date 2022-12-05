package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _893_GroupsOfSpecialEquivalentStringsTest {

    _893_GroupsOfSpecialEquivalentStrings groupsOfSpecialEquivalentStrings;

    @BeforeEach
    public void setUp() {
        groupsOfSpecialEquivalentStrings = new _893_GroupsOfSpecialEquivalentStrings();
    }

    @Test
    public void numSpecialEquivGroups_case_1() throws Exception {
        String[] words = {"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        int expected = 3;
        assertEquals(expected, groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(words));
    }

    @Test
    public void numSpecialEquivGroups_case_2() throws Exception {
        String[] words = {"abc","acb","bac","bca","cab","cba"};
        int expected = 3;
        assertEquals(expected, groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(words));
    }
}