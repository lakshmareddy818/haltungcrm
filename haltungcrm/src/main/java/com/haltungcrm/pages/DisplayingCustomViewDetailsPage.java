package com.haltungcrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.haltungcrm.genericlib.BaseTest;

public class DisplayingCustomViewDetailsPage {
	
   @FindBy(xpath="//input[@value='New Campaign']") private WebElement NewCampaignBtn;
  @FindBy(xpath="//table[@class='secContent']//tbody//tr[*]//td[@class=\"tableData\"][3]") private List<WebElement> campaignList;
  
	//@FindBy(xpath="//input[@value='New Lead']") private WebElement NewLeadBtn;
	
	
   public DisplayingCustomViewDetailsPage()
   {
	   
   PageFactory.initElements(BaseTest.driver, this);
   	
}

   
   
   
/*
 * public void clickNewLeadBtn() { NewLeadBtn.click(); }
 * 
 * 
 * 
 * 
 * public WebElement getNewLeadBtn() { return NewLeadBtn; }
 * 
 * }
 */   
   
   
   
   
   public WebElement getNewCampaignBtn() 
   {
	   
   
	return NewCampaignBtn;
   }
	
     public void clickNewCampaignBtn() {
    	 
	NewCampaignBtn.click();
	
}
     
	
	  public void verifyCampaignCreation(String campaign) { for(WebElement
	  oneCampaign:campaignList) { String campaignName = oneCampaign.getText();
	  if(campaignName.equals(campaign))
	  
	  {
	  
	  Reporter.log("our campaign is created",true); break; } else {
	  Reporter.log("our campaign is notcreated",true); }
	  
	  
	  }
	  
	  
	  }
	  
	  }
	  
	 