package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabl1 {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(2000);
   //no of row present in table
	List<WebElement> noofrow = driver.findElements(By.xpath("//table[@id='product']//tr"));
	System.out.println("No of Row ="+ noofrow.size());
		for (int i=1;i<noofrow.size();i++ ) {
	List<WebElement> noofcell = driver.findElements(By.xpath("//table[@id='product']//tr ["+(i+1)+"] //td"));
			System.out.println("Row no =" +i+ "No of Cell" +noofcell.size());
	
	for(int cell=0;cell<noofcell.size();cell++) {
		System.out.print(noofcell.get(cell).getText()+", ");
		
	}
	System.out.println();
		}}}