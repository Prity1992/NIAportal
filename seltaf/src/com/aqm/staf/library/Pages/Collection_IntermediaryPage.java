package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CollectionIntermediaryEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;

public class Collection_IntermediaryPage extends BasePage {

	private PageElement getCollectionpageName;
	private PageElement quoteNo;
	private PageElement quoteAmount;
	private PageElement balance;
	private PageElement totalAmount;
	private PageElement premiumAmount;
	private PageElement cashTab;
	private PageElement chequeTab;
	private PageElement demandDraftTab;
	private PageElement postalOrderTab;
	private PageElement netBankingTab;
	private PageElement collectionMode;
	private PageElement quoteModeAmount;
	private PageElement collectionModeAmount;
	private PageElement collectiontotalAmount;
	private PageElement instrumentAmount;
	private PageElement chequeDraftPOTypedropdown;
	private PageElement chequeDraftPONodropdown;
	private PageElement chequeDraftPODatedropdown;
	private PageElement dreweenBankName;
	private PageElement dreweenBankBranch;
	private PageElement collectionModeTotalAmount;
	private PageElement collectionModeAddBtn;
	private PageElement collectionModeCollectPremiumBtn;
	private PageElement progressBar;
	private PageElement payMentverify;
	private PageElement payMentverifyLink;
	private PageElement fetchPolicyNo;
	private PageElement fetchQuoteNo;
	private PageElement fetchProductName;
	private PageElement fetchPolicyHolderName;
	String CollectionModeType;
	String modeofcollection;
	private PageElement clickOnviewthePolicyDetailsLink;
	private PageElement pancardDetails;
	private PageElement updateBtn;
	private PageElement chequePOno;
	private PageElement drafttype;
	private PageElement draftNumber;
	private PageElement draweeDraftbankName;
	private PageElement draftBankBranch;
	private PageElement chequeOrDraftOrPODate;
	private PageElement potype;
	private PageElement poNumber;
	private PageElement pobankName;
	private PageElement poBankBranch;
	private PageElement PODate;
	private PageElement paymentdiscliamer;
	private PageElement payNowButton;
	private PageElement BrowseButton;
	

