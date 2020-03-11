package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getResetValue()
	{
		String noReset=pro.getProperty("noReset");
		return noReset;
	}
	public String getBrowserValue()
	{
		String BrowserValue=pro.getProperty("CapabilityType.BROWSER_NAME");
		return BrowserValue;
		
	}
	public String getautomationName()
	{
		String automationNameValue=pro.getProperty("automationName");
		return automationNameValue;
	}
	public String getudid()
	{
		String getudid=pro.getProperty("udid");
		return getudid;
	}
	public String getdeviceName()
	{
		String getdeviceName=pro.getProperty("deviceName");
		return getdeviceName;
	}
	public String getplatformVersion()
	{
		String getplatformVersion=pro.getProperty("platformVersion");
		return getplatformVersion;
	}
	public String getplatformName()
	{
		String getplatformName=pro.getProperty("platformName");
		return getplatformName;
	}
	public String getappPackage()
	{
		String getappPackage=pro.getProperty("appPackage");
		return getappPackage;
	}
	public String getappActivity()
	{
		String getappActivity=pro.getProperty("appActivity");
		return getappActivity;
	}
	public String geturl()
	{
		String geturl=pro.getProperty("url");
		return geturl;
	}
	
	
	
	
	
	
	
	

}
