package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Favexpath {

	ChromeDriver d;
	
	@Before
	public void star()
	{
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	@Test
	public void t1()
	{
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("ath@gmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("hghj");
		d.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
}
