package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex {
	ChromeDriver d;
	
	@BeforeMethod
	public void setup()
	{
		d=new ChromeDriver();
		
	}
	@Test
	public void test() throws InterruptedException 
	{
		d.get("https://www.ebay.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
		
		d.findElement(By.xpath("//*[@id=\"userid\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("archaj1212@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).click();
		
		/*d.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Myshopping123*");
		d.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();*/
	}
	

}
