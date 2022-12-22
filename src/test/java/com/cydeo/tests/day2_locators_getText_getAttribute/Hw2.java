package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

    public static void main(String[] args) throws InterruptedException {


        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”//
        String expectedHeaderText = "Log in to ZeroBank";
        WebElement actualText = driver.findElement(By.tagName("h3"));
        if(expectedHeaderText.equals(actualText.getText())){
            System.out.println("Header Text is verified");
        } else {
            System.out.println("Header Text is NOT verified!!!");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
