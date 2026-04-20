package TestTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestTestNG {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google opened");
    }

    @Test
    public void openFacebook() {
        driver.get("https://www.facebook.com");
        System.out.println("Facebook opened");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}