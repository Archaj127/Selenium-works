package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Saucedemo;
import utilities.Excelhandle;

public class Saucedemotest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test() throws InterruptedException
	{
		Saucedemo s=new Saucedemo(driver);
		driver.manage().window().maximize();
		String x1="E:\\saucedemo.xlsx";
		String sheet="Sheet1";
		int rowCount=Excelhandle.getRowCount(x1, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelhandle.getCellValue(x1, sheet, i, 0);
			System.out.println("username---"+UserName);
			String pwd=Excelhandle.getCellValue(x1, sheet,i, 1);
			s.setvalues(UserName, pwd);
			s.loginclick();
			s.loginver();
		
		s.drop();
		
		s.addcart();
	
		s.cartclick();
		s.removeitems();
		s.checkout();
		s.userdetails("Archana", "Jain", "689504");
		s.finish();
		s.back();
		s.menuclick();
		s.logout();
		}
	}

}
