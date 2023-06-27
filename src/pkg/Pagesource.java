package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://google.com");
		String a=d.getPageSource();
		if(a.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
		
		

	}

}
