/* Clicking on Home -> Journeys -> More------ options and validating the heading in it */

package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.Homepage;

public class HomeJourneyMoreOptions extends baseClass {
	
	
	@Test
	public void traverseHJM() throws IOException{
		  
		  Homepage screens=new Homepage(driver);
		  
		  logger.info("URL is opened");
		 
		  screens.selectJourneyandVerify();
		 
		  logger.info("Opened Journey Screen");
		
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 
		  captureScreen(driver,"Journey Screen"); 
		  
		  screens.selectMoreandVerify();
			 
		  logger.info("Opened More option Screen");
		
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 
		  captureScreen(driver,"More option Screen");
		  
		  
		  screens.selectHomeandVerify();
			 
		  logger.info("Back to Home Screen");
		
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 
		  captureScreen(driver,"Back to Screen");
		  
		  
		  
		  
	}

}
