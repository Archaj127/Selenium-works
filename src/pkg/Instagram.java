package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	ChromeDriver d;
	
	@Before
	public void Start1()
	{
		d=new ChromeDriver();
		d.get("https://www.instagram.com");
	}
	@Test
	public void Tct()
	{
		d.findElement(By.name("username")).sendKeys("fghyj");
		d.findElement(By.name("password")).sendKeys("tyuik");
		
	}
	

}
