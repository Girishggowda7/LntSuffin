package com.LntSuffin.genericUtility;

import org.testng.ITestResult;

public class IRetryAnalyzer implements org.testng.IRetryAnalyzer
{

	int retry=2;
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
	
		
		while(count<retry)
		{
			return true;
		}
		
		return false;
	}
	
	
	
}
