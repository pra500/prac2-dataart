package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Expedia {

    WebDriver driver;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


        driver.get("https://www.expedia.com/");
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }


    @AfterClass
    public void teardown() {
        driver.close();
    }


    @Test
    public void click(){
        String s=
        driver.findElement(By.xpath("//button[@aria-label='Where to?']")).getText();
        System.out.println(s);
    }




    @Test
    public void click1() {

Set<String> set1=
        driver.getWindowHandles();


int size=set1.size();
        System.out.println(size);



    }





}
