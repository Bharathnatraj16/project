package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart extends BaseClass {


public static void main(String[] args) {
	browserLaunch("chrome");
	urlLaunch("https://www.flipkart.com/");
	maximize();
	

	WebElement classbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	classbtn.click();
	WebElement srcbox = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
	srcbox.sendKeys("iphone");
	WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	System.out.println("==========mobile models list===========");
	List<WebElement> mblname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(WebElement m:mblname)
	{
		String text = m.getText();
		System.out.println(text);
	}
	System.out.println("---------mobile price-----------");
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	for(WebElement p:price)
	{
		String text = p.getText();
		System.out.println(text);
	}
	driver.close();
}
}
