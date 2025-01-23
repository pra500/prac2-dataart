package pac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange {

    WebDriver driver;

    @Test(dataProvider = "csvDataProvider", dataProviderClass = DataProviderrrr.class)
    public void loginTest(String username, String password, String role) {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        try {
            // Open OrangeHRM
            driver.get("https://opensource-demo.orangehrmlive.com/");

            // Enter credentials
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();


            // Verify login success
            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
            if (dashboard.isDisplayed()) {
                System.out.println("Login successful for role: " + role);
            } else {
                System.out.println("Login failed for role: " + role);
            }

        } finally {
            driver.quit();
        }
    }
}
