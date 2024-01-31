package BuySell;

import org.junit.Test;

import junit.framework.Assert;

public class BuySellTest {
    @Test
    public void test() {
        BuySell x = new BuySell();
        int[] input = { 7, 1, 5, 3, 6, 4 };
        int tester = x.maxProfit(input);
        Assert.assertEquals(5, tester);
    }
}
