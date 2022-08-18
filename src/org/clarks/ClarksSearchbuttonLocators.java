package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksSearchbuttonLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\SkechersProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.clarksusa.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		search.sendKeys("Mens Shoes");
		
		driver.findElement(By.xpath("(// button[@type='submit'])[1]")).click();
	}
}
