package Palindrone;

import org.junit.Test;

import junit.framework.Assert;

public class PalindroneTest {
    @Test
    public void test() {
        Palindrome x = new Palindrome();
        String input = "ava";
        boolean tester = x.isPalindrome(input);
        Assert.assertEquals(true, tester);
    }
}
