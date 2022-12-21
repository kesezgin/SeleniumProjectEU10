package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.tesla.com");

        Thread.sleep(3000);
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        driver.navigate().to("https://www.google.com");

        currentTitle = driver.getTitle();
        System.out.println(currentTitle);


    }

}
