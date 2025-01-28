package pcaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DatePicker {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dhtmlx.com/docs/products/dhtmlxCalendar/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }


    //@Test
    public void details() {


        boolean b = driver.findElement(By.cssSelector(".button-secondary-big.twin.js-to-anchor")).isDisplayed();
        System.out.println(b);

        boolean b1 =
                driver.findElement(By.cssSelector("div[class='relative t72 b72 tt16 tb64 mb40'] h2[class='sub-title reg-font center']")).isDisplayed();

        System.out.println(b);
//
//        driver.findElement(By.cssSelector("div[class='dhx-landing-head__btn'] a[class='button-default-big twin']")).isDisplayed();
//
//        driver.findElement(By.cssSelector(".button-secondary-big.twin.js-to-anchor")).isDisplayed();
//        driver.findElement(By.cssSelector(".button-secondary-big.twin.js-to-anchor")).isDisplayed();


//.button-secondary-big.twin.js-to-anchor


    }


    @Test
    public void deepdetails() {


        boolean b = driver.findElement(By.cssSelector("img[alt='Best Meets Requirements']")).isDisplayed();
        System.out.println(b);





      //boolean b2 = driver.findElement(By.cssSelector(".logo-96w.js-lazy.active[src='//crozdesk.com/top_badges/crozdesk-trusted-vendor-badge.png']")).isDisplayed();
        //System.out.println(b);





        boolean b3 = driver.findElement(By.cssSelector("img[alt='Siemens']")).isDisplayed();
        System.out.println(b3);


        boolean b4 = driver.findElement(By.cssSelector("div[class='ohb'] div[class='sky-bg'] strong:nth-child(1)")).isDisplayed();
        System.out.println(b4);



        boolean b5= driver.findElement(By.cssSelector("div[class='ohb'] div[class='sky-bg'] strong:nth-child(1)")).isDisplayed();
        System.out.println(b4);



        boolean b6= driver.findElement(By.cssSelector("div[class='t60 tt40 b36 mb56'] div:nth-child(4)")).isDisplayed();
        System.out.println(b6);
    }






}