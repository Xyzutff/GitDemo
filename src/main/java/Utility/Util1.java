package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class Util1 extends TestBase {
      public static void screenShot(String name) throws IOException 
      {
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 File dest= new File("C:\\Users\\Asus\\eclipse-workspace\\26FebFrame\\Screenshot.jpeg");
	
	 FileHandler.copy(source,dest);
	
      }
	
	
	
	
}
