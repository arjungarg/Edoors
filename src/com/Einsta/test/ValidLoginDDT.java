//package com.Einsta.test;
//import org.testng.annotations.Test;
//
//import com.Einsta.page.LoginPage;
//
//import generic.*;
//
//
//public class ValidLoginDDT extends BaseTest
//{
//
//	@Test
//	public void TestValidLogin()
//	{
//	String un = Excel.getCellValue(XLPATH, "ValidLogin", 1, 0);
//	String pw = Excel.getCellValue(XLPATH, "ValidLogin", 1, 1);
//	String vy = Excel.getCellValue(XLPATH, "ValidLogin", 1, 2);
//	
//		LoginPage l=new LoginPage(driver);
//		l.enterUserName(un);
//		l.enterPassword(pw);
//		l.clickLogin();
//		l.verifyTitle(vy);
//		
//		
//	}
//	
//	
//	
//}
