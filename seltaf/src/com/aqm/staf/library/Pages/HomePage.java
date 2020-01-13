package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.FindElements;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.LoginEntity;

public class HomePage extends BasePage {
	private PageElement lobNameDropdown;
	private PageElement productDropdown;
	private PageElement buyOnlineButton;
	private PageElement continueButton;
	// My Policy Attribute by ADP START
	private PageElement myPolicyTab;
	private PageElement myQuotations;
	private PageElement myClaims;
	private PageElement myGrievances;
	private PageElement myPayments;
	private PageElement tableElement;
	private PageElement QuoteNo;
	private PageElement Status;
	private PageElement oKButton;
	private PageElement HEALTHImage;
	private PageElement MISCELLANEOUSImage;
	private PageElement MOTORImage;
	private PageElement RURALImage;
	private PageElement OVERSEASImage;
	private PageElement getQuoteButton;
	private PageElement detailedViewButton;
	private PageElement policyHolderName;
	private PageElement intimateClaimButton;
	String myQuoteNo, QuoteNumber, ClickOnBuyButton, ClickOnGetQuote;

	// String status;
	// My Policy Attribute by ADP END
	public HomePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		lobNameDropdown = new PageElement(By.xpath("//select[@id='targetCarousel']"), "lobname", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		productDropdown = new PageElement(By.xpath("//select[@name='product']"), "Product", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buyOnlineButton = new PageElement(By.xpath("//button[@class='buyOnlineDiv']"), "Submit Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		continueButton = new PageElement(By.xpath("//button[@class='btn btn-width btn-Continue']"), "Continue Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		oKButton = new PageElement(By.xpath("//button[@class='btn btn-green btn-width alert_ok_btn']"), "OK Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// By ADP START
		myPolicyTab = new PageElement(By.xpath("//*[contains(text(),'My Policies')]"), "My Policy Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myQuotations = new PageElement(By.xpath("//*[contains(text(),'My Quotations')]"), "My Quotations Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myClaims = new PageElement(By.xpath("//*[contains(text(),'My Claims')]"), "My Claims Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myGrievances = new PageElement(By.xpath("//*[contains(text(),'My Grievances')]"), "My Grievances Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myPayments = new PageElement(By.xpath("//*[contains(text(),'My Payments')]"), "My Payments Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		intimateClaimButton= new PageElement(By.xpath("//button[@class='btn submit-button']"), "Intimate Claim button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// QuoteNo = new PageElement(By.xpath("//*[contains(text()='"+myQuoteNo+"']"),
		// "My Quote No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// Status = new
		// PageElement(By.xpath("//*[contains(text()='"+myQuoteNo+"']//following::td[4]"),
		// "My current status", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		HEALTHImage = new PageElement(By.xpath("//div[contains(@class,'pointer HEALTH')]"), "HEALTH Image", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		MISCELLANEOUSImage = new PageElement(By.xpath("//div[contains(@class,'pointer MISCELLANEOUS')]"),
				"MISCELLANEOUS Image", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		MOTORImage = new PageElement(By.xpath("//div[contains(@class,'pointer MOTOR')]"), "MOTOR Image", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RURALImage = new PageElement(By.xpath("//div[contains(@class,'pointer RURAL')]"), "RURAL Image", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		OVERSEASImage = new PageElement(By.xpath("//div[@class='pointer OVERSEAS']"), "OVERSEAS Image", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// getQuoteButton = new PageElement(By.className("getQuotebt"), "Get Quote
		// Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		getQuoteButton = new PageElement(By.xpath("//button[contains(@class,'getQuotebt')]"), "Get Quote Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		detailedViewButton = new PageElement(By.xpath("//label[@class='onoffswitch ml-10']"), "Detailed View Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyHolderName = new PageElement(By.xpath("//th[contains(text(),'Policy Holder Name')]"),
				"Detailed View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// By ADP END
	}

	public void fillAndSubmitHomePage(HomeEntity homeEntity, CustomAssert customAssert) throws InterruptedException {
		if (homeEntity.getAction().equalsIgnoreCase("add")||homeEntity.getAction().equalsIgnoreCase("verify")) {
			String val;
			val = homeEntity.getStringValueForField("LOBName");
			if ((val != null) && (!val.isEmpty())) {
				waitForPageElement(lobNameDropdown);
				selectValueFromList(lobNameDropdown, homeEntity.getStringValueForField("LOBName"));
				selectValueFromList(productDropdown, homeEntity.getStringValueForField("ProductName"));
				ClickOnBuyButton = homeEntity.getStringValueForField("ClickOnBuyButton");
				ClickOnGetQuote = homeEntity.getStringValueForField("ClickOnGetQuote");

				// added by ADP On 26-09-2018 START
				if ((ClickOnBuyButton != null) && (!ClickOnBuyButton.isEmpty())) {
					click(buyOnlineButton);
					if ((val != null) && (!val.isEmpty())
							&& (homeEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")
									|| homeEntity.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))) {
						try { 
							click(continueButton);
							switchToFrame("chrome");
						} catch (Exception e) {
						}
					}
				}
				if ((ClickOnGetQuote != null) && (!ClickOnGetQuote.isEmpty())) {
					click(getQuoteButton);
				}

			}
			String image;
			image = homeEntity.getStringValueForField("Image");
			if ((image != null) && (!image.isEmpty())) {
				switch (image) {
				case "HEALTH":
					click(HEALTHImage);
					//click(productDropdown);
					selectLOBAndProduct(homeEntity);
					break;
				case "MISCELLANEOUS":
					click(MISCELLANEOUSImage);
					selectLOBAndProduct(homeEntity);
					break;
				case "MOTOR":
					click(MOTORImage);
					selectLOBAndProduct(homeEntity);
					break;
				case "RURAL":
					click(RURALImage);
					selectLOBAndProduct(homeEntity);
					break;
				case "OVERSEAS":
					click(OVERSEASImage);
					Thread.sleep(2000);
					selectLOBAndProduct(homeEntity);
					// click(buyOnlineButton);
					break;
				}
				String detailedView;
				detailedView = homeEntity.getStringValueForField("DetailedView");
				if ((detailedView != null) && (!detailedView.isEmpty())) {
					click(detailedViewButton);
				}
			} else if ((val != null) && (!val.isEmpty())
					&& homeEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
				try {
					click(oKButton);
					switchToFrame("clearfix");
				} catch (Exception e) {
				}
			}

			String getQuote;
			getQuote = homeEntity.getStringValueForField("GetQuote");
			if ((getQuote != null) && (!getQuote.isEmpty())) {
				click(getQuoteButton);
				Thread.sleep(6000);
			}
			String detailedView;
			detailedView = homeEntity.getStringValueForField("DetailedView");
			if ((detailedView != null) && (!detailedView.isEmpty())) {
				click(detailedViewButton);
			}
		}

		if (homeEntity.getAction().equalsIgnoreCase("verify")) {
			String val;
			val = homeEntity.getStringValueForField("LOBName");
			if ((val != null) && (!val.isEmpty())) {
				customAssert.assertEquals(homeEntity.getStringValueForField("LOBName"),
						fetchValueFromList(lobNameDropdown), AssertionType.WARNING);
				customAssert.assertEquals(homeEntity.getStringValueForField("ProductName"),
						fetchValueFromList(productDropdown), AssertionType.WARNING);
			}
			String policHolderNameTab;
			policHolderNameTab = homeEntity.getStringValueForField("PolicyHolderName");
			if ((policHolderNameTab != null) && (!policHolderNameTab.isEmpty())) {
				customAssert.assertEquals(homeEntity.getStringValueForField("PolicyHolderName"),
						fetchValueFromFields(policyHolderName), AssertionType.WARNING);
			}
		}
	}

	// Pravina Code END
	public void selectLOBAndProduct(HomeEntity homeEntity) {
		// selectValueFromList(lobNameDropdown,
		// homeEntity.getStringValueForField("LOBName"));
		click(productDropdown);
		selectValueFromList(productDropdown, homeEntity.getStringValueForField("ProductName"));
	}
	// Amol
	public void ClickOnMyClaim(HomeEntity homeEntity)
	{
		String MyClaim = homeEntity.getStringValueForField("MyClaimTab");
		if ((MyClaim != null) && (!MyClaim.isEmpty())) 
		{
			click(myClaims);
		}
	}
	//Amol
	public void ClickOnMyIntimateClaimButton(HomeEntity homeEntity)
	{
		String IntimateClaimButton = homeEntity.getStringValueForField("IntimateClaimButton");
		if ((IntimateClaimButton != null) && (!IntimateClaimButton.isEmpty())) 
		{
			click(intimateClaimButton);
		}
	}

	// Pal Code start
	public void verifypolicyStatus(HomeEntity homeEntity, CustomAssert customAssert) {
		click(myQuotations);
		myQuoteNo = homeEntity.getStringValueForField("QuoteNo");
		Status = new PageElement(By.xpath("//*[contains(text(),'" + myQuoteNo + "')]/following::td[7]"),
				"My current status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		QuoteNo = new PageElement(By.xpath("//*[contains(text(),'" + myQuoteNo + "')]"), "My Quote Number", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WebElement ele_status =driver.findElement(By.xpath("//*[contains(text(),'\" + myQuoteNo + \"')]/following::td[7]"));
	
		System.out.println(ele_status.getText());
		customAssert.assertEquals(myQuoteNo, fetchValueFromFields(QuoteNo), AssertionType.WARNING);
		customAssert.assertEquals(homeEntity.getStringValueForField("PolicyStatus"), fetchValueFromFields(Status),
				AssertionType.WARNING);
	}

	public void fillAndVerifyHomePage(HomeEntity homeEntity, CustomAssert customAssert) throws InterruptedException {
		fillAndSubmitHomePage(homeEntity, customAssert);
		ClickOnMyClaim(homeEntity);
		ClickOnMyIntimateClaimButton(homeEntity);
	}
	// Pal Code END
}
