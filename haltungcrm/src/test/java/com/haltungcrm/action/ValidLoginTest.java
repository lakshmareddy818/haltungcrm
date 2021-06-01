package com.haltungcrm.action;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.haltungcrm.genericlib.BaseTest;
import com.haltungcrm.genericlib.FileLib;
import com.haltungcrm.genericlib.WebDriverCommonLib;
import com.haltungcrm.pages.LoginPage;


@Listeners(com.haltungcrm.genericlib.MyListeners.class)

public class ValidLoginTest extends BaseTest {

	@Test
	public void loginToApp() throws Throwable {
		LoginPage lp = new LoginPage();
		FileLib fl = new FileLib();

		lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
		WebDriverCommonLib wd = new WebDriverCommonLib();
		wd.waitForPage(fl.readPropData(PROP_PATH, "homeTitle"));
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "homeTitle"), " Home Page");

	}
}
