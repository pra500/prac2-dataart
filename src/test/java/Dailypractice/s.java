package Dailypractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class s {

    WebDriver driver;

    @BeforeTest
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
    }




    @AfterTest
    public void teardown() {
        driver.close();
    }


   @Test
    public void title() {

        driver.findElement(By.cssSelector("//div[@class='sc-124al1g-2 dwOYCh']//button[@class='sc-124al1g-0 jCsgpZ'][normalize-space()='Add to cart']")).click();
        driver.findElement(By.cssSelector("//button[normalize-space()='Checkout']")).click();
        Alert alt = driver.switchTo().alert();
        alt.accept();

    }
}



