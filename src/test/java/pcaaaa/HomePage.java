package pcaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {


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
    public void verifylogintoapp() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String title = driver.getTitle();

        Assert.assertEquals(title, "OrangeHRM");
    }


}
