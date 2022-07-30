package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

  public class DashboardPageTest extends TestBase{
  DashboardPage dash;
  LoginPage login;

	  @BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initalization();
		login=new LoginPage();
		dash=new DashboardPage();
		login.loginToApp();
	}
	
  
	
	@Test(enabled = false)
	public void verifyUsernameTest() throws InterruptedException
	{
		
		String value = dash.verifyUsername();
	     Assert.assertEquals(value, "Harshal Rajeshwar Tajane");
	
	}
	
	
	
	@Test(enabled = false)
	
	public	void	verifyEmailIdTest()	throws	InterruptedException
	{
	String	value =	dash.verifyEmailId();
	Assert.assertEquals(value,	"tajneharshal@gmail.com");
	
	
	}
 
	
	
	@Test
	
	public	void placeGttOrder() throws	InterruptedException, EncryptedDocumentException, IOException
	{
	dash.placeGttOrder();
	}
	
	
	@AfterMethod
	public	void exit()
	{
	driver.quit();
	
	}
	
	
	
  }
	
	
	
	
	
	
	
	
	
	
    
















	
	
	
	
	

