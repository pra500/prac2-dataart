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

public class Ghusers {


    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.get("https://gh-users-search.netlify.app/");

    }

    @AfterClass
    public void teardown() {

        driver.quit();


    }





    @Test
    public void search1Test() {

// Finding all the available links on webpage


driver.findElement(By.cssSelector("input[data-testid='search-bar']")).sendKeys("pra55");

        driver.findElement(By.cssSelector("//h3[text()='Wel1come']")).isDisplayed();


    }






   @Test
    public void search2Test() {

// Finding all the available links on webpage

       driver.findElement(By.cssSelector("input[data-testid='seach-bar']")).sendKeys("pra55");



    }


    @Test
    public void s5Test() {

// Finding all the available links on webpage

        driver.findElement(By.cssSelector("input[data-testid='seach-ar']")).sendKeys("pra55");


    }



    @Test
    public void s6Test() {

// Finding all the available links on webpage

        driver.findElement(By.cssSelector("input[data-testid='seachw-bar']")).sendKeys("pra55");




    }









}
