package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass1 {
 
	@Test
	public void createpagetest()
	{
		Fbcreatepage cp=new Fbcreatepage(driver);
		cp.createpageclick();
		cp.getstartedclick();
	}
}


//THANKS FOR WATCHING.....