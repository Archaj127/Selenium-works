package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Asertionprgrm {
	
	ChromeDriver d;
	
	public class Reddiffbutton {
		
		ChromeDriver d;
		
		@BeforeTest
		public void bsetup()
		{
			d=new ChromeDriver();
		}
		
		@BeforeMethod
		public void burlload()
		{
			d.get("http://register.rediff.com/register/register.php?FormName=user_details");
		}
		@Test
		public void test()
		{
			WebElement l=d.findElement(By.xpath("//*[@id=\"Register\"]"));
					Assert.assertEquals(true, l.isDisplayed());
					System.out.println("button displayed");
		}
		
}
}
