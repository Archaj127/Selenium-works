package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver d;
	
	@Before
	public void radiostart()
	{
		d=new ChromeDriver();
		d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void radiotest()
	{
		Boolean r=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(r)
		{
			System.out.println("male radio button selected");
		}
		else
		{
			System.out.println("male radio button not selected");
		}
	}
	

}
