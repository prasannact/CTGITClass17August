package org.clarks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksBrowserlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\SkechersProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.clarksusa.com/");
		driver.manage().window().maximize();
		
		System.out.println("Done");
		
	}
	
	
	
	
	
	
}


