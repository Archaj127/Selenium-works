package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Mypracticedatadriven {
	
	ChromeDriver d;
	@BeforeTest
	public void setup()
	{
		d=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		d.get("https://prod-auth.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code");;
	}
     @Test
     public void test() throws Exception
     {
    	 FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\test2.xlsx");
    	 XSSFWorkbook wb=new XSSFWorkbook(f);
    	 XSSFSheet s=wb.getSheet("Sheet1");
    	 int r=s.getLastRowNum();
    	 for(int i=1;i<=r;i++)
    	 {
    		 String user=s.getRow(i).getCell(0).getStringCellValue();
    		 int pwd=(int)s.getRow(i).getCell(1).getNumericCellValue();
    		 String pass=String.valueOf(pwd);
    		 d.findElement(By.xpath("//*[@id=\"username\"]")).clear();
    		 d.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(user);
    		 d.findElement(By.xpath("//*[@id=\"password\"]")).clear();
    		 d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
    		 d.findElement(By.name("login")).click();
    	 
     }
}
}
