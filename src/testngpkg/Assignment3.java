package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment3 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void url()
	{
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement>l=driver.findElements(By.tagName("a"));
		int c=l.size();
		System.out.println("Links number--"+c);
		for(WebElement n:l)
		{
			String text=n.getText();
			String url=n.getAttribute("href");
			System.out.println(text+"----"+url);
		}
	}
	
	//THANKS FOR WATCHING...........
	
}
