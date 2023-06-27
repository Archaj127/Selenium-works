package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment6 {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		
		String s="Dropped";
		String ot=drop.getText();
		Assert.assertEquals(s, ot);
		System.out.println("Dropped successfully");
	}

}
