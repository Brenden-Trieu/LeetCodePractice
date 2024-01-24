import org.junit.*;

public class AppTest {
    @Test
    public void test() {
        App x = new App();
        int[] nums = new int[] { 1, 2, 3, 1 };
        boolean tester = x.containsDuplicate(nums);
        Assert.assertEquals(true, tester);
    }
}
