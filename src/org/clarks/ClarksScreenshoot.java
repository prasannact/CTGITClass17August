package org.clarks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksScreenshoot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File source = tk.getScreenshotAs(OutputType.FILE);
	
	File desc = new File ("C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Screenschoots\\CT.jpg");
	
	
	FileUtils.copyFile(source, desc);
	
	
	
	
	
	
	
	
	
	
	
}

}
