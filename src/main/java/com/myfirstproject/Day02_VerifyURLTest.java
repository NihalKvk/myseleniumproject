package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL ; "+currentURL);
        if (currentURL.equals("https://www.amazon.com/")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL ; Actual URL "+currentURL+" but expected URL is https://www.amazon.com  ");
        }
        driver.quit();






    }
}
