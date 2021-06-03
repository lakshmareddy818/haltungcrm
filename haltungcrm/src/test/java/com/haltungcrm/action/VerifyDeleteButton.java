package com.haltungcrm.action;

import org.openqa.selenium.Alert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.haltungcrm.genericlib.BaseTest;
import com.haltungcrm.genericlib.FileLib;
import com.haltungcrm.genericlib.WebDriverCommonLib;
import com.haltungcrm.pages.CreateCampaignPage;
import com.haltungcrm.pages.DeleteDetailsPage;
import com.haltungcrm.pages.DisplayingCustomViewDetailsPage;
import com.haltungcrm.pages.HomePage;
import com.haltungcrm.pages.LoginPage;

@Listeners(com.haltungcrm.genericlib.MyListeners.class)

public class VerifyDeleteButton extends BaseTest {
	
	@Test
	public void VerifyDeleteButtonTest() throws Throwable {
		
		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		DisplayingCustomViewDetailsPage dc = new DisplayingCustomViewDetailsPage();
		CreateCampaignPage cc = new CreateCampaignPage();
		DeleteDetailsPage dd = new DeleteDetailsPage();
		
		FileLib fl = new FileLib();
		WebDriverCommonLib wd = new WebDriverCommonLib();
		
		lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
		wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH, "homeTitle"),"HomePage");
		hp.clickCampaignsLink();
		wd.verify(wd.getPageTitle(),fl.readPropData(PROP_PATH,"CustomViewTitle") , "Custom View Page");
		dc.clickflipkart();
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "campaigndetails"), "Campaign View Page");
		dd.clickdeleteBtn();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
		
	}
	
}
