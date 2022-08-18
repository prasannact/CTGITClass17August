package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksJavaScript {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[text()='Log in / Register'])[1]")).click();
	
	Thread.sleep(1000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
	js.executeScript("arguments[0].setAttribute('value','vikramm12')", email);
	
	Object x = js.executeScript("return arguments[0].getAttribute('value')", email);
	
   
	String s = String.valueOf(x);
	
	System.out.println(s);
	
	
	
	
	
}
}
