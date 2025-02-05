package pcaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Trycatchfinally {



    public static void main(String[] args) {


        WebDriver driver;

        try {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://naveenautomationlabs.com/opencart/");

            boolean b =
                    driver.findElement(By.cssSelector("input[name='searcsh']")).isDisplayed();
            Assert.assertTrue(b, "not matched");




        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("ended");
        }

    }
}