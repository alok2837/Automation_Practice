package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/request-demo/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).sendKeys("hello@gmail.com");
        Thread.sleep(4000);
        driver.close();
    }
}