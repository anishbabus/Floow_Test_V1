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

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]\r\n" + 
			"")
	WebElement dateJourney;


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]")
	WebElement durationJourney;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]")
	WebElement distanceJourney;


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[4]")
	WebElement scoreJourney;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.RelativeLayout\r\n" + 
			"")
	WebElement Journey;

	public boolean dateElementPresent()
	{
		Journey.click();
		return dateJourney.isDisplayed();	

	}

	public boolean durationElementPresent()
	{
		Journey.click();
		return durationJourney.isDisplayed();	

	}
	public boolean distanceElementPresent()
	{
		Journey.click();
		return distanceJourney.isDisplayed();	

	}
	public boolean scoreElementPresent()
	{
		return scoreJourney.isDisplayed();	

	}









}
