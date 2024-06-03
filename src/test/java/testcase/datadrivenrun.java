package testcase;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.datadrivensample;

public class datadrivenrun {

	public static WebDriver driver;

	@BeforeClass
	public void initialization() throws SocketException {

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("url lunched");
	}

	@Test
	public void lopros() throws IOException, InterruptedException {

		File f1 = new File("C:\\Users\\admin\\Desktop//bhuvi.xlsx.");
		FileInputStream f2 = new FileInputStream(f1);
		XSSFWorkbook book = new XSSFWorkbook(f2);
		XSSFSheet sheet = book.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFCell cell = sheet.getRow(i).getCell(0);
			DataFormatter formatter = new DataFormatter();

			String username = formatter.formatCellValue(cell);
			XSSFCell cell2 = sheet.getRow(i).getCell(1);
			String password = formatter.formatCellValue(cell);
			PageFactory.initElements(driver, datadrivensample.class);
			datadrivensample.us.sendKeys(username);
			Reporter.log("username done");

			datadrivensample.ps.sendKeys(password);
			Reporter.log("password done");

			datadrivensample.lo.click();
			Reporter.log("logined");
         String title= driver.getTitle();
         System.out.println("title:"+title);
         if(title.equalsIgnoreCase("Login: Mercury Tours"))
         {
        	 System.out.println("test pass");
         }else {
        	 System.out.println("test fail");
 
         }
       // Assert.assertEquals(actual,"SIGN-OFF");
         datadrivensample.snoff.click();
			Reporter.log("SIGN-OFFED");

 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

	}

	@AfterClass
	public void teardown() {

	}
}
