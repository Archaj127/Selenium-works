package page;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebaypage {
	

	
	WebDriver driver;
		
		By search=By.xpath("//*[@id=\"gh-ac\"]");
		By category=By.xpath("//*[@id=\"gh-shop-ei\"]");
		By searchbutton=By.xpath("//*[@id=\"gh-btn\"]");
		By electronics=By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a");
		By Products=By.xpath("//*[@class='s-item s-item__pl-on-bottom']");
		By plist=By.xpath("//*[contains(@role,'heading')]");
		
		public Ebaypage(WebDriver driver)
		{
			this.driver=driver;	
			}
		public void productenter()
		{
			
			driver.findElement(search).sendKeys("Apple Watches");
		}
		public void category()
		{
			driver.manage().window().maximize();
			driver.findElement(category).click();
			driver.findElement(electronics).click();
		}
		public void searching()
		{
			driver.findElement(searchbutton).click();
		}
		public void productlist()
		{
			System.out.println("Product Results");
			List<WebElement>l=driver.findElements(plist);
			for(WebElement n:l)
			{
				String a=n.getText();
				System.out.println("Product name="+a);
			}
		}
		public void tenproduct(int itemno)
		{
			String pxpath=String.format("//*[contains(@role,'heading')]%d",itemno);
			String nth=driver.findElement(By.xpath(pxpath)).getText();
			System.out.println("Nth product="+nth);
			
		}
		
	}
		


