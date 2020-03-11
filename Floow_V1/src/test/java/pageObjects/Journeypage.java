package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Journeypage {

	AppiumDriver<MobileElement> ldriver;


	public Journeypage(AppiumDriver<MobileElement> driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void 



	
}
