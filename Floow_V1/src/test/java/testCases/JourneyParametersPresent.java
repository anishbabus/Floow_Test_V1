package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Journeypage;

public class JourneyParametersPresent extends baseClass {

	@Test
	public void JourneyParameterspresent() throws IOException {
		
		Journeypage jp= new Journeypage(driver);
		
		Assert.assertEquals(true, jp.dateElementPresent());
		Assert.assertEquals(true, jp.distanceElementPresent());
		Assert.assertEquals(true, jp.durationElementPresent());
		Assert.assertEquals(true, jp.scoreElementPresent());
		
		  captureScreen(driver,"Journey Screen Elements present"); 
	}
	
}
