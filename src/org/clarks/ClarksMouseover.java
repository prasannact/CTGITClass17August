package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClarksMouseover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	Actions a = new Actions(driver);
	
	WebElement womens = driver.findElement(By.xpath("(//button[@data-test='flyout-women'])[1]"));
	a.moveToElement(womens).perform();
	
	WebElement widefit = driver.findElement(By.xpath("(//a[text()='Wide Fit'])[1]"));
	a.moveToElement(widefit).click().perform();
	
	
	
	
	
}
}
