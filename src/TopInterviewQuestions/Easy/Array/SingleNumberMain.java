package topinterviewquestions.easy.array;

/* Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * You must implement a solution with a linear runtime complexity
 * and use only constant extra space.
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */

import java.util.Arrays;

class SingleNumberMain {

    public static void main(String[] args) {
        SingleNumberMain task = new SingleNumberMain();
        int[] input = new int[]{4, 1, 2, 1, 2};
        System.out.println("Single number: " + task.singleNumber(input));
        input = new int[]{2, 2, 1};
        System.out.println("Single number: " + task.singleNumber(input));
    }

    public int singleNumber(int[] nums) {
        System.out.println("Input: " + Arrays.toString(nums));

        /* Simple algorithmic solution for sorted array */
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i += 2) {
//            if (nums[i] != nums[i + 1]) {
//                return nums[i];
//            }
//        }
//        return nums[nums.length - 1];

        /* Solution with XOR */
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}