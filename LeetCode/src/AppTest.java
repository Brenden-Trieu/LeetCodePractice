import org.junit.*;

public class AppTest {
    @Test
    public void test() {
        App x = new App();
        int[] nums = new int[] { 0 };
        boolean tester = x.containsDuplicate(nums);
        Assert.assertEquals(true, tester);
    }
}
