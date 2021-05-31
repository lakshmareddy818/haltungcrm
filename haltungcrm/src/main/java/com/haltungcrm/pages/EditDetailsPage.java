package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class EditDetailsPage {

	@FindBy(xpath="//input[@name='property(Num sent)']") private WebElement numsent;
	
	
	public EditDetailsPage() {
		PageFactory.initElements(BaseTest.driver,this);
		
	}


	public WebElement getNumsent() {
		return numsent;
	}
	
	public void enternumsent(String num) {
	numsent.sendKeys(num);
		
	}
}
