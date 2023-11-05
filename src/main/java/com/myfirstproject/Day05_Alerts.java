package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

public class Day05_Alerts extends TestBase {

//    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
//    Create a class: AlertTest
//    Create 3 test methods:
//    acceptAlert() => click on the first alert,
//    verify the text “I am a JS Alert” ,
//    click OK ,
//    and Verify “You successfully clicked an alert”
//    dismissAlert()=> click on the second alert,
//    verify text "I am a JS Confirm”,
//    click cancel,
//    and Verify “You clicked: Cancel”
//    sendKeysAlert()=> click on the third alert,
//    verify text “I am a JS prompt”,
//    type “Hello World”,
//    click OK,
//    and Verify “You entered: Hello World”


    @Test
    public void acceptAlert(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


    }




}
