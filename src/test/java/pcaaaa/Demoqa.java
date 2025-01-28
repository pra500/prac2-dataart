package pcaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demoqa {


    public static void main(String[] args) {

        WebDriver driver;

        String month="feb";
        String date="12";
        String year="2022";

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://jqueryui.com/datepicker/");
            String title= driver.getTitle();



            driver.switchTo().frame(0);

     while(true)
     {
         String month1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
         String date1=   driver.findElement(By.xpath("")).getText();

    if(month1.equals(month) && date1.equals(date))
    {
        break;
    }

    }

        driver.quit();


        }



}
