package com.Einsta.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{

    @FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[contains(text(),'build')]")
	private WebElement buildNum;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeButton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
  
	public void clickHelp()
	{
		help.click();
	}
	
	public void clickAboutActitime()
	{
		aboutActiTIME.click();
	}
	
	public void verifyBuildNumber(String eBuildNumber)
	{
		String aBuildNumber=buildNum.getText();
		Assert.assertEquals(aBuildNumber, eBuildNumber);
	}
	
	public void clickCloseButton()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		closeButton.click();
	}
	
	public void clickLogoutButton()
	{
		logoutLink.click();
	}
}
