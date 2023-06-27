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

public class Screenshotprgrm {
	ChromeDriver d;
	
	@Before
	public void screen1()
	{
		d=new ChromeDriver();
		d.get("file:///C:/Users/admin/Videos/alert.html");
	}
	@Test
	public void screen2() throws Exception
	{
		//Takes Page Screenshot
		File f1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f1, new File("E://screen1.png"));
		
		//Takes element screenshot
		WebElement button=d.findElement(By.xpath("/html/body/input[1]"));
		File f2=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f2,new File ("./Screenshot/screen2.png"));
	}

}
