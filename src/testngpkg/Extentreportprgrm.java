package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportprgrm {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest()
	public void btest()
	{
		reporter=new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("funtional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows 10");
		extent.setSystemInfo("tester name", "Archana");
		extent.setSystemInfo("Browser name", "chrome");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void bsetup()
	{
		
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("Fbtitleverification");
		String exp="facebook.com";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
	}
	@Test
	public void fbbuttontest()
	{
		test=extent.createTest("Fbbuttontest");
		String buttontext=driver.findElement(By.name("login")).getText();
		Assert.assertEquals(buttontext, "Log in");
	}
	@AfterTest
	public void rear()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case  failed"+result.getName());
			test.log(Status.FAIL, "test case  failed"+result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
			
		}
	}
}
	
	
   
   

