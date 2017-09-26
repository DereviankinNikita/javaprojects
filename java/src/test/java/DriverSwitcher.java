import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverSwitcher {
    protected WebDriver driver;

    public DriverSwitcher(WebDriver lead){
        driver = lead;
    }

}
