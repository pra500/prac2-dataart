package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationPractice {

    WebDriver driver;



    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://testautomationpractice.blogspot.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }



    @Test
    public void ge33e()
    {

    }



    @Test
    public void geedee()
    {



    }



//    public Object[][] getdata()
//    {
//        Object[][] th=new Object[][]
//
//
//
//
//
//
//
//
//        //return
//
//
//    }




    @Test
    public void geer()
    {



    }


}
