package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingIdLocator {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://retail.tekschool-students.com/");


         //Step 1 Locate the Element
         By signInlink = By.id("signinLink");

        // Step 2 asking Selenium to Find the Element
        WebElement signInElement =driver.findElement(signInlink);



        //Step 3 Perform the action
        signInElement.click();
        Thread.sleep(10_000);


        driver.quit();
    }
}
