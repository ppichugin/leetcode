package topinterviewquestions.easy.string;

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * s[i] is a printable ascii character.
 */

public class ReverseStringMain {
    public static void main(String[] args) {
        ReverseStringMain string = new ReverseStringMain();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        string.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
