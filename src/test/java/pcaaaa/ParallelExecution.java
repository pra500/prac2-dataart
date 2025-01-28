package pcaaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {


    WebDriver driver;

    @Parameters({"browser"})
    @Test
    public  void ge(String brow)
    {

        if(brow.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (brow.equalsIgnoreCase("firefox")){

        } else if (brow.equalsIgnoreCase("edge")) {

        }
        else {

        }
    }

}
