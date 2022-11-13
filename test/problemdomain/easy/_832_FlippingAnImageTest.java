package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _832_FlippingAnImageTest {

    _832_FlippingAnImage flippingAnImage;

    @BeforeEach
    public void setUp() {
        flippingAnImage = new _832_FlippingAnImage();
    }

    @Test
    public void flipAndInvertImage_case_1() throws Exception {
        int[][] image = new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] expected = new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        assertTrue(Arrays.deepEquals(expected, flippingAnImage.flipAndInvertImage(image)));
    }

    @Test
    public void flipAndInvertImage_case_() throws Exception {
        int[][] image = new int[][] {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        int[][] expected = new int[][] {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        };
        assertTrue(Arrays.deepEquals(expected, flippingAnImage.flipAndInvertImage(image)));
    }
}