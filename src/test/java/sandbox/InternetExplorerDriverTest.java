package sandbox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

@Disabled
public class InternetExplorerDriverTest extends AbstractDriverTest {

    @BeforeAll
    public static void before() {
        AbstractDriverTest.before(new InternetExplorerDriver());
    }
}
