package com.haltungcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltungcrm.genericlib.BaseTest;

public class LoginPage {
	
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver , this);
		
	}
	public WebElement getUntb() {
		return untb;
	}
	public void setUntb(WebElement untb) {
		this.untb = untb;
	}
	public WebElement getPwtd() {
		return pwtb;
	}
	public void setPwtd(WebElement pwtd) {
		this.pwtb = pwtd;
	}
	public WebElement getSignInBtn() {
		return signInBtn;
	}
	public void setSignInBtn(WebElement signInBtn) {
		this.signInBtn = signInBtn;
	}
	
	public void login(String un,String pwd) {
		
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInBtn.click();
		
	}
}
