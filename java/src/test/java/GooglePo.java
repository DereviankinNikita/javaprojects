import org.openqa.selenium.*;

public class GooglePo extends DriverSwitcher {
    public GooglePo(WebDriver driver1){
        super(driver1);
    }

    public void useGoogle(){
        driver.get("http://google.com.ua");
    }

    public void google(String query){
        WebElement searchArea = driver.findElement(By.id("lst-ib"));
        searchArea.sendKeys(query);
        searchArea.sendKeys(Keys.ENTER);
    }

    public HotlinePO useHotlineLink(){
        driver.findElement(By.xpath("//a[contains(text(), 'Hotline - сравнить цены в интернет-магазинах Украины')]")).click();
        driver.findElement(By.xpath("//*[@id='lv-1-14']")).click();
        driver.findElement(By.linkText("Смартфон Xiaomi Mi A1 4/64GB Gold")).click();
        return new HotlinePO(driver);
    }

    public void scroll()  {
        WebElement element = driver.findElement(By.id("lv-1-14"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            throw e;
        }
    }

}
