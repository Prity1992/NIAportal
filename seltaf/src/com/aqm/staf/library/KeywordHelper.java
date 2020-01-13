package com.aqm.staf.library;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePageOrangeHRM;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.Pages.AdditionalDetailPage;
import com.aqm.staf.library.Pages.ClaimIntimateDetailpage;
import com.aqm.staf.library.Pages.Collection_IntermediaryPage;
import com.aqm.staf.library.Pages.DetailedQuotePage;
import com.aqm.staf.library.Pages.HomePage;
import com.aqm.staf.library.Pages.HomePage_Intermediary;
import com.aqm.staf.library.Pages.Inter_PremiumCalculatorPage;
//import com.aqm.staf.library.Pages.Intermediary_PremiumCalculator;
import com.aqm.staf.library.Pages.LoginPage;
import com.aqm.staf.library.Pages.PaymentPage;
import com.aqm.staf.library.Pages.ProposalForm_IntermediaryPage;
import com.aqm.staf.library.Pages.QuickHelpPage;
import com.aqm.staf.library.Pages.ProductInsurancePage;
import com.aqm.staf.library.Pages.SummaryPage;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.ClaimIntimateEntity;
import com.aqm.staf.library.databin.CollectionIntermediaryEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PaymentEntity;
import com.aqm.staf.library.databin.PrpslFrm_IntrmdryEntity;
import com.aqm.staf.library.databin.QuickHelpEntity;
import com.aqm.staf.library.databin.PremiumCalculatorEntity;
import com.aqm.staf.library.databin.ProductInsuranceEntity;
import com.aqm.staf.library.databin.SummaryEntity;
import com.aqm.staf.library.databin.UserEntity;
import com.aqm.staf.library.databin.HomeEntity_Intermediary;

public class KeywordHelper extends BasePageOrangeHRM{
	
