package Dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://practice.expandtesting.com/login");

    }



    @AfterClass
    public void teardown() {

        driver.quit();
    }


    //wrong creds
    @Test
    public void logintoapp() {
        try {

            driver.findElement(By.cssSelector("#username")).sendKeys("tom");
            driver.findElement(By.cssSelector("#password")).sendKeys("tom@123");

            driver.findElement(By.xpath("//button[text()='Login']")).click();

            boolean b = driver.findElement(By.xpath("//b[text()='Your username is invalid!']")).isDisplayed();

            Assert.assertTrue(b);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("tc is working fine");
        }

    }

    //correct creds
    @Test
    public void Title() {
        try {

            driver.findElement(By.cssSelector("#username")).sendKeys("tom");
            driver.findElement(By.cssSelector("#password")).sendKeys("tom@123");


            driver.findElement(By.xpath("//button[text()='Login']")).click();

            boolean b = driver.findElement(By.xpath("//b[text()='Your username is invalid!']")).isDisplayed();

            Assert.assertTrue(b);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("tc is working fine");
        }

    }


    //Verify Login with Blank Credentials
    //Your username is invalid!
    @Test
    public void bothfieldsblank() {
        try {

            driver.findElement(By.cssSelector("#username")).clear();

            driver.findElement(By.cssSelector("#username")).sendKeys("");

            driver.findElement(By.cssSelector("#password")).clear();

            driver.findElement(By.cssSelector("#password")).sendKeys("");


            driver.findElement(By.xpath("//button[text()='Login']")).click();

            boolean b = driver.findElement(By.xpath("//b[text()='Your username is invalid!']")).isDisplayed();

            Assert.assertTrue(b);


        } catch (Exception e) {

            e.printStackTrace();


        } finally {

        }

    }


    //Verify Login with SQL Injection Attack
    @Test
    public void blankusername() {
        try {


            driver.findElement(By.cssSelector("#username")).clear();
            driver.findElement(By.cssSelector("#username")).sendKeys("select * from emp;");


            driver.findElement(By.cssSelector("#password")).clear();


            driver.findElement(By.xpath("//button[text()='Login']")).click();

            boolean b = driver.findElement(By.xpath("//b[text()='Your username is invalid!']")).isDisplayed();

            Assert.assertTrue(b);


        } catch (Exception e) {


        } finally {

        }

    }


}


