package BinarySearch;

import org.junit.Test;

import BuySell.BuySell;
import junit.framework.Assert;

public class BinarySearchTest {
    @Test
    public void test() {
        BinarySearch x = new BinarySearch();
        int[] input = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        int tester = x.search(input, target);
        Assert.assertEquals(-1, tester);
    }
}
