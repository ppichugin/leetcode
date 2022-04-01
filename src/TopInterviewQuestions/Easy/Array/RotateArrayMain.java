package topinterviewquestions.easy.array;

import java.util.Arrays;

public class RotateArrayMain {

    public static void main(String[] args) {
        RotateArrayMain solutionTry = new RotateArrayMain();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] array2 = new int[]{-1, -100, 3, 99};
        solutionTry.rotate(array, 3);
        solutionTry.rotate(array2, 2);
    }

    public void rotate(int[] nums, int k) {
        final int length = nums.length;
        k %= length;
        System.out.println("INPUT: " + Arrays.toString(nums));
        int[] tempArray = new int[length];
        System.arraycopy(nums, length - k, tempArray, 0, k);
        System.arraycopy(nums, 0, tempArray, k, length - k);
        System.arraycopy(tempArray, 0, nums, 0, length);
        System.out.println("OUTPUT" + Arrays.toString(nums));
    }
}