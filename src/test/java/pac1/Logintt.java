package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Logintt {

    WebDriver driver;


    @Test(priority = 0)
    public  void get()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
       // driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        driver.get("https://letcode.in/frame");

        System.out.println(driver.getCurrentUrl());


        //driver.getCurrentUrl()


    }


    @Test(priority = 1)
    public  void get8()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        // driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        driver.get("https://naveenautomationlabs.com/opencart/");

        System.out.println(driver.getCurrentUrl());


        //driver.getCurrentUrl()


    }



    @Test(priority = 2)
    public  void get9()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        // driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        driver.get("https://demo.guru99.com/test/guru99home/");

        System.out.println(driver.getCurrentUrl());


        //driver.getCurrentUrl()


    }


}
