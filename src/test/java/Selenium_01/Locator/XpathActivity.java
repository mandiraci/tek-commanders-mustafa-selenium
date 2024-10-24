package Selenium_01.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //By videoGamesLocator= By.className("image");

        By videoGamesLocator= By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img");

        driver.findElement(videoGamesLocator).click();

        By games =By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/img");
       driver.findElement(games).click();





        Thread.sleep(3000);

        By psTitleLocator=By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/h1");
        String productTitle= driver.findElement(psTitleLocator).getText();
        System.out.println(productTitle);
        driver.close();
    }
}
