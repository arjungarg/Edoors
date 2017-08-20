package com.Einsta.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class LoginPage extends BasePage
{

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errMsg;                                    
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public void verifyErrMsgISDisplayed()
	{
		try
		{
			Thread.sleep(1000);
			Reporter.log("pass:err msg is displayed",true);
		}
		catch(Exception e)
		{
			
		}
		Assert.assertTrue(errMsg.isDisplayed());
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion=version.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
}
