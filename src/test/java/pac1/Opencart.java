package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Opencart {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }


    @AfterClass
    public void teardown() {
        driver.close();
    }

/*
    @Test(priority = 0)
    public void get() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("keyboard", Keys.ENTER);

    }


    @Test(priority = 1)
    public void get1() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("keyboard", Keys.ENTER);

    }




    @Test(priority = 2)
    public void get2() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("keyboard", Keys.ENTER);

    }

    @Test(priority = 3)
    public void get3() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("keyboard", Keys.ENTER);

    }

    @Test(priority = 4)
    public void get4() {
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("keyboard", Keys.ENTER);

    }
*/


//-----------------


    //scenario:     4. Verify Registration Functionality:


    //@Test(priority = 5)
    public void registrationTest() throws InterruptedException {


        // Fill out the registration form
        driver.findElement(By.id("input-firstname")).sendKeys("John");
        driver.findElement(By.id("input-lastname")).sendKeys("Doe");
        driver.findElement(By.id("input-email")).sendKeys("johndoet@example.com");
        driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
        driver.findElement(By.id("input-password")).sendKeys("Password123");
        driver.findElement(By.id("input-confirm")).sendKeys("Password123");

        // Agree to the Privacy Policy
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        if (!privacyPolicyCheckbox.isSelected()) {
            privacyPolicyCheckbox.click();
        }

        // Click the Continue button to submit the form
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Validate registration success
        String successMessage = driver.findElement(By.cssSelector("#content h1")).getText();
        if (successMessage.equals("Your Account Has Been Created!")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }


//scenario:       1. Verify Login Functionality

    @Test(priority = 6)
    public void loginTest() {

        driver.findElement(By.id("input-email")).sendKeys("johndoet@example.com");
        driver.findElement(By.id("input-password")).sendKeys("Password123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        String title = driver.getTitle();

        if (title.equals("My Account")) {
            System.out.println("login successful!");
        } else {
            System.out.println("login failed.");
        }
    }


    //scenario:       2. Verify Search Functionality
    @Test(priority = 7, dependsOnMethods = {"loginTest"})
    public void searchTest() {

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook", Keys.ENTER);

        String SearchMacBook = driver.findElement(By.xpath("//h1[text()='Search - MacBook']")).getText();

        if (SearchMacBook.equals("Search - MacBook")) {
            System.out.println("search successful!");
        } else {
            System.out.println("search failed.");
        }
    }


    //scenario:        3. Verify Add to Cart Functionality
    @Test(priority = 7, dependsOnMethods = {"loginTest", "searchTest"})
    public void addtocartTest() {


        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]")).click();

    }


    //scenario:             4. Verify Logout Functionality
    @Test(priority = 8, dependsOnMethods = {"loginTest"})
    public void logoutTest() {

        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        driver.findElement(By.xpath("//li[@class='dropdown open']//ul//li[5]")).click();


        String message = driver.findElement(By.xpath("//p[text()='You have been logged off your account. It is now safe to leave the computer.']")).getText();

        if (message.equals("You have been logged off your account. It is now safe to leave the computer.")) {
            System.out.println("logout successful!");
        } else {
            System.out.println("logout failed.");
        }

    }


    //scenario:             4. Verify Product Details Page;   check the product description, price, and name.
    @Test(priority = 8, dependsOnMethods = {"loginTest", "searchTest"})
    public void productdetailsTest() {


        //description
        boolean desc =
                driver.findElement(By.xpath("//p[text()='MacBook Air is ultrathin, ultraportable, and ultra unlike anything else. But you don’t lose in..']")).isDisplayed();

        if (desc) {
            System.out.println("description is printed correctly");
        }


        //price
        boolean price =
                driver.findElement(By.xpath("(//p[@class='price'])[2]")).isDisplayed();


        if (price) {
            System.out.println("price is printed correctly");
        }


        //name
        boolean name =
                driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'MacBook Air')]")).isDisplayed();

        if (name) {
            System.out.println("name is printed correctly");
        }

    }


    //scenario:                   5. Verify Wishlist Functionality
    @Test(priority = 8, dependsOnMethods = {"loginTest", "searchTest"})
    public void wishlistTest() {

        driver.findElement(By.xpath("(//button[@data-original-title='Add to Wish List'])[1]")).click();


        driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed();

/*
        msg:
        //div[@class='alert alert-success alert-dismissible']

//span[text()='Wish List (0)']

*/
    }


    //7 Jan:
    //scenario:                   6. Verify Contact Us Form
    @Test(priority = 9, dependsOnMethods = {"loginTest"})
    public void contactusTest() {

        driver.findElement(By.xpath(" //a[text()='Contact Us']")).click();

        driver.findElement(By.id("input-name")).clear();
        driver.findElement(By.id("input-name")).sendKeys("Rayan");

        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("Rayan465@yahoo.com");


        driver.findElement(By.id("input-enquiry")).sendKeys("please tell me the registration fees");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String msg = driver.findElement(By.xpath("//p[text()='Your enquiry has been successfully sent to the store owner!']")).getText();

        if (msg.equals("Your enquiry has been successfully sent to the store owner!")) {
            System.out.println("enquiry has been sent successfully");
        } else {
            System.out.println("enquiry has not been sent successfully");
        }


    }


    //scenario:          9. Verify Newsletter Subscription
    @Test(priority = 10, dependsOnMethods = {"loginTest"})
    public void NewsletterSubscriptionTest() {

        driver.findElement(By.xpath("//a[text()='Newsletter']")).click();

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();

        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        String msg = driver.findElement(By.xpath("//div[normalize-space()='Success: Your newsletter subscription has been successfully updated!']")).getText();


        if (msg.equals("Success: Your newsletter subscription has been successfully updated!")) {
            System.out.println("newsletter subscription has been working fine");
        } else {
            System.out.println("newsletter subscription has not been working fine");
        }
    }


    //scenario:    Validate Login with Invalid Credentials
    @Test(priority = 10)
    public void logininvalidcredsTest() {

        driver.findElement(By.id("input-email")).clear();

        driver.findElement(By.id("input-email")).sendKeys("xyz");

        driver.findElement(By.id("input-password")).clear();

        driver.findElement(By.id("input-password")).sendKeys("abc");


        driver.findElement(By.xpath("//input[@value='Login']")).click();

        String msg = driver.findElement(By.xpath("//div[normalize-space()='Warning: No match for E-Mail Address and/or Password.']")).getText();


        if (msg.equals("Warning: No match for E-Mail Address and/or Password.")) {
            System.out.println("creds are invalid");
        } else {
            System.out.println("creds are valid");
        }

    }


    //scenario:           Validate Registration with Missing Required Fields;      missing name field
    @Test(priority = 10)
    public void RegistrationmissingfieldsTest() {


        driver.findElement(By.id("input-firstname")).clear();


        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys("Roy");


        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("jddd34@example.com");


        driver.findElement(By.id("input-telephone")).clear();
        driver.findElement(By.id("input-telephone")).sendKeys("1238880003");

        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("Password1239");


        driver.findElement(By.id("input-confirm")).clear();
        driver.findElement(By.id("input-confirm")).sendKeys("Password1239");

        // Agree to the Privacy Policy
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        if (!privacyPolicyCheckbox.isSelected()) {
            privacyPolicyCheckbox.click();
        }


        // Click the Continue button to submit the form
        driver.findElement(By.xpath("//input[@value='Continue']")).click();


        String msg = driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText();
        if (msg.equals("First Name must be between 1 and 32 characters!")) {
            System.out.println("validation msg has been showing successfully");
        } else {
            System.out.println("validation msg has not been showing successfully");
        }

    }


    //scenario:           Validate Search with Non-Existing Product
    @Test(priority = 11, dependsOnMethods = {"loginTest"})
    public void SearchWithInvalidProdTest() {

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("XYZ123", Keys.ENTER);
        String msg = driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).getText();

        if (msg.equals("There is no product that matches the search criteria.")) {
            System.out.println("invalid product");
        } else {
            System.out.println("valid product");
        }
    }


    //Validate Search with Empty Input
    @Test(priority = 12, dependsOnMethods = {"loginTest"})
    public void SearchWithEmtryProdTest() {


    }


