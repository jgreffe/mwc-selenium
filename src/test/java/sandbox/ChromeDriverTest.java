package sandbox;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest extends AbstractDriverTest {

    @BeforeAll
    public static void before() {
        AbstractDriverTest.before(new ChromeDriver());
    }
}
