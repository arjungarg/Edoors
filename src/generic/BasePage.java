package generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage
{
public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("pass: matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("fail: not matching",true);
			Assert.fail();
		}
	}
}
