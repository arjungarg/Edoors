//package com.Einsta.test;
//import generic.*;
//import org.testng.annotations.Test;
//
//import com.Einsta.page.LoginPage;
//
//import generic.BaseTest;
//
//public class InvalidLogin1 extends BaseTest
//{
//
//		@Test
//		public void testInvalidLogin()
//		{
//			int rc = Excel.getRowCount(XLPATH, "InvalidLogin");
//			
//
//			for(int i=1; i<=rc; i++)
//			{
//					
//					
//				
//			String un = Excel.getCellValue(XLPATH, "InvalidLogin", 1, 0);
//			String pw = Excel.getCellValue(XLPATH, "InvalidLogin", 1, 1);
//			
//			LoginPage l=new LoginPage(driver);
//			l.enterUserName(un);
//			l.enterPassword(pw);
//			l.clickLogin();
////			l.verifyErrMsgISDisplayed();
//			
//
//}
//}}