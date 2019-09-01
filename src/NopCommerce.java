import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        //click on login button
        driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
        // enter e-mail address
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("testtest1@test.com");
        // enter password
        driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("abcd1234");
        //click on login
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
        //click on mac product
        driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        // email a friend
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //enter a friend email
        driver.findElement(By.id("FriendEmail")).sendKeys("vaibhavshah_01@yahoo.com");
        //enter personal email
        driver.findElement(By.xpath("//input[@data-val=\"true\"]")).click();
        //enter a personal message
        driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("pls check a deal");
        //click on send email button
        driver.findElement(By.xpath("//input[@value=\"Send email\"]")).click();
        //driver.close


    }
}
