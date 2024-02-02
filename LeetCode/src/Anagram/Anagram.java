package Anagram;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toLowerCase().toCharArray();
        char[] targetArray = t.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(targetArray);

        // if (charArray.length == targetArray.length) {
        // for (int i = 0; i < targetArray.length; i++) {
        // if (charArray[i] != targetArray[i])
        // return false;
        // }
        // } else {
        // return false;
        // }

        // return true;

        return Arrays.equals(charArray, targetArray);
    }
}