//******************

    //5 tc's


    //need to correct the priority

    //Update Product Quantity in the Cart
    //Wishlist Functionality
    //Filter Products by Category


    //Remove a Product from the Cart
    @Test(priority = 12, dependsOnMethods = {"loginTest", "searchTest"})
    public void RemoveProductTest() {

        driver.findElement(By.xpath("(//button//span[text()='Add to Cart'])[3]")).click();

        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();

        driver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();

        String msg = driver.findElement(By.xpath("(//p[text()='Your shopping cart is empty!'])[2]")).getText();

        Assert.assertEquals(msg, "Your shopping cart is empty!");

    }



    //6. Update Product Quantity in the Cart
    @Test(priority = 12, dependsOnMethods = {"loginTest", "searchTest"})
    public void UpdateProductQuantityTest() {

        driver.findElement(By.xpath("(//button//span[text()='Add to Cart'])[3]")).click();

        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();


        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).clear();


        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(String.valueOf(3));
        driver.findElement(By.xpath("//button[@data-original-title='Update']")).click();

        String msg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

        //Assert.assertEquals(msg, "Success: You have modified your shopping cart!");

    }



    //13 jan:


    @Test(priority = 12, dependsOnMethods = {"loginTest", "searchTest"})
    public void WishlistFunctionalityTest() {

        driver.findElement(By.xpath("(//button[@data-original-title='Add to Wish List'])[2]")).click();

       String msg= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

//ssert.assertEquals(msg, "Success: You have added MacBook Air to your wish list!");

        driver.findElement(By.xpath("//span[text()='Wish List (1)']")).click();

       boolean exist= driver.findElement(By.xpath("(//a[text()='MacBook Air'])[2]")).isDisplayed();

        Assert.assertTrue(exist);

    }




    //Filter Products by Category
    //@Test(priority = 12, dependsOnMethods = {"loginTest", "searchTest"})
    public void FilterProductsbyCategoryTest() {


    }





    //******

}





























