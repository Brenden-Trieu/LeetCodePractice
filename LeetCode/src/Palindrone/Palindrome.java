package Palindrone;

import java.util.Arrays;

public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean result = false;
        String tester = s.toLowerCase();
        tester.replaceAll("[^a-zA-Z]", "");
        char[] charArray = tester.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[charArray.length - 1]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}
