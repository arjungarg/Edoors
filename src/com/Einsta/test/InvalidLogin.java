package com.Einsta.test;

import org.testng.annotations.Test;

import com.Einsta.page.LoginPage;

import generic.BaseTest;

public class InvalidLogin extends BaseTest
{
	 @Test(priority=2)
	   public void testInvalidLogin() throws InterruptedException
	   {
		   //Enter Invalid user name
		   LoginPage l=new LoginPage(driver);
		   l.enterUserName("admign");
	 
		   //Enter Invalid Password
		   l.enterPassword("manahger");
		   
		   //click on Login
		   l.clickLogin();
		   
		  
		   // verify error message
		   l.verifyErrMsgISDisplayed();
	
	   }
	 
	
}
