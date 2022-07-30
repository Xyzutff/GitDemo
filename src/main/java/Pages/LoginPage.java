package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{

//object repository

  @FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo;

  @FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
  
  @FindBy(xpath="//input[@id='userid']")private WebElement userIdTextbox;
  
  @FindBy(xpath="//input[@type='password']")private WebElement password;
  
  @FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;
  
  @FindBy(xpath="//input[@id='pin']")private WebElement pintrxtbox;
  
  @FindBy(xpath="//button[@type='submit']")private WebElement contibtn;
  
  @FindBy(xpath="//span[@class='nickname']")private WebElement nicknameLable;
  
  public LoginPage()
  {
	  PageFactory.initElements(driver,this);
  }
  
  //Methods
 
  public String verifyTitle()
  {
	return driver.getTitle();  
  }
  
  
  
       public Boolean verifyKiteLogo()
     {
	  return kiteLogo.isDisplayed();
     } 
  
    public Boolean verifyZerodhaLogo()
    {
    	return zerodhaLogo.isDisplayed();
    }
    
     
    public  String loginToApp() throws InterruptedException, IOException
    {
    	userIdTextbox.sendKeys(readPropertyFile("username"));  /// these r the imp data for this we use proprty file
    	password.sendKeys(readPropertyFile("password"));
    	loginBtn.click();
    	Thread.sleep(2000);
    	pintrxtbox.sendKeys(readPropertyFile("pin"));
    	contibtn.click();
    	Thread.sleep(2000);
    	return nicknameLable.getText(); // nick name of profile
    }
  












}
