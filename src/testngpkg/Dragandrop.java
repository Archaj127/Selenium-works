package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragandrop {
ChromeDriver driver;
	
	@BeforeTest
	public void bsetup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void burlload()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).perform();
		String droptrxt=to.getText();
		if(droptrxt.equals("Dropped!"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("not verified");
		}
	
}
}
