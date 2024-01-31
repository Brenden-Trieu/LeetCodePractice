package Palindrone;

public class Palindrome {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toCharArray();
        int size = charArray.length - 1;

        for (int i = 0; i < size; i++) {
            if (charArray[i] != charArray[size - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean oldIsPalindrome(String s) {
        boolean result = false;
        String tester = s.toLowerCase();
        tester.replaceAll("[^a-zA-Z]", "");
        char[] charArray = tester.toCharArray();
        // System.out.println(Arrays.toString(charArray));
        int size = charArray.length - 1;

        for (int i = 0; i < size; i++) {
            if (charArray[i] == charArray[size - i]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}
