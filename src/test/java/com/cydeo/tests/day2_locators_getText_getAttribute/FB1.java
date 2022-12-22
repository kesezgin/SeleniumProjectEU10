package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB1 {


    public static void main(String[] args) throws InterruptedException {


//    TC #1: Facebook title verification
//    1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//    2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

//    3. Verify title:
//    Expected: “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title is verified");
        } else {
            System.out.println("Title is NOT verified!!!");
        }

        //Thread.sleep(3000);
        //driver.close();
    }

}
