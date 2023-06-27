package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Seleniumassignment1 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.navigate().to("https://qatechhub.com/");
		String expected="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println("Pass");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		String curl=driver.getCurrentUrl();
		System.out.println("current url="+curl);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
//THANKS FOR WATCHING.....
