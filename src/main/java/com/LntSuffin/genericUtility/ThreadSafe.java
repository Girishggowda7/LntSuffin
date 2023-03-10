package com.LntSuffin.genericUtility;

public class ThreadSafe 
{
	private static ThreadLocal<WebDriverUtility> webdrive=new ThreadLocal<WebDriverUtility>();
	
	public static void setWebDriverUtility(WebDriverUtility sWebDrive)
	{
		webdrive.set(sWebDrive);
	}
	
	public static WebDriverUtility getWebDriverUtility()
	{
		return getWebDriverUtility();
	}
}
