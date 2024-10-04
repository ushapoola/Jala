package ExecuteSteps;

import org.testng.annotations.Test;

import basepakage.Baseclass;

public class Execute extends Baseclass {
  @Test
  public void Running() throws InterruptedException {
	  Script s=new Script();
	  s.Login();
	  //s.InvalidLogin();
	  //s.InvalidLogin1();
	  
	 // s.Remainder();
	 // s.forget();
	 // s.Login();
	  s.Title();
	 // s.Add();
	  
	  
	  
  }
}
