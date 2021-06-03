package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class EditDetailsPage {

	@FindBy(xpath="//input[@name='property(Num sent)']") private WebElement numsent;
	@FindBy(xpath = "//td[contains(text(),'Edit Campaign')]/ancestor::table /following-sibling::table[2]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}


	

	public EditDetailsPage() {
		PageFactory.initElements(BaseTest.driver,this);
		
	}


	public WebElement getNumsent() {
		return numsent;
	}
	
	public void enternumsent(String num) {
	numsent.sendKeys(num);
		
	}
   public void clicksaveBtn() {
	   saveBtn.click();
	
}

}



