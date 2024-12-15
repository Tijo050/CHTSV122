package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath= "//input[@id='kc-login']")
	WebElement btnLogin;

	@FindBy(xpath= "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin2;
	
	@FindBy(xpath = "//span[normalize-space()='Email OTP']")
	WebElement emailotp;
	
	@FindBy(xpath = "//label[@for='otpRemember']")
	WebElement otpreminder;
	
	@FindBy(xpath = "//div[@class='submitIcon']")
	WebElement lastSubmitbutton;
	
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	
	public void clickLogin2() {
		btnLogin2.click();
	}
	
	
	public void emailotp() {
		emailotp.click();
	}
	
	
	public void otpreminder() {
		otpreminder.click();
	}
	
	public void lastsubmitbutton() {
		lastSubmitbutton.click();
	}
	
}
