package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Tentestcases {


    WebDriver driver;


    @BeforeMethod
    public void setup() {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");
        co.addArguments("incognito");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://letcode.in/frame");

    }


    @AfterMethod
    public void teardown() {

        driver.quit();
    }


   // @Test
    public void p1() {

        boolean b =
                driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();

        System.out.println(b);


    }


    //@Test
    public void p2() {
        boolean b =
                driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]")).isDisplayed();

        System.out.println(b);


    }

   // @Test
    public void p3() {

        boolean b =
                driver.findElement(By.xpath("(//img[@alt='Logo'])[2]")).isDisplayed();

        System.out.println(b);

    }



    //@Test
    public void p4()
    {
            driver.switchTo().frame(0);

            boolean b=driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();

        System.out.println(b);



    }

    //@Test
    public void p5()
    {

        driver.switchTo().frame("googlefcPresent");
        boolean b=driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();

        System.out.println(b);




    }





   // @Test
    public void p6()
    {
driver.get("https://the-internet.herokuapp.com/iframe");
driver.switchTo().frame("mce_0_ifr");
boolean b=
driver.findElement(By.xpath("//p[text()='Your content goes here.']")).isDisplayed();
        System.out.println(b);


    }



    @Test
    public void p7()
    {




    }
    @Test
    public void p8()
    {

    }
    @Test
    public void p9()
    {

    }
    @Test
    public void p10()
    {


    }







}
