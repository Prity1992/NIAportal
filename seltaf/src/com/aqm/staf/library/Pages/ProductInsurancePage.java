package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.ProductInsuranceEntity;

public class ProductInsurancePage extends BasePage {
	private PageElement lOBName;
	private PageElement RadioButton;
	private PageElement getInfoButton;
	private PageElement buyOnlineButton;
	private PageElement prodname;
	private PageElement lOBProductName;
	private PageElement productInfoNameLabel;
	private PageElement continueButton;
	private PageElement detailedQuoteLabel;
	private PageElement getinfoRuralButton;
	private PageElement knowYourPremiumButton;
	String Prodname;
	String indexName;
	String productName;
	private PageElement lOBNameCPA;
	private PageElement dateOfBirthCPA;
	private PageElement mobileNoCPA;
	private PageElement emailIdCPA;
	private PageElement knowYourPremiumButtonCPA;

	public ProductInsurancePage(WebDriver driver,String pageName){
		super(driver,pageName);
		lOBName    	     = new PageElement(By.xpath("//span[@class='clr_text_nia']"), "LOB Name", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//RadioButton      = new PageElement(By.xpath("//input[@id='product+'"+indexName+"'']"), "Radio Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		prodname	 	 = new PageElement(By.xpath("//span[contains(text(),'"+Prodname+"')]"), "Prod name", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		getInfoButton	 = new PageElement(By.xpath("//button[@id='buyOnline']/preceding::button[1]"),"Get Info Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buyOnlineButton  = new PageElement(By.xpath("//button[@class='buyOnlineDiv']"),"Buy Online Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
		productInfoNameLabel	 = new PageElement(By.xpath("//h5[contains(text(),'Product Information')]/following::h6[1]"),"Product Information Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		continueButton=new PageElement(By.xpath("//button[@class='btn btn-width btn-Continue']"),"Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailedQuoteLabel	 = new PageElement(By.xpath("//label[@data-ng-switch-when='1']"),"Detailed Quote Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		getinfoRuralButton		= new PageElement(By.xpath("//div[@class='col-xs-12 text-center clearfix product_show_btns EK_btns active']//button[@type='submit']"),"Get Info Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		knowYourPremiumButton		= new PageElement(By.xpath("//div[@class='col-xs-12 text-center clearfix product_show_btns EK_btns active']//button[@type='submit']/following::button[1]"),"Know Your Premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBNameCPA					=new PageElement(By.xpath("//div[@class='GetQuote-header']"), "LOB Name CPA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfBirthCPA		=new PageElement(By.xpath("//input[@id='datefield']"), "Date Of Birth CPA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		mobileNoCPA= new PageElement(By.xpath("//input[@name='mobileNo']"), "Mobile No CPA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		emailIdCPA= new PageElement(By.xpath("//input[@name='emailId']"), "Email Id CPA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		knowYourPremiumButtonCPA= new PageElement(By.xpath("//*[contains(text(),'your Premium')]"), "Know your Premium CPA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void verifyHealthInsurance(ProductInsuranceEntity productInsuranceEntity,CustomAssert customAssert) {
		if(productInsuranceEntity.getAction().equalsIgnoreCase("add")&&(!(productInsuranceEntity.getStringValueForField("lOBNameCPA").equalsIgnoreCase("Standalone CPA")))){
			String lOBProductName;
			lOBProductName = productInsuranceEntity.getStringValueForField("ProductName");
			if ((lOBProductName!=null)&&(!lOBProductName.isEmpty())){
				productName=productInsuranceEntity.getStringValueForField("ProductName");
				RadioButton=new PageElement(By.xpath("//span[contains(text(),'"+productName+"')]/preceding::input[1]"), "Radio Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				isElementEnabled(RadioButton);
			}
			String getinfoButton;
			getinfoButton = productInsuranceEntity.getStringValueForField("Getinfo");
			if ((getinfoButton!=null)&&(!getinfoButton.isEmpty())){
				click(getInfoButton);
			}
			String buyOnlineBtn;
			buyOnlineBtn = productInsuranceEntity.getStringValueForField("BuyOnline");
			if ((buyOnlineBtn!=null)&&(!buyOnlineBtn.isEmpty())){
				click(buyOnlineButton);	
				try {
					click(continueButton);
					switchToFrame("chrome");
				} catch (Exception e) {
				}
			}
			String getinfoRural;
			getinfoRural = productInsuranceEntity.getStringValueForField("GetinfoRural");
			if ((getinfoRural!=null)&&(!getinfoRural.isEmpty())){
				click(getinfoRuralButton);
			}
			String knowYourPremium;
			knowYourPremium = productInsuranceEntity.getStringValueForField("KnowYourPremium");
			if ((knowYourPremium!=null)&&(!knowYourPremium.isEmpty())){
				click(knowYourPremiumButton);
			}
		}
		else if(productInsuranceEntity.getAction().equalsIgnoreCase("verify")){
			String lOBName1;
			lOBName1 = productInsuranceEntity.getStringValueForField("lOBName");
			if ((lOBName1!=null)&&(!lOBName1.isEmpty())){
				String symbol[]=fetchValueFromFields(lOBName).split("\\s");
				String symbol1=symbol[0]+" "+symbol[1];
				customAssert.assertEquals(productInsuranceEntity.getStringValueForField("lOBName"), symbol1, AssertionType.WARNING);
			}
		}
			 if(productInsuranceEntity.getAction().equalsIgnoreCase("add")||productInsuranceEntity.getAction().equalsIgnoreCase("verify")&&((productInsuranceEntity.getStringValueForField("lOBNameCPA").equalsIgnoreCase("Standalone CPA")))){
				String lOBName2;
				lOBName2 = productInsuranceEntity.getStringValueForField("lOBNameCPA");
				if ((lOBName2!=null)&&(!lOBName2.isEmpty())){
					String symbol[]=fetchValueFromFields(lOBNameCPA).split("\\s");
					String symbol1=symbol[0]+" "+symbol[1];
					customAssert.assertEquals(productInsuranceEntity.getStringValueForField("lOBNameCPA"), symbol1, AssertionType.WARNING);
				}
				
				String DateOfBirthCPA;
				DateOfBirthCPA = productInsuranceEntity.getStringValueForField("DateOfBirthCPA");
				if ((DateOfBirthCPA!=null)&&(!DateOfBirthCPA.isEmpty())){
					clearAndSendKeys(dateOfBirthCPA, DateOfBirthCPA);
				}
				
				String MobileNoCPA;
				MobileNoCPA = productInsuranceEntity.getStringValueForField("MobileNoCPA");
				if ((MobileNoCPA!=null)&&(!MobileNoCPA.isEmpty())){
					clearAndSendKeys(mobileNoCPA, MobileNoCPA);
				}
				
				String EmailIdCPA;
				EmailIdCPA = productInsuranceEntity.getStringValueForField("EmailIdCPA");
				if ((EmailIdCPA!=null)&&(!EmailIdCPA.isEmpty())){
					clearAndSendKeys(emailIdCPA, EmailIdCPA);
				}
				
				String KnowYourPremiumButtonCPA;
				KnowYourPremiumButtonCPA = productInsuranceEntity.getStringValueForField("KnowYourPremiumButtonCPA");
				if ((KnowYourPremiumButtonCPA!=null)&&(!KnowYourPremiumButtonCPA.isEmpty())){
					click(knowYourPremiumButtonCPA);
				}
			 }
			String lOBProductName1;
			lOBProductName1 = productInsuranceEntity.getStringValueForField("ProductName");
			if (productInsuranceEntity.getBooleanValueForField("ConfigProductName")){ 
				productName=productInsuranceEntity.getStringValueForField("ProductName");
				RadioButton=new PageElement(By.xpath("//span[contains(text(),'"+productName+"')]/preceding::input[1]"), "Radio Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				isElementEnabled(RadioButton);

				lOBProductName=new PageElement(By.xpath("//span[contains(text(),'"+productName+"')]"), "Radio Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				customAssert.assertEquals(productInsuranceEntity.getStringValueForField("ProductName"), fetchValueFromFields(lOBProductName), AssertionType.WARNING);
			}

			String productInfoName;
			productInfoName = productInsuranceEntity.getStringValueForField("ProductInfoName");
			if (productInsuranceEntity.getBooleanValueForField("ConfigProductInfoName")){ 
				customAssert.assertEquals(productInsuranceEntity.getStringValueForField("ProductInfoName"), fetchValueFromFields(productInfoNameLabel), AssertionType.WARNING);
			}
			String detailedQuote;
			detailedQuote = productInsuranceEntity.getStringValueForField("DetailedQuoteLabel");
			if ((detailedQuote!=null)&&(!detailedQuote.isEmpty())){ 
				customAssert.assertEquals(productInsuranceEntity.getStringValueForField("DetailedQuoteLabel"), fetchValueFromFields(detailedQuoteLabel), AssertionType.WARNING);
			}
		}
	
		
	public void fillAndVerifyProductInsurancePage(ProductInsuranceEntity productInsuranceEntity,CustomAssert customAssert) {
		verifyHealthInsurance(productInsuranceEntity, customAssert);
	}
}


