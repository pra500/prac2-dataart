package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cart {

            WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://naveenautomationlabs.com/opencart/");

    }

    @AfterClass
    public void teardown()
    {

        driver.quit();

    }

    @Test
    public void getTest()
    {
        //url
        String url=driver.getCurrentUrl();
        System.out.println(url);

    }

    @Test
    public void gettTest()
    {
        //url
        String sou=driver.getPageSource();
        System.out.println(s);

    }

    @Test
    public void get1Test()
    {
        //title
     String title=driver.getTitle();
        System.out.println(title);
    }


}
