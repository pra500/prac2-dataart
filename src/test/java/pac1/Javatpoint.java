package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Javatpoint {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://www.javatpoint.com/");
    }



    @AfterClass
    public void teardown() {
        driver.close();
    }


    @Test
    public void alllinks()
    {

        List<WebElement> list=
        driver.findElements(By.tagName("a"));
        System.out.println(list.size());
    }



    @Test
    public void allimages()
    {

        List<WebElement> list=
                driver.findElements(By.tagName("img"));
        System.out.println(list.size());
    }



    @Test
    public void javascripttitle()
    {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("return document.title;");


    }

    @Test
    public void javascriptbackforward()
    {

        driver.get("https://www.google.com");

        driver.get("https://www.rediff.com/");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.history.back();");


        js.executeScript("window.history.forward();");

        js.executeScript("history.go(0)");

    }



   @Test
    public void javascriptscroll()
    {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
    }

    @Test
    public void javascriptentertext()
    {
        driver.get("https://www.google.com");

        WebElement wb=
        driver.findElement(By.xpath("//textarea[@name='q']"));

        //textarea[@name='q']

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='selenium';", wb);


    }




}




