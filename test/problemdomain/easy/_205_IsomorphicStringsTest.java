package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _205_IsomorphicStringsTest {

    _205_IsomorphicStrings isomorphicStrings;

    @BeforeEach
    public void setUp() {
        isomorphicStrings = new _205_IsomorphicStrings();
    }

    @Test
    public void isIsomorphic_case_1() throws Exception {
        String s = "egg";
        String t = "add";
        boolean expected = true;
        assertEquals(expected, isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void isIsomorphic_case_2() throws Exception {
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        assertEquals(expected, isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void isIsomorphic_case_3() throws Exception {
        String s = "paper";
        String t = "title";
        boolean expected = true;
        assertEquals(expected, isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void isIsomorphic_case_4() throws Exception {
        String s = "ppaper"; //paer
        String t = "tittle"; //tole
        boolean expected = false;
        assertEquals(expected, isomorphicStrings.isIsomorphic(s, t));
    }
}