package org.clarks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clarks_WindowsHandle {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();
	
	WebElement go = driver.findElement(By.xpath("(//button[@class='new-header__search-btn'])"));
	go.click();
	driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("violet 55 court");
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	
	
	
	String parttab = driver.getWindowHandle();
	Set<String> allwindows = driver.getWindowHandles();
	
	for(String each : allwindows) {
		if(!parttab.equals(each)) {
			driver.switchTo().window(each);
			
		}
	}
	
	Thread.sleep(2000);
	
	WebElement product = driver.findElement(By.xpath("(//img[@loading='lazy'])[3]"));
   Actions  a = new Actions(driver);
   a.moveToElement(product).perform();
   a.contextClick(product).perform();
   
   Robot r = new Robot();
   for (int i = 0; i<2; i++) {
	

   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   
   }
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyPress(KeyEvent.VK_ENTER);
   
 
  
}
	
}

