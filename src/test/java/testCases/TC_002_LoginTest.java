package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass {

	
	@Test(groups= {"Sanity","Master"})
	public void verify_login ()
	{
		logger.info("############starting Login ##########");
		try{
			
		
		
		//Loginpage
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(2000);
		lp.setEmail(p.getProperty("email"));
		
		lp.clickLogin();
		lp.setPassword(p.getProperty("password"));
		//Thread.sleep(30000);
		lp.clickLogin();
		lp.emailotp();
		
		lp.otpreminder();
		Thread.sleep(30000);
		lp.lastsubmitbutton();
		//MyAccount
		Thread.sleep(30000);
	
		MyAccountPage macc= new MyAccountPage(driver);
		macc.msgheading();
		
		boolean targetpage= macc.isMyAccountPageExists();
		macc.clicklogout();
		Assert.assertEquals(targetpage, true,"Login failed");
	}
	
	catch(Exception e)
	{
		Assert.fail();
		logger.info("############Finished TC002  Login ##########");
	}
}
}