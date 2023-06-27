package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandle {
	WebDriver driver;
	
	@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			
		}
	@BeforeMethod
	
		public void urlload()
		{
			driver.get("http://demo.guru99.com/popup.php");
		}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			}
		}
	}
	
	


