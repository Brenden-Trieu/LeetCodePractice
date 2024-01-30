package TwoSum;

import org.junit.*;

public class TwoSumTest {
    @Test
    public void test() {
        TwoSum x = new TwoSum();
        int[] nums = new int[] { 0 };
        int target = 9;
        int[] tester = x.twoSum(nums, target);
        int[] answer = { 0, 1 };

        Assert.assertArrayEquals(answer, tester);

    }
}
