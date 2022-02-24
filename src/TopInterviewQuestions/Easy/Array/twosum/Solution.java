package topinterviewquestions.easy.array.twosum;

/* Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution task = new Solution();

        System.out.println("1st TASK.");
        int[] input = {2, 7, 11, 15};
        int target = 18;
        int[] output = task.twoSum(input, target);
        task.printResults(input, output, target);

        System.out.println("2nd TASK.");
        input = new int[]{3, 2, 4};
        target = 6;
        output = task.twoSum(input, target);
        task.printResults(input, output, target);

        System.out.println("3rd TASK.");
        input = new int[]{3, 3};
        output = task.twoSum(input, 6);
        task.printResults(input, output, 6);

        System.out.println("4th TASK.");
        input = new int[]{-1, -2, -3, -4, -5};
        target = -8;
        output = task.twoSum(input, target);
        task.printResults(input, output, target);
    }

    public int[] twoSum(int[] nums, int target) {
        //Single through pass
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int supposedNumber = target - nums[i];
            if (hashMap.containsKey(supposedNumber)) {
                return new int[]{hashMap.get(supposedNumber), i};
            }
            hashMap.put(nums[i], i);
        }


//        Two through pass
//        for (int i = 1; i < nums.length; i++) {
//            indices[0] = i - 1;
//            final int number1 = nums[i - 1];
//            final int number2 = target - number1;
//            System.out.print("1st Number: " + number1 + ". Looking for 2nd number: " + number2);
//            for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
//                if (pair.getValue() == number2 && pair.getKey() != indices[0]) {
//                    System.out.println(" - Found by index: " + pair.getKey());
//                    indices[1] = pair.getKey();
//                    return indices;
//                }
//            }
//            System.out.println(" - Not exist.");
//        }

//        // brute force solution
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target == nums[i] + nums[j]) {
//                    indices[0] = i;
//                    indices[1] = j;
//                    return indices;
//                }
//            }
        return new int[]{-1, -1};
    }

    private void printResults(int[] inputs, int[] output, int target) {
        System.out.println("Input: " + Arrays.toString(inputs) + " \nTarget: " + target);
        System.out.println("Output: " + Arrays.toString(output));
        System.out.println();
    }
}