	public Collection_IntermediaryPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		getCollectionpageName = new PageElement(By.xpath("//h2[contains(text(),'Collection')]"),
				"GetCollection PageName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNo = new PageElement(By.xpath("//strong[@class='text-primary bold']"), "Quote No", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteAmount = new PageElement(By.xpath("//strong[@class='text-primary bold copperPlate RuppeSymbol']"),
				"Quote Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balance = new PageElement(By.xpath("//label[contains(text(),'Balance:')]/following::label[1]"), "Balance",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAmount = new PageElement(By.xpath("//label[contains(text(),'Balance:')]//following::label[2]"),
				"TotalAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumAmount = new PageElement(By.xpath("//label[contains(text(),'Premium Amount ')]/following::label[1]"),
				"PremiumAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cashTab = new PageElement(By.xpath("//a[contains(text(),'Cash')]"), "Cash Tab", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeTab = new PageElement(By.xpath("//a[contains(text(),'Cheque')]"), "Cheque Tab", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		demandDraftTab = new PageElement(By.xpath("//a[contains(text(),'Demand Draft')]"), "Demand DraftTab", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		postalOrderTab = new PageElement(By.xpath("//a[contains(text(),'Postal Order')]"), "Postal OrderTab", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netBankingTab = new PageElement(By.xpath("//a[contains(text(),'Net Banking')]"), "Net BankingTab", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionMode = new PageElement(
				By.xpath("//data-ng-form[contains(@name,''" + modeofcollection
						+ "'+CollectionForm')]//label[contains(text(),'Quote no.')]/following::strong[1]"),
				"Collection Mode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteModeAmount = new PageElement(
				By.xpath("//data-ng-form[contains(@name,''" + modeofcollection
						+ "'+CollectionForm')]//label[contains(text(),'Quote Amount')]/following::strong[1]"),
				"quoteMode Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionModeAmount = new PageElement(By.xpath("//input[contains(@name,'collectnAmtCash')]"),
				"Collection Mode Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectiontotalAmount = new PageElement(By.xpath("//input[contains(@name,'collectnAmtCash')]"),
				"Collection Total Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		instrumentAmount = new PageElement(By.xpath("//input[contains(@name,'instAmtCheque')]"), "Instrument Amount",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeDraftPOTypedropdown = new PageElement(By.xpath("//select[contains(@name,'chequeType')]"),
				"Collection Total Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeDraftPONodropdown = new PageElement(By.xpath("//input[contains(@name,'chequeOrDraftOrPONumber')]"),
				"ChequeDraftPO No Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeDraftPODatedropdown = new PageElement(By.xpath("//input[contains(@name,'chequeOrDraftOrPONumber')]"),
				"ChequeDraftPO No Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dreweenBankName = new PageElement(By.xpath("//input[(@name='draweeCheque')]"), "Dreween Bank Name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dreweenBankBranch = new PageElement(By.xpath("//input[contains(@name,'bankBranch')]"), "Dreween Bank Branch",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionModeTotalAmount = new PageElement(By.xpath("//input[@name='totalAmtCheque']"),
				"Collection Mode Total Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionModeAddBtn = new PageElement(By.xpath("//button[contains(text(),'Add')]"),
				"Collection Mode Total Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionModeCollectPremiumBtn = new PageElement(By.xpath("//button[contains(text(),'Collect Premium')]"),
				"Collection Add Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		progressBar = new PageElement(By.xpath("//div[@class='relative progresswpr']//div[1]//div[1]"), "Progress Bar",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		payMentverify = new PageElement(By.xpath("//div[contains(text(),'Transaction Status')]//following::div[1]"),
				"Payment Verify", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		payMentverifyLink = new PageElement(By.xpath("//a[contains(text(),'here to view the Policy Details')]"),
				"here to view the Policy Details ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fetchPolicyNo = new PageElement(By.xpath("//label[contains(text(),'Policy No.')]//following::label[1]"),
				"Fetch PolicyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fetchQuoteNo = new PageElement(By.xpath("//label[contains(text(),'Quote No.')]//following::label[1]"),
				"Fetch PolicyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fetchProductName = new PageElement(By.xpath("//label[contains(text(),'Product Name')]//following::label[1]"),
				"Fetch Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clickOnviewthePolicyDetailsLink = new PageElement(
				By.xpath("//a[contains(text(),'here to view the Policy Details')]"),
				"Click On viewthe Policy DetailsLink", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fetchPolicyHolderName = new PageElement(
				By.xpath("//label[contains(text(),'Policy Holder Name')]//following::label[1]"),
				"Fetch Policy HolderName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Harsha
		pancardDetails = new PageElement(By.name("panCard"), "Enter pan card details", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		updateBtn = new PageElement(By.xpath("//button[contains(text(),'Update')]"), "click on update button", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequePOno = new PageElement(By.name("chequeOrDraftOrPONumber"), "cheque Or Draft Or PO Number", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		drafttype = new PageElement(By.name("draftType"), "Draft type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		draftNumber = new PageElement(By.name("draftNumb"), "Draft Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		draweeDraftbankName = new PageElement(By.xpath("//input[@name='draweeDraft']"), "Draft bank Name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeOrDraftOrPODate = new PageElement(
				By.xpath("//ng-form[@name='ddCollectionForm']//input[@name='chequeOrDraftOrPODate']"), "Draft date ",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draftBankBranch = new PageElement(By.xpath("//ng-form[@name='ddCollectionForm']//input[@name='bankBranch']"),
				"Draft Bank Branch", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		potype = new PageElement(By.name("pOType"), "Postal order type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		poNumber = new PageElement(By.name("PONumb"), "Postal order Number", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pobankName = new PageElement(By.name("draweePO"), "Postal order bank Name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PODate = new PageElement(By.xpath("//ng-form[@name='poCollectionForm']//input[@name='chequeOrDraftOrPODate']"),
				"Postal order date ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		poBankBranch = new PageElement(By.name("draweeBranchPO"), "Postal order Bank Branch", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentdiscliamer = new PageElement(By.name("acceptdeclaration"), "Payment Discliamer", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		payNowButton = new PageElement(By.xpath("//button[@class='btn btn-width btn-blue pull-right']"), "Pay Now",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BrowseButton=new PageElement(By.xpath("//div[@class='col-md-2 padding-none']//span[1]"), "browsebutton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillAndCollectPrmium(CollectionIntermediaryEntity collectionIntermediaryData, CustomAssert customAssert)
			throws InterruptedException {
		// String Text=getText(getCollectionpageName);
		
	String BrowseBtn =	collectionIntermediaryData.getStringValueForField("BrowseButton");
	if(BrowseBtn=="yes")
	{
		click(BrowseButton);
	}
		CollectionModeType = collectionIntermediaryData.getStringValueForField("collectionModeType");
		switch (CollectionModeType) {
		case "cash":
			click(cashTab);

			break;
		case "cheque":
			click(chequeTab);

			String chqueNoPO;
			chqueNoPO = collectionIntermediaryData.getStringValueForField("ChquePONo");
			if ((chqueNoPO != null) && (!chqueNoPO.isEmpty())) {
				clearAndSendKeys(chequePOno, collectionIntermediaryData.getStringValueForField("ChquePONo"));
			}

			String strDreweeBankname = collectionIntermediaryData.getStringValueForField("DreweeBankName");
			if ((strDreweeBankname != null) && (!strDreweeBankname.isEmpty())) {
				clearAndSendKeys(dreweenBankName, strDreweeBankname);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[(@name='draweeCheque')]")).sendKeys(Keys.TAB);
				Thread.sleep(4000);

			}
			break;

		case "demanddraft":
			click(demandDraftTab);
			String draftType;
			draftType = collectionIntermediaryData.getStringValueForField("DraftType");
			if ((draftType != null) && (!draftType.isEmpty())) {
				selectValueFromList(drafttype, draftType);
			}
			String strdraftNumb;
			strdraftNumb = collectionIntermediaryData.getStringValueForField("DraftNumber");
			if ((strdraftNumb != null) && (!strdraftNumb.isEmpty())) {
				clearAndSendKeys(draftNumber, strdraftNumb);
			}
			String strchequeOrDraftOrPODate;
			strchequeOrDraftOrPODate = collectionIntermediaryData.getStringValueForField("chequeOrDraftOrPODate");
			if ((strchequeOrDraftOrPODate != null) && (!strchequeOrDraftOrPODate.isEmpty())) {
				// clearAndSendKeys(chequeOrDraftOrPODate,strchequeOrDraftOrPODate);
				clearAndEnterDate(chequeOrDraftOrPODate, RandomCodeGenerator.dateGenerator(strchequeOrDraftOrPODate));
			}
			String strDraftBankname1 = collectionIntermediaryData.getStringValueForField("DreweeBankName");
			if ((strDraftBankname1 != null) && (!strDraftBankname1.isEmpty())) {
				clearAndSendKeys(draweeDraftbankName, strDraftBankname1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='draweeDraft']")).sendKeys(Keys.TAB);
				Thread.sleep(4000);
			}
			String strdraftBankBranch;
			strdraftBankBranch = collectionIntermediaryData.getStringValueForField("DreweenBankBranch");
			if ((strdraftBankBranch != null) && (!strdraftBankBranch.isEmpty())) {
				clearAndSendKeys(draftBankBranch, strdraftBankBranch);
			}

			break;

		case "postalorder":
			click(postalOrderTab);

			String strpoType;
			strpoType = collectionIntermediaryData.getStringValueForField("DraftType");
			if ((strpoType != null) && (!strpoType.isEmpty())) {
				selectValueFromList(potype, strpoType);
			}
			String strpoNumb;
			strpoNumb = collectionIntermediaryData.getStringValueForField("DraftNumber");
			if ((strpoNumb != null) && (!strpoNumb.isEmpty())) {
				clearAndSendKeys(poNumber, strpoNumb);
			}
			String strPODate;
			strPODate = collectionIntermediaryData.getStringValueForField("chequeOrDraftOrPODate");
			if ((strPODate != null) && (!strPODate.isEmpty())) {
				clearAndEnterDate(PODate, RandomCodeGenerator.dateGenerator(strPODate));
			}
			String strpoBankname = collectionIntermediaryData.getStringValueForField("DreweeBankName");
			if ((strpoBankname != null) && (!strpoBankname.isEmpty())) {
				clearAndSendKeys(pobankName, strpoBankname);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='draweePO']")).sendKeys(Keys.TAB);
				Thread.sleep(4000);
			}
			String strpoBankBranch;
			strpoBankBranch = collectionIntermediaryData.getStringValueForField("DreweenBankBranch");
			if ((strpoBankBranch != null) && (!strpoBankBranch.isEmpty())) {
				clearAndSendKeys(poBankBranch, strpoBankBranch);
			}
			break;
		case "netbanking":
			click(netBankingTab);
			break;
		}

		collectionIntermediaryData.setStringValueForField("Collection Mode : ", "<B>" + (CollectionModeType) + "</B>");
		click(collectionModeAddBtn);
		if (isElementEnabled(progressBar)) {
			click(collectionModeCollectPremiumBtn);

			String strPancard;
			strPancard = collectionIntermediaryData.getStringValueForField("PancardDetails");
			if ((strPancard != null) && (!strPancard.isEmpty())) {
				clearAndSendKeys(pancardDetails, strPancard);
				click(updateBtn);
				click(collectionModeCollectPremiumBtn);
			}
		}
		String paymentdisc;
		paymentdisc = collectionIntermediaryData.getStringValueForField("PaymentDisclaimer");
		if ((paymentdisc != null) && (!paymentdisc.isEmpty())) {
			click(paymentdiscliamer);
		}
		String paynow;
		paynow = collectionIntermediaryData.getStringValueForField("PayNow");
		if ((paynow != null) && (!paynow.isEmpty())) {
			click(payNowButton);
		}

		verifyFetchDetails(collectionIntermediaryData, customAssert);

		if (collectionIntermediaryData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")) {
			// click(payMentverifyLink);
		}
		String holderName;
		holderName = collectionIntermediaryData.getStringValueForField("HolderName");
		if ((holderName != null) && (!holderName.isEmpty())) {
			customAssert.assertEquals(collectionIntermediaryData.getStringValueForField("HolderName"),
					fetchValueFromFields(fetchPolicyHolderName), AssertionType.WARNING);
		}
		String quoteNo;
		quoteNo = collectionIntermediaryData.getStringValueForField("QuoteNo");
		if ((quoteNo != null) && (!quoteNo.isEmpty())) {
			customAssert.assertEquals(collectionIntermediaryData.getStringValueForField("QuoteNo"),
					fetchValueFromFields(fetchQuoteNo), AssertionType.WARNING);
		}
		String productName;
		productName = collectionIntermediaryData.getStringValueForField("ProductName");
		if ((productName != null) && (!productName.isEmpty())) {
			customAssert.assertEquals(collectionIntermediaryData.getStringValueForField("ProductName"),
					fetchValueFromFields(fetchProductName), AssertionType.WARNING);
		}
	}

	public void verifyFetchDetails(CollectionIntermediaryEntity collectionIntermediaryData, CustomAssert customAssert) throws InterruptedException {
		customAssert.assertEquals("Success", fetchValueFromFields(payMentverify), AssertionType.WARNING);
		click(clickOnviewthePolicyDetailsLink);
		Thread.sleep(5000);
		// System.out.println(getText(balance));
		// System.out.println(getText(quoteModeAmount));
		collectionIntermediaryData.setStringValueForField("FetchPolicyNo", fetchValueFromFields(fetchPolicyNo));
		collectionIntermediaryData.setStringValueForField("FetchQuoteNo", fetchValueFromFields(fetchQuoteNo));
		collectionIntermediaryData.setStringValueForField("FetchProductName", fetchValueFromFields(fetchProductName));
		collectionIntermediaryData.setStringValueForField("FetchPolicyHolderName",
				fetchValueFromFields(fetchPolicyHolderName));
	}
}
