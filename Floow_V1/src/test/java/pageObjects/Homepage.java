
// ## "Home Screen"  web elements and its methods are defined here.

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Homepage {

	AppiumDriver<MobileElement> ldriver;


	public Homepage(AppiumDriver<MobileElement> driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//android.widget.TextView[@content-desc='Apps, Dock']")
	@CacheLookup
	WebElement mobilestart_btn;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	@CacheLookup
	WebElement mobileSearch_btn;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
	@CacheLookup
	WebElement mobileSearch_txt;

	@FindBy(xpath="//android.widget.TextView[@content-desc='FloowDrive']")
	@CacheLookup
	WebElement appIcon;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ImageView[3]" + 
			"")
	@CacheLookup
	WebElement homeHeading;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.RelativeLayout/android.widget.ImageView")
	@CacheLookup
	WebElement homeIcon;


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.RelativeLayout\r\n" + 
			"")
	WebElement Journey;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout\r\n" + 
			"" + 
			"")
	WebElement Moreoption;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton[2]\r\n" + 
			"")
	WebElement rNavigatorHome;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton[1]\r\n" + 
			"")
	WebElement lNavigatorHome;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]\r\n" + 
			"")
	WebElement parameterLabel;
	
   public String returnParamLabel(){
	  return(ldriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"))).getAttribute("text");
	                                    //   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]

   }
   public WebElement returnrNavigatorHome(){
	   return(ldriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton[2]")));	   
   }

	 public void allParamterstraverse()
	{
		int i;
		String s;
		String[] values= {"Score","Smooth Driving","Mobile Use","Speed","Fatigue","Time of Day"};
		for(i=0;i<5;i++) {
			
			//ldriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView["+i+"]")).click();;
			
			s= parameterLabel.getText();
	        s.equals(values[i]);
           rNavigatorHome.click();
           
         
		}

	} 
	

	public void selectHomeandVerify() // Clicking the Home main heading and checking the presence of homeIcon "FloowDrive"
	{

		homeIcon.click();
		Assert.assertEquals(true, homeIcon.isDisplayed());
	}
	public void selectJourneyandVerify() // Clicking the Home main heading and checking the presence of homeIcon "FloowDrive"
	{

		Journey.click();
		Assert.assertEquals(true, Journey.isDisplayed());
	}
	public void selectMoreandVerify() // Clicking the Home main heading and checking the presence of homeIcon "FloowDrive"
	{

		Moreoption.click();
		Assert.assertEquals(true, Moreoption.isDisplayed());
	}

	
	public void clickMobile_btn() // function to traverse from home screen of mobile and launch the application
	{
		//TouchAction action = new TouchAction((AppiumDriver<MobileElement>)ldriver);

		System.out.println("Click button function");
		mobilestart_btn.click();
		//action.tap(new PointOption().withCoordinates(mobilestart_btn.getLocation()));
		//action.tap(new PointOption().withCoordinates(mobileSearch_btn.getLocation()));	   


		mobileSearch_btn.click();
		mobileSearch_txt.sendKeys("Floow");
		appIcon.click();
		//action.tap(new PointOption().withCoordinates(appIcon.getLocation()));
	}

	public void HomePageHeadingPresent()
	{
		Assert.assertEquals(true, homeHeading.isDisplayed());
	}

}
