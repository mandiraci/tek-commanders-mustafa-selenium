package Selenium_01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Setting {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // maximize Browser
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);
        driver.quit();

    }
}
