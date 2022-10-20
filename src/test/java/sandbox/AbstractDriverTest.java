package sandbox;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.sukgu.Shadow;

public abstract class AbstractDriverTest {
    protected static WebDriver DRIVER;
    protected static Shadow SHADOW;
    protected static final String URL = "http://localhost:1234";

    public static void before(WebDriver driver) {
        DRIVER = driver;
        SHADOW = new Shadow(DRIVER);
        DRIVER.get(URL);
    }

    @AfterAll
    public static void after() {
        DRIVER.quit();
    }

    /**
     * Standard input
     *
     * @throws Exception
     */
    @Test
    public void input() throws Exception {
        SHADOW.findElement("input").sendKeys("test");
    }

    /**
     * Use automation plugin to traverse web component shadow dom
     *
     * @throws Exception
     */
    @Test
    public void mwc_textfield_shadow() throws Exception {
        WebElement element = SHADOW.findElement("mwc-textfield");
        element.click();
        element.sendKeys("test");
    }

    /**
     * Use standard selenium API to traverse web component shadow dom
     *
     * @throws Exception
     */
    @Test
    public void mwc_textfield_selenium_shadow() throws Exception {
        WebElement customTextField = DRIVER.findElement(By.cssSelector("custom-text-field"));
        WebElement mwcTextfield = customTextField.getShadowRoot().findElement(By.cssSelector("mwc-textfield"));
        WebElement input = mwcTextfield.getShadowRoot().findElement(By.cssSelector("input"));
        input.click();
        input.sendKeys("test");
    }
}
