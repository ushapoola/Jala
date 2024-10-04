package ExecuteSteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Script extends Reused{

	public void Login() throws InterruptedException {
	driver.get(pro.getProperty("URL"));
		xp("UN").sendKeys(pro.getProperty("U"));
		xp("UP").sendKeys(pro.getProperty("P"));
		xp("Button").click();
		
		driver.navigate().refresh();
		T(2);
	}

	
	public void InvalidLogin() {
		driver.get(pro.getProperty("URL"));
			xp("UN").sendKeys(pro.getProperty("U1"));
			xp("UP").sendKeys(pro.getProperty("P1"));
			xp("Button").click();
			driver.navigate().refresh();
		}
	public void EmptyLogin() throws InterruptedException {
		T(2);
		driver.get(pro.getProperty("URL"));
			xp("UN").sendKeys(pro.getProperty("U2"));
			xp("UP").sendKeys(pro.getProperty("P2"));
			xp("Button").click();
			driver.navigate().refresh();
		}
	public void InvalidLogin1() {
		
		driver.navigate().refresh();
		driver.get(pro.getProperty("URL"));
			xp("UN").sendKeys(pro.getProperty("U3"));
			xp("UP").sendKeys(pro.getProperty("P3"));
			xp("Button").click();
			driver.navigate().refresh();
			
		}
	public void Remainder() throws InterruptedException {
		driver.get(pro.getProperty("URL"));
			xp("UN").sendKeys(pro.getProperty("U"));
			xp("UP").sendKeys(pro.getProperty("P"));
			xp("Button").click();
			
			xp("Rem").click();
			//driver.navigate().refresh();
		}
	public void forget() throws InterruptedException {
		T(2);
		driver.navigate().back();
		
		driver.get(pro.getProperty("URL"));
			xp("UN").sendKeys(pro.getProperty("U"));
			xp("UP").sendKeys(pro.getProperty("P"));
			xp("Button").click();
			T(2);
			driver.navigate().back();
			xp("forget").click();
			xp("forgetmail").sendKeys(pro.getProperty("U"));
			xp("get").click();
			
	}
	public void Title() throws InterruptedException {
		driver.get(pro.getProperty("URL"));
		//driver.navigate().back();
		T(2);
			xp("UN").sendKeys(pro.getProperty("U"));
			xp("UP").sendKeys(pro.getProperty("P"));
			xp("Button").click();
			String EP=driver.getTitle();
			String AC="Magnus";
			System.out.println(EP);
			if(EP.equals(AC)) {
				System.out.println("the Title is valid");
				
			}
			else {
				System.out.println("The title is not valid");
			}
			driver.navigate().refresh();
			T(2);
		}
	
	public void Add() throws InterruptedException {
		T(2);
		Actions a=new Actions(driver);
		a.moveToElement(xp("emp")).click().perform();
		xp("Create").click();
		
		T(2);
		xp("EF").sendKeys(pro.getProperty("Ename"));
		xp("EL").sendKeys(pro.getProperty("Elast"));
		xp("EM").sendKeys(pro.getProperty("Email"));
	    xp("EMO").sendKeys(pro.getProperty("Emobile"));
	    xp("EG").click();
	    xp("EA").sendKeys(pro.getProperty("Eaddress"));
	    
	    T(2);
	    WebElement d=xp("EC");
	  //  List<WebElement> dd=d.findElements(By.tagName("option"));
	    Select s=new Select(d);
	    s.selectByValue("1");	
	    xp("ECheck").click();
	    xp("EO").sendKeys(pro.getProperty("Eother"));
	    
	    xp("EA").click();
	}
	
}
