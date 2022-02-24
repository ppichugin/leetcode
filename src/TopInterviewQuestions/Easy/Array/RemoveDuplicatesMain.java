package topinterviewquestions.easy.array;

/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 */

import java.util.Arrays;

class RemoveDuplicatesMain {

    public static void main(String[] args) {
        RemoveDuplicatesMain task = new RemoveDuplicatesMain();
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = task.removeDuplicates(input);
        System.out.println(result);
        input = new int[]{1, 1};
        result = task.removeDuplicates(input);
        System.out.println(result);
        input = new int[]{1, 2, 2};
        result = task.removeDuplicates(input);
        System.out.println(result);
        input = new int[]{1, 1, 2, 2};
        result = task.removeDuplicates(input);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        System.out.println("Input: " + Arrays.toString(nums));
        int uniqueNums = nums.length;
        int pointer;
        for (int i = 0; i < uniqueNums - 1; i++) {
            pointer = 0;
            while (pointer + i < nums.length && nums[i] == nums[pointer + i]) {
                pointer++;
            }
            if (pointer == 0) continue;
            int lengthToShift = uniqueNums - pointer - i;
            int srcPosition = pointer + i;
            int desPosition = i + 1;
            System.arraycopy(nums, srcPosition, nums, desPosition, lengthToShift);
            uniqueNums = uniqueNums - (pointer - 1);
            int startPosition = uniqueNums;
            int toIndex = startPosition + pointer-1;
            Arrays.fill(nums, startPosition, toIndex, -200);
        }
        System.out.println(Arrays.toString(nums));
        return uniqueNums;
    }

    // Solution #2
//    public int removeDuplicates(int[] nums) {
//        System.out.println("Input: " + Arrays.toString(nums));
//        if (nums.length == 0) return 0;
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        System.out.println("Output: " + Arrays.toString(nums));
//        return i + 1;
//    }
}
