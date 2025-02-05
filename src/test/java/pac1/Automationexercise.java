package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Automationexercise {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.automationexercise.com/");


    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }

/*
    @Test
    public void gettitle() {

        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        //a[normalize-space()='Signup / Login']

    }


    @Test
    public void getpagesource() {
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

    }

    @Test
    public void geturl() {
        String url = driver.getCurrentUrl();
        System.out.println(url);

    }


    @Test(priority = 0)
    public void signupclick() {

        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();


        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("johndoet@example.com");


        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("jo@123");


        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

        //button[normalize-space()='Signup']
    }




    @Test(priority = 1, dependsOnMethods = {"signupclick"})
    public void registrationclick() {


        driver.findElement(By.cssSelector("#id_gender2")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("jo@123");

        WebElement wb = driver.findElement(By.cssSelector("#days"));
        Select sel = new Select(wb);
        sel.selectByIndex(3);


    }

*/



}
