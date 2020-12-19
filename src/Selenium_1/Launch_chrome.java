package Selenium_1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://www.google.com");
        cd.manage().window().maximize();

    }

}
