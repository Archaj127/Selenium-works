package pkg;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksresponsecode {
	ChromeDriver d;
	
	@Before
	public void link1()
	{
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	
	@Test
	public void link2() throws Exception
	{
		List<WebElement> lname=d.findElements(By.tagName("a"));
		System.out.println("No of links="+lname.size());
	
	for(WebElement links:lname)
	{
		String l=links.getAttribute("href");
		verify(l);
	}
		
}
	private void verify(String l) throws Exception
	{
		URL u= new URL(l);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Response code 200-"+l);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Response code 404-"+l);
		}
		
		
	}	
	}
