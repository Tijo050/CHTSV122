package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserCreationPage extends BasePage{
	
	public UserCreationPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='mat-input-6']") 
WebElement txtorgname;

@FindBy(xpath="//input[@id='mat-input-7']") 
WebElement txtorgid;

@FindBy(xpath="//span[normalize-space()='XORGANEESA']") 
WebElement txtParentOrgname;

@FindBy(xpath="//input[@id='mat-input-8']") 
WebElement TxtPrimaryContact;

@FindBy(xpath="//input[@id='mat-input-9']") 
WebElement txtEmailPrimaryContact;

@FindBy(xpath="//input[@id='mat-input-10']") 
WebElement txtWebsite;

@FindBy(xpath="//div[@class='kr-wizard-v2']") 
WebElement txtTelephone;


//@FindBy(xpath = "//h1[normalize-space()='User created successfully!']")
//WebElement msgConfirmation;


public void setOrgName(String fname) {
	txtorgname.sendKeys(fname);

}

public void setOrgId(String lname) {
	txtorgid.sendKeys(lname);

}

public void setParentOrgName(String parentorgname) {
	txtParentOrgname.sendKeys(parentorgname);

}

public void setPrimaryContact(String pname) {
	TxtPrimaryContact.sendKeys(pname);

}

public void setEmailPrimaryContact(String email) {
	txtEmailPrimaryContact.sendKeys(email);

}

public void setwebsite(String website) {
	txtWebsite.sendKeys(website);
	
}
	
	
public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);



}

/*public void clickContinue() {
	//sol1 
	btnContinue.click();
*/	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	

/*public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

}*/
}