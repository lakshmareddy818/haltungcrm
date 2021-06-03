package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class DeleteDetailsPage {
  
	@FindBy(xpath = "//td[@id='mouseArea__Description']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Delete']")
	private WebElement deleteBtn;

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public DeleteDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	
	public void clickdeleteBtn() {
		deleteBtn.click();
		
	}
}
