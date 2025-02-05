package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class React1 {

    WebDriver driver;



    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }



    @Test
    public void title()
    {
       String title= driver.getTitle();
        System.out.println(title);

    }


    @Test
    public void url()
    {
        String title= driver.getTitle();
        System.out.println(title);

    }




    @Test
    public void windowhandle()
    {
        String title= driver.getWindowHandle();
        System.out.println(title);

    }


    @Test
    public void windowhandledddd()
    {
        String title= driver.getWindowHandle();
        System.out.println(title);

    }




}
