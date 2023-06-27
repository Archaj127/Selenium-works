package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redex {
	ChromeDriver d;
	
	@Before
	public void tt()
	{
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void ttt()
	{
		d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("thfh");
		d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("u78");
	}
	

}
