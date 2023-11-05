package com.myfirstproject;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxTest {
    public static void main(String[] args) {

       // Create a new class under : FirefoxTest
        WebDriverManager.firefoxdriver().setup();
        // Create firefox driver
        WebDriver driver = new FirefoxDriver();
      //  Open google home page https://www.amazon.com/
        driver.get("https://www.amazon.com");
      //  Maximize the window
        driver.manage().window().maximize();
        // Close/Quit the browser
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();






    }
}
