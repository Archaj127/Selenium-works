package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselect {

	ChromeDriver d;
	
	@Before
	public void drop1()
	{
		d=new ChromeDriver();
		d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void drop2()
	{  
		//Day
		WebElement day=(d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
		Select s=new Select(day);   //select class for drop down
	    s.selectByValue("02");      //select by value/index/visible text
	    List<WebElement>l=s.getOptions();  //drop down count
	    System.out.println("size="+l.size());
	    
	    //Month
		WebElement month=(d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
		Select s1=new Select(month);
		s1.selectByValue("07");
		List<WebElement>ll=s1.getOptions();
	    System.out.println("size="+ll.size());
	    
	    //year
		WebElement year=(d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
		Select s2=new Select(year);
		s2.selectByValue("2011");
		List<WebElement>lll=s2.getOptions();
	    System.out.println("size="+lll.size());
	}
	
	
	
	
}
