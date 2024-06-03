package testcase;

import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	public static WebDriver driver;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cel;

	@BeforeSuite
	public void initialization() {
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
	}
	@AfterSuite
	public void teardown() {
		
		driver.quit();

	}
	
	
}
