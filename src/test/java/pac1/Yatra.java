package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class Yatra {


    WebDriver driver;


    @Test(priority = 0)
    public void get() {
        try {
            boolean b = driver.findElement(By.xpath("//div[text()='Regular']")).isDisplayed();
            Assert.assertTrue(b);


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test(priority = 1)
    public void get1() {
        try {
            boolean b = driver.findElement(By.xpath("//span[text()='Non-Stop Flights']")).isDisplayed();
            Assert.assertTrue(b);


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test(priority = 2)
    public void get1i() {
        try {
            boolean b = driver.findElement(By.xpath("(//span[text()='Holidays'])[1]")).isDisplayed();
            Assert.assertTrue(b);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 3)
    public void get1ii() {
        try {
            boolean b = driver.findElement(By.xpath("(//span[text()='Holidays'])[1]")).isDisplayed();
            Assert.assertTrue(b);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test(priority = 4)
    public void getalllinks() {
        try {
            boolean b = driver.findElement(By.xpath("//a")).isDisplayed();
            Assert.assertTrue(b);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 5)
    public void getallimages() {
        try {
            boolean b = driver.findElement(By.xpath("//img")).isDisplayed();
            Assert.assertTrue(b);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 6)
    public void getallbuttons() {
        try {
            boolean b = driver.findElement(By.xpath("//input")).isDisplayed();
            Assert.assertTrue(b);



        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test(priority = 7)
    public void tgetallbuttonsTest() {
        try {
            boolean b = driver.findElement(By.xpath("//input")).isDisplayed();
            Assert.assertTrue(b);



        } catch (Exception e) {
            e.printStackTrace();

        }
    }




    @Test(priority = 8)
    public void ffgetallbutjtonsTest() {
        try {
            boolean b = driver.findElement(By.xpath("//input")).isDisplayed();
            Assert.assertTrue(b);



        } catch (Exception e) {
            e.printStackTrace();

        }
    }





    @Test(priority = 9)
    public void kkTest() {
        try {
            boolean b = driver.findElement(By.xpath("//iframe")).isDisplayed();
            Assert.assertTrue(b);



        } catch (Exception e) {
            e.printStackTrace();

        }
    }



    @Test(priority = 11)
    public void kkjTest() {
        try {
            boolean b = driver.findElement(By.xpath("//iframe")).isDisplayed();
            Assert.assertTrue(b);

        }catch (Exception e) {
            e.printStackTrace();

        }
    }


    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.yatra.com/");

    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }




}






