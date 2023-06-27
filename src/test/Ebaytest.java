package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Ebaypage;

public class Ebaytest {
	WebDriver driver;
	@BeforeClass
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test() throws InterruptedException
	{
		Ebaypage e=new Ebaypage(driver);
		
		
		e.category();
		Thread.sleep(3000);
		e.productenter();
		e.searching();
		e.productlist();
		e.tenproduct(10);
		
	}

}
