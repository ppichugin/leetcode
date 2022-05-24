package topinterviewquestions.easy.array;

import java.util.Arrays;

/*
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the i(th) digit of the integer.
 * The digits are ordered from most significant to the least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */

public class PlusOneMain {

    public static void main(String[] args) {
        PlusOneMain plusOneMain = new PlusOneMain();
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{8, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{9, 9})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{9, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOneMain.plusOne(new int[]{9, 8, 9})));
    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] result = new int[length];
        int decimalDigit = 0;
        boolean isCalculate = true;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 0) {
                return null;
            }
            int currentDigit = digits[i] + decimalDigit;
            decimalDigit = 0;
            int newDigit = isCalculate ? currentDigit + 1 : currentDigit;
            if (newDigit > 9) {
                decimalDigit = 1;
                newDigit -= 10;
            }
            isCalculate = false;
            result[i] = newDigit;
            if (decimalDigit == 1 && i == 0) {
                int[] newArray = new int[result.length + 1];
                System.arraycopy(result, 0, newArray, 1, result.length);
                newArray[0] = decimalDigit;
                result = newArray;
            }
        }
        return result;
    }
}
