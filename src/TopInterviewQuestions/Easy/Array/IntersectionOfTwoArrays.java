package topinterviewquestions.easy.array;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Constraints:
 *   1 <= nums1.length, nums2.length <= 1000
 *   0 <= nums1[i], nums2[i] <= 1000
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        int[] array = new int[]{1, 2, 2, 1};
        int[] array2 = new int[]{2, 2};
        System.out.println(Arrays.toString(solution.intersect(array, array2)));

        array = new int[]{4, 9, 5};
        array2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersect(array, array2)));

        array = new int[]{3, 1, 2};
        array2 = new int[]{1, 1};
        System.out.println(Arrays.toString(solution.intersect(array, array2)));

        array = new int[]{1, 2, 2, 1};
        array2 = new int[]{1, 1, 2};
        System.out.println(Arrays.toString(solution.intersect(array, array2)));

        array = new int[]{61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64,
                46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54,
                44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60,
                10, 55, 66, 82, 0, 79, 11, 8161, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12,
                86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41,
                53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92,
                31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81};
        array2 = new int[]{5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48};
        System.out.println(Arrays.toString(solution.intersect(array, array2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        System.out.println("INPUT: " + Arrays.toString(nums1) + " & " + Arrays.toString(nums2));
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] smallerArray;
        int[] biggerArray;
        if (nums1.length <= nums2.length) {
            smallerArray = nums1;
            biggerArray = nums2;
        } else {
            smallerArray = nums2;
            biggerArray = nums1;
        }
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int k : smallerArray) {
            for (int j = 0; j < biggerArray.length; j++) {
                if (k == biggerArray[j] && !tempMap.containsKey(j)) {
                    tempMap.put(j, biggerArray[j]);
                    break;
                }
            }
        }
        return tempMap.values().stream().mapToInt(i -> i).toArray();
    }
}