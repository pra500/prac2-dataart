package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class OrangeHRM {


    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }

    @Test
    public void validcredsTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String title = driver.getTitle();

        Assert.assertEquals(title, "OrangeHRM");
    }


    @Test(priority = 1)
    public void invalidusernameTest() {


        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Appdmin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");


    }


    @Test(priority = 2)
    public void invalidpwdTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123pp");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");


    }


    @Test(priority = 3)
    public void bothfieldblankTest() {
        driver.findElement(By.xpath(" //input[@placeholder='Username']")).clear();

        driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String userrequiredmsg = driver.findElement(By.xpath("(//span[text()='Required'])[1]")).getText();

        Assert.assertEquals(userrequiredmsg, "Required");

        String pwdrequiredmsg = driver.findElement(By.xpath("(//span[text()='Required'])[2]")).getText();

        Assert.assertEquals(pwdrequiredmsg, "Required");


    }


    @Test(priority = 4)
    public void SQLInjectionTest() {


        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("select * from Employee;");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");

    }

    @Test(priority = 5)
    public void ForgotPasswordLinkTest() {


        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//p[normalize-space()='Forgot your password?']")).click();


        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");


    }


    @Test(priority = 6)
    public void CapsLockWarningTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        Actions actions = new Actions(driver);

        // Type uppercase password by holding Shift
        actions.moveToElement(password)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("admin123")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");


    }


    @Test(priority = 7)
    public void enteremailinusernameTest() {


        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin234@gmail.com");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");


    }

    @Test(priority = 8)
    public void PasswordMaskingTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ad@min123##");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String msg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();

        Assert.assertEquals(msg, "Invalid credentials");


    }





    //Verify the Presence of Widgets on the Dashboard
    @Test(priority = 8, dependsOnMethods = {"validcredsTest"})
    public void VerifycomponentsTest() {


      WebElement  wb=driver.findElement(By.xpath("//span[normalize-space()='Leave']"));
        boolean leave = driver.findElement(By.xpath("//span[normalize-space()='Leave']")).isDisplayed();
        Assert.assertTrue(leave);

        boolean myinfo = driver.findElement(By.xpath("//span[normalize-space()='My Info']")).isDisplayed();
        Assert.assertTrue(myinfo);

        wb.click();

        driver.findElement(By.xpath("//span[normalize-space()='Leave']"));

        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Tom");

        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();



    }




    //5 tc's:

    //Verify Notifications and Alerts
   @Test(priority = 9, dependsOnMethods = "validcredsTest")
    public void VerifyNotificationsAlertsTest() {



       // boolean leave = driver.findElement(By.xpath("//span[normalize-space()='Leave']")).isDisplayed();
       // Assert.assertTrue(leave);

        boolean myinfo = driver.findElement(By.xpath("//span[normalize-space()='My Info']")).isDisplayed();
        Assert.assertTrue(myinfo);

        boolean recruitemtment = driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).isDisplayed();
        Assert.assertTrue(recruitemtment);



       String title= driver.getTitle();
        System.out.println(title);


       String str= driver.getWindowHandle();
        System.out.println(str);

        System.out.println(driver.getClass());


        System.out.println(driver.getPageSource().contains("div"));



    }






//dashboard page:
// one tc:

    //@Test(priority = 8, dependsOnMethods = {"validcredsTest"})
    public void VerifycomponenxxtsTest() {














    }






















}



