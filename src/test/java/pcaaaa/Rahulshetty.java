package pcaaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Rahulshetty {


    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://rahulshettyacademy.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }

    @Test
    public void titleTest() {
        System.out.println(driver.getTitle());

    }


    @Test
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());


    }

    @Test
    public void logoTest() {
        System.out.println(driver.getCurrentUrl());
    }

}