package topinterviewquestions.easy.string;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned)!
 *
 * Constraints:
 * -2^31 <= x <= 2^31 - 1
 *
 */

public class ReverseIntegerMain {
    public static void main(String[] args) {
        ReverseIntegerMain reverseInt = new ReverseIntegerMain();
        System.out.println(reverseInt.reverse(123));
        System.out.println(reverseInt.reverse(-3001));
        System.out.println(reverseInt.reverse(120));
    }

    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = x * -1;
        }
        int reverse = 0;
        int lastDigit;
        while (x >= 1) {
            lastDigit = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverse = reverse * 10 + lastDigit;
        }
        return isNegative ? reverse * -1 : reverse;
    }
}
