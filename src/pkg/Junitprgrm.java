package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgrm {
	
	ChromeDriver d;
	 @Before
	 public void Setup()
	 {
		 d=new ChromeDriver();
		 d.get("https://www.google.com");
	 }
     @Test
     public void Test1()
	 {
    	 d.findElement(By.id("APjFqb")).sendKeys("Books",Keys.ENTER);
		String w=d.getTitle();
		System.out.println(w) ;
		
	 }
     
    
}
