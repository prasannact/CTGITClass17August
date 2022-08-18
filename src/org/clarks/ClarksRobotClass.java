package org.clarks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClarksRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.clarksusa.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("(//a[text()='Log in / Register'])[1]")).click();
		 
		 Thread.sleep(2000);
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
		 email.sendKeys("Vikramm12");
		 
		 //ACTIONS CLASS
		Actions a = new Actions(driver);
		a.doubleClick(email).contextClick(email).perform();
		
		//ROBOT CLASS
		Robot r = new Robot();
		
		for (int i = 0; i <3; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		for (int i = 0; i <7; i++) {
			
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	}	

