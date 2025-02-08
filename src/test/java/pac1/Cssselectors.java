package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cssselectors {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        //driver.manage().timeouts().impicitlyWait(Duration.ofSeconds(30));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://www.javatpoint.com/");
    }

    @AfterClass
    public void teardown() {
        driver.close();
    }


    @Test
    public void get1() {
String str=driver.getWindowHandle();
        System.out.println();
    }


    @Test
    public void get2() {
String title=
driver.getTitle();
        System.out.println(title);


    }



}
