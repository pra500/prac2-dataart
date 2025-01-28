package pcaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Orangerahul {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }

    @Test(priority = 0)
    public void loginTest() {

        driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }


    @Test(priority = 1, dependsOnMethods = {"loginTest"})
    public void dropdowmTest() {


        driver.findElement(By.xpath("//span[text()='Admin']")).click();

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();


//JavascriptExecutor js=(JavascriptExecutor) driver;


        /*
        List<WebElement> list=
                driver.findElements(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));

        for(int i=0;i<=list.size()-1;i++)
        {
            String s=  list.get(i).getText();
            System.out.println(s);

}
*/


       // driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();


       // driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]//div[text()='Enabled']")).click();


        // Open the dropdown (if necessary)
        WebElement dropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", dropdown);

        // Select the desired option
        WebElement option = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]//div[text()='Enabled']"));
        js.executeScript("arguments[1].click();", option);




        // Select the desired option
        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
        //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]
       // WebElement option1 = driver.findElement(By.xpath("//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
        js.executeScript("arguments[1].click();", option1);


        // Verify the selection (custom logic may be needed)
        System.out.println("Option selected.");

    }
}
