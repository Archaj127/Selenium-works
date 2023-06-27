package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Saucedemo {
	
	WebDriver driver;
	By username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"login-button\"]");
	By drop=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By firstname=By.xpath("//*[@id=\"first-name\"]");
	By lastname=By.xpath("//*[@id=\"last-name\"]");
	By zipcode=By.xpath("//*[@id=\"postal-code\"]");
	By proceed=By.xpath("//*[@id=\"continue\"]");
	
	public Saucedemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String uname,String pwd)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
	}
	public void loginclick()
	{
		driver.findElement(login).click();
	}
	public void loginver()
	{
		String s="https://www.saucedemo.com/inventory.html";
		String s1=driver.getCurrentUrl();
		Assert.assertEquals(s,s1);
		System.out.println("login validated");
		Boolean a=(s==s1);
		Assert.assertFalse(a);
		driver.navigate().refresh();
		
		
		
	}
	public void drop()
	{
		driver.findElement(drop).click();
		WebElement ddrop=(driver.findElement(drop));
		Select s=new Select(ddrop);   //select class for drop down
	    s.selectByValue("lohi");
	}
	public void addcart()
	{
		List<WebElement>m=driver.findElements(By.xpath("//*[contains(@class,'btn btn_primary btn_small btn_inventory')]"));
		for(WebElement n:m)
		{
		n.click()	;
		}
		/*driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();*/
		
		
	
		String str="Add to cart";
		if(driver.getPageSource().contains(str))
		
		{
			System.out.println("All products not added");
		}
		else
		{
			System.out.println("All products added to cart");
		}
	}
	public void cartclick()
	{
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}
    public void removeitems()
    {
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
    	if(driver.getPageSource().contains("Sauce Labs Bike Light,Sauce Labs Onesie"))
    	{
    		
    			System.out.println("Items not removed");
    		}
    	else
		{
			System.out.println("Items removed");
		}
    	}
    
    public void checkout()
    {
    	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    public void userdetails(String fname,String lname,String zip)
    {
    	driver.findElement(firstname).click();
    	driver.findElement(firstname).sendKeys(fname);
    	driver.findElement(lastname).click();
    	driver.findElement(lastname).sendKeys(lname);
    	driver.findElement(zipcode).click();
    	driver.findElement(zipcode).sendKeys(zip);
    	driver.findElement(proceed).click();
    	
    }
    public void finish()
    {
    	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
    public void back()
    {
    	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
    }
    public void menuclick()
    {
    driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
}
    public void logout()
    {
    	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    }
}
