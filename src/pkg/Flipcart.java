package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	ChromeDriver d;
	@Before
	public void fbefore()
	{
		d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
	}
	@Test
	public void ftest()
	{
		d.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		d.findElement(By.xpath("//div[@class='exehdJ']")).click();
		
	}
	

}
