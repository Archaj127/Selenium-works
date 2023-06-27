package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypractice1 {
	
	ChromeDriver driver;
	
	@Before
	public void my1()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void my2()
	{
		List <WebElement> lname=driver.findElements(By.tagName("a"));
		System.out.println("links="+lname.size());
		 
		for(WebElement l:lname)
		{
			String s=l.getText();
			String s1=l.getAttribute("href");
			System.out.println(s+"----"+s1);
		}
	}
	

}
