package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Day01_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
//
//        Create chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        Maximize the window
        driver.manage().window().maximize();
//        Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");
        Thread.sleep(3000);
//        On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        Navigate back to google
        driver.navigate().back();
//        Navigate forward to amazon
        driver.navigate().forward();
//        Refresh the page
        driver.navigate().refresh();
//        Close/Quit the browser
        driver.quit();








    }
}
