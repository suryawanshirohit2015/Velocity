package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectoption {
	
	  public static void main ( String [ ] args ) throws InterruptedException { 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();  
		
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(2000);
			
			WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
			Select s = new Select(year);
			s.selectByIndex(1);
			s.selectByIndex(2);
			s.selectByIndex(3);
			
			List<WebElement> select = s.getAllSelectedOptions();
			System.out.println(select.size());
			
			WebElement sel = s.getFirstSelectedOption();
			System.out.println(sel.getText());
			
			for(int i=0;i<s.getOptions().size();i++) {
				System.out.println(s.getOptions().get(i).getText()+", ");
			}
			
	  }

	
}
