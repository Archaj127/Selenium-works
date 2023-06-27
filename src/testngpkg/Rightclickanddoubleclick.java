package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickanddoubleclick {
ChromeDriver driver;
	
	@BeforeTest
	public void bsetup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void burlload()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions a=new Actions(driver);
		a.contextClick(button);
		a.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		a.doubleClick(button1);
		a.perform();
		Alert a2=driver.switchTo().alert();
		String s=a2.getText();
		System.out.println(s);
		a2.accept();
		
		
	}
}
