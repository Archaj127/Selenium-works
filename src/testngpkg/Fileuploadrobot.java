package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	ChromeDriver d;
	
	@BeforeTest
	public void setup()
	{
		d=new ChromeDriver();
	}
	
    @Test
    public void test() throws Exception
    {
    	d.get("https://www.ilovepdf.com/word_to_pdf");
    	d.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
    	fileUpload("E:\\Shone jacob Details.docx");    //define a method fileupload and pass file path
    }
    
    //create a separate method for fileupload
    public void fileUpload(String p) throws AWTException 
    {
    	
    	//copy file to clipboard
    	StringSelection strSelection=new StringSelection(p);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
    	
    	//create robot class
    	Robot robot=new Robot();
    	//robot.delay(3000);
    	robot.keyPress(KeyEvent.VK_CONTROL);   //paste file
    	robot.keyPress(KeyEvent.VK_V);
    	
    	robot.keyRelease(KeyEvent.VK_CONTROL);  
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyPress(KeyEvent.VK_ENTER);  //enter
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    }
}
