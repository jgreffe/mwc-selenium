package sandbox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.safari.SafariDriver;

@Disabled
public class SafariDriverTest extends AbstractDriverTest {

    @BeforeAll
    public static void before() {
        AbstractDriverTest.before(new SafariDriver());
    }
}
