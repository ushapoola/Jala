package ExecuteSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Reused extends Execute{

	
	public WebElement xp(String x)
	{
	return	driver.findElement(By.xpath(pro.getProperty(x)));
	}
	
	public void T(int f) throws InterruptedException {
		
		int x=1000*f;
		Thread.sleep(x);
	}

}
