package com.LntSuffin.genericUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class IListenersImplementationClass implements ITestListener
{
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"         is SKIPPED");		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("on start");
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./Extent_Reports/Report.html");
		spark.config().setDocumentTitle("SafeZoo Test Reports");
		spark.config().setReportName("Report Name");
		spark.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("operating system", "Windows 11");
		report.setSystemInfo("Browser", "Browser Name");
		report.setSystemInfo("Reporter Name", "Girish G");
		
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		 test = report.createTest(result.getMethod().getMethodName());
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+"    is PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{

		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(WebDriverUtility.sDriver);
		String src = eDriver.getScreenshotAs(OutputType.BASE64);
		
		test.addScreenCaptureFromPath(src);
		
		
		test.log(Status.FAIL, result.getMethod().getMethodName()+"      is  FAILED ");

	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		System.out.println("stop");
		
	}





}
