package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment8 {
ChromeDriver driver;
	
	@BeforeTest
	public void bsetup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void burlload() throws InterruptedException
	{
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("archanajain12995@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
	}
	

}
