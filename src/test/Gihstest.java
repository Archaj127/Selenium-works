package test;


import org.testng.annotations.Test;

import page.Gihshomepage;

public class Gihstest extends Gihsbaseclass {
	
	@Test
	public void test()
	{
		Gihshomepage gp=new Gihshomepage(driver);
		gp.aboutclick();
		gp.notclick();
		gp.galleryclick();
		gp.contactclick("Anu", "anu23@gmail.com", "8976568900", "Good collge");
		
		
	}

}
