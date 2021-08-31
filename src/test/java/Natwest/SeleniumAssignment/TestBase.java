package Natwest.SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static final String UserName = "deepa.markit2@gmail.com";
    public static final String Password = "qwerty123";
    public static WebDriver Driver;

    protected void TestSetup(){
        Driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
    }

    protected void TestTearDown(){
        Driver.quit();
    }
}