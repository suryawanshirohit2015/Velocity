package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suryawanshirohit2015@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rohitbhaui");
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//button[text()='Hide']")).click();
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@class,'2L')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("124");
		Thread.sleep(2000);
		
		
	
		
		
		
		
		
		
		
		
	}

}
