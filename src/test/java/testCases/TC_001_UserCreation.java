package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.UserCreationPage;


public class TC_001_UserCreation extends BaseClass{
	
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("############starting Account registration##########");
		try {
		
		
		
		UserCreationPage regpage=new UserCreationPage(driver);
		
		logger.info("Providing customer details into form");
		regpage.setOrgName(randomeString().toUpperCase());
		regpage.setOrgId(randomeString().toUpperCase());
		regpage.setEmailPrimaryContact(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		regpage.setwebsite(randomeString()+".com");
		regpage.setParentOrgName("XORGANEESA");
		regpage.setPrimaryContact("Tijo");
		
//		String password=randomAlphaNumeric();
		
//		
//		regpage.setPassword(password);
//		regpage.setConfirmPassword(password);
		
//		regpage.setPrivacyPolicy();
//		regpage.clickContinue();
//		
		//*logger.info("Validating expected msg after clicking on continue");
		//String confmsg=regpage.getConfirmationMsg();
		//if(confmsg.equals("Your Account Has Been Created!"))
		//{
			
		//	Assert.assertTrue(true);
		//}
		
		//else
		//{
		//	logger.error("Test failed");
		//	logger.debug("Debug logs....");
			//Assert.assertTrue(false);
		//}
			
		}
		
		catch(Exception e)
		{
			
			Assert.fail();
		}
		logger.info("############Finished Account registration##########");
		
	}
	
	
	
	
}