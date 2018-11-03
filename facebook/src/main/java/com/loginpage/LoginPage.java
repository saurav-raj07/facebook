package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement usernameTxtBx;

	@FindBy(name = "pwd")
	private WebElement passwordTxtBx;

	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;

	public LoginPage(WebDriver driver) {

		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginFunction(String username, String password) throws InterruptedException {
		usernameTxtBx.sendKeys(username);
		passwordTxtBx.sendKeys(password);
		loginBtn.click();
		Reporter.log("logged in Sucessfully -->>",true);
		Thread.sleep(2000);
		logoutLink.click();
		Reporter.log("logged out sucessfully <<--",true);
		Thread.sleep(2000);
	}

}
