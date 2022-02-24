package topinterviewquestions.easy.array.singlenumber;

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

class Solution {

    public static void main(String[] args) {
        Solution task = new Solution();
        int[] input = new int[]{4, 1, 2, 1, 2};
        System.out.println(task.singleNumber(input));
        input = new int[]{2, 2, 1};
        System.out.println(task.singleNumber(input));
    }


    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}