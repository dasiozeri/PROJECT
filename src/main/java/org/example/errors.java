package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errors {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");


        driver.findElement(By.id("firstname")).sendKeys("Hadasa");
        driver.findElement(By.id("lastname")).sendKeys("ab");
        driver.findElement(By.id("email")).sendKeys("123");

        driver.findElement(By.id("next")).click();


//        מילוי שגיאות- שיעורי בית 3




//שאלה 1
        // שם משפחה
        String errMessage1 = driver.findElement(By.id("lastname-error")).getText();
        if (errMessage1.equals("Please enter at least 3 characters.")) {
            System.out.println("ההודעה תקינה");
        } else {
            System.out.println("ההודעה לא תקינה");
        }


        //מייל

        String errMessage2 = driver.findElement(By.id("email-error")).getText();
        if (errMessage2.equals("Please enter a valid email address.")) {
            System.out.println("ההודעה תקינה");
        } else {
            System.out.println("ההודעה לא תקינה");
        }


//שאלה 2
        driver.findElement(By.id("firstname")).sendKeys("dasi");
        driver.findElement(By.id("lastname")).sendKeys("ozeri");
        driver.findElement(By.id("email")).sendKeys("dasi4180875@gmail.com");

        driver.findElement(By.id("next")).click();



        String check = driver.findElement(By.className("moving-tab")).getText();
        if (check.equals("Account")) {
            System.out.println(" המעבר לטאב השני הצליח");
        } else {
            System.out.println("המעבר לטאב השני לא הצליח");
        }

//שאלה 3

        driver.findElement(By.id("Beginner")).click();
        driver.findElement(By.id("next")).click();



//שאלה 4

        driver.findElement(By.id("streetname")).sendKeys("Rabyy Akiva");
        driver.findElement(By.id("streetnumber")).sendKeys("4");
        driver.findElement(By.id("city")).sendKeys("Modiin Ilit");
        driver.findElement(By.id("country")).sendKeys("Israel");
        driver.findElement(By.id("finish")).click();




    }

}