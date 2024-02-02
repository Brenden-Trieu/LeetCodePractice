package Anagram;

import org.junit.Test;

import Palindrone.Palindrome;
import junit.framework.Assert;

public class AnagramTest {
    @Test
    public void test() {
        Anagram x = new Anagram();
        String input = "rat";
        String target = "car";
        boolean tester = x.isAnagram(input, target);
        Assert.assertEquals(false, tester);
    }
}
