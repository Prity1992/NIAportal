
package com.aqm.staf.library;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePageOrangeHRM;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionMasterTestSuites;
import com.aqm.staf.framework.core.entity.ExecutionTestScenarios;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.framework.core.entity.ExecutionTestSuites;
import com.aqm.staf.framework.core.entity.MasterTestSuite;
import com.aqm.staf.framework.core.entity.TestPlan;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.framework.core.entity.TestSuite;
import com.aqm.staf.library.Pages.LoginPage;

public class FunctionalKeyword extends KeywordHelper{
	private  String stepGroup;
	protected void executeStep(
			TestPlan testPlan, ExecutionMasterTestSuites executionMasterTestSuite, MasterTestSuite masterTestSuite, ExecutionTestSuites executionTestSuite, TestSuite testSuite,
			ExecutionTestScenarios executionTestScenario, TestScenario testScenario, ExecutionTestSteps executionTestStep, ScenarioTestData testData, 
			WebDriver driver, File scenarioExecutionFolderReference, CustomAssert assertReference, boolean allStepExecutionMode) throws FileNotFoundException, IOException, InterruptedException, AWTException {
		String keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		String configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		int stepNumber= executionTestStep.getExecutionTestStepMasterAutomationScriptStepExecutionSequence();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		FrameworkServices.logMessage("<B><u>StepNumber-</u>"+stepNumber+"<i><Font Color = /'#00008B/'> Executing :"+keyword+" </Font></i></B>");
		Properties configProperties = FrameworkServices.getConfigProperties();
		KeywordHelper keywordHelper=new KeywordHelper();
		//int skipStepsInExecution= Integer.parseInt(configProperties.getProperty("skipSteps"));
		switch (keyword) {
		case "LoginUser":
			loginHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "EditHome":
			CreateHomeHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyHome":
			verifyHomeHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyPolicy":
			verifyPolicyHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "DetailedQuote":
			CreateDetailedQuoteHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "AdditionalDetail":
			CreateAdditionalDetailHelper(testData, executionTestStep, assertReference, driver, configData);
			break;	
		case "EditSummary":
			CreateSummaryHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifySummary":
			CreateSummaryHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "EditPayment":
			CreatePaymentHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyPayment":
			CreatePaymentHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "EditPremiumCalculator":
			CreatePremiumCalculator(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "HomeEntity_Intermediary":
			CreateHomeEntityHelper_Intermediary(testData, executionTestStep, assertReference, driver, configData);
			break;	
		case "EditProductInsurance":
			CreateProductInsuranceHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyProductInsurance":
			VerifyProductInsuranceHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "ProposalForm":
			CreateProposalFormHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyProposalForm":
			VerifyProposalFormHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "Collection":
			CreateCollectionIntermediaryHelper(testData, executionTestStep, assertReference, driver, configData);
			break;	
		case "verifyPolicyStatusIntermediary":
			verifyPolicystatusIntermediaryHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyProductName":
			VerifyProductHomeEntityHelper_Intermediary(testData, executionTestStep, assertReference, driver, configData);
			break;	
			
		case "EditClaimIntimate":
			CreateClaimIntimate(testData, executionTestStep, assertReference, driver, configData);
			break;
			
		case "CreateQuickHelper":
			CretaeQuickHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "EditQuickHelper":
			EditQuickHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		case "VerifyQuickHelper":
			VerifyQuickHelper(testData, executionTestStep, assertReference, driver, configData);
			break;
		
		default:
			break;
		}

 	}
}

