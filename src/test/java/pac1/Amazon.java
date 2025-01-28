package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;


public class Amazon {

    WebDriver driver;



    @Test(priority = 0)
    public void seTest() {

        Set<String> set1 = driver.getWindowHandles();
        System.out.println(set1.size());

    }

    @Test(priority = 1)
    public void se1Test() {

        List<WebElement> list = driver.findElements(By.xpath("//input"));
        System.out.println(list.size());

    }


    @Test(priority = 2)
    public void se1iTest() {

        List<WebElement> list = driver.findElements(By.xpath("//iframe"));
        System.out.println(list.size());
        //list.size();

    }


    @Test(priority = 3)
    public void se1fiddTest() {

        List<WebElement> list = driver.findElements(By.xpath("//input"));
        System.out.println(list.size());
        //list.size();

    }


    @Test(priority = 4)
    public void s1Test() {

        List<WebElement> list = driver.findElements(By.xpath("//img"));
        System.out.println(list.size());
        //list.size();

    }




    @Test(priority = 5, enabled = false)
    public void s2Test() {

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));


// Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);

        }

    }

       public static void verifyLink(String url) {
            try {
                URL link = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
                httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
                httpURLConnection.connect();


                if (httpURLConnection.getResponseCode() == 200) {
                    System.out.println(url + " - " + httpURLConnection.getResponseMessage());
                } else {
                    System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
                }
            } catch (Exception e) {
                System.out.println(url + " - " + "is a broken link");
            }
        }



    @Test(priority = 6)
    public void s3Test() {

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }



    @Test(priority = 7)
    public void s4Test() {

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("span"));
        System.out.println(links.size());
    }




    @Test(priority = 8)
    public void s5Test() {

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("span"));
        System.out.println(links.size());
    }


    @Test(priority = 9)
    public void s6Test() {

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("span"));
        System.out.println(links.size());
    }


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.amazon.in/");

    }

    @AfterClass
    public void teardown() {

        driver.quit();



    }


}