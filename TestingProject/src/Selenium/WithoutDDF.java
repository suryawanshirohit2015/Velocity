package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7654321");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
        
        
		String expectedUID = "OKP335";
		
		if(expectedUID.equals(ActualUID)) {
			System.out.println("TC PASS");
		}
		else 
			System.out.println("TC fail");
		}
		
		
		
		

	}


