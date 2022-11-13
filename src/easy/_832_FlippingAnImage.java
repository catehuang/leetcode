package easy;

/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 */
public class _832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int j = 0; j < image.length; j++) {
            for (int i = 0; i < image[0].length / 2; i++) {
                // two different value items switch and reverse => the values of items are the same as the values before they got switched and reverse
                if (image[j][i] == image[j][image[0].length - 1 - i]) {
                    image[j][i] = (image[j][i] + 1) % 2;
                    image[j][image[0].length - 1 - i] = (image[j][image[0].length - 1 - i] + 1) % 2;
                }
            }
            // the middle one
            if (image[0].length % 2 != 0) {
                image[j][image[0].length / 2] = (image[j][image[0].length / 2] + 1) % 2;
            }
        }
        return image;
    }
}
