package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Cssselectorsss {

    public static  WebDriver driver;

    public static void main(String[] args) {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://naveenautomationlabs.com/opencart/");


        String title=driver.getTitle();
        System.out.println(title);



    }
}
