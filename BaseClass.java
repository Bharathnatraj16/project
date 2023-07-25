package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
	    }
		return driver;
	
      }
	
	     public static void urlLaunch(String url) {
			driver.get(url);

		}
	  	   public static void maximize() {
			driver.manage().window().maximize();
			
		}
	  	   
	  	  	  	   public static void selectByVisibleText(WebElement drpdown,String string) {
			Select s= new Select(drpdown);
			s.selectByVisibleText(string);

		}
	  	   public static void selectByValue(WebElement drpdown) {
			Select s = new Select(drpdown);
			s.selectByValue(null);

		}
	  	   public static void isSelected(WebElement radiobutton) {
			WebElement elemnt = driver.findElement(null);
			elemnt.isSelected();

		}
	  	  
	  	   
	  	   public static void switchTo() {
		   driver.switchTo();

		}
	  	   public static void clickAndHold(WebElement target) {
		   Actions a = new Actions(driver);
		   a.clickAndHold(target).perform();

		}
	  	 
	  	   	  	   public static void doubleClick(WebElement target) {
			Actions a = new Actions(driver);
			a.doubleClick(target).perform();

		}
	  	 
	  	   
	  	 
	  	   @SuppressWarnings("deprecation")
		public static void implicitlyWait(Duration duration) {
		    driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		    
		}
	  	   public static String getText(WebElement e) {
			String text=e.getText();
			return text;

		}
	  	   
	  	   public static String getAttribute(WebElement e) {
			String text=e.getAttribute("value");
			return text;

		}
	  	   public static void moveToElement(WebElement target) {
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();

		}
	  	   
	  	   public static void dragAndDrop(WebElement src,WebElement des) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, des).perform();

		}
	  	   
	  	   public static void selectByIndex(WebElement drpdown,int index) {
		   Select s= new Select(drpdown);
		  s.selectByIndex(index);

		}
	  	  
	public static String getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}
	 public static String getTitle()
	   {
		String title=driver.getTitle();
		
		return title;

	}
	
	   public static void quit() {
		driver.quit();

	}
	   public static void sendKeys(WebElement e,String data) {
		e.sendKeys("data");
		   
	}
	   
	  	   public static void click(WebElement e) {
         e.click();

	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	
	
	
	
	
	
	
	
	
	

}
