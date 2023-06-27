package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
   @BeforeMethod
   public void url()
   {
	   driver.get("https://www.expedia.com/");
   }
   @Test
   public void date()
   {
	   driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
   }
}
