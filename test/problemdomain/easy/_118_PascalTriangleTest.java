package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    _118_PascalTriangle pascalTriangle;

    @BeforeEach
    void setUp() {
        this.pascalTriangle = new _118_PascalTriangle();
    }

    @AfterEach
    void tearDown() {
        this.pascalTriangle = null;
    }

    @Test
    void testcase1() {
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        expected.add(new ArrayList(list));
        assertEquals(expected, this.pascalTriangle.generate(1));
    }

    @Test
    void testcase2() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        expected.add(new ArrayList(list));

        list.add(1);
        expected.add(new ArrayList(list));
        assertEquals(expected, this.pascalTriangle.generate(2));
    }

    @Test
    void testcase3() {
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        expected.add(new ArrayList(list));
        list.add(1);
        expected.add(new ArrayList(list));
        list.clear();
        list.add(1);
        list.add(2);
        list.add(1);
        expected.add(new ArrayList(list));
        assertEquals(expected, this.pascalTriangle.generate(3));
    }

    @Test
    void testcase5() {
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr3 = {1, 2, 1};
        int[] arr4 = {1, 3, 3, 1};
        int[] arr5 = {1, 4, 6, 4, 1};
        list.add(1);
        expected.add(new ArrayList(list));

        list.clear();
        list.add(1);
        list.add(1);
        expected.add(new ArrayList(list));

        list.clear();
        for (int i = 0; i < arr3.length; i++)
        {
            list.add(arr3[i]);
        }
        expected.add(new ArrayList(list));

        list.clear();
        for (int i = 0; i < arr4.length; i++)
        {
            list.add(arr4[i]);
        }
        expected.add(new ArrayList(list));

        list.clear();
        for (int i = 0; i < arr5.length; i++)
        {
            list.add(arr5[i]);
        }
        expected.add(new ArrayList(list));
        assertEquals(expected, this.pascalTriangle.generate(5));
    }
}