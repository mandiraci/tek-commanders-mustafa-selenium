package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingIdLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
         driver.get("https://retail.tekschool-students.com/");
         driver.manage().window().maximize();

         By signInlink = By.id("signinLink");

        WebElement signInElement =driver.findElement(signInlink);
        signInElement.click();
    }
}
