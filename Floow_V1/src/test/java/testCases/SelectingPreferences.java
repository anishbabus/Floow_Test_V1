package testCases;

import java.io.IOException;

import org.testng.annotations.Test;


import pageObjects.Moreoptionpage;

public class SelectingPreferences extends baseClass {

	
	@Test
	public void allParamterstraverse() throws IOException
	{
		Moreoptionpage mp=new Moreoptionpage(driver);
	    mp.moveToMoreOption();
	    mp.moveToPrefOption();
		mp.selectBatterycov15();
		mp.selectBatterycov20();
		mp.selectBatterycov25();
		mp.selectBatterycov30();
		mp.selectMeasureUnitAuto();
		mp.selectMeasureUnitImp();
		mp.selectMeasureUnitMet();
		captureScreen(driver,"Preferences Selected");
		mp.returnToMoreOption();

	}
}
