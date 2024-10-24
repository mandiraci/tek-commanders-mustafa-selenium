package Selenium_01.Locator.Reviev;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class Activity_01 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input =new Scanner(System.in);
        System.out.println("which browser you like to use 1:for edge, 2 for Safari");
        int safariOrEdge =input.nextInt();
        switch (safariOrEdge) {
             case 1:

            ChromeDriver driver = new ChromeDriver();
            driver.get("https://dev.retail.tekschool-students.com/");

            String pageTitle = driver.getTitle();
            System.out.println("Edge " + pageTitle);
            Thread.sleep(3000);
            driver.quit();
            break;

            case 2:
            SafariDriver safDriver = new SafariDriver();
            safDriver.get("https://dev.retail.tekschool-students.com/");
            String safPageTitle = safDriver.getTitle();
            System.out.println("Safari " + safPageTitle);
            Thread.sleep(3000);
            safDriver.quit();
            break;
        }


    }
}
