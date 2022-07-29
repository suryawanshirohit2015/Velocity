package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	  Alert promptAlert = driver.switchTo().alert();
	  System.out.println(promptAlert.getText());
	  promptAlert.sendKeys("yes");
	//  promptAlert.accept();
	  promptAlert.dismiss();
	  
		Thread.sleep(2000);
	System.out.println(driver.findElement(By.id("demoone")).getText());


	}
}
