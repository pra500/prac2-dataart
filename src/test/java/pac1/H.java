package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class H {


    WebDriver driver;

    @BeforeClass
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://testautomationpractice.blogspot.com/");

    }

    @AfterClass
    public void teardown() {
driver.close();
    }

    @Test
    public void gettitle()
    {

     String title=   driver.getTitle();
        System.out.println(title);
    }




    @Test
    public void gettitle4()
    {

        String title=   driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void gettitle44()
    {

        String title=   driver.getTitle();
        System.out.println(title);
    }


    @Test
    public void gettitl55e()
    {

        String title=   driver.getTitle();
        System.out.println(title);
    }




}
