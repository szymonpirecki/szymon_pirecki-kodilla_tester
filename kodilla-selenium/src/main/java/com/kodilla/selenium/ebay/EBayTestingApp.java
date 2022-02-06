package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kodilla/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.ebay.com/");
//        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
//        acceptCookies.click();
        WebElement searchField = driver.findElement(By.name("_nkw"));
        searchField.sendKeys("laptop");
        searchField.submit();




    }
}
