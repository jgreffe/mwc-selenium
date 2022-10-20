package sandbox;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverTest extends AbstractDriverTest {

    @BeforeAll
    public static void before() {
        AbstractDriverTest.before(new FirefoxDriver());
    }
}
