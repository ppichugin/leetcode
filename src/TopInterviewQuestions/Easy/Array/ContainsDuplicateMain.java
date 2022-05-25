package topinterviewquestions.easy.array;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateMain {

    public static void main(String[] args) {
        ContainsDuplicateMain duplicates = new ContainsDuplicateMain();
        System.out.println(duplicates.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(duplicates.containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(duplicates.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public boolean containsDuplicate(int[] nums) {
        boolean result = false; // assuming every element is distinct
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            result = !(integerSet.add(num));
            if (result) {
                break;
            }
        }
        return result;
    }
}
