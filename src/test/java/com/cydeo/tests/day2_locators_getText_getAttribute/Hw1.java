package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {


    public static void main(String[] args) throws InterruptedException {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("Wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon - Etsy”
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is verified");
        } else {
            System.out.println("Title is NOT verified!!!");
        }

        Thread.sleep(5000);
        driver.close();
    }

}



