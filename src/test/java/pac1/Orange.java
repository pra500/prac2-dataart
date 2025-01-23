package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Orange {

//need to check the code
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();



    }


    @Test
    public void dashboardTest() {


        System.out.println(driver.getPageSource());


   }


    @Test
    public void dashboardbuttons1Test() {


       String time= driver.findElement(By.xpath(" //span[text()='Time']")).getText();
        System.out.println(time);
        //span[text()='Time'].


    }


    @Test
    public void dashboardbuttons2Test() {


        String time= driver.findElement(By.xpath(" //span[text()='Time']")).getText();
        System.out.println(time);
        //span[text()='Time'].


    }

    @Test
    public void dashboardbutton3sTest() {


        String time= driver.findElement(By.xpath(" //span[text()='Time']")).getText();
        System.out.println(time);
        //span[text()='Time'].


    }

    @Test
    public void dashboardlinks3Test() {

List<WebElement> lis=
        driver.findElements(By.tagName("//a"));
        System.out.println(lis);


    }

    //@Test
    public void dashboardlinks4Test() {

        List<WebElement> lis=
                driver.findElements(By.tagName("//a"));
        System.out.println(lis);


    }
   // @Test
    public void dashboardlinksTest() {

        List<WebElement> lis=
                driver.findElements(By.tagName("//a"));
        System.out.println(lis);


    }



}
