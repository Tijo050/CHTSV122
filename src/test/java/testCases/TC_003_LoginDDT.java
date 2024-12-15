package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_003_LoginDDT extends BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
				
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
			
			boolean targetPage= macc.isMyAccountPageExists();
			
			
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}








