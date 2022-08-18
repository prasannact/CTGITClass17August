package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksGettextGetAttributes {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@aria-label='Log in / Register']")).click();
	
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
	email.sendKeys("VIKRAM@red.com");
	String input = email.getText();
	System.out.println(input);
	
	
	WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
	password.sendKeys("GHOSTkaml007");
	String pass = password.getAttribute("id");
	System.out.println("getAttribute\n");
	System.out.println(pass);
	
	
	
	
}
}
