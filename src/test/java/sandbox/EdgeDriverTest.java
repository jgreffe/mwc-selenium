package sandbox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Disabled
public class EdgeDriverTest extends AbstractDriverTest {

    @BeforeAll
    public static void before() {
        AbstractDriverTest.before(new EdgeDriver());
    }
}
