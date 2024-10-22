package Selenium_01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity01 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");

        driver.manage().window().maximize();


        String titlePage = driver.getTitle();

        System.out.println(titlePage);
        driver.quit();
    }
}
