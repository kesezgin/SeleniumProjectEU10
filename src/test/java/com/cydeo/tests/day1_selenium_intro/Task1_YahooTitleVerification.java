package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String CurrentTitle=driver.getTitle();

        if (CurrentTitle.equals("Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos")) {
            System.out.println("yes, it matches the title!!!");
        } else {
            System.out.println("no, it does not match with the title given");
        }
        Thread.sleep(3000);

        driver.quit();

    }

}
