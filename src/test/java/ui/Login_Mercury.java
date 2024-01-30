package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Mercury {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        // driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();
        String expValue = "Login: Mercury Tours";
        String actValue = driver.getTitle();
        if (expValue.equalsIgnoreCase(actValue))
            System.out.println("Test Passed!");
        else
            System.out.println("Test Failed");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.close();
    }
}
