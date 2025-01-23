package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Stra {

    WebDriver driver;
@BeforeClass
public  void  set()
{



    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

    driver.get("https://bookcart.azurewebsites.net/filter?category=biography");
}

@AfterClass
public void tear()
{driver.quit();

}



    @Test
    public void gettilTest()
    {

        System.out.println(driver.getTitle());
//driver.getTitle();
    }


    @Test
    public void geturlTest()
    {
        System.out.println(driver.getCurrentUrl());

    }


   // @Test 
    public void getlinksTest()
    {

    }



}

