package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Gihsbaseclass {
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.gihs.org.in/");
	}
}
