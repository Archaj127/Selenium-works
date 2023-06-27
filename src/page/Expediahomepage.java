package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expediahomepage {
WebDriver driver;
	
	By expflight=By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span");
	By leavingfrombutton=By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button");
	By leavingplace=By.xpath("//*[@id=\"location-field-leg1-origin\"]");
	By goingto=By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button");
	By goingplace=By.xpath("//*[@id=\"location-field-leg1-destination\"]");
	By departingdate=By.xpath("//*[@id=\"d1-btn\"]");
	By arrow=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
	By arrow1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]");
	By returingdate=By.xpath("//*[@id=\"d2-btn\"]");
	By datedonebutton=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");
	By datedonebutton2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/button");
	By traveller=By.xpath("//*[@id=\"adaptive-menu\"]/button");
	By increaseadults=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]");
	By increasechild=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]");
	By childage=By.xpath("//*[@id=\"child-age-input-0-0\"]");
	By donebutton=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");
	By economy=By.xpath("//*[@id=\"preferred-class-input-trigger\"]");
	By firstclass=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]");
	By search=By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button");
	
	public Expediahomepage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void flightclick()
	{
		driver.findElement(expflight).click();
	}
	public void leavingbuttonclick()
	{
		driver.findElement(leavingfrombutton).click();
	}
	public void leavingplacee(String lplace)
	{
		driver.findElement(leavingplace).sendKeys(lplace);
		driver.findElement(leavingplace).sendKeys(Keys.ENTER);
	}
	
	public void goingbuttonclick()
	{
		driver.findElement(goingto).click();
	}
	public void goingplacee(String gplace)
	{
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(goingplace).sendKeys(gplace);
		driver.findElement(goingplace).sendKeys(Keys.ENTER);
	}
	public void departingclick()
	{
		driver.findElement(departingdate).click();
	}
	public void departingdateselect()
	{
		
		while(true)
		   {
			   WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h2"));
			   String month1=month.getText();
			   if(month1.equals("July 2023"))
			   {
				   break;
			   }
			   else
			   {
				   driver.findElement(arrow).click();
				   
			   }
			   
		   }
		   List<WebElement>alldates1=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button"));
		   for(WebElement dateelement:alldates1)
		   {
			   String date=dateelement.getAttribute("data-day");
			   //System.out.println(date);
			  
			   if(date.equals("20"))
			   {
				   dateelement.click();
				  
				   
				   
				   WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
				   System.out.println("July 20 date selected");
			   }
		   }
	}
	
	public void returnclick()
	{
		driver.findElement(returingdate).click();
	}
    public void returingdateselect()
	{
		while(true) {
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/h2"));
		String month1=month.getText();
		if(month1.equals("September 2023"))
		{
			break;
		}
		else
		{
			driver.findElement(arrow1).click();
		}
		}
		List<WebElement>alldates1=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button"));
		   for(WebElement dateelement:alldates1)
		   {
			   String date=dateelement.getAttribute("data-day");
			   //System.out.println(date);
			   if(date.equals("20"))
			   {
				   dateelement.click();
				   System.out.println("Sep 20 date selected");
			   }
		   }
		
		}
	public void datedoneclick()
	{
		// WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(datedonebutton).click();
	}
	public void datedoneclick1()
	{
		driver.findElement(datedonebutton2).click();
	}
		public void travelerclick()
		{
			driver.findElement(traveller).click();
	}
		public void adultincreaseclick()
		{
			driver.findElement(increaseadults).click();
		}
		public void childincrease()
		{
			driver.findElement(increasechild).click();
		}
		public void childage()
		{
			driver.findElement(childage).click();
		}
		public void childdropdown()
		{
			WebElement age=(driver.findElement(childage));
			Select s=new Select(age);   //select class for drop down
		    s.selectByValue("3");
		}
		public void travellerdone()
		{
			driver.findElement(donebutton);
		}
	public void economyclick()
	{
		driver.findElement(economy).click();
		
	}
	public void economyvalue()
	{
		driver.findElement(firstclass).click();
	}
   public void  searchbutton()
   {
	   driver.findElement(search).click();
   }
}
