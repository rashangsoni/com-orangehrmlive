package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // 1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2. Open URL
        String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // 4. Print the current url
        System.out.println("Current Url : " + driver.getCurrentUrl());
        // 5. Print the page source
        System.out.println("Page Resource : " + driver.getPageSource());
        WebElement usernamelink = driver.findElement(By.name("username"));
        // 6. Enter the email to email field
        usernamelink.sendKeys("rashangs@yahoo.co.uk");
        // 7. Enter the password to password field
        WebElement passwordlink = driver.findElement(By.name("password"));
        passwordlink.sendKeys("Jaisrikrishana@12");
        // 8. Close the browser
         driver.close();

    }

}
