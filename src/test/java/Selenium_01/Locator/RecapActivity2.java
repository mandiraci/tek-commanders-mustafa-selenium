package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapActivity2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        By signInLocator = By.id("signinLink");
        driver.findElement(signInLocator).click();

        By emailLocator =By.name("email");
        WebElement emailElement=driver.findElement(emailLocator);

        emailElement.sendKeys("musty@hotmail.com");
        Thread.sleep(1000);

        By passWordLocator =By.name("password");
        WebElement emailPassword=driver.findElement(passWordLocator);
        emailPassword.sendKeys("12345");
        Thread.sleep(1000);

        By loginLocator = By.id("loginBtn");
        WebElement logIn =driver.findElement(loginLocator);
        logIn.click();
        Thread.sleep(1000);

        By errorMessage =By.className("error");
        WebElement errorElement= driver.findElement(errorMessage);
        String errorTest=errorElement.getText();
        System.out.println(errorTest);

        driver.close();




    }
}
