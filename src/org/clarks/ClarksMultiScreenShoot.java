package org.clarks;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksMultiScreenShoot {

   public static  WebDriver driver;
   public static void screnshot(String name) throws IOException {
	  TakesScreenshot tk=(TakesScreenshot )driver;
	  
	  File scr = tk.getScreenshotAs(OutputType.FILE);
	  
	  File des = new File("C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Screenschoots\\"+name+".jpg");
	  
	  FileUtils.copyFile(scr, des);
   }
	  
	 public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			driver.get("https://www.clarksusa.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
		screnshot("home");
		driver.findElement(By.xpath("(//a[text()='Log in / Register'])[1]")).click();
		
		Thread.sleep(2000);
		
		 WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
		 email.sendKeys("Vikramm12");
		
		 screnshot("emailname");
		 
			
		
			
	}
	  
	
}



