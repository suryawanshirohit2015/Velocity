package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass4 {
	                                                           //drag and drop
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act= new Actions(driver);
		
		//act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		act.dragAndDrop(source, dest).perform();
		
	}
	 

}
