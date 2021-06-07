package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class EditDetailsPage {

	/*
	 * @FindBy(xpath="//input[@name='property(Num sent)']") private WebElement
	 * numsent;
	 * 
	 * @FindBy(xpath =
	 * "//td[contains(text(),'Edit Campaign')]/ancestor::table /following-sibling::table[2]/descendant::input[@value='Save']"
	 * ) private WebElement saveBtn;
	 * 
	 * public WebElement getSaveBtn() { return saveBtn; }
	 */
	@FindBy(name = "property(Campaign Name)") private WebElement CampaignName;
	@FindBy(xpath="//td[@id='mouseArea__Description']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Edit']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//td[contains(text(),'Edit Campaign')]/ancestor::table /following-sibling::table[2]/descendant::input[@value='Save']")
	private WebElement saveBtn;

	
	
	
	public EditDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);

	}



	
	

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public void enterCampaignName(String campaignName) {
		 CampaignName.clear();
		CampaignName.sendKeys(campaignName);
		//editBtn.click();
		//saveBtn.click();
		
	}


	public WebElement getEditBtn() {
		return editBtn;
	}
	
	
	  public void clickeditBtn()
	   { editBtn.click();
	  
	  }
	 

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	  public void clicksaveBtn()
	  { saveBtn.click();
	  
	  }
	 
	
	
	
	
}
	
	

	/*
	 * public WebElement getNumsent() { return numsent; }
	 * 
	 * public void enternumsent(String num) { numsent.clear();
	 * numsent.sendKeys(num);
	 * 
	 */

	/*
	 * public void clicksaveBtn() { saveBtn.click();
	 * 
	 * }
	 */

