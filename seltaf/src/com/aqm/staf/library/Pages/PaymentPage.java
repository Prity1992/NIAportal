
package com.aqm.staf.library.Pages;

import static org.testng.Assert.assertEquals;

import org.hibernate.mapping.PrimaryKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PaymentEntity;
import com.aqm.staf.library.databin.SummaryEntity;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import org.testng.SkipException;

public class PaymentPage extends BasePage{
	private PageElement authenticateWithOTPAndBuyNowButton;
	private PageElement quoteNoLabel;
	private PageElement grossPremiumLabel;
	private PageElement goodsAndServicesTaxLabel;
	private PageElement netPremiumLabel;
	private PageElement productNameLabel;
	private PageElement policyHolderNameLabel;
	private PageElement policyStartDateLabel;
	private PageElement policyExpiryDateLabel;
	private PageElement disclaimerCheckBox;
	private PageElement IacceptpolicyTermsConditionsCheckBox;
	private PageElement buyLaterButton;
	private PageElement otpValidation;
	private PageElement submit;
	private PageElement iAgree;
	private PageElement pRoceed;
	private PageElement policyNoLabel;
	private PageElement myDashboard;

	public PaymentPage(WebDriver driver,String pageName) {
		super(driver,pageName);
		authenticateWithOTPAndBuyNowButton  = new PageElement(By.xpath("//button[contains(text(),'Authenticate with OTP and Buy now')]"), "Authenticate with OTP and Buy now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel                        = new PageElement(By.xpath("//label[contains(text(),'Quote No.')]/following::label[1]"), "Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossPremiumLabel                   = new PageElement(By.xpath("//label[contains(text(),'Gross Premium')]/following::label[1]"), "Gross Premium Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodsAndServicesTaxLabel            = new PageElement(By.xpath("//label[contains(text(),'Goods & Services Tax (GST)')]/following::label[1]"), "Goods And Services Tax Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netPremiumLabel                     = new PageElement(By.xpath("//label[contains(text(),'Net premium')]/following::label[1]"), "Net Premium Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productNameLabel                    = new PageElement(By.xpath("//label[contains(text(),'Product Name')]/following::label[1]"), "Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderNameLabel               = new PageElement(By.xpath("//label[contains(text(),'Policy Holder Name')]/following::label[1]"), "Policy Holder Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStartDateLabel                = new PageElement(By.xpath("//label[contains(text(),'Policy Start Date')]/following::label[1]"), "Policy Start Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyExpiryDateLabel               = new PageElement(By.xpath("//label[contains(text(),'Policy Expiry Date')]/following::label[1]"), "Policy Expiry Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		disclaimerCheckBox                  = new PageElement(By.xpath("//label//p//strong[contains(text(),'Disclaimer')]/preceding::input[1]"), "Disclaimer", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		IacceptpolicyTermsConditionsCheckBox= new PageElement(By.xpath("//label//p//strong[contains(text(),'Disclaimer')]/following::input[1]"), "I accept policy Terms Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buyLaterButton                      = new PageElement(By.xpath("//button[contains(text(),'Buy Later')]"), "Buy Later Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		otpValidation                       = new PageElement(By.xpath("//input[@name='otp']"), "OTP", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		submit                              = new PageElement(By.xpath("//button[contains(text(),'Submit')]"), "Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		iAgree                              = new PageElement(By.xpath("//button[contains(text(),'Authenticate with OTP and Buy now')]//following::input[1]"), "I Agree", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pRoceed                             = new PageElement(By.xpath("//button[contains(text(),'Authenticate with OTP and Buy now')]//following::button[1]"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel                       = new PageElement(By.xpath("//div[contains(text(),'Policy No.')]/following::div[1]"), "Policy No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		myDashboard                         = new PageElement(By.xpath("//a[contains(text(),'My Dashboard')]"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	public void VerifyPaymentPage(PaymentEntity paymentEntity,CustomAssert customAssert) {
		if(paymentEntity.getAction().equalsIgnoreCase("add")){
			waitForPageElement(quoteNoLabel);
			String quoteNo;
			quoteNo = paymentEntity.getStringValueForField("QuoteNo");
			if ((quoteNo!=null)&&(!quoteNo.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			String grossPremium;
			grossPremium = paymentEntity.getStringValueForField("GrossPremium");
			if ((grossPremium!=null)&&(!grossPremium.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("grossPremium"), fetchValueFromFields(grossPremiumLabel), AssertionType.WARNING);
			}
			String goodsAndServicesTax;
			goodsAndServicesTax=paymentEntity.getStringValueForField("GoodsAndServicesTax");
			if ((goodsAndServicesTax!=null)&&(!goodsAndServicesTax.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("GoodsAndServicesTax"), fetchValueFromFields(goodsAndServicesTaxLabel), AssertionType.WARNING);
			}
			String netPremium;
			netPremium=paymentEntity.getStringValueForField("NetPremium");
			if ((netPremium!=null)&&(!netPremium.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("NetPremium"), fetchValueFromFields(netPremiumLabel), AssertionType.WARNING);
			}
			String productName;
			productName=paymentEntity.getStringValueForField("ProductName");
			if ((productName!=null)&&(!productName.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("ProductName"), fetchValueFromFields(productNameLabel), AssertionType.WARNING);
			}
			String policyHolderName;
			policyHolderName=paymentEntity.getStringValueForField("PolicyHolderName");
			if ((policyHolderName!=null)&&(!policyHolderName.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderNameLabel), AssertionType.WARNING);
			}
			String policyStartDate;
			policyStartDate=paymentEntity.getStringValueForField("PolicyStartDate");
			if ((policyStartDate!=null)&&(!policyStartDate.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("PolicyStartDate"), fetchValueFromFields(policyStartDateLabel), AssertionType.WARNING);
			}
			String policyExpiryDate;
			policyExpiryDate=paymentEntity.getStringValueForField("PolicyExpiryDate");
			if ((policyExpiryDate!=null)&&(!policyExpiryDate.isEmpty())){
				customAssert.assertEquals(paymentEntity.getStringValueForField("PolicyExpiryDate"), fetchValueFromFields(policyExpiryDateLabel), AssertionType.WARNING);
			}
			String disclaimer;
			disclaimer=paymentEntity.getStringValueForField("DisclaimerCheckBox");
			if((disclaimer!=null)&&(!disclaimer.isEmpty())) {
				click(disclaimerCheckBox);
			}
			String IacceptpolicyTermsConditions;
			IacceptpolicyTermsConditions=paymentEntity.getStringValueForField("IacceptpolicyTermsConditions");
			if((IacceptpolicyTermsConditions!=null)&&(!IacceptpolicyTermsConditions.isEmpty())) {
				click(IacceptpolicyTermsConditionsCheckBox);
			}
		}
	}

	public void ClickOnBuyButton(PaymentEntity paymentEntity) throws InterruptedException {
		String BuyButton;
		BuyButton=paymentEntity.getStringValueForField("AuthenticateWithOTPAndBuyNowButton");
		if((BuyButton!=null)&&(!BuyButton.isEmpty())){
			click(authenticateWithOTPAndBuyNowButton);
			Thread.sleep(100000);
			String oTPValidation=null;
			String mailHost="pop.rediffmailpro.com";
			String userName="ajit.borase@aqmtechnologies.com";
			String password="Chhaya@1995";
			Properties mailProp=System.getProperties();
			Session sessionOBJ=Session.getDefaultInstance(mailProp,new MailCleanerAuthenticator(userName,password));
			try {
				Store storeOBJ=sessionOBJ.getStore("pop3");
				storeOBJ.connect(mailHost, userName, password);
				Folder folderOBJ=storeOBJ.getFolder("INBOX");
				folderOBJ.open(Folder.READ_ONLY);
				Message[] message=folderOBJ.getMessages();
				// for (int i = message.length-1; i >=0; i--) {
				for (int i = 0; i <message.length; i++) {
					System.out.println("________________________"+i+"________________________");
					if (message[i].isMimeType("text/plain")) {
						String result = message[i].getContent().toString();
						if(result.contains("The OTP for authenticating your e-proposal quote")) {
							System.out.println("Plain Text:"+result);
						}
					} else if (message[i].isMimeType("multipart/*")) {
						MimeMultipart mimeMultipart = (MimeMultipart) message[i].getContent();
						String result = getTextFromMimeMultipart(mimeMultipart);
						//Get CurrentDate
						DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
						String currentData = df.format(new Date());
						//Print Email content
						if(result.contains("The OTP for authenticating your e-proposal quote") && result.contains(paymentEntity.getStringValueForField("QuoteNo"))) {
							System.out.println("*****Mail body******:"+result.toString());
							String otp=result.toString();
							String[] getOtp = otp.split("\\s+");
							System.out.print(getOtp[12]);
							oTPValidation = getOtp[12];
						}
						/*  else
	                    {
	                    	throw new SkipException("OTP not received");
	                    }*/
					}
				}
				folderOBJ.close(true);
				storeOBJ.close();

			} catch (NoSuchProviderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clearAndSendKeys(otpValidation,oTPValidation);
			click(submit);
			String iagree;
			iagree=paymentEntity.getStringValueForField("Iagree");
			if((iagree!=null)&&(!iagree.isEmpty())){
				click(iAgree);}
			String proceed;
			proceed=paymentEntity.getStringValueForField("Proceed");
			if((proceed!=null)&&(!proceed.isEmpty())){
				click(pRoceed);}
			waitForPageElement(policyNoLabel);
			paymentEntity.setStringValueForField("PolicyNumber",fetchValueFromFields(policyNoLabel));
			click(myDashboard);
		}
	}
	private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart)   throws MessagingException, IOException{
		String result = "";
		int count = mimeMultipart.getCount();
		for (int i = 0; i < count; i++) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(i);
			if (bodyPart.isMimeType("text/plain")) {
				result = result + "\n" + bodyPart.getContent();
				break; 
			} else if (bodyPart.isMimeType("text/html")) {
				String html = (String) bodyPart.getContent();
				result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
			} else if (bodyPart.getContent() instanceof MimeMultipart){
				result = result + getTextFromMimeMultipart((MimeMultipart)bodyPart.getContent());
			}
		}
		return result;
	}
	public void ClickBuyLaterButton(PaymentEntity paymentEntity) {
		String BuyLaterButton;
		BuyLaterButton=paymentEntity.getStringValueForField("BuyLaterButton");
		if((BuyLaterButton!=null)&&(!BuyLaterButton.isEmpty())){
			click(buyLaterButton);
		}
	}

	public void VerifyAndSubmitPaymentPage(PaymentEntity paymentEntity,CustomAssert customAssert) throws InterruptedException {
		VerifyPaymentPage(paymentEntity, customAssert);
		ClickOnBuyButton(paymentEntity);
		ClickBuyLaterButton(paymentEntity);
	}
}
class MailCleanerAuthenticator extends Authenticator{
	MailCleanerAuthenticator(String username,String password){
		new PasswordAuthentication(username, password);
	}
}
