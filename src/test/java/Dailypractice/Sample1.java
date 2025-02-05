package Dailypractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sample1 {


    WebDriver driver;

    @Test
    public void gettitle()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://www.bing.com");


        System.out.println(driver.getTitle());
//driver.getTitle();
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }

}