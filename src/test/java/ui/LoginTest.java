package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.kent.qa.eschein.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("Accept all")).click();    //It is coming from Shadow root. Need to find x path for shadow root.
        //    element = driver.execute_script("return document.querySelector('#usercentrics-root').shadowRoot.querySelector("button[data-testid='uc-accept-all-button']")");
        //    element.click();
		// https://stackoverflow.com/questions/70347087/how-to-handle-the-popup-accepting-all-cookies-when-the-element-is-data-testid
		driver.findElement(By.xpath("button[data-testid='uc-accept-all-button']")).click();
		driver.findElement(By.xpath("//nav[2]//div//div[1]/p[2]/a")).click();
		driver.findElement(By.id("//*[@id=\"mat-input-4\"]")).sendKeys("msdental");
		driver.findElement(By.id("//*[@id=\"mat-input-5\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//form//div[2]//button")).click();
		driver.close();
	}
}