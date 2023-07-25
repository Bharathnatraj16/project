package org.test;



import java.util.Date;

import org.page.AdactinHotel;

public class HotelLaunch extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		maximize();
		browserLaunch(getCurrenturl())
		
		
		
		
		AdactinHotel ah = new AdactinHotel();
		
		//click(ah.getNewuser());
		
		//sendKeys(ah.getTxtusername(),"bharathbarry6");
		
		//sendKeys(ah.getTxtpassword(), "bharath@16");
		
		//sendKeys(ah.getTxtrepassword(), "bharath@16");
		
		
		//sendKeys(ah.getTxtemail(), "bharath160698@gmail.com");
		
		//sendKeys(ah.getTxtfullname(), "bhrarathn");
				
//Thread.sleep(15000);
		
//click(ah.getClick());
		
//click(ah.getBtnsubmit());

//click(ah.getBtnlogin());
	

sendKeys(ah.getTxtusername1(), "bharathbarry6");

sendKeys(ah.getTxtpassword1(),"bharath@16");

click(ah.getSubmit2());


selectByVisibleText(ah.getLocation(), "Brisbane");

selectByVisibleText(ah.getHotels(),"Hotel Hervey");

selectByVisibleText(ah.getRoom(),"Super Deluxe");

selectByVisibleText(ah.getNor(),"5 - Five");

selectByVisibleText(ah.getAdultrom(),"3 - Three");

selectByVisibleText(ah.getChildroom(),"3 - Three");


//selectByVisibleText(ah.getDate(),"03/07/2023");

//selectByVisibleText(ah.getDateout(), "04/07/2023");

click(ah.getSubmit3());
click(ah.getRadiobutton());
click(ah.getSubmit4());


sendKeys(ah.getFirstname(),"bharath");
sendKeys(ah.getLastname(),"barry");
sendKeys(ah.getAddress(),"no.7 thimmavaram");
sendKeys(ah.getCreditcard(), "1234567890123456");
selectByVisibleText(ah.getCctype(),"Master Card");
selectByVisibleText(ah.getExpirymonth(),"April");
selectByVisibleText(ah.getExpiryyear(),"2025");
sendKeys(ah.getCvvnumber(),"123");
click(ah.getBooknow());





	}

}
