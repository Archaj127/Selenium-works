package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiffbutton {
	
	ChromeDriver d;
	
	@BeforeTest(alwaysRun=true)
	public void bsetup()
	{
		d=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void burlload()
	{
		d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void test2()
	{
		WebElement e=d.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]"));
		String s=e.getAttribute("value");
		String s1="Check availability";
		if(s.equals(s1))
		{
			System.out.println("Expected text");
		}
		else
		{
			System.out.println(" Not Expected text");
		}
			
	}
	@AfterMethod
	public void confirm()
	{
		System.out.println("Text verified");
	}
	

}
