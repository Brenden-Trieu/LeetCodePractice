package ReverseString;

import org.junit.Test;

import Anagram.Anagram;
import junit.framework.Assert;

public class ReverseStringTest {
    @Test
    public void test() {
        ReverseString x = new ReverseString();
        String input = "hippo";
        String target = "oppih";
        String tester = x.reverse(input);
        Assert.assertEquals(target, tester);
    }
}
