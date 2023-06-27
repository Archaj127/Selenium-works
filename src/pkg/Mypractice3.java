package pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mypractice3 {
	
	ChromeDriver d;
	
	@Before
	public void sc1()
	{
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void sc2() throws Exception
	{
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File ("E:\\sc1.png"));
		
		WebElement b=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[1]"));
		File f1=b.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f1, new File("E:\\sc2.png"));
	}

}
