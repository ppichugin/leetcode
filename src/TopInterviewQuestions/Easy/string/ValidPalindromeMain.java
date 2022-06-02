package topinterviewquestions.easy.string;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Constraints:
 * 1 <= s.length <= 2 * 10^5
 * s consists only of printable ASCII characters.
 */

public class ValidPalindromeMain {
    public static void main(String[] args) {
        ValidPalindromeMain checkString = new ValidPalindromeMain();
        String s = "A man, a plan, a canal: Panama";
        System.out.println("String: '" + s + "' is palindrome? " + checkString.isPalindrome(s));
        s = "race a car";
        System.out.println("String: '" + s + "' is palindrome? " + checkString.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        StringBuilder buf = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isAlphaNum(c)) {
                buf.append(lowerCase(c));
            }
        }
        String input = buf.toString();
        String reversed = buf.reverse().toString();
        return input.equals(reversed);
    }

    private boolean isAlphaNum(char c) {
        return (48 <= c && c <= 57) || (65 <= c && c <= 90) || (97 <= c && c <= 122);
    }

    private char lowerCase(char c) {
        if (65 <= c && c <= 90) {
            return (char) (c + 32);
        } else {
            return c;
        }
    }
}
