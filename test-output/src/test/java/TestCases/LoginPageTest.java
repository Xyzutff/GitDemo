package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {


	 
	LoginPage login;
	
	@BeforeMethod
	
	public void setup() throws IOException
	{
		initalization();
	     login =new LoginPage();
	}
	
	
	 
	@Test
	public void verifyTitleTest()
	{
	  String title= login.verifyTitle();
	  Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
	
	//  Assert.assertFalse(true); // skips 2  forcefully failed
	
	}
	
	
	@Test(dependsOnMethods = {"verifyTitleTest"})
	
	public void verifyKiteLogoTest()
	{
		boolean value=login.verifyKiteLogo();
	    Assert.assertEquals(value, true);
	}
	
	
	@Test(dependsOnMethods = {"verifyTitleTest"})
	
	 public void verifyZerodhaLogoTest()
	 {
		boolean value=login.verifyZerodhaLogo();
	   Assert.assertEquals(value, true);
	 }
	
	@Test(enabled = false)
	
	public void loginToAppTest() throws InterruptedException, IOException
	{
		String nickname = login.loginToApp();
		Assert.assertEquals(nickname, "Harshal");// verify name harshal
	}
	
	
	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}





}
