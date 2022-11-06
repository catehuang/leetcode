package easy;

import medium.easy._119_PascalTriangle2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _119_PascalTriangle2Test {

    _119_PascalTriangle2 pascalTriangle;

    @BeforeEach
    void setUp() {
        this.pascalTriangle = new _119_PascalTriangle2();
    }

    @AfterEach
    void tearDown() {
        this.pascalTriangle = null;
    }

    @Test
    void testcase0() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, this.pascalTriangle.getRow(0));
    }

    @Test
    void testcase1() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, this.pascalTriangle.getRow(1));
    }

    @Test
    void testcase2() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, this.pascalTriangle.getRow(2));
    }


    @Test
    void testcase3() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, this.pascalTriangle.getRow(3));
    }

    @Test
    void testcase4() {
        ArrayList<Integer> expected = new ArrayList<>();
        int[] arr5 = {1, 4, 6, 4, 1};

        for (int i = 0; i < arr5.length; i++)
        {
            expected.add(arr5[i]);
        }
        assertEquals(expected, this.pascalTriangle.getRow(4));
    }
}