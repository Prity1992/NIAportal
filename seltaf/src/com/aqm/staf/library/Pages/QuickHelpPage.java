package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.ProductInsuranceEntity;
import com.aqm.staf.library.databin.QuickHelpEntity;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class QuickHelpPage extends BasePage {

	private PageElement quickHelpDropDown;
	private PageElement quickPaymentTab;
	private PageElement quickRenewalTab;
	private PageElement customerIDRenewal;
	private PageElement policyNoRadiobtn;
	private PageElement freshRenewalNoRadiobtn;
	private PageElement freshRenewalQuoteNo;
	private PageElement proceedbtn;
	private PageElement confirmRenewalbtn;
	private PageElement customerIDTextField;
	private PageElement freshQuoteNoTextField;
	private PageElement proceedButton;
	private PageElement confirmButton;
	private PageElement iAgreeCheckbox;
	private PageElement payNowButton;
	private PageElement policyNoLabel;
	private PageElement quouteNoLabel;
	private PageElement transactionIDNoLabel;
	private PageElement transactionAmountLabel;
	private PageElement transactionStatusLabel;
	private PageElement quikPaymentLabel;
	private PageElement alertCloseImgWindow;
	private PageElement continueRenewalbtn;
	//	private PageElement personalDetails;


	public QuickHelpPage(WebDriver driver,String pageName){
		super(driver,pageName);
		
		quickHelpDropDown  = new PageElement(By.xpath("//a[contains(text(),'Quick Help')]"), "Quick Help", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		quickPaymentTab         = new PageElement(By.name("uploadProp"), "Upload;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quickRenewalTab         = new PageElement(By.xpath("//a[@title='Quick Renewal']"), "Quick Renewal", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		customerIDRenewal		= new PageElement(By.xpath("//input[@id='partyCode']"), "customerID Renewal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoRadiobtn        = new PageElement(By.xpath("//span[@class='bold radio_span_np pl-1']"), "policy No Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		freshRenewalNoRadiobtn  = new PageElement(By.xpath("//span[@class=' bold radio_span_np pl-1']"), "Fresh Renewal NoRadiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		freshRenewalQuoteNo		= new PageElement(By.xpath("//input[@id='quoteNo']"), "quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedbtn				= new PageElement(By.xpath("//button[contains(text(),'Proceed')]"), "Proceedbtn;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		confirmRenewalbtn				= new PageElement(By.xpath("//button[@class='btn btn-width submit-button mr-10']"), "confirm Renewal btn;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		continueRenewalbtn 			= new PageElement(By.xpath("//button[contains(text(),'Continue Renewal')]"), "continue Renewal btn;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		customerIDTextField  = new PageElement(By.xpath("//input[@id='partyCode']"), "Customer ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		freshQuoteNoTextField  = new PageElement(By.xpath("//input[@id='quoteNo']"), "Upload", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton      = new PageElement(By.xpath("//button[contains(text(),'Proceed')]"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		confirmButton  = new PageElement(By.xpath("//button[@class='btn btn-width submit-button mr-10']"), "Confime", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		iAgreeCheckbox  = new PageElement(By.xpath("//input[@name='acceptdeclaration']"), " I Agree;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		payNowButton      = new PageElement(By.xpath("//button[@class='btn btn-width submit-button pull-right']"), "Pay Now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quikPaymentLabel = new PageElement(By.xpath("//a[contains(text(),'Quick Payment ')]"), "Quick Payment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Policy No.')]//following::div[1]"), "Policy No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quouteNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Quote No.')]//following::div[1]"), "Quote Number;", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionIDNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction ID No.')]//following::div[1]"), "Customer ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionAmountLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction Amount')]//following::div[1]"), "Transaction Amount;", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionStatusLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction Status')]//following::div[1]"), "Transaction Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		alertCloseImgWindow= new PageElement(By.xpath("//img[@class='alert_CloseImg advartisement']"), "alert_CloseImg advartisement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//personalDetails = new PageElement(By.xpath("//span[contains(text(),'Personal Details')]"), "alert_CloseImg advartisement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void clickAlertCloseImgWindow(QuickHelpEntity quickHelpEntity){
		String AlertCloseImgWindow;
		AlertCloseImgWindow = quickHelpEntity.getStringValueForField("AlertCloseImgWindow");
		if ((AlertCloseImgWindow!=null)&&(!AlertCloseImgWindow.isEmpty())){
		 {
				click(alertCloseImgWindow);
		} 
		}
	}
	public void fillQuickPageDetails(QuickHelpEntity quickHelpEntity,CustomAssert assertReference) throws InterruptedException {
		if(quickHelpEntity.getAction().equalsIgnoreCase("add")) {
			String QuickHelpType;
			QuickHelpType = quickHelpEntity.getStringValueForField("QuickHelpType");
			click(quickHelpDropDown);
			if ((QuickHelpType!=null)&&(!QuickHelpType.isEmpty())){
				click(quikPaymentLabel);

			}
		}
	}
	public void fillQuickRenewalDetails(QuickHelpEntity quickHelpEntity,CustomAssert assertReference) throws InterruptedException {
		if(quickHelpEntity.getAction().equalsIgnoreCase("add")) {
			
			String QuickRenewalTab;
			QuickRenewalTab = quickHelpEntity.getStringValueForField("QuickRenewalTab");
			if ((QuickRenewalTab!=null)&&(!QuickRenewalTab.isEmpty())){
				click(quickRenewalTab);
				
			}
			
			String CustomerID;
			CustomerID = quickHelpEntity.getStringValueForField("CustomerIDRenewal");
			if ((CustomerID!=null)&&(!CustomerID.isEmpty())){
			  clearAndSendKeys(customerIDRenewal,quickHelpEntity.getStringValueForField("CustomerIDRenewal"));
				
			}
			
			String PolicyNoRadiobtn;
			PolicyNoRadiobtn = quickHelpEntity.getStringValueForField("PolicyNoRadiobtn");
			if ((PolicyNoRadiobtn!=null)&&(!PolicyNoRadiobtn.isEmpty())){
			  click(policyNoRadiobtn);
				
			}
			
			String FreshRenewalNoRadiobtn;
			FreshRenewalNoRadiobtn = quickHelpEntity.getStringValueForField("FreshRenewalNoRadiobtn");
			if ((FreshRenewalNoRadiobtn!=null)&&(!FreshRenewalNoRadiobtn.isEmpty())){
				 click(freshRenewalNoRadiobtn);
			}
			
			String FreshRenewalQuoteNo;
			FreshRenewalQuoteNo = quickHelpEntity.getStringValueForField("FreshRenewalQuoteNo");
			if ((FreshRenewalQuoteNo!=null)&&(!FreshRenewalQuoteNo.isEmpty())){
			  clearAndSendKeys(freshRenewalQuoteNo,quickHelpEntity.getStringValueForField("FreshRenewalQuoteNo"));
				
			}
			
			String Proceedbtn;
			Proceedbtn = quickHelpEntity.getStringValueForField("Proceedbtn");
			if ((Proceedbtn!=null)&&(!Proceedbtn.isEmpty())){
				click(proceedbtn);
				
			}
			
			
			String Continuebtn;
			Continuebtn = quickHelpEntity.getStringValueForField("Continuebtn");
			if ((Continuebtn!=null)&&(!Continuebtn.isEmpty())){
				click(continueRenewalbtn);
				
			}
			
		}
	}
		
	public void fillQuickPaymentDetails(QuickHelpEntity quickHelpEntity,CustomAssert assertReference) throws InterruptedException {
		if(quickHelpEntity.getAction().equalsIgnoreCase("add")) {
			String CustomerID;
			CustomerID = quickHelpEntity.getStringValueForField("CustomerID");
			if ((CustomerID!=null)&&(!CustomerID.isEmpty())){
				clearAndSendKeys(customerIDTextField,quickHelpEntity.getStringValueForField("CustomerID"));
			}
			String freshQuoteNo;
			freshQuoteNo = quickHelpEntity.getStringValueForField("FreshQuoteNo");
			if ((freshQuoteNo!=null)&&(!freshQuoteNo.isEmpty())){
				clearAndSendKeys(freshQuoteNoTextField,quickHelpEntity.getStringValueForField("FreshQuoteNo"));
			}

			String proceed;
			proceed = quickHelpEntity.getStringValueForField("Proceed");
			if ((proceed!=null)&&(!freshQuoteNo.isEmpty())){
				click(proceedButton);
			}

			String confirme;
			confirme = quickHelpEntity.getStringValueForField("Confirme");
			if ((confirme!=null)&&(!confirme.isEmpty())){
				click(confirmButton);
			}
			
			String Confirmbtn;
			Confirmbtn = quickHelpEntity.getStringValueForField("ConfirmRenewalbtn");
			if ((Confirmbtn!=null)&&(!Confirmbtn.isEmpty())){
				click(confirmRenewalbtn);
				
			}

			String iagree;
			iagree = quickHelpEntity.getStringValueForField("IAgree");
			if ((iagree!=null)&&(!iagree.isEmpty())){
				click(iAgreeCheckbox);
			}

			String payNow;
			payNow = quickHelpEntity.getStringValueForField("PayNow");
			if ((payNow!=null)&&(!payNow.isEmpty())){
				click(payNowButton);
			}


			if(quickHelpEntity.getBooleanValueForField("ConfigPolicyNo")){
				quickHelpEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
			}


			if(quickHelpEntity.getBooleanValueForField("ConfigQuoteNo")){
				quickHelpEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quouteNoLabel));
			}



			if(quickHelpEntity.getBooleanValueForField("ConfigTransactionIDNo")){
				quickHelpEntity.setStringValueForField("TransactionIDNo", fetchValueFromFields(transactionIDNoLabel));
			}


			if(quickHelpEntity.getBooleanValueForField("ConfigTransactionAmount")){
				quickHelpEntity.setStringValueForField("TransactionAmount", fetchValueFromFields(transactionAmountLabel));
			}



			if(quickHelpEntity.getBooleanValueForField("ConfigTransactionStatus")){
				quickHelpEntity.setStringValueForField("TransactionStatus", fetchValueFromFields(transactionStatusLabel));
			}

		}
	}
	public void fillAndSubmitQuickHelpPage(QuickHelpEntity quickHelpEntity,CustomAssert assertReference) throws InterruptedException {
		clickAlertCloseImgWindow(quickHelpEntity);
		fillQuickPageDetails(quickHelpEntity, assertReference);
		fillQuickRenewalDetails(quickHelpEntity, assertReference);
		fillQuickPaymentDetails(quickHelpEntity, assertReference);



	}

	}













