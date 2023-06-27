package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;
import utilities.Excelhandle;

public class Fblogintest extends Baseclass1 {
	
	@Test
	public void fbtest()
	{
		Fbloginpage fb=new Fbloginpage(driver);
 //Reading the data from excel file by specified path
		String x1="E:\\testdata1.xlsx";
		String sheet="Sheet1";
		//call method in the excelhandle class
		int rowCount=Excelhandle.getRowCount(x1, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelhandle.getCellValue(x1, sheet, i, 0);
			System.out.println("username---"+UserName);
			String pwd=Excelhandle.getCellValue(x1, sheet,i, 0);
		//passing username and password as parameters
		     fb.setvalues(UserName, pwd);
		  //submitting the data by clicking login button
		     fb.login();
		
		//validating login
		String expecturl="https://www.facebook.com/";
		String s=driver.getCurrentUrl();
		if(expecturl.equals(s))
		{
			System.out.println("validated successfully");
		}
		else
		{
			System.out.println("validated failed");
		}
		
	}

}
}
