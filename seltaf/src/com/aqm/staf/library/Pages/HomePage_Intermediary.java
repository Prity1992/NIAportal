package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.HomeEntity_Intermediary;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.QuickHelpEntity;


public class HomePage_Intermediary extends BasePage {

	private PageElement myDashBoard;
	private PageElement products;
	private PageElement quickServices;
	private PageElement aboutUs;
	private PageElement help;
	private PageElement buyOnline;
	private PageElement quickrenewalORPayment;
	private PageElement callMe;
	private PageElement searchByDropDown;
	private PageElement policyQuoteNoField;
	private PageElement lOBRural;
	private PageElement lOBHealth;
	private PageElement lOBMiscellaneous;
	private PageElement lOBMarine;
	private PageElement lOBTravel;
	private PageElement renewalsTab;
	private PageElement manageQuotesTab;
	private PageElement managePolicyTab;
	private PageElement makePaymentTab;
	private PageElement viewReportsTab;
	private PageElement QutORPolcyNornwlTab;
	private PageElement productrnwlTab;
	private PageElement expiryDateFromrnwlTab;
	private PageElement expiryDateTornwlTab;
	private PageElement resetButton;
	private PageElement QuoteNoMngQuotTab;
	private PageElement productMngQuotTab;
	private PageElement fromDateMngQuotTab;
	private PageElement toDateMngQuotTab;
	private PageElement statusMngQuotTab;
	private PageElement plcyNoQuotNoMngPlcyTab;
	private PageElement productMngPlcyTab;
	private PageElement fromDateMngPlcyTab;
	private PageElement toDateMngPlcyTab;
	private PageElement statusmngPlcyTab;
	private PageElement QutnoMakPaymnt;
	private PageElement ProductMakPaymnt;
	private PageElement fromDateMakPaymnt;
	private PageElement toDateMakPaymnt;
	private PageElement statusMakPaymnt;
	private PageElement slcttyprportViewRprt;
	private PageElement fromdateViewRprt;
	private PageElement toDateViewRprt;
	private PageElement prdctViewRprt;
	private PageElement statusViewRprt;
	private PageElement itemsPerPage;
	private PageElement srchNo;
	private PageElement srchQuoteNo;
	private PageElement srchPolicyHolder;
	private PageElement srchStartDate;
	private PageElement srchStatus;
	private PageElement srchActions;
	private PageElement srchClone;
	private PageElement alertPopupWindow;
	private PageElement lntermediaryHomepage;
	private PageElement continueButton;
	private PageElement lOBMotor;
	private PageElement searchButton;
	private PageElement okButton;
	private PageElement productLinkName;
	String getProducts;
	private PageElement buyOnlineButton;
	private PageElement productcategoryDropdown;
	private PageElement productDropdown;
	private PageElement myDashboard;
	private PageElement productList;
	private PageElement privateCarLabel;
	private PageElement renewalSearchButton;
	private PageElement actionButton;
	private PageElement saveAndCalculatePremiumButton;
	private PageElement approveAndPayButton;
	private PageElement confirmButton;
	private PageElement addButton;
	private PageElement collectPremiumButton;
	private PageElement policyNoLabel;
	private PageElement quouteNoLabel;
	private PageElement transactionIDNoLabel;
	private PageElement transactionAmountLabel;
	private PageElement transactionStatusLabel;
	private PageElement panCardTextField;
	private PageElement updateButton;
	public HomePage_Intermediary(WebDriver driver,String pageName){
		super(driver,pageName);
		alertPopupWindow	= new PageElement(By.xpath("//*[contains(text(),'OK')]"), "alert Popup Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lntermediaryHomepage = new PageElement(By.xpath("//a[contains(text(),'My Dashboard')]"), "lntermediaryHomepage", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myDashBoard			= new PageElement(By.xpath("//a[contains(text(),'My Dashboard')]"), "myDashBoard", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		products			= new PageElement(By.xpath("//a[contains(text(),'Products')]"), "products", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quickServices		= new PageElement(By.xpath("//a[contains(text(),'Quick Services')]"), "quick Services", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		aboutUs				= new PageElement(By.xpath("//a[contains(text(),'About Us')]"), "aboutUs", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		help				= new PageElement(By.xpath("//a[contains(text(),'Help')]"), "help", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buyOnline			= new PageElement(By.xpath("//button[@type='submit']"), "buyOnline", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quickrenewalORPayment= new PageElement(By.xpath("//button[contains(text(),'Quick Renewal / Payment')]"), "quick renewal OR Payment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		callMe				= new PageElement(By.xpath("//button[@data-ng-click='openCustTypeModal()']"), "callMe", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBHealth			= new PageElement(By.xpath("//option[contains(text(),'MISCELLANEOUS')]/preceding::select[1]"), "lOB Health", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBMiscellaneous	= new PageElement(By.xpath("//option[contains(text(),'MARINE')]/preceding::select[1]"), "lOBMiscellaneous", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBRural			= new PageElement(By.xpath("//option[contains(text(),'MISCELLANEOUS')]/preceding::select[2]"), "lOB Rural", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);									 						
		lOBMarine			= new PageElement(By.xpath("//option[contains(text(),'MISCELLANEOUS')]/following::select[1]"), "lOB Marine", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBMotor			= new PageElement(By.xpath("//select[@class='form-control text-blue lead-sm ng-pristine ng-untouched ng-valid MOTOR']"), "lOB Motor", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		lOBTravel			= new PageElement(By.xpath("//option[contains(text(),'MISCELLANEOUS')]/following::select[2]"), "lOB Travel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchByDropDown	= new PageElement(By.xpath("//option[contains(text(),'RURAL')]/preceding::select[1]"), "search By DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyQuoteNoField	= new PageElement(By.xpath("//*[@placeholder='Policy No. / Quote No.']"), "policyQuoteNoField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton		= new PageElement(By.xpath("//*[@class='input-group-addon magnifier']"), "search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		continueButton      =new PageElement(By.xpath("//button[contains(text(),'Continue')]"),"Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		okButton            = new PageElement(By.xpath("//button[contains(text(),'OK')]"),"Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buyOnlineButton     =new PageElement(By.xpath("//button[@type='submit']"),"Buy Online Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		productcategoryDropdown    =new PageElement(By.xpath("//select[@name='productCategory']"),"Product Category", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		productDropdown            =new PageElement(By.xpath("//select[@name='product']"),"Product", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		myDashboard         =new PageElement(By.xpath("//a[@data-ng-click='goToDash()']"),"My Dashboard", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		renewalsTab =new PageElement(By.xpath("//a[contains(text(),'Renewals')]"),"Renewals", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		productList=new PageElement(By.name("product"),"Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		privateCarLabel=new PageElement(By.xpath("//a[@bind-html-unsafe='match.label | typeaheadHighlight:query']"),"Two Wheeler", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		renewalSearchButton=new PageElement(By.xpath("//button[contains(text(),'Search')]"),"Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		actionButton=new PageElement(By.xpath("//th[contains(text(),'Renewed Quote Status')]//following::td[26]"),"Action", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveAndCalculatePremiumButton=new PageElement(By.xpath("//button[contains(text(),'Save & Calculate Premium')]"),"Save & Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		approveAndPayButton=new PageElement(By.xpath("//button[@class='btn btn-blue']"),"Approve And Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		confirmButton=new PageElement(By.xpath("//button[contains(text(),'Confirm')]"),"Confirm", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButton=new PageElement(By.xpath("//button[contains(text(),'Add')]"),"Add", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectPremiumButton=new PageElement(By.xpath("//button[contains(text(),'Collect Premium')]"),"Add", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
		policyNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Policy No.')]//following::div[1]"), "Policy No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quouteNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Quote No.')]//following::div[1]"), "Upload;", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionIDNoLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction ID No.')]//following::div[1]"), "Customer ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionAmountLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction Amount')]//following::div[1]"), "Transaction Amount;", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transactionStatusLabel  = new PageElement(By.xpath("//div[contains(text(),'Transaction Status')]//following::div[1]"), "Transaction Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		panCardTextField=new PageElement(By.name("panCard"),"Pan Card", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		updateButton=new PageElement(By.xpath("//button[contains(text(),'Update')]"),"Pan Card", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}

	//click On Popup window
	public void clickAlertCloseImgWindow(HomeEntity_Intermediary homeEntity_Intermediary) throws InterruptedException{
		try {
			click(alertPopupWindow);
			Thread.sleep(1000);
		}
		catch (Exception e) {		
		}
		isElementDisplayed(lntermediaryHomepage);
	}

	//Fill Home page 
	public void fillHomeEntityIntermediaryPage(HomeEntity_Intermediary homeEntity_Intermediary,CustomAssert customAssert) throws InterruptedException {
		if(homeEntity_Intermediary.getAction().equalsIgnoreCase("add")) {
			String product;
			product=homeEntity_Intermediary.getStringValueForField("Product");
			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))){
				selectValueFromList(lOBHealth, product);
				String continuebutton = homeEntity_Intermediary.getStringValueForField("ContinueButton");
				if ((continuebutton!=null) && (!continuebutton.isEmpty())){
					waitForPageElement(continueButton);
					click(continueButton);
					try {
						wait(1000);
						click(continueButton);

						switchToFrame("chrome");
					} catch (Exception e) {
					}
				}
			}

			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("RURAL"))){
				selectValueFromList(lOBRural, product);
			}
			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))){
				selectValueFromList(lOBMiscellaneous, product);

			}
			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))){
				selectValueFromList(lOBMarine, product);

			}
			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))){
				selectValueFromList(lOBMotor, product);
				Thread.sleep(1000);
			/*if((!homeEntity_Intermediary.getStringValueForField("ProductName").equalsIgnoreCase("Standalone OD for Motor PC"))) {
				okButton = new PageElement(By.xpath("//button[@class='btn btn-blue btn-width']"),"Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(okButton);
			}*/
			}
			if ((product!=null)&&(!product.isEmpty())&&(homeEntity_Intermediary.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))){
				selectValueFromList(lOBTravel, product);
				Thread.sleep(1000);
				click(continueButton);
			}
		}
	}

	public void buyOnlineHomeEntityIntermediaryPage(HomeEntity_Intermediary homeEntity_Intermediary,CustomAssert customAssert) throws InterruptedException {
		if(homeEntity_Intermediary.getAction().equalsIgnoreCase("add")) {

			String button;
			button = homeEntity_Intermediary.getStringValueForField("BuyOnlineButton");
			if ((button!=null) && (!button.isEmpty())){
				click(buyOnlineButton);
				Thread.sleep(2000);
			}
			String val;
			val = homeEntity_Intermediary.getStringValueForField("ProductCategoryName");
			if ((val!=null) && (!val.isEmpty())){
				waitForPageElement(productcategoryDropdown);
				selectValueFromList(productcategoryDropdown, homeEntity_Intermediary.getStringValueForField("ProductCategoryName"));
				selectValueFromList(productDropdown, homeEntity_Intermediary.getStringValueForField("Product"));
				click(continueButton);
				try {
					click(continueButton);

				} catch (Exception e) {
				}

			}
		}
		if(homeEntity_Intermediary.getAction().equalsIgnoreCase("Verify")) {
			String dashboard;
			dashboard=homeEntity_Intermediary.getStringValueForField("Dashboard");
			if ((dashboard!=null)&&(!dashboard.isEmpty())){
				customAssert.assertEquals(homeEntity_Intermediary.getStringValueForField("Dashboard"), fetchValueFromFields(myDashboard), AssertionType.WARNING);
			}
		}
	}
	public void fillRenewalDetails(HomeEntity_Intermediary homeEntityIntermediary,CustomAssert customassert) throws InterruptedException {
		if(homeEntityIntermediary.getAction().equalsIgnoreCase("add")) {
			String Renewal;
			Renewal = homeEntityIntermediary.getStringValueForField("Renewal");
			if ((Renewal!=null)&&(!Renewal.isEmpty())){
				click(renewalsTab);
			}
			String productlist;
			productlist = homeEntityIntermediary.getStringValueForField("ProductList");
			if ((productlist!=null)&&(!productlist.isEmpty())){
				switchToDefaultFrame();
				waitForPageElement(productList);
				clearAndSendKeys(productList,homeEntityIntermediary.getStringValueForField("ProductList"));
				click(privateCarLabel);
			}
			String search;
			search = homeEntityIntermediary.getStringValueForField("RenewalSearch");
			if ((search!=null)&&(!search.isEmpty())){
				click(renewalSearchButton);
			}
			String action;
			action = homeEntityIntermediary.getStringValueForField("RenewalAction");
			if ((action!=null)&&(!action.isEmpty())){
				doubleClick(actionButton);
			}
			String saveAndCalculate;
			saveAndCalculate = homeEntityIntermediary.getStringValueForField("SaveAndCalculatePremium");
			if ((saveAndCalculate!=null)&&(!saveAndCalculate.isEmpty())){
				click(saveAndCalculatePremiumButton);
			}
			String approveAndPay;
			approveAndPay = homeEntityIntermediary.getStringValueForField("ApproveAndPay");
			if ((approveAndPay!=null)&&(!approveAndPay.isEmpty())){
				click(approveAndPayButton);
				click(confirmButton);
				
			}
			String pancard;
			pancard = homeEntityIntermediary.getStringValueForField("Pancard");
			if ((pancard!=null)&&(!pancard.isEmpty())){
				clearAndSendKeys(panCardTextField,homeEntityIntermediary.getStringValueForField("Pancard"));
				click(updateButton);
				
			}
			
			String add;
			add = homeEntityIntermediary.getStringValueForField("RenewAdd");
			if ((add!=null)&&(!add.isEmpty())){
				click(addButton);	
			}
			String collectPremium;
			collectPremium = homeEntityIntermediary.getStringValueForField("CollectPremium");
			if ((collectPremium!=null)&&(!collectPremium.isEmpty())){
				click(collectPremiumButton);	
			}
			if(homeEntityIntermediary.getBooleanValueForField("ConfigPolicyNo")){
				homeEntityIntermediary.setStringValueForField("PolicyNo", fetchValueFromFields(policyNoLabel));
			}


			if(homeEntityIntermediary.getBooleanValueForField("ConfigRenewalQuoteNo")){
				homeEntityIntermediary.setStringValueForField("RenewalQuoteNo", fetchValueFromFields(quouteNoLabel));
			}



			if(homeEntityIntermediary.getBooleanValueForField("ConfigTransactionIDNo")){
				homeEntityIntermediary.setStringValueForField("TransactionIDNo", fetchValueFromFields(transactionIDNoLabel));
			}


			if(homeEntityIntermediary.getBooleanValueForField("ConfigTransactionAmount")){
				homeEntityIntermediary.setStringValueForField("TransactionAmount", fetchValueFromFields(transactionAmountLabel));
			}



			if(homeEntityIntermediary.getBooleanValueForField("ConfigTransactionStatus")){
				homeEntityIntermediary.setStringValueForField("TransactionStatus", fetchValueFromFields(transactionStatusLabel));
			}
		}
	}


	public void fillAndVerifyHomeEntityIntermediaryPage(HomeEntity_Intermediary homeEntityIntermediary,CustomAssert customassert) throws InterruptedException {
		String BuyOnline=homeEntityIntermediary.getStringValueForField("byuOnline");
		if ((BuyOnline==null)||(BuyOnline.isEmpty())) {
			fillHomeEntityIntermediaryPage(homeEntityIntermediary, customassert);	
			fillRenewalDetails(homeEntityIntermediary, customassert);
			
		}
		buyOnlineHomeEntityIntermediaryPage(homeEntityIntermediary, customassert);
	}

	public void verifyPolicystatusIntermediary(HomeEntity_Intermediary homeEntity_Intermediary,CustomAssert customAssert) {
		if(homeEntity_Intermediary.getAction().equalsIgnoreCase("Verify")) {
			String health;
			health=homeEntity_Intermediary.getStringValueForField("LOBHealth");
			if ((health!=null)&&(!health.isEmpty())){
				selectValueFromList(lOBHealth, health);
				try {
					click(continueButton);
					switchToFrame("chrome");
				} catch (Exception e) {
				}
			}
		}

	}

	public void verifypolicyStatusIntermediary(HomeEntity_Intermediary homeEntityIntermediary,CustomAssert customassert) {
		verifyPolicystatusIntermediary(homeEntityIntermediary, customassert);
	}

	//Verify Product link displayed on portal
	//START
	public void VerifyProductLinkNameHomeEntity(HomeEntity_Intermediary homeEntityIntermediary,CustomAssert customassert) {
		verifyPolicyIntermediary(homeEntityIntermediary, customassert);
	}

	public void verifyPolicyIntermediary(HomeEntity_Intermediary homeEntity_Intermediary,CustomAssert customAssert) {
		if(homeEntity_Intermediary.getAction().equalsIgnoreCase("Verify")) {
			//isElementDisplayed(productLinkName);	
			getProducts = homeEntity_Intermediary.getStringValueForField("Products");
			if ((getProducts!=null)&&(!getProducts.isEmpty())){
				mouseOver(products);
				productLinkName	= new PageElement(By.partialLinkText(getProducts), " My Product "  +  getProducts, false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(productLinkName);
			}
		}
	}
}

