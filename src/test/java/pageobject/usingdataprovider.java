package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class usingdataprovider {
	
	
WebDriver adriver;

public  usingdataprovider(WebDriver bdriver) {
	
	adriver=bdriver;	

	
}


@FindBy(xpath="//input[@id='user-name']")
public static WebElement username;

@FindBy(xpath="//input[@id='password']")
public static WebElement password;

@FindBy(xpath="//input[@id='login-button']")
public static WebElement submit;

@FindBy(id="react-burger-menu-btn")
public static WebElement back;

@FindBy(xpath="//a[text()='Logout']")

public static WebElement logout;


}
