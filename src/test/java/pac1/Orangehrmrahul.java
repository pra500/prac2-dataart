package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;
import java.util.List;

public class Orangehrmrahul {

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

    @Test(priority = 0)
    public void validcredsTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }


    @Test(priority = 1, dependsOnMethods = {"validcredsTest"})
    public void invalidusernameTest() {


driver.findElement(By.xpath("//span[text()='Admin']")).click();

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();




//JavascriptExecutor js=(JavascriptExecutor) driver;

        List<WebElement> list=
driver.findElements(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));



        for(int i=0;i<=list.size()-1;i++)
        {
          String s=  list.get(i).getText();
            System.out.println(s);
        }

    }


}
