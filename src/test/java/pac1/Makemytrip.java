package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Makemytrip {

    WebDriver driver;


    @AfterTest
    public void teardown()
    {
        driver.close();

    }


    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://www.expedia.com/");

    }



    @Test(priority = 0)
    public void getwindowid()
    {
       String s= driver.getWindowHandle();
        System.out.println(s);
    }


    @Test(priority = 1)
    public void gettitle()

    {
        String s= driver.getTitle();
        System.out.println(s);
    }


    @Test(priority = 2)
    public void geturl()
    {
        String s= driver.getCurrentUrl();
        System.out.println(s);
    }


    @Test(priority = 3)
    public void getdaataaa()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }


    @Test(priority = 4)
    public void geturllll()
    {
        String s= driver.getCurrentUrl();
        System.out.println(s);
    }




    @Test(priority = 5)
    public void tessss()
    {
        String s= driver.getCurrentUrl();
        System.out.println(s);
    }



    @Test(priority = 6)
    public void yeeeeee()
    {
        String s= driver.getCurrentUrl();
        System.out.println(s);
    }




    @Test(priority = 7)
    public void yeeejjeeey()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }


//new




    @Test(priority = 8)
    public void yeeeeeey()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }



    @Test(priority = 9)
    public void yeeeeee1y()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }
    @Test(priority = 10)
    public void yeeeeeey2()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }
    @Test(priority = 11)
    public void yeeeeeey3()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }
    @Test(priority = 12)
    public void yeeeeeey4()
    {
        String s= driver.getTitle();
        System.out.println(s);
    }








}
