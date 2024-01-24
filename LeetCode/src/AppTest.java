import org.junit.*;

public class AppTest {
    @Test
    public void test() {
        App x = new App();
        Assert.assertEquals("Hope McDoing", x.says());
    }
}
