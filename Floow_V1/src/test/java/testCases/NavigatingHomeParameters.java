/*
 Navigating through attributes like Mobile Use,Speed,Fatigue,Time of Day and retrieving the value
 */

package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.Homepage;

public class NavigatingHomeParameters extends baseClass{


	@Test
	public void allParamterstraverse() throws IOException
	{
		Homepage hp=new Homepage(driver);
		hp.allParamterstraverse();

	}

}


