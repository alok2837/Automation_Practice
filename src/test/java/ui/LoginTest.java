package ui;

import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.kent.qa.eschein.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("Accept all")).click();
		driver.findElement(By.xpath("//nav[2]//div//div[1]/p[2]/a")).click();
		driver.findElement(By.id("//*[@id=\"mat-input-4\"]")).sendKeys("msdental");
		driver.findElement(By.id("//*[@id=\"mat-input-5\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//form//div[2]//button")).click();
		driver.close();
	}
}