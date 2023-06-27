package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Excersise {

	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://impresario.co.in/");
        String q=d.getTitle();
        System.out.println(q);
        String u="impresario";
        if(q.equals(u))
        {
        	 System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
        String o=d.getPageSource();
        if(o.contains("About Us"))
        {
        	 System.out.println("present");
        }
        else
        {
        	System.out.println("not present");
        }
        
	}

}
