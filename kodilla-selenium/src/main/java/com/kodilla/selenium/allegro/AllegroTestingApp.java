package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kodilla/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        WebElement acceptCookies = driver.findElement(By.xpath("//*[@role=\"alertdialog\"]/div/button"));
        acceptCookies.click();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"mp7g_oh mr3m_1 _r65gb\"]/select"));
        Select category = new Select(categoryCombo);
        category.selectByValue("/kategoria/elektronika");

        WebElement searchField = driver.findElement(By.xpath("//*[@class=\"mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _535b5_3gmLS mp7g_oh\"]/input"));
        searchField.sendKeys("Mavic mini");
        searchField.submit();




    }
}
