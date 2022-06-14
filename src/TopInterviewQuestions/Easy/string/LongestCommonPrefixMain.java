package topinterviewquestions.easy.string;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 *  Example 1:
 *
 *  Input: strs = ["flower","flow","flight"]
 *  Output: "fl"
 *
 *
 *  Example 2:
 *  Input: strs = ["dog","racecar","car"]
 *  Output: ""
 *  Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *   -- 1 <= strs.length <= 200
 *   -- 0 <= strs[i].length <= 200
 *   -- strs[i] consists of only lowercase English letters.
 *
 */

import java.util.Objects;

public class LongestCommonPrefixMain {

    public static void main(String[] args) {
        LongestCommonPrefixMain prefix = new LongestCommonPrefixMain();
        String result = prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assert Objects.equals(result, "fl");
        System.out.println(result);
        result = prefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assert Objects.equals(result, "");
        System.out.println(result);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty()) {
                    return "";
                }
            }
        }
        return commonPrefix;
    }
}