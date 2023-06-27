package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif {
	ChromeDriver d;
	@Before
	public void fbefore()
	{
		d=new ChromeDriver();
		d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void ftest()
	{
		boolean r=d.findElement(By.xpath("//*[@id='wrapper']/table/tbody/tr/td[1]/img")).isDisplayed ();
		if(r)
			
		System.out.println("logo is present");
		else
			System.out.println("logo is not present");
			
	}
	
	

}
