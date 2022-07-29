package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\"");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		WebElement female=driver.findElement(By.xpath("//input[@type='radio']"));
		female.click();
	    Thread.sleep(2000);
	   boolean result = female.isSelected();
	   System.out.println(result);
	   
	   if(result==true) {
		   System.out.println("element is selected");
	   }
	   else {
		   System.out.println("element is not selected");
	   }
	    
	    
		
		

	}

}