	public void CretaeQuickHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<QuickHelpEntity> QuickHelpEntityList=testData.getQuickHelpRecords();
		for(QuickHelpEntity QuickHelpEntityListData:QuickHelpEntityList){
			if(QuickHelpEntityListData.getAction().equalsIgnoreCase("add")){
				QuickHelpPage quickHelpPage=new QuickHelpPage(driver, "QuickHelpPage");
				quickHelpPage.fillAndSubmitQuickHelpPage(QuickHelpEntityListData, assertReference);
		}
		}
	}
	
	public void EditQuickHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<QuickHelpEntity> QuickHelpEntityList=testData.getQuickHelpRecords();
		for(QuickHelpEntity QuickHelpEntityListData:QuickHelpEntityList){
			if(QuickHelpEntityListData.getAction().equalsIgnoreCase("edit")){
				QuickHelpPage quickHelpPage=new QuickHelpPage(driver, "QuickHelpPage");
				quickHelpPage.fillAndSubmitQuickHelpPage(QuickHelpEntityListData, assertReference);
		}
		}
	}
	
	public void VerifyQuickHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<QuickHelpEntity> QuickHelpEntityList=testData.getQuickHelpRecords();
		for(QuickHelpEntity QuickHelpEntityListData:QuickHelpEntityList){
			if(QuickHelpEntityListData.getAction().equalsIgnoreCase("verify")){
				QuickHelpPage quickHelpPage=new QuickHelpPage(driver, "QuickHelpPage");
				quickHelpPage.fillAndSubmitQuickHelpPage(QuickHelpEntityListData, assertReference);
		}
		}
	}
	
	
	
	
	
	
	
	public void loginHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<LoginEntity> loginEntityList=testData.getLoginEntityRecords();
		for(LoginEntity loginData:loginEntityList){
			LoginPage loginPage=new LoginPage(driver, "LoginPage");
			loginPage.fillAndSubmitLoginPage(loginData, assertReference);
		}
	}

	public void CreateHomeHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<HomeEntity>homeEntitylist=testData.getHomeRecords();
		for(HomeEntity homeEntityData:homeEntitylist)
		{
			if(homeEntityData.getAction().equalsIgnoreCase("add")){
				HomePage homePage=new HomePage(driver, "Home Page");
				homePage.fillAndVerifyHomePage(homeEntityData, assertReference);
				setEditPaymentDependencyForProductName(homeEntityData, testData);
				setEditProductInsuranceDependency(homeEntityData, testData);
			}	

		}
	}
	
	public void verifyHomeHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<HomeEntity>homeEntitylist=testData.getHomeRecords();
		for(HomeEntity homeEntityData:homeEntitylist)
		{
			if(homeEntityData.getAction().equalsIgnoreCase("verify")){
				HomePage homePage=new HomePage(driver, "Home Page");
				homePage.fillAndVerifyHomePage(homeEntityData, assertReference);
			}	

		}
	}
	public void verifyPolicyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<HomeEntity>homeEntitylist=testData.getHomeRecords();
		for(HomeEntity homeEntityData:homeEntitylist){
			if(homeEntityData.getAction().equalsIgnoreCase("verify")){
				HomePage homePage=new HomePage(driver, "Home Page");
				/*homePage.fillAndSubmitHomePage(homeEntityData, assertReference);*/
				homePage.verifypolicyStatus(homeEntityData, assertReference);

			}
		}
	}

	//pravina
	    public void CreateAdditionalDetailHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, IOException, AWTException{
		List<AdditionalDetailEntity>additionalDetailEntitylist=testData.getAdditionalDetailRecords();
		for(AdditionalDetailEntity additionalDetailEntityData:additionalDetailEntitylist)
		{
			if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")){
				AdditionalDetailPage additionalDetailpage=new AdditionalDetailPage(driver, "Additional Detail Page");
				additionalDetailpage.fillAdditionalDetailPage(additionalDetailEntityData, assertReference);
				setEditPaymentDependencyForPolicyHolderName(additionalDetailEntityData, testData);	
			}	

		}
	}
	//uday
	public void CreateDetailedQuoteHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<DetailedQuoteEntity>detailedQuoteEntitylist=testData.getdetailedQuoteRecords();
		for(DetailedQuoteEntity detailedQuoteEntityData:detailedQuoteEntitylist)
		{
			if(detailedQuoteEntityData.getAction().equalsIgnoreCase("add")){
				DetailedQuotePage detailedQuote=new DetailedQuotePage(driver, "Detail Qutoe Page");
				detailedQuote.fillDetailQuoteInformationPage(detailedQuoteEntityData, assertReference);
				setEditPaymentDependency(detailedQuoteEntityData, testData);
			}	

		}	
	}
	public void CreateSummaryHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<SummaryEntity>summaryEntitylist=testData.getSummaryPageDetailRecords();
		for(SummaryEntity summaryEntitData:summaryEntitylist){
			SummaryPage summaryPage=new SummaryPage(driver, "Summary Page");
			summaryPage.fillSummaryPagePage(summaryEntitData, assertReference);

		}
	}
	public void VerifySummaryHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<SummaryEntity>summaryEntitylist=testData.getSummaryPageDetailRecords();
		for(SummaryEntity summaryEntitData:summaryEntitylist){
			SummaryPage summaryPage=new SummaryPage(driver, "Summary Page");
			summaryPage.fillSummaryPagePage(summaryEntitData, assertReference);

		}
	}
	public void CreatePaymentHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PaymentEntity>paymentPagelist=testData.getPaymentPageDetailRecords();
		for(PaymentEntity paymentPageData:paymentPagelist){
			PaymentPage paymentPage=new PaymentPage(driver, "Payment Page");
			paymentPage.VerifyAndSubmitPaymentPage(paymentPageData, assertReference);

		}
	}
	public void VerifyPaymentHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PaymentEntity>paymentPagelist=testData.getPaymentPageDetailRecords();
		for(PaymentEntity paymentPageData:paymentPagelist){
			PaymentPage paymentPage=new PaymentPage(driver, "Payment Page");
			paymentPage.VerifyAndSubmitPaymentPage(paymentPageData, assertReference);

		}
	}
	public void CreateProductInsuranceHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<ProductInsuranceEntity>productInsurancePagelist=testData.getProductInsuranceDetailRecords();
		for(ProductInsuranceEntity productInsurancePageData:productInsurancePagelist){
			if(productInsurancePageData.getAction().equalsIgnoreCase("add")){
				ProductInsurancePage productInsurancePage=new ProductInsurancePage(driver, "Product Insurance Page");
				productInsurancePage.fillAndVerifyProductInsurancePage(productInsurancePageData, assertReference);
			}

		}
	}
	public void CreatePremiumCalculator(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PremiumCalculatorEntity>PremiumCalculatorPagelist=testData.getPremiumCalculatorRecords();
		for(PremiumCalculatorEntity PremiumCalculatorEntityData:PremiumCalculatorPagelist){
			if(PremiumCalculatorEntityData.getAction().equalsIgnoreCase("add")){
			Inter_PremiumCalculatorPage inter_PremiumCalculatorPage=new Inter_PremiumCalculatorPage(driver, "Payment Page");
			inter_PremiumCalculatorPage.fillInter_PremiumCalculatorPagePage(PremiumCalculatorEntityData, assertReference);
			}
		}
	}


	public void VerifyProductInsuranceHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<ProductInsuranceEntity>productInsurancePagelist=testData.getProductInsuranceDetailRecords();
		for(ProductInsuranceEntity productInsurancePageData:productInsurancePagelist){
			if(productInsurancePageData.getAction().equalsIgnoreCase("verify")){
				ProductInsurancePage productInsurancePage=new ProductInsurancePage(driver, "Product Insurance Page");
				productInsurancePage.fillAndVerifyProductInsurancePage(productInsurancePageData, assertReference);
			}

		}
	}
	private void setEditPaymentDependency(DetailedQuoteEntity detailedQuoteEntity, ScenarioTestData testData) {
		if(detailedQuoteEntity.getStringValueForField("DependencyForPayment")!=null){
			ArrayList<PaymentEntity> paymentEntityListAll = testData.getObjectByReference(testData.getPaymentPageDetailRecords(), detailedQuoteEntity.getStringValueForField("DependencyForPayment"));
			for(PaymentEntity paymentEntityData:paymentEntityListAll) {
				paymentEntityData.setStringValueForField("PolicyStartDate", detailedQuoteEntity.getStringValueForField("PolicyStartDate"));
				paymentEntityData.setStringValueForField("PolicyExpiryDate", detailedQuoteEntity.getStringValueForField("PolicyExpiryDate"));
				paymentEntityData.setStringValueForField("QuoteNo", detailedQuoteEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(paymentEntityData);

			}
		}

		if(detailedQuoteEntity.getStringValueForField("DependencyForHomeEntity")!=null){
			ArrayList<HomeEntity> HomeEntityListAll = testData.getObjectByReference(testData.getHomeRecords(), detailedQuoteEntity.getStringValueForField("DependencyForHomeEntity"));
			for(HomeEntity HomeEntityData:HomeEntityListAll) {
				HomeEntityData.setStringValueForField("QuoteNo", detailedQuoteEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(HomeEntityData);


			}
		}
		if(detailedQuoteEntity.getStringValueForField("DependencyForPolicyNo")!=null){
			ArrayList<HomeEntity> HomeEntityListAll = testData.getObjectByReference(testData.getHomeRecords(), detailedQuoteEntity.getStringValueForField("DependencyForPolicyNo"));
			for(HomeEntity HomeEntityData:HomeEntityListAll) {
				HomeEntityData.setStringValueForField("PolicyNumber", detailedQuoteEntity.getStringValueForField("PolicyNumber"));
				testData.updateRecordsForCriteria(HomeEntityData);


			}
		}


	}
	private void setEditPaymentDependencyForPolicyHolderName(AdditionalDetailEntity additionalDetailEntity, ScenarioTestData testData) {
		if(additionalDetailEntity.getStringValueForField("DependencyForPaymentPolicyHolderName")!=null){
			ArrayList<PaymentEntity> paymentEntityListAll = testData.getObjectByReference(testData.getPaymentPageDetailRecords(), additionalDetailEntity.getStringValueForField("DependencyForPaymentPolicyHolderName"));
			for(PaymentEntity paymentEntityData:paymentEntityListAll) {
				paymentEntityData.setStringValueForField("PolicyHolderName", additionalDetailEntity.getStringValueForField("FirstName")+" "+additionalDetailEntity.getStringValueForField("LastName"));
				testData.updateRecordsForCriteria(paymentEntityData);
			}
		}
	}	
	private void setEditPaymentDependencyForProductName(HomeEntity homeEntity, ScenarioTestData testData) {
		if(homeEntity.getStringValueForField("DependencyForPaymentProductName")!=null){
			ArrayList<PaymentEntity> paymentPagelist = testData.getObjectByReference(testData.getPaymentPageDetailRecords(), homeEntity.getStringValueForField("DependencyForPaymentProductName"));
			for(PaymentEntity paymentPageData:paymentPagelist){
				paymentPageData.setStringValueForField("ProductName", homeEntity.getStringValueForField("ProductName"));
				testData.updateRecordsForCriteria(paymentPageData);
			}
		}
	}
	private void setEditProductInsuranceDependency(HomeEntity homeEntity, ScenarioTestData testData) {
		if(homeEntity.getStringValueForField("DependencyForProductInsurance")!=null){
			ArrayList<ProductInsuranceEntity> ProductInsurancePagelist = testData.getObjectByReference(testData.getProductInsuranceDetailRecords(), homeEntity.getStringValueForField("DependencyForProductInsurance"));
			for(ProductInsuranceEntity ProductInsurancePagelistData:ProductInsurancePagelist){
				ProductInsurancePagelistData.setStringValueForField("ProductName", homeEntity.getStringValueForField("ProductName"));
				ProductInsurancePagelistData.setStringValueForField("ProductInfoName", homeEntity.getStringValueForField("ProductName"));
				testData.updateRecordsForCriteria(ProductInsurancePagelistData);
			}
		}
	}
	private void setEditPaymentDependencyForPolicyNo(PaymentEntity paymentEntity, ScenarioTestData testData) {
		if(paymentEntity.getStringValueForField("DependencyForPolicyNo")!=null){
			ArrayList<HomeEntity> homeEntitylist = testData.getObjectByReference(testData.getHomeRecords(), paymentEntity.getStringValueForField("DependencyForPolicyNo"));
			for(HomeEntity homeEntityData:homeEntitylist){
				homeEntityData.setStringValueForField("PolicyNumber", paymentEntity.getStringValueForField("PolicyNumber"));
				testData.updateRecordsForCriteria(homeEntityData);
			}
		}
	}

	public void CreateHomeEntityHelper_Intermediary(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException  {
		List<HomeEntity_Intermediary>homeEntitylist_Intermediary=testData.getHomeEntityIntermediariesRecords();
		for(HomeEntity_Intermediary homeEntityData_Intermediary:homeEntitylist_Intermediary)
		{
			if(homeEntityData_Intermediary.getAction().equalsIgnoreCase("add")){
				HomePage_Intermediary homePage_Intermediary = new HomePage_Intermediary(driver, "Home Page Intermediary");
				homePage_Intermediary.clickAlertCloseImgWindow(homeEntityData_Intermediary);
				homePage_Intermediary.fillAndVerifyHomeEntityIntermediaryPage(homeEntityData_Intermediary, assertReference);
				setEditCollectionIntermediaryDependencyForProductName(homeEntityData_Intermediary, testData);
			}	
		}
	}
	public void CreateClaimIntimate(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<ClaimIntimateEntity>ClaimIntimateDetailpageList=testData.getClaimIntimateRecords();
		for(ClaimIntimateEntity ClaimIntimateEntityPageData:ClaimIntimateDetailpageList){
			if(ClaimIntimateEntityPageData.getAction().equalsIgnoreCase("add")){
				ClaimIntimateDetailpage ClaimIntimateDetailpage=new ClaimIntimateDetailpage(driver, "ClaimIntimateDetailpage");
				ClaimIntimateDetailpage.fillAndSubmitIntimateClaim(ClaimIntimateEntityPageData, assertReference);
			}

		}
	}
	public void CreateProposalFormHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PrpslFrm_IntrmdryEntity>proposalForm_IntermediaryEntitylist=testData.getProposalForm_IntermediaryRecords();
		for(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData:proposalForm_IntermediaryEntitylist)
		{
			if(proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")){
				ProposalForm_IntermediaryPage proposalForm_IntermediaryPage=new ProposalForm_IntermediaryPage(driver, "Proposal Form Page");
				try {
					proposalForm_IntermediaryPage.fillPropsalFormPage(proposalForm_IntermediaryEntityData, assertReference);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setEditCollectionIntermediaryDependency(proposalForm_IntermediaryEntityData, testData);
			}	

		}
	}
	public void VerifyProposalFormHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<PrpslFrm_IntrmdryEntity>proposalForm_IntermediaryEntitylist=testData.getProposalForm_IntermediaryRecords();
		for(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData:proposalForm_IntermediaryEntitylist){
			ProposalForm_IntermediaryPage proposalForm_IntermediaryPage=new ProposalForm_IntermediaryPage(driver, "Proposal Form Page");
			proposalForm_IntermediaryPage.VerifyAndSubmitProposalPage(proposalForm_IntermediaryEntityData, assertReference);

		}
	}
	//Collection
	public void CreateCollectionIntermediaryHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<CollectionIntermediaryEntity> CollectionIntermediarylist=testData.getCollectionIntermediaryRecords();
		for(CollectionIntermediaryEntity collectionIntermediaryData:CollectionIntermediarylist)
		{
			if(collectionIntermediaryData.getAction().equalsIgnoreCase("add")){
				Collection_IntermediaryPage collection_IntermediaryPage=new Collection_IntermediaryPage(driver, "Collection Page");
				collection_IntermediaryPage.fillAndCollectPrmium(collectionIntermediaryData, assertReference);

			}	

		}
	}	
	//END
	public void verifyPolicystatusIntermediaryHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		List<HomeEntity_Intermediary>VerifyhomeEntitylist=testData.getHomeEntityIntermediariesRecords();
		for(HomeEntity_Intermediary verifyhomeEntityData:VerifyhomeEntitylist){
			if(verifyhomeEntityData.getAction().equalsIgnoreCase("verify")){
			HomePage_Intermediary HomePage_Intermediary=new HomePage_Intermediary(driver, "Verify Policy Status");
			HomePage_Intermediary.verifypolicyStatusIntermediary(verifyhomeEntityData, assertReference);
			
		}
		}
}
	private void setEditCollectionIntermediaryDependency(PrpslFrm_IntrmdryEntity prpslFrm_IntrmdryEntity, ScenarioTestData testData) {
		if(prpslFrm_IntrmdryEntity.getStringValueForField("DependencyForQuoteNo")!=null){
			ArrayList<CollectionIntermediaryEntity> CollectionIntermediarylistAll = testData.getObjectByReference(testData.getCollectionIntermediaryRecords(), prpslFrm_IntrmdryEntity.getStringValueForField("DependencyForQuoteNo"));
			for(CollectionIntermediaryEntity CollectionIntermediaryData:CollectionIntermediarylistAll) {
				CollectionIntermediaryData.setStringValueForField("HolderName", prpslFrm_IntrmdryEntity.getStringValueForField("FirstName")+" "+prpslFrm_IntrmdryEntity.getStringValueForField("LastName"));
				CollectionIntermediaryData.setStringValueForField("QuoteNo", prpslFrm_IntrmdryEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(CollectionIntermediaryData);

			}
		}
	}
	private void setEditCollectionIntermediaryDependencyForProductName(HomeEntity_Intermediary homeEntity_Intermediary, ScenarioTestData testData) {
		if(homeEntity_Intermediary.getStringValueForField("DependencyForProductName")!=null){
			ArrayList<CollectionIntermediaryEntity> CollectionIntermediarylistAll = testData.getObjectByReference(testData.getCollectionIntermediaryRecords(), homeEntity_Intermediary.getStringValueForField("DependencyForProductName"));
			for(CollectionIntermediaryEntity CollectionIntermediaryData:CollectionIntermediarylistAll) {
				CollectionIntermediaryData.setStringValueForField("ProductName", homeEntity_Intermediary.getStringValueForField("Product"));
				testData.updateRecordsForCriteria(CollectionIntermediaryData);

			}
		}
	}

	public void VerifyProductHomeEntityHelper_Intermediary(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException  {
		List<HomeEntity_Intermediary>homeEntitylist_Intermediary=testData.getHomeEntityIntermediariesRecords();
		for(HomeEntity_Intermediary homeEntityData_Intermediary:homeEntitylist_Intermediary)
		{
			if(homeEntityData_Intermediary.getAction().equalsIgnoreCase("Verify")){
				HomePage_Intermediary homePage_Intermediary = new HomePage_Intermediary(driver, "Home Page Intermediary Verify");
				homePage_Intermediary.clickAlertCloseImgWindow(homeEntityData_Intermediary);
				//homePage_Intermediary.fillAndVerifyHomeEntityIntermediaryPage(homeEntityData_Intermediary, assertReference);
				homePage_Intermediary.VerifyProductLinkNameHomeEntity(homeEntityData_Intermediary, assertReference);
				setEditCollectionIntermediaryDependencyForProductName(homeEntityData_Intermediary, testData);
			}	
		}
	}
	
	

}

