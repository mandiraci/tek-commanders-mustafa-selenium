package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Name_Locator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLocator=By.id("signinLink");
        driver.findElement(signInLocator).click();

         Thread.sleep(3000);

        //Locate Element with name attribute
        By emailInputLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailInputLocator);

        //For input elements, you can type to those elements
        // use sendKeys method to enter a value into an input element
        emailElement.sendKeys("mistin@gmal.com");



    }
}
