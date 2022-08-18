package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksLocators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\SkechersProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//a[@aria-label='Log in / Register']")).click();
	
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
	email.sendKeys("VIKRAM@red.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
	password.sendKeys("GHOSTkaml007");
	
	
	driver.findElement(By.xpath("//a[@class='show-hide-password show-hide-password__show']")).click();
	
	
	
}
}
