package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static WebDriver driver;
	
	public String readPropertyFile(String value) throws IOException 
	{
	  Properties prop = new Properties();	
	
	  FileInputStream file = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\src\\main\\java\\Config\\Config.properties");
	
	  prop.load(file);
	
	  return prop.getProperty(value);   // url property madhun read karel
	
	}
	
	
	
    public void initalization() throws IOException
    {
    	        String browserName = "chrome";  
    			
    	        if(browserName.equalsIgnoreCase("chrome"))
    	
    			{	
    			ChromeOptions o = new 	ChromeOptions();
                o.addArguments("--disable-notifications");
    	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
                driver= new ChromeDriver(o);
                }
   
    			else if(browserName.equalsIgnoreCase("firefox"))
    			{
    				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\geckodriver.exe");
    				driver = new FirefoxDriver();
    			}
    			
    			else 
    			{
    				System.setProperty("webdriver.edge.driver", "C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\msedgedriver.exe");
    				driver = new EdgeDriver();
    				
    			}
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    			
    		  driver.manage().window().maximize();
              driver.manage().deleteAllCookies();
             // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              //driver.get("https://kite.zerodha.com/");
   
              driver.get(readPropertyFile("url"));
    
    }

        public String readExcelFile(int rowNum,int colNum) throws EncryptedDocumentException, IOException
        {
        	
        	
       FileInputStream file = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\TestData\\Book1.xlsx");
        
        
       Sheet excelSheet  =WorkbookFactory.create(file).getSheet("Sheet1");
        
       String value= excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        //INFY
       return  value;
        
        
        
        
        }
















}
