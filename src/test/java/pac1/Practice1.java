package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Practice1 {



    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://naveenautomationlabs.com/opencart/");
    }







    @AfterClass
    public void teardown() {
        driver.close();
    }



    //scn1: Remove a Product from the Cart




}
