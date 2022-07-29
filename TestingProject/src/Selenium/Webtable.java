package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		//no of row present in table
		List<WebElement> noofRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("No of rows:"+ noofRow.size());
		
		for(int i=1;i<noofRow.size();i++) {
			List<WebElement> noocell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("Row No :" +i+ "No Of Cell :"+ noocell.size());
			
			for(int cell=0;cell<noocell.size();cell++) {
				System.out.print(noocell.get(cell).getText()+", ");
			
			}
			
			System.out.println();
		
		
	}

}}