package test;

import org.testng.annotations.Test;

import page.Expediahomepage;

public class Expediahometest extends Expediabaseclass{
	
	@Test
	public void expediatest() 
	{
		Expediahomepage hp=new Expediahomepage(driver);
		
		hp.flightclick();
		hp.leavingbuttonclick();
		hp.leavingplacee("brussels");
		hp.goingbuttonclick();
		hp.goingplacee("newyork");
		hp.departingclick();
		hp.departingdateselect();
		hp.datedoneclick();
		hp.returnclick();
		hp.returingdateselect();
		hp.datedoneclick1();
		hp.travelerclick();
		hp.adultincreaseclick();
		hp.childincrease();
		hp.childage();
		hp.childdropdown();
		hp.travellerdone();
		
		hp.economyclick();
		hp.economyvalue();
		hp.searchbutton();
	}

}
