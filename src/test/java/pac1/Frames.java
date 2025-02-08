package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Frames {

    WebDriver driver;



    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://the-internet.herokuapp.com/iframe");
    }


    @AfterClass
    public void teardown()
    {
driver.close();

    }


    @Test(priority = 0)
    public void seee()
    {

//
//       // driver.switchTo().frame("mce_0_ifr");
//     boolean b=   driver.findElement(By.cssSelector("#tinymce")).isDisplayed();
//        System.out.println(b);


    }

    @Test(priority = 1)
    public void se3ee()
    {
        driver.switchTo().frame(0);
        boolean b=   driver.findElement(By.cssSelector("#tinymce")).isDisplayed();
        System.out.println(b);


    }







    @Test(priority = 3)
    public void seeddddde()
    {


        WebElement wb=
        driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(wb);
        boolean b=   driver.findElement(By.cssSelector("#tinymce")).isDisplayed();
        System.out.println(b);





    }





}



