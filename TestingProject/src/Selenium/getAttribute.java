package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class getAttribute {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		
		String attribute= result.getAttribute("aria-label");
		System.out.println(attribute);
	}

}
