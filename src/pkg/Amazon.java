package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver d;
	
	@Before
	public void strt()
	{
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
	}
	@Test
	public void te1()
	{
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);
		
		d.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		d.findElement(By.xpath("//div[@class='nav-line-1-container']/span[1]")).click();
		d.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("gjjhj@gmail.com");
		d.findElement(By.xpath("//input[@id='continue']")).click();
		d.navigate().back();
		d.navigate().back();
		d.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
		d.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
		
	}
	

}
