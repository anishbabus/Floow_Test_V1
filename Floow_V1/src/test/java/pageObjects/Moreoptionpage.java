package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Moreoptionpage {

	AppiumDriver<MobileElement> ldriver;


	public Moreoptionpage(AppiumDriver<MobileElement> driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView\r\n" + 
			"")
	WebElement preferenceOption;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[4]\r\n" + 
			"")
	WebElement batteryConv30;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]\r\n" + 
			"")
	WebElement batteryConv15;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]\r\n" + 
			"")
	WebElement batteryConv20;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]\r\n" + 
			"")
	WebElement batteryConv25;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]\r\n" + 
			"")
	WebElement measureUnitAuto;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]\r\n" + 
			"")
	WebElement measureUnitImperial;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]\r\n" + 
			"")
	WebElement measureUnitMetric;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageButton\r\n" + 
			"")
	WebElement returntoMain;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout\r\n" + 
			"" + 
			"")
	WebElement Moreoption;
	

	public void selectBatterycov15() {

		if(!(batteryConv15.isSelected())) {

			batteryConv15.click();
		}

	}
	public void selectBatterycov20() {

		if(!(batteryConv20.isSelected())) {

			batteryConv20.click();
		}

	}
	public void selectBatterycov25() {

		if(!(batteryConv25.isSelected())) {

			batteryConv25.click();
		}

	}
	public void selectBatterycov30() {

		if(!(batteryConv30.isSelected())) {

			batteryConv30.click();
		}

	}

	public void selectMeasureUnitAuto() {

		if(!(measureUnitAuto.isSelected())) {

			measureUnitAuto.click();
		}

	}
	public void selectMeasureUnitImp() {

		if(!(measureUnitImperial.isSelected())) {

			measureUnitImperial.click();
		}

	}
	public void selectMeasureUnitMet() {

		if(!(measureUnitMetric.isSelected())) {

			measureUnitMetric.click();
		}

	}
	public void returnToMoreOption() {

		returntoMain.click();
	}
	public void moveToMoreOption() {

		Moreoption.click();
	}
	
	public void moveToPrefOption() {

		preferenceOption.click();
	}

}
