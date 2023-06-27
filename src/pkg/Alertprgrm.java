package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver d;
	
	@Before
	public void Alertstart()
	{
		d=new ChromeDriver();
		d.get("file:///C:/Users/admin/Videos/alert.html");
	}
	
	@Test
	public void alerttest()
		{
			d.findElement(By.xpath("/html/body/input[1]")).click();
			
			//Handle alert
			Alert a=d.switchTo().alert();
			String s=a.getText();
			if(s.equalsIgnoreCase("Hello Iam alert box!"))
			{
				System.out.println("text is as expected");
			}
			else
			{
				System.out.println("text is not expected");
			}
			a.accept();
			d.findElement(By.xpath("/html/body/input[2]")).sendKeys("Archana");
			d.findElement(By.xpath("/html/body/input[3]")).sendKeys("Jain");
			d.findElement(By.xpath("/html/body/input[4]")).click();

		}
	}
	


