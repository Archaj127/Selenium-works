package testngpkg;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.facebook.com/");
	}
	

	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("E:\\testdata1.xlsx"); //read file
		XSSFWorkbook wb=new XSSFWorkbook(f); //read full sheet of excel file
		XSSFSheet sheet=wb.getSheet("Sheet1"); //get sheet details
		int row=sheet.getLastRowNum(); //last edited row number
		
		for(int i=1;i<=row;i++)
		{
			String username=sheet.getRow(i).getCell(0).getStringCellValue(); //1st row+0th column
			String pwd=sheet.getRow(i).getCell(1).getStringCellValue();      //1st row+1st col
			System.out.println("username="+username+"\n"+"password="+pwd);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();  //clear text from field
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			//int pwd=(int)s.getRow(i).getCell(1).getNumericCellValue(); type cast double to int
   		 //String pass=String.valueOf(pwd);   Then int to string
		
		}
	}
}
