package Selenium_01;

import org.openqa.selenium.safari.SafariDriver;

public class Home01 {
    public static void main(String[] args) throws InterruptedException{
        SafariDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://chatgpt.com");
        Thread.sleep(10_000);
        driver.quit();
    }
}
