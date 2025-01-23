package pac3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testautomationpractice {

    WebDriver driver;


    @BeforeClass
    public void getd() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://testautomationpractice.blogspot.com/");

    }

    @AfterClass
    public void getdD() {

        driver.quit();

    }


    //Verify Double Click Action
    @Test
    public void exist() {
        boolean b =

                driver.findElement(By.id("name")).isDisplayed();

        Assert.assertTrue(b);

    }

    @Test
    public void geyyt() {
        boolean b =

                driver.findElement(By.xpath("//button[text()='START']")).isDisplayed();

        Assert.assertTrue(b);

    }


    @Test
    public void get() {
        boolean b =

                driver.findElement(By.id("name")).isDisplayed();

        Assert.assertTrue(b);

    }


    @Test
    public void gdet() {

        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        //button[text()='Simple Alert']


        Alert alt = driver.switchTo().alert();
        alt.accept();

    }




}
