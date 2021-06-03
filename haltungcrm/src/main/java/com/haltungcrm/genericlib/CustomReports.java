package com.haltungcrm.genericlib;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports {
	
	@Test
	public void runReports()
	{
		
	
	    ExtentReports repo = new ExtentReports();
	    ExtentSparkReporter spark  = new ExtentSparkReporter("./MyBeautifulReport.html");
	    spark.config().setTheme(Theme.DARK);
	    spark.config().setDocumentTitle("Haltung Document");
	    spark.config().setReportName("Customised Beautiful Report");  
	    repo.attachReporter(spark);
	    
	   ExtentTest test1 = repo.createTest("Login TestCase").assignAuthor("Lakshma").assignCategory("Regression Test").assignDevice("Windows Chrone 90");
	   test1.info("Open the browser");
	   test1.info("Enter the test URL");
	   test1.info("Enter Username");
	   test1.info("Enter Password");
	   //test1.skip("Click rem pwd chechbox");
	   test1.info("Click on Login Button");
	   test1.pass("Login Successfil");
	   
	   repo.flush();
	   
	   ExtentTest test2 = repo.createTest("Logout TestCase").assignAuthor("Lakshma").assignCategory("Smoke Test").assignDevice("Windows Chrone 90");
	   test2.info("Open the browser");
	   test2.info("Enter the test URL");
	   test2.info("Enter Username");
	   test2.info("Enter Password");
	   test2.info("Click on Login Button");
	   test2.pass("Login Successfil");
	   test2.fail("Logout FAILED");
	   repo.flush();
	  
	    
		
		
	}
	
	

}
