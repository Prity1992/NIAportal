package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmentable;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LoginEntity;

public class LoginPage extends BasePage{
	private PageElement userName;
	private PageElement password;
	private PageElement LoginButton;
	private PageElement alertCloseImgWindow; 
	private PageElement customerLoginTab;
	private PageElement patternATextField;
	private PageElement patternBTextField;
	private PageElement patternCTextField;
	private PageElement intermediaryLoginTab;
	private PageElement selecttheRoleDropDown;
	private PageElement selecttheRoleOkButton;

	public LoginPage(WebDriver driver,String pageName){
		super(driver,pageName);
		userName				= new PageElement(By.xpath("//input[@id= 'userName']"), "UserName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		password				= new PageElement(By.id("password"), "Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LoginButton				= new PageElement(By.xpath("//button[contains(text(),'Login')]"), "Submit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		alertCloseImgWindow 	= new PageElement(By.xpath("//img[@class='alert_CloseImg advartisement']"), "alert_CloseImg advartisement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		customerLoginTab		= new PageElement(By.xpath("//span[contains(text(),'CUSTOMER')]"), "Customer Login Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		patternATextField  		= new PageElement(By.id("a"), "Pattern Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		patternBTextField  		= new PageElement(By.id("b"), "Pattern Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		patternCTextField  		= new PageElement(By.id("c"), "Pattern Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		intermediaryLoginTab	= new PageElement(By.xpath("//span[contains(text(),'INTERMEDIARY')]"), "Intermediary Login Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		selecttheRoleDropDown	= new PageElement(By.xpath("//select[@name=('role')]"), "Select the Role", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		selecttheRoleOkButton	= new PageElement(By.xpath("//button[contains(text(),'OK')]"), "Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void clickAlertCloseImgWindow(LoginEntity loginEntity){
		String AlertCloseImgWindow;
		AlertCloseImgWindow = loginEntity.getStringValueForField("AlertCloseImgWindow");
		if ((AlertCloseImgWindow!=null)&&(!AlertCloseImgWindow.isEmpty())){
			try {
				click(alertCloseImgWindow);
			} catch (Exception e) {
			}
			isElementDisplayed(customerLoginTab);
		}
	}
	public void ClickCustomerLoginTab(LoginEntity loginEntity){
		String customerLogin;
		customerLogin = loginEntity.getStringValueForField("CustomerLoginTab");
		if ((customerLogin!=null)&&(!customerLogin.isEmpty())){
			click(customerLoginTab);
		}
	}
	public void ClickIntermediaryLoginTab(LoginEntity loginEntity) throws InterruptedException{
		String intermediaryLogin;
		intermediaryLogin = loginEntity.getStringValueForField("IntermediaryLoginTab");
		if ((intermediaryLogin!=null)&&(!intermediaryLogin.isEmpty())){
			click(intermediaryLoginTab);
			switchToTab();
			driver.navigate().refresh();
			Thread.sleep(1000);
			//driver.findElement(By.id("")).sendKeys(Keys.F5);
			//switchToWindow("The New India Assurance Co. Ltd.");
			//driver.get("https://uatapps.newindia.co.in/NIABancsPortal/IntermediaryLogin.html");
		}
	}

	public void fillAndSubmitLogin(LoginEntity loginEntity,CustomAssert customAssert){
		if(loginEntity.getAction().equalsIgnoreCase("add")){
			String UserName;
			UserName = loginEntity.getStringValueForField("UserName");
			if ((UserName!=null)&&(!UserName.isEmpty())){
				clearAndSendKeys(userName, loginEntity.getStringValueForField("UserName"));
			}
			String Password;
			Password = loginEntity.getStringValueForField("Password");
			if ((Password!=null)&&(!Password.isEmpty())){
				clearAndSendKeys(password, loginEntity.getStringValueForField("Password"));
			}
			String captcha;
			captcha = loginEntity.getStringValueForField("Captcha");
			if ((captcha!=null)&&(!captcha.isEmpty())){
				String test=driver.findElement(By.xpath("//simple-captcha[@valid='captchaValid']")).getText();
				String[] test1=test.split(" ");
				int index;
				int a,b,sum;
				String value,math;
				for(index=0; index<test1.length;index++) {
					math = test1[1];
					if(test1[index].isEmpty()) {
						switch(index) {
						case 0:

							a = Integer.parseInt(test1[2]);
							b = Integer.parseInt(test1[4]);
							value = simplecaptcha(a,b,math,index);
							clearAndSendKeys(patternATextField,value);
							break;
						case 2:
							a = Integer.parseInt(test1[0]);
							b = Integer.parseInt(test1[4]);
							value = simplecaptcha(a,b,math,index);
							clearAndSendKeys(patternBTextField,value);
							break;
						case 4:
							a = Integer.parseInt(test1[2]);
							b = Integer.parseInt(test1[0]);
							value = simplecaptcha(a,b,math,index);
							clearAndSendKeys(patternCTextField,value);
							break;
						}
					}
				}
			}

			String Submit;
			Submit = loginEntity.getStringValueForField("Submit");
			if ((Submit!=null)&&(!Submit.isEmpty())){
				click(LoginButton);
			}
		}
	}
	public String simplecaptcha(int a,int b,String math,int index) {
		int value=0;
		switch(index) {
		case 0: case 2:
			if(math.equalsIgnoreCase("+")) {
				value = b - a ;
			}else if(math.equalsIgnoreCase("-")) {
				value = b + a ;
			}
			break;
		case 4:
			if(math.equalsIgnoreCase("+")) {
				value = b + a ;
			}else if(math.equalsIgnoreCase("-")) {
				value = a - b ;
			}
		}
		return Integer.toString(value).replaceAll("-", "");
	}
	//shreeya
	public void fillSelecttheRole(LoginEntity loginEntity,CustomAssert customAssert){
		String SelecttheRole;
		SelecttheRole = loginEntity.getStringValueForField("SelecttheRole");
		if ((SelecttheRole!=null)&&(!SelecttheRole.isEmpty())){
			selectValueFromList(selecttheRoleDropDown,loginEntity.getStringValueForField("SelecttheRole"));
		}
		String SelecttheRoleOk;
		SelecttheRoleOk=loginEntity.getStringValueForField("SelecttheRoleOk");
		if ((SelecttheRoleOk!=null)&&(!SelecttheRoleOk.isEmpty())){
			click(selecttheRoleOkButton);
		}
	}
	public void fillAndSubmitLoginPage(LoginEntity loginEntity,CustomAssert customAssert) throws InterruptedException{

		clickAlertCloseImgWindow(loginEntity);
		//shreeya
		String IntermediaryLogin;
		IntermediaryLogin = loginEntity.getStringValueForField("IntermediaryLogin");
		if ((IntermediaryLogin!=null)&&(!IntermediaryLogin.isEmpty())){
			ClickIntermediaryLoginTab(loginEntity);
		}
		else {
			ClickCustomerLoginTab(loginEntity);
		}

		fillAndSubmitLogin(loginEntity, customAssert);
		//Shreeya
		/*if ((IntermediaryLogin!=null)&&(!IntermediaryLogin.isEmpty())){
		//fillSelecttheRole(loginEntity, customAssert);
		}*/
	}
}
