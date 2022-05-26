package topinterviewquestions.easy.string;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 *
 */

public class ValidAnagramMain {

    public static void main(String[] args) {
        ValidAnagramMain anagram = new ValidAnagramMain();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
        System.out.println(anagram.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        int len = s.length();
        int[] asciiMap = new int[123];
        if (t.length() != len) return false;
        for (int i = 0; i < len; i++) {
            asciiMap[s.codePointAt(i)]++;
        }
        for (int i = 0; i < len; i++) {
            if (--asciiMap[t.codePointAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        char[] inArray = s.toCharArray();
//        char[] secArray = t.toCharArray();
//        for (int i = 0; i < inArray.length; i++) {
//            int val = map.computeIfAbsent(inArray[i], character -> 0);
//            val++;
//            putRemoveMapValue(inArray[i], val, map);
//
//            val = map.computeIfAbsent(secArray[i], character -> 0);
//            val--;
//            putRemoveMapValue(secArray[i], val, map);
//        }
//        return map.size() == 0;
//    }
//
//    private static void putRemoveMapValue(char ch, int val, Map<Character, Integer> map) {
//        if (val == 0) {
//            map.remove(ch);
//        } else {
//            map.put(ch, val);
//        }
//
//    }
}