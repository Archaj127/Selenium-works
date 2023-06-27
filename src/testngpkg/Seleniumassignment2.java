package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Seleniumassignment2 {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(3000);
	    driver.findElement(By.name("firstname")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Minmini");
	    driver.findElement(By.name("lastname")).click();
	    driver.findElement(By.name("lastname")).sendKeys("Mohan");
	    driver.findElement(By.name("reg_email__")).click();
	    driver.findElement(By.name("reg_email__")).sendKeys("minmini@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).click();
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("minmini@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).click();
	    driver.findElement(By.name("reg_passwd__")).sendKeys("min12345");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")).click();
	    WebElement day=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
	    Select s=new Select(day);
	    s.selectByValue("12");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")).click();
	    WebElement month=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
	    Select s1=new Select(month);
	    s1.selectByVisibleText("Mar");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")).click();
	    WebElement year=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
	    Select s2=new Select(year);
	    s2.selectByValue("1995");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	    
	    
	    
	    
	   
			   
	}
}
