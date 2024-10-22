package Selenium_01;

import org.openqa.selenium.chrome.ChromeDriver;


public class Opening_browser {
    public static void main(String[] args) {

        ChromeDriver chrome =new ChromeDriver();
        chrome.get("https://www.educative.io/answers/how-to-create-a-method-in-java");

        //closing browser
        chrome.quit(); // Closing browser

        //closing 1 tab
        //chrome.close();

    }
}
