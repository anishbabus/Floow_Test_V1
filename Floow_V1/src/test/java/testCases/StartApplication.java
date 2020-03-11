

// This test case traverse from mobile home screen and launch the Floow app. Ensures the launching of Floow App 

package testCases;


import pageObjects.Homepage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StartApplication extends baseClass {

	
@Test
public void launchingFloow() throws IOException{
	  
	  Homepage hp=new Homepage(driver);
	  
	  logger.info("URL is opened");
	 
	  hp.clickMobile_btn();
	 
	  System.out.println("Initiated wait element");
	
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	  
	   hp.HomePageHeadingPresent();
	 
	 
	  captureScreen(driver,"Launched App"); 
}
}

