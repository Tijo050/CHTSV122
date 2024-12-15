package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[normalize-space()='Add Organization']")
	WebElement lnkMyAccount;
	
	
	
public void clickMyAccount()
{
	lnkMyAccount.click();
}

}
