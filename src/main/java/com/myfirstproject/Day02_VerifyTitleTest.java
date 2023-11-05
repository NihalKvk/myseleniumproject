package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       // Navigate to amazon homepage
        driver.get("https://www.amazon.com");

       // Verify if page title contains “Amazon”
        String actualTitle = driver.getTitle();
        System.out.println("PAGE TITLE "+ actualTitle);
        if (actualTitle.contains("Amazon")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILS");
            System.out.println("ACTUAL TITLE : " +actualTitle+" doesnt contain expected title : ");
            System.out.println("EXPECTED TITLE : Amazon");



    }
        driver.quit();
}
}
