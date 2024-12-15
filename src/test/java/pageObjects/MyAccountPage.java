package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

@FindBy(xpath="//img[@id='user-avatar']") //myaccount page heading
	WebElement msgHeading;   //kore home page logo name
	

@FindBy(xpath ="//*[@id=\"logout-span\"]")
WebElement lnklogout;

public boolean isMyAccountPageExists()
{
	try {
		
		return msgHeading.isDisplayed();
        }
	
	catch(Exception e)
	{
		return false;
	}
}


public void msgheading()
{
	msgHeading.click();
}

public void clicklogout()
{
	lnklogout.click();
}


}
