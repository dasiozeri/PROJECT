package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
        driver.findElement(By.id("firstname")).sendKeys("Hadasa");
        driver.findElement(By.id("lastname")).sendKeys("Cohen");
        driver.findElement(By.id("email")).sendKeys("Hadasa@gmail.com");

        driver.findElement(By.id("next")).click();


        driver.findElement(By.id("Beginner")).click();


        driver.findElement(By.id("next")).click();


        driver.findElement(By.id("streetname")).sendKeys("Rabyy Akiva");
        driver.findElement(By.id("streetnumber")).sendKeys("4");
        driver.findElement(By.id("city")).sendKeys("Modiin Ilit");
        driver.findElement(By.id("country")).sendKeys("Israel");
        driver.findElement(By.id("finish")).click();














    }
}