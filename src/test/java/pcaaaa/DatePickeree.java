package pcaaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DatePickeree {


    WebDriver driver;




    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://jqueryui.com/datepicker/");
    }




    @AfterClass
    public void teardown() {

        driver.quit();

    }


    @Test
    public void datepicker11() {
        System.out.println(driver.getPageSource());
//driver.getPageSource()


    }



    @Test
    public void datepickeri11u() {
        System.out.println(driver.getPageSource());
//driver.getPageSource()


    }




    @Test
    public void datepickerkk11() {
        //System.out.println(driver.getPageource().contains("iframe"));
//driver.getPageSource()


    }



    @Test
    public void datepicker1b1() {
        System.out.println(driver.getPageSource());
//driver.getPageSource()


    }


    @Test
    public void datepick66() {
       // System.out.println(driver.getTitlse());
//driver.getPageSource()


    }


    @Test
    public void datepicker12() {
        //System.out.println(driver.getCursrentUrl());
//driver.getPageSource()


    }




}
