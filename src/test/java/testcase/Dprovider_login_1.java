package testcase;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.usingdataprovider;

public class Dprovider_login_1 extends baseclass {
	
	
	@Test(dataProvider="dataproviderrr")
	public void loginn(String uname,String pwad) throws InterruptedException{
		PageFactory.initElements(driver, usingdataprovider.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		usingdataprovider.username.sendKeys((uname));
		usingdataprovider.password.sendKeys((pwad));
		Reporter.log("username and pasword entered succesfully");
		Thread.sleep(3000);

		usingdataprovider.submit.click();
		Reporter.log("loged  succesfully");
		usingdataprovider.back.click();
		usingdataprovider.logout.click();
	}
	@DataProvider
	public Object[][] dataproviderrr() {
		
		Object obj[][] = {{"standard_user","secret_sauce"},
				
				{"performance_glitch_user","secret_sauce"},
			
				{"problem_user","secret_sauce"}
				};
		return obj;	
	}
		
		
		}




		
		
		
		
		
	
	
	


