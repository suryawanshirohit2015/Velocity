package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BySELECT {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
WebElement month =	driver.findElement(By.xpath("//select[@title='Month']"));
	Select s = new Select(month);
	//s.selectByIndex(3);
	s.selectByVisibleText("Dec");
//	s.selectByValue("11");

		
		
		
	}

}
