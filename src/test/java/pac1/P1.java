package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class P1 {


    WebDriver driver;


    @BeforeMethod
    public void set()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://toolsqa.com/testng/testng-data-provider-excel/");

    }

    @Test
    public void s1() {

        System.out.println(driver.getCurrentUrl());
      //  driver.getCurrentUrl()


    }





    @Test(priority = 1)
    public void s11() {

        System.out.println(driver.getCurrentUrl());
        //  driver.getCurrentUrl()


    }



    @AfterMethod
    public void tear()
    {
        driver.close();
    }
}


