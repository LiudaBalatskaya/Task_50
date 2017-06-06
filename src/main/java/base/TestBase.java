package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;
    protected static final String BASE_URL = "https://192.168.100.26/";

    public static void gotoPage(WebDriver driver) {
        driver.get(BASE_URL);
    }
    public static WebDriver getWebDriver(){ return driver; }

    public static void driverWait() {
        final int MAXIMUM_WAIT_TIME = 20;
        WebDriverWait wait = new WebDriverWait(driver, MAXIMUM_WAIT_TIME);
    }

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void exit(){
        driver.close();
    }
}
