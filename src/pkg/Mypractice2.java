package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypractice2 {
	
	ChromeDriver driver;
	
	@Before
	public void al1()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Videos/alert.html");
	}
	
	@Test
	public void al2()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Archana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("j");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	

}
