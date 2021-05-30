package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class CreateCampaignPage {

	@FindBy(name = "property(Campaign Name)") private WebElement CampaignName;
	//@FindBy(xpath="//input[@name='property(Company)']") private WebElement CompanyName;
	
	@FindBy(xpath = "//td[contains(text(),'Create Campaign')]/ancestor::table /following-sibling::table[2]/descendant::input[@value='Save']")
	private WebElement saveBtn;

	public CreateCampaignPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public void enterCampaignName(String campaignName) {
		// CampaignName.clear();
		CampaignName.sendKeys(campaignName);
		
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
    public void clicksavebtn()  {
    	saveBtn.click();
    
	}

}
