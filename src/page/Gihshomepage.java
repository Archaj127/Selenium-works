package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Gihshomepage {
	WebDriver driver;
	
	//By about=By.xpath("//*[@id=\"nav\"]/li[2]/a");
	By notification=By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[4]/a");
	By gallery=By.xpath("//*[@id=\"nav\"]/li[7]/a");
	By contact=By.xpath("//*[@id=\"nav\"]/li[8]/a");
	By name=By.xpath("//*[@id=\"contact\"]/div/div[2]/div/div[2]/div/form/div[1]/input");
	By email=By.xpath("//*[@id=\"contact\"]/div/div[2]/div/div[2]/div/form/div[2]/input");
	By mobile=By.xpath("//*[@id=\"contact\"]/div/div[2]/div/div[2]/div/form/div[3]/input");
	By comment=By.xpath("//*[@id=\"contact\"]/div/div[2]/div/div[2]/div/form/div[4]/textarea");
	By button=By.xpath("//*[@id=\"contact\"]/div/div[2]/div/div[2]/div/form/div[5]/div/button");
	
	
	public Gihshomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void aboutclick()
	{   
		driver.manage().window().maximize();
		WebElement about=driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/nav/div/ul/li[2]/a/i"));
		Actions a=new Actions(driver);
		a.moveToElement(about);
		a.perform();
	}
	public void notclick()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(notification).click();
	}
	public void galleryclick()
	{
		driver.findElement(gallery).click();
	}
	public void contactclick(String cname,String cemail,String cmobile,String ccomment)
	{
		driver.findElement(contact).click();
		driver.findElement(name).sendKeys(cname);
		driver.findElement(email).sendKeys(cemail);
		driver.findElement(mobile).sendKeys(cmobile);
		driver.findElement(comment).sendKeys(ccomment);
		driver.findElement(button).click();
		
	}

}
