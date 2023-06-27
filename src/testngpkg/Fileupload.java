package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
		
		ChromeDriver d;
		
		@BeforeTest
		public void bsetup()
		{
			d=new ChromeDriver();
		}
		
		@BeforeMethod
		public void burlload()
		{
			d.get("https://demo.guru99.com/test/upload/");
		}
		
		
		@Test
		public void test2()
		{
			d.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:\\gettyimages-171271182-612x612.jpg");
			d.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
			
		}
}
