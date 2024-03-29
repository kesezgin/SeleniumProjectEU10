package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB2 {


    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("qqqqqqqq@qqqqqq.com");

        //4. Enter incorrect password
        WebElement pwdBox = driver.findElement(By.name("pass"));
        pwdBox.sendKeys("pppppppppppppppp");

        driver.findElement(By.name("login")).click();
        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is verified");
        } else {
            System.out.println("Title is NOT verified");
        }

    }


}
