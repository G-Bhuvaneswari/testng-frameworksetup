package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class datadrivensample {

	WebDriver adriver;

	public datadrivensample(WebDriver cdriver) {

		adriver = cdriver;

	}

	@FindBy(name = "userName")
	public static WebElement us;

	@FindBy(name = "password")
	public static WebElement ps;

	@FindBy(name = "submit")
	public static WebElement lo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	public static WebElement snoff;
	
	
}
