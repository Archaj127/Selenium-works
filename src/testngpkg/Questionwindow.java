package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Questionwindow {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	String s="https://www.facebook.com";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlload()
		{
			driver.get(baseurl);
		}
		@Test
		public void test()
		{
			String parentwindow=driver.getWindowHandle();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to(s);
			Set<String> allwindowhandles=driver.getWindowHandles();
			for(String handle:allwindowhandles)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					driver.switchTo().window(handle);
					driver.navigate().back();
				}
				driver.switchTo().window(parentwindow);
				}
			}
		
		
		}


