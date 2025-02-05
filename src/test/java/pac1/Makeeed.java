package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Makeeed {


    WebDriver driver;


    @BeforeClass
    public void setup() {



        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }


    @AfterClass
    public void teardown() {
        driver.close();
    }




    @Test
    public void seeffe()
    {

        // Search for a term
        driver.findElement(By.name("q")).sendKeys("laptop");
        driver.findElement(By.id("searchButton")).click();

// Verify search results
        List<WebElement> results = driver.findElements(By.className("resultTitle"));
        Assert.assertTrue(results.size() > 0);




        
        


    }




    @Test
    public void seefffe()
    {






    }

    @Test
    public void serree()
    {

        driver.findElement(By.name("q")).sendKeys("laptop");
        driver.findElement(By.id("searchButton")).click();

// Verify search results
        List<WebElement> results = driver.findElements(By.className("resultTitle"));
        Assert.assertTrue(results.size() > 0);

    }
    @Test
    public void seffdd2ee()
    {

    }



    @Test
    public void seff2ee()
    {

    }


    @Test
    public void seff2ee2()
    {

    }

    @Test
    public void seff2ee4()
    {

    }
    @Test
    public void seff2ee5()
    {


    }

















}
