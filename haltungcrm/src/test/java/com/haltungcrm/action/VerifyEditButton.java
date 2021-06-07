package com.haltungcrm.action;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.haltungcrm.genericlib.BaseTest;
import com.haltungcrm.genericlib.FileLib;
import com.haltungcrm.genericlib.MyListeners;
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
		//login page
			LoginPage lp = new LoginPage();
			FileLib fl = new FileLib();
			WebDriverCommonLib wd = new WebDriverCommonLib();
			lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "homeTitle"),"Home Page");
			CreateCampaignPage cc = new CreateCampaignPage();
			
			MyListeners.test=MyListeners.repo.createTest("Verify Edit Button");
			
			//home page
			HomePage hp = new HomePage();
			
			wd.elementStatus("displayed", hp.getCampaignsLink(), "Campaign Link");
			
			hp.clickCampaignsLink();
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "CustomViewTitle"),"Displaying Custom View Details");
			
			//click new campaign
			DisplayingCustomViewDetailsPage dc = new DisplayingCustomViewDetailsPage();
			
			wd.elementStatus("displayed", dc.getNewCampaignBtn(), "New Campaign Button");
			
			dc.clickNewCampaignBtn();
			//sThread.sleep(2000);
			wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH,"CreateCampaignTitle"),"Create Campaign Page");
			
			//create campaign
			
			wd.elementStatus("displayed", cc.getCampaignName(), "Campaign Name");
			
			cc.enterCampaignName(fl.readDataFromExcel(EXCEL_PATH,"edit", 1,0));
			
			wd.elementStatus("displayed", cc.getSaveBtn(), "Save Button");
			
			cc.clicksaveBtn();
			Thread.sleep(2000);
			//dc.verifyCampaignCreation(campaignName);
			
			//edit campaign page
			EditDetailsPage ed = new EditDetailsPage();
			
			wd.elementStatus("displayed", ed.getEditBtn(), "Edit Button");
			
			ed.clickeditBtn();
			
			//wd.waitForPage(fl.readPropData(PROP_PATH, "Zoho CRM - Edit Campaign"));
			//wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH,"editcampaign"),"Edit Campaign Page");
			
			wd.elementStatus("displayed", ed.getCampaignName(), "Campaign Name");
			
			ed.enterCampaignName(fl.readDataFromExcel(EXCEL_PATH,"edit",2,0));
			
			wd.elementStatus("displayed", ed.getSaveBtn(), "Save Button");
			
			ed.clicksaveBtn();			
			
	}
}
			
			
			