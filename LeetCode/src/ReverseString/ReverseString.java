package ReverseString;

public class ReverseString {
    public String reverse(String s) {
        char[] charArray = s.toCharArray();
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += charArray[i];
        }
        return r;
    }
}
