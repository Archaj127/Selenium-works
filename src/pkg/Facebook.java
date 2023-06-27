package pkg;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver d;
	@Before
	public void start()
	{
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	@Test
	public void t1()
	{
		//locate multiple elements
		
		List<WebElement>lname=d.findElements(By.tagName("a"));
		System.out.println("links="+lname.size());
		
		//to print the links 
		for (WebElement link:lname) {
			String s=link.getText();
			String b=link.getAttribute("href");
			System.out.println(s+"-----"+b);
		}
		
		//locate specific element
		d.findElement(By.id("email")).sendKeys("amay@com");
		d.findElement(By.id("pass")).sendKeys("amaya123");
		d.findElement(By.name("login")).click();
	}
	

}
