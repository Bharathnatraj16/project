package org.test;
import org.test.BaseClass;
import org.page.Register;
public class Fblaunch extends BaseClass {
      public static void main(String[] args) {
		
    	  browserLaunch("chrome");
    	  
    	 urlLaunch("https://www.facebook.com/");
    	  
    	  maximize();
    	  
    	  implicitlyWait(10);
    	 
    	  
    	  
    	  
    	  Register r1 = new Register();
    	  
    	  click(r1.getCrtnew());
    	  
    	  sendKeys(r1.getTxtusername(), "bharath");
    	  
    	  sendKeys(r1.getTxtlastname(), "qwerj ");
    	  
    	  sendKeys(r1.getTxtemail(),"abc@gmail.com");
    	  
    	  sendKeys(r1.getBirthday(),"16");
    	  
    	  sendKeys(r1.getBirthdymonth(), "june");
    	  
    	  sendKeys(r1.getGendermale(), "male");
    	  
    	  
    	  driver.navigate().refresh();
    	  
    	  
    	  
	}
	
	
	
	
	
}
