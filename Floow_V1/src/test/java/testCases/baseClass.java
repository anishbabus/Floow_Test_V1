//### This base class reads the data from configuration details using readConfig file and perfrom initial setup

package testCases;

import static testCases.baseClass.capabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import utilities.ReadConfig;

public class baseClass {
	ReadConfig readconfig=new ReadConfig(); //#initializing the readconfig instance 
	public static DesiredCapabilities capabilities;
	public static Logger logger;
	
	AppiumDriver<MobileElement> driver;
	
	// Basic setup method initializing the variables to connect to the Appium server and then the Mobile device.
	@BeforeClass
	public void setup() throws MalformedURLException 
	{	
		logger = Logger.getLogger("Floow App log");
		PropertyConfigurator.configure("Log4j.properties");

		capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,readconfig.getBrowserValue());
		capabilities.setCapability("noReset", readconfig.getResetValue());
		capabilities.setCapability("automationName", readconfig.getautomationName());
		capabilities.setCapability("udid", readconfig.getudid());
		capabilities.setCapability("deviceName", readconfig.getdeviceName());
		capabilities.setCapability("platformVersion", readconfig.getplatformVersion());
		capabilities.setCapability("platformName", readconfig.getplatformName());
		capabilities.setCapability("appPackage", readconfig.getappPackage());
		capabilities.setCapability("appActivity", readconfig.getappActivity());
		capabilities.setCapability("perfecto:waitForPageLoad", true);
		driver = new AppiumDriver<MobileElement>(new URL(readconfig.geturl()), capabilities);
		Assert.assertNotNull(driver);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
	 
		driver.quit();
	}
	
	// The below function can be referred where we need to capture screenshot. The screenshots will be saved in the folder /Screenshot
	
	public void captureScreen(AppiumDriver<MobileElement> driver2, String state) throws IOException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date=new Date();
		String filename=sdf.format(date)+state;
		TakesScreenshot ts = (TakesScreenshot) driver2;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + filename + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

}
