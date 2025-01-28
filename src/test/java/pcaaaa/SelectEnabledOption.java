package pcaaaa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelectEnabledOption {


        public static void main(String[] args) {            // Set up WebDriver
           // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

          WebDriver  driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));



            try {



                // Navigate to the OrangeHRM site
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


                // Log in to the site
                WebElement username = driver.findElement(By.name("username"));
                WebElement password = driver.findElement(By.name("password"));
                WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

                username.sendKeys("Admin");
                password.sendKeys("admin123");
                loginButton.click();

                // Navigate to the "Add User" page
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");

                // Locate the "Status" dropdown
                WebElement statusDropdown = driver.findElement(By.xpath("//label[text()='Status']/following::div[1]"));

                // Open the dropdown
                statusDropdown.click();

                // Select the "Enabled" option
                WebElement enabledOption = driver.findElement(By.xpath("//div[@role='option' and text()='Enabled']"));
                enabledOption.click();

                // Verify selection (if necessary)
                String selectedOption = statusDropdown.getText();
                System.out.println("Selected Option: " + selectedOption);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();
            }
        }
    }


