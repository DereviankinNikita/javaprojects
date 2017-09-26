
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotlinePO extends DriverSwitcher {
    public HotlinePO(WebDriver driver1) {
        super(driver1);
    }

    public String getText() {
        return driver.findElement(By.xpath("//*[@class='title-24 p_b-5']")).getText();
    }



}