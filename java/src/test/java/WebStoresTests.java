import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebStoresTests {
    WebDriver driver;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User 1th\\Documents\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findOnStore(){
        GooglePo lead = new GooglePo(driver);
        lead.scroll();
        lead.useGoogle();
        lead.google("Hotline");
        HotlinePO hotlinePO = lead.useHotlineLink();
        System.out.println(hotlinePO.getText());

        Assert.assertTrue(hotlinePO.getText().contains("Xiaomi Mi A1 4/64GB Gold"));
    }



    @After
    public void tearDown (){
        driver.quit();
    }
}
