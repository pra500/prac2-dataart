package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Open {

    WebDriver driver;



    @Test
    public void getTest() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        https:
//www.yatra.com/

        driver.get("https://www.yatra.com/");


        String title = driver.getTitle();
        System.out.println(title);
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }




    @Test
    public void getiiTest() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        https:
//www.yatra.com/

        driver.get("https://www.yatra.com/");


        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.yatra.com/");

        boolean b = driver.findElement(By.xpath("//p[text()='mumbai']")).isDisplayed();

Assert.assertTrue(b);
List<WebElement> list=driver.findElements(By.tagName("//a"));
        System.out.println(list.size());

    }



    @Test
    public void setrTest()
    {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        https:
//www.yatra.com/



        driver.get("");



        String title=driver.getTitle();
        System.out.println(title);

      String windid=  driver.getWindowHandle();
        System.out.println(windid);




    }





    @Test
    public void getijiTest() {


       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        https:
//www.yatra.com/

        driver.get("https://www.amazon.in/");


String url=driver.getCurrentUrl();

        System.out.println(url);


    }



    @Test
    public void getiji1Test() {





    }


    }
