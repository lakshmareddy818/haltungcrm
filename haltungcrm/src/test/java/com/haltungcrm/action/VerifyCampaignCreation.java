package com.haltungcrm.action;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.haltungcrm.genericlib.BaseTest;
import com.haltungcrm.genericlib.FileLib;
import com.haltungcrm.genericlib.WebDriverCommonLib;
import com.haltungcrm.pages.CreateCampaignPage;
import com.haltungcrm.pages.DisplayingCustomViewDetailsPage;
import com.haltungcrm.pages.HomePage;

@Listeners(com.haltungcrm.genericlib.MyListeners.class)
 public class VerifyCampaignCreation extends BaseTest {
	

	@Test
	public void verifyCampaignTest() throws Throwable {
		
	//open the browser enter url
	//logi to app and verify homepage
		
	ValidLoginTest vl= new ValidLoginTest();
	vl.loginToApp();
	
	Thread.sleep(2000);
	//click on compaign(action)  module
	HomePage hp = new HomePage();
	hp.clickCampaignsLink();
	
	Thread.sleep(2000);
	
	WebDriverCommonLib wd= new WebDriverCommonLib();
	FileLib fl = new FileLib();
	
	wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "CustomViewTitle"), "Custom View Page");
	
   //click on new campaign button
	DisplayingCustomViewDetailsPage dc= new DisplayingCustomViewDetailsPage();
	dc.clickNewCampaignBtn();
	Thread.sleep(3000);
	wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH,  "CreateCampaignTitle"), "Create Campaign Page");
	
	//enter campaign name
	CreateCampaignPage cc = new CreateCampaignPage();
	cc.enterCampaignName("Reddy");
	cc.clicksavebtn();
	Thread.sleep(3000);
	hp.clickCampaignsLink();
	Thread.sleep(2000);
	
	//dc.verifyCampaignCreation("Reddy");
	
	
}
}