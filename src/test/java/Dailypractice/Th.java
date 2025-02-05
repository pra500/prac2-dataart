package Dailypractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Th {





    public static void main(String[] args) {

        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/");

      boolean b=  driver.getCurrentUrl().contains("open");
        System.out.println(b);

    }
}
