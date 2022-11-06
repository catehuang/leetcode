package easy;

import medium.easy._70_ClimbingStairs;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _70_ClimbingStairsTest {

    private _70_ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        this.climbingStairs = new _70_ClimbingStairs();
    }

    @AfterEach
    void tearDown() {
        this.climbingStairs = null;
    }

    @Test
    void testcase1() {
        int n = 1;
        int expected = 1;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase2() {
        int n = 2;
        int expected = 2;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase3() {
        int n = 3;
        int expected = 3;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase4() {
        int n = 15;
        int expected = 987;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase5() {
        int n = 25;
        int expected = 121393;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase6() {
        int n = 40;
        int expected = 165580141;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase7() {
        int n = 44;
        int expected = 1134903170;

        assertEquals(expected, this.climbingStairs.climb(n));
    }

    @Test
    void testcase8() {
        int n = 45;
        int expected = 1836311903;

        assertEquals(expected, this.climbingStairs.climb(n));
    }
}