package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase  {
 
  @FindBy(xpath="//div[@class='avatar']")private WebElement avatarIcon;
  @FindBy(xpath="//h4[@class='username']")private WebElement username;
  @FindBy(xpath="//div[@class='email']")private WebElement email;
  @FindBy(xpath="//button[text()='Start investing ']")private WebElement startinvestingbtn;
  @FindBy(xpath="(//input[@type='text'])[2]")private WebElement searchBartextbox; 
  @FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement selectInfybtn ;
 
  @FindBy(xpath = "//button[text()='Create GTT ']") private WebElement creatGttbtn ;
  @FindBy(xpath="//input[@label='Trigger price']")private WebElement trigerpricetextbox;
  @FindBy(xpath="//input[@label='Qty.']")private WebElement quantytextbox;
  @FindBy(xpath="//input[@label='Price']")private WebElement pricetextbox;
  @FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelbtn;
  
  
  
  public DashboardPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
 
  public String verifyUsername() throws InterruptedException
  {
	 avatarIcon.click();
     Thread.sleep(3000);
     return username.getText();
  }
 
  
  public String verifyEmailId() throws InterruptedException
  {
	  avatarIcon.click();
      Thread.sleep(3000);
	  return email.getText();
	  
  }
  
   public void placeGttOrder() throws InterruptedException, EncryptedDocumentException, IOException
   {
	 
	   
	   startinvestingbtn.click();
	   Thread.sleep(2000);
	 // searchBartextbox.sendKeys("INFY");
	   Thread.sleep(2000);
	   searchBartextbox.sendKeys(readExcelFile(0,0));
	   selectInfybtn.click();
	   Thread.sleep(2000);
	   creatGttbtn.click();
	   Thread.sleep(2000);
	   trigerpricetextbox.clear();
	   Thread.sleep(2000);
	  // trigerpricetextbox.sendKeys("1400");
	   Thread.sleep(2000);
	   trigerpricetextbox.sendKeys(readExcelFile(0,1));
	   quantytextbox.clear();
	  // quantytextbox.sendKeys("100");
	   quantytextbox.sendKeys(readExcelFile(0,2));
	   Thread.sleep(2000);
	  // pricetextbox.clear();
	   pricetextbox.sendKeys(readExcelFile(0,3));
	   Thread.sleep(2000);
	   cancelbtn.click();
	   Thread.sleep(2000);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

	}                           









 





