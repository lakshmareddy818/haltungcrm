package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class HomePage {
     
	//we are storing the element's address of home page here
	//Declaration
	//@Find by (locatorName="locatorValue") accessSpecifier ReturnType elementName
	
	
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsLink;
	
	//@FindBy(id="Campaignstab") private WebElement CampTab;
	
	//initialization
	public HomePage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	//utilization
	//address returning method
	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

//action performing method
	public void clickCampaignsLink() 
	{
		
		campaignsLink.click();
		
	
		
	}
		
}



