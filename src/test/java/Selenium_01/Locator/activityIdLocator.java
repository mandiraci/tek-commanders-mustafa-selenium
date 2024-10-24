package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activityIdLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();

        String titleRetail= driver.getTitle();
        System.out.println(titleRetail);

        //locate the element
        By signinLink = By.id("signinLink");

        //asking selenium to find the element
        WebElement signInElement=driver.findElement(signinLink);
        signInElement.click();

        By createAccount=By.id("newAccountBtn");
        WebElement creatingAccount=driver.findElement(createAccount);
        creatingAccount.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
