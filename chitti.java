package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class chitti extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		

	
	 browserLaunch("chrome");
	  
	 urlLaunch("https://www.facebook.com/");
	  
	  maximize();
	  
	  implicitlyWait(10);
	  WebElement txtuser = driver.findElement(By.id("email"));
	  txtuser.sendKeys("barry");
	  Actions a = new Actions(driver);
	  a.doubleClick(txtuser).perform();
	  //
	  a.contextClick(txtuser).perform();
	  
	  Robot r = new Robot();
	  
	  //down
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  //enter
	  Thread.sleep(5000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
}

		
	}