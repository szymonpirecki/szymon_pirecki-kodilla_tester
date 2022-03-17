package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class EBayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kodilla/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement categoryCombo = driver.findElement(By.cssSelector("#gh-cat"));
        Select category = new Select(categoryCombo);
        category.selectByVisibleText("Cameras & Photo");

        WebElement searchField = driver.findElement(By.cssSelector("#gh-ac"));
        searchField.sendKeys("Mavic Mini");
        searchField.submit();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("li[class*='s-item']"), 0));

        List<WebElement> items = driver.findElements(By.cssSelector("li[class*='s-item']"));
        List<String> texts = new ArrayList<>();
        for (WebElement item : items) {
            texts.add(item.getText());
        }
        int counter = 0;

        for (String item : texts) {
            counter++;
            System.out.println(counter);
            System.out.println("------");
            System.out.println(item);
            System.out.println("------");
        }
        driver.quit();
    }
}