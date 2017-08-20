package com.Einsta.test;

import org.testng.annotations.Test;

import com.Einsta.page.*;


import generic.BaseTest;

public class ValidLogin extends BaseTest
{
   @Test(priority=1)
   public void testValidLogin()
   {
	   //Enter valid user name
	   LoginPage l=new LoginPage(driver);
	   l.enterUserName("admin");
       
	   //Enter Valid Password
	   l.enterPassword("manager");
	   
	  // click on Login
	   l.clickLogin();
	   
	   //verify that home page is displayed
	   EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	     e.verifyTitle("actiTIME - Enter Time-Track");
	  
}
	
	
}
