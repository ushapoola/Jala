package basepakage;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver driver;
	public  static Properties pro;
	
  @BeforeMethod
  public void BC() throws IOException {
	  
	  System.setProperty("Wedbriver.chromedriver","C:\\Users\\admin\\eclipse-workspace\\Batch15_basic_maven\\chromedriviver\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\JALA_Maven\\src\\data\\java\\Data");
	   pro = new Properties();
	   pro.load(f);
	   
  }
}
