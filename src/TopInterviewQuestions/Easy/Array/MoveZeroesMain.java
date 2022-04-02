package topinterviewquestions.easy.array;
/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */

import java.util.Arrays;

public class MoveZeroesMain {

    public static void main(String[] args) {
        MoveZeroesMain moveZeroes = new MoveZeroesMain();
        int[] array = new int[]{0, 1, 0, 3, 12};
        int[] array2 = new int[]{0};
        int[] array3 = new int[]{1, 0};
        moveZeroes.moveZeroes(array);
        System.out.println(Arrays.toString(array));
        moveZeroes.moveZeroes(array2);
        System.out.println(Arrays.toString(array2));
        moveZeroes.moveZeroes(array3);
        System.out.println(Arrays.toString(array3));

    }

    public void moveZeroes(int[] nums) {
        System.out.println("Input: " + Arrays.toString(nums));
        final int length = nums.length;
        if (length == 1) {
            return;
        }
        int nextNonZero;
        int currentNonZero = 0;
        while (currentNonZero < length) {
            if (nums[currentNonZero] == 0) {
                nextNonZero = findFirstNonZero(nums, currentNonZero+1);
                if (nextNonZero == -1) break;
                swapElements(nums, currentNonZero, nextNonZero);
            }
            currentNonZero++;
        }
    }

    private int findFirstNonZero(int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    private void swapElements(int[] nums, int first, int second) {
        System.out.print("Swapping elements: " + first + " & " + second);
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        System.out.println(" -> " + Arrays.toString(nums));
    }
}
