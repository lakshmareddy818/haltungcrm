package com.haltungcrm.action;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.haltungcrm.genericlib.BaseTest;
import com.haltungcrm.genericlib.FileLib;
import com.haltungcrm.genericlib.WebDriverCommonLib;
import com.haltungcrm.pages.CreateCampaignPage;
import com.haltungcrm.pages.DisplayingCustomViewDetailsPage;
import com.haltungcrm.pages.EditDetailsPage;
import com.haltungcrm.pages.HomePage;
import com.haltungcrm.pages.LoginPage;

@Listeners(com.haltungcrm.genericlib.MyListeners.class)
public class VerifyEditButton extends BaseTest {
	
	
	   @Test
	        public void VerifyEditButtonTest() throws Throwable {
			HomePage hp = new HomePage();
			DisplayingCustomViewDetailsPage dc = new DisplayingCustomViewDetailsPage();
			CreateCampaignPage cc = new CreateCampaignPage();
			EditDetailsPage ed = new EditDetailsPage();
			ValidLoginTest vl=new ValidLoginTest();
			
			FileLib fl = new FileLib();
			WebDriverCommonLib wd = new WebDriverCommonLib();
			
			vl.loginToApp();
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "homeTitle"), "Home Page");
			hp.clickCampaignsLink();
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "CustomViewTitle"), "Custom View Page");
			dc.clicknlink();
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "campaigndetails"), "Campaign View Page");
			cc.clickeditBtn();
			//Thread.sleep(2000);
			//wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "editcampaign"), "Edit Page");
			//Thread.sleep(2000);
			ed.enternumsent("20");
			ed.clicksaveBtn();
			

		}
		
	}


