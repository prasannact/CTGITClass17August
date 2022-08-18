package org.clarks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarksScrollup_down_Highlight {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsannt\\eclipse-workspace\\ClarksProject\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.clarksusa.com/");
	driver.manage().window().maximize();

	Thread.sleep(1000);
	
     driver.findElement(By.xpath("(//a[text()='Log in / Register'])[1]")).click();
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement downpt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	js.executeScript("arguments[0].scrollIntoView(false)", downpt);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
	js.executeScript("arguments[0].setAttribute('value','VIKRAMMM')", email);

	js.executeScript("arguments[0].setAttribute('style','background:red; border:15px solidblack')", email);
	js.executeScript("arguments[0].setAttribute('style','fontsize:30 px; text-align:right')", email);
	
}
}
