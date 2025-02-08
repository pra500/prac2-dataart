package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class tryaaaa {

    public static void main(String[] args) {


        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
            driver.get("https://www.expedia.com/");



        } catch (Exception e) {
            e.getMessage();

        }

    }
}
