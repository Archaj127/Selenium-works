package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncart {
WebDriver driver;
	
	@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			
		}
	@BeforeMethod
	
		public void urlload()
		{
			driver.get("https://www.amazon.in/");
		}
	@Test
	public void test() throws InterruptedException
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();
				System.out.println("cart page title"+driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		
	}

}
}
