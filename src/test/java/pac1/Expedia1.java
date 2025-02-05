package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Expedia1 {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.get("https://www.expedia.com/");

        boolean b =
                driver.findElement(By.xpath("//button[@aria-label='Where to?']")).isDisplayed();  //button[@aria-label='Where to?']
        Assert.assertTrue(b);


        boolean b1 =
                driver.findElement(By.xpath("//span[text()='Flights']")).isDisplayed();
        Assert.assertTrue(b1);


        boolean b2 =
                driver.findElement(By.xpath("//span[text()='Cars']")).isDisplayed();
        Assert.assertTrue(b2);


        boolean b3 =
                driver.findElement(By.xpath("//span[text()='Packages']")).isDisplayed();
        Assert.assertTrue(b3);


        boolean b4 =
                driver.findElement(By.xpath("//span[text()='Things to do']")).isDisplayed();
        Assert.assertTrue(b4);


    }
}
