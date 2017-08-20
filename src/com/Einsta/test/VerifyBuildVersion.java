package com.Einsta.test;

import org.testng.annotations.Test;

import com.Einsta.page.*;

import generic.BaseTest;

public class VerifyBuildVersion extends BaseTest
{

	@Test(priority=3)
	public void testVerifyBuildVersion()
	{
		//verify build version                                                      n 
		LoginPage l=new LoginPage(driver);
		l.verifyVersion("actiTIME 2017.4");
		
		 //Enter valid user name
		   l.enterUserName("admin");
	 
		   //Enter Valid Password
		   l.enterPassword("manager");
		   
		   //click on Login
		   l.clickLogin();
		   
		   //click help
		   EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		   e.clickHelp();
		   
		   //click about your actiTime
		   e.clickAboutActitime();
		   
		   //verify that build no is(build 39634)
		   e.verifyBuildNumber("(build 39634)");
		   
		   //click on close button
		   e.clickCloseButton();
		   
		   //click on logout button
		   e.clickLogoutButton();
	}
}
