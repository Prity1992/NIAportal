package com.aqm.staf.library.Pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.PremiumCalculatorEntity;

public class Inter_PremiumCalculatorPage extends BasePage {
	private PageElement policyPeriodTab;
	private PageElement policyStartDateTextField;
	private PageElement policyEndDateTextField;
	private PageElement basicInformationTab;
	private PageElement basicInformationTab1;
	private PageElement sumInsuredInRsDropdown;
	private PageElement cityofResidenceDropdown;
	private PageElement memberInformationTab;
	private PageElement proposer18yearsto50yearsTextField;
	private PageElement daughter1AgeLimitTextField;
	private PageElement child1AgeLimitTextField;
	private PageElement dependentTypeDropdown;
	private PageElement iaGreeWithTheCheckBox;
	private PageElement saveCalculatePremiumButton;
	private PageElement continueButton;
	private PageElement sumInsuredInRs;
	private PageElement childAddButton;
	private PageElement plandropdown;
	private PageElement floaterRadioButton;
	private PageElement individualRadioButton;
	private PageElement thresholdLimit;
	private PageElement sumInsured;
	private PageElement sumInsuredforChild;
	private PageElement sumInsuredInformationDROP;
	private PageElement sumInsuredInformationDROP1;
	private PageElement sumInsuredDateOfBirth;
	private PageElement sumInsuredForPersonalAccident;
	private PageElement sumInsuredForHospitalExpensesDueToRoadAccident;
	private PageElement sIForHospExpensesDueToAccntInCourseOfEmpExtn;
	private PageElement sIForHospExpensesForAnyOtherAccident;
	private PageElement totalAccidentSumInsuredInRs;
	private PageElement coverageRequiredFor;
	private PageElement grossMonthlyIncomeOfTheProposer;
	private PageElement occupationOfTheProposer;
	private PageElement selfProposerDOB;
	private PageElement sumInsuredInRupeeDropdown;

	public Inter_PremiumCalculatorPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyPeriodTab = new PageElement(By.xpath("//span[contains(text(),'Policy Period')]"), "policy Period Tab",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyStartDateTextField = new PageElement(By.xpath("//input[@name='policyStartDate']"), "Policy Start Date",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyEndDateTextField = new PageElement(By.xpath("//input[@name='policyEndDate']']"), "Policy End Date", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicInformationTab = new PageElement(By.xpath("//span[contains(text(),'Basic Information')]"),
				"Basic Information Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 20);
		basicInformationTab1 = new PageElement(By.xpath("//span[contains(text(),'Basic information')]"),
				"Basic Information Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 20);
		sumInsuredInRsDropdown = new PageElement(By.name("propSumInsured"), "Sum Insured In Rs", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cityofResidenceDropdown = new PageElement(By.xpath("//select[@name=('cityOfResidence')]"), "city o fResidence",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredInRupeeDropdown = new PageElement(By.name("propSumInsured"), "Sum Insured In Rupee", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		memberInformationTab = new PageElement(By.xpath("//span[contains(text(),'Member Information')]"),
				"Member Information Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		proposer18yearsto50yearsTextField = new PageElement(By.name("proposerDob"), "Proposer 18 years to 50 years",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		daughter1AgeLimitTextField = new PageElement(By.name("daughterDob0"), "Daughter 1 Age Limit", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		child1AgeLimitTextField = new PageElement(By.name("childDob0"), "Child 1 Age Limit", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dependentTypeDropdown = new PageElement(By.xpath("//select[@name='dependentType0']"), "Dependent Type Dropdown",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iaGreeWithTheCheckBox = new PageElement(By.xpath("//input[@name='acceptTerms']"),
				"I agree with the Terms & Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveCalculatePremiumButton = new PageElement(By.xpath("//button[contains(text(),'Save & Calculate Premium')]"),
				"save Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		continueButton = new PageElement(By.xpath("//button[contains(text(),'Continue')]"), "Continue Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		sumInsuredInRs = new PageElement(By.xpath("//select[@name='propSumInsured']"), "Sum Insured", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforChild = new PageElement(By.xpath("//select[@name='childSumInsured0']"), "Sum Insured for child",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		childAddButton = new PageElement(By.xpath("//button[contains(text(),'Add Child')]"), "Add Child", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		plandropdown = new PageElement(By.xpath("//select[@name='planType']"), "Plan Type", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		floaterRadioButton = new PageElement(By.xpath("//label[@for='typeOfCover1']"), "Floater Radio Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		individualRadioButton = new PageElement(By.xpath("//input[@id='typeOfCover2']"), "Individual Radio Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		thresholdLimit = new PageElement(By.xpath("//select[@name='propThresholdLimit']"), "Threshold Limit Value",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsured = new PageElement(By.xpath("//select[@name='propSumInsured']"), "SumInsured", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredInformationDROP = new PageElement(By.xpath("  //span[contains(text(),'Sum Insured Information')]"),
				"SumInsured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredInformationDROP1= new PageElement(By.xpath("//span[contains(text(),'Sum insured information')]"),
				"SumInsured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		sumInsuredDateOfBirth = new PageElement(By.xpath("//input[@placeholder='Date Of Birth (dd/mm/yyyy)']"),
				"Date Of Birth (dd/mm/yyyy)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForPersonalAccident = new PageElement(By.xpath("//select[@name='SIRoadAccident0']"),
				"Sum Insured For Personal Accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForHospitalExpensesDueToRoadAccident = new PageElement(By.xpath("//select[@name='SIForHospExpn0']"),
				"Sum Insured For Hospital Expenses Due To Road Accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		sIForHospExpensesDueToAccntInCourseOfEmpExtn = new PageElement(
				By.xpath("//select[@name='SIForHospExpInEmpExt0']"),
				"SI For Hosp Expenses Due To Accnt In Course Of Emp Extn", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		sIForHospExpensesForAnyOtherAccident = new PageElement(By.xpath("//select[@name='SIForHospExpOtherAcc0']"),
				"SI For Hosp Expenses For Any Other Accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAccidentSumInsuredInRs = new PageElement(By.xpath("//input[@placeholder='Total Accident Sum Insured']"),
				"Total Accident Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageRequiredFor = new PageElement(By.xpath("//select[@name='coverageFor']"), "Coverage For", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossMonthlyIncomeOfTheProposer = new PageElement(
				By.xpath("//input[@placeholder='Gross monthly income of the proposer']"),
				"Gross monthly income of the proposer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationOfTheProposer = new PageElement(By.xpath("//select[@name='propOccupation']"),
				"Occupation of the Proposer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selfProposerDOB = new PageElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"), "Self Proposer DOB", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
	}

	public void fillPolicyPeriod(PremiumCalculatorEntity premiumCalculatorEntity) {
		// click(policyPeriodTab);
		String policyStartDate;
		policyStartDate = premiumCalculatorEntity.getStringValueForField("policyStartDate");
		if ((policyStartDate != null) && (!policyStartDate.isEmpty())) {
			clearAndSendKeys(policyStartDateTextField,
					premiumCalculatorEntity.getStringValueForField("policyStartDate"));
		}
		String policyEndDate;
		policyEndDate = premiumCalculatorEntity.getStringValueForField("policyEndDate");
		if ((policyEndDate != null) && (!policyEndDate.isEmpty())) {
			clearAndSendKeys(policyEndDateTextField, premiumCalculatorEntity.getStringValueForField("policyEndDate"));
		}
	}

	public void fillBasicInformation(PremiumCalculatorEntity premiumCalculatorEntity) throws InterruptedException {
		if (premiumCalculatorEntity.getAction().equalsIgnoreCase("add")
				&& (premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))
				|| (premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))||
				(!premiumCalculatorEntity.getStringValueForField("TestScenario").equalsIgnoreCase("Misc_Int_PADPTD_002 "))||
		(!premiumCalculatorEntity.getStringValueForField("TestScenario").equalsIgnoreCase("Misc_Int_PADPTD_003 ")) || 
		(!premiumCalculatorEntity.getStringValueForField("TestScenario").equalsIgnoreCase("Misc_Int_PADPTD_004 "))){
			
			String BasicInformationTab;
			BasicInformationTab = premiumCalculatorEntity.getStringValueForField("BasicInformationTab");
			if ((BasicInformationTab != null) && (!BasicInformationTab.isEmpty())) {
				Thread.sleep(2000);
				click(basicInformationTab);
				Thread.sleep(5000);
			}
			String BasicInformationTab1 = premiumCalculatorEntity.getStringValueForField("BasicInformationTab1");
			if ((BasicInformationTab1 != null) && (!BasicInformationTab1.isEmpty())) {
				waitForPageElement(basicInformationTab1);
				click(basicInformationTab1);
				Thread.sleep(5000);
			}
			String planDropdown;
			planDropdown = premiumCalculatorEntity.getStringValueForField("PlanDropdown");
			if ((planDropdown != null) && (!planDropdown.isEmpty())) {
				click(plandropdown);
			}

			String SumInsuredInRs;
			SumInsuredInRs = premiumCalculatorEntity.getStringValueForField("sumInsuredInRs");
			if ((SumInsuredInRs != null) && (!SumInsuredInRs.isEmpty())) {
				selectValueFromList(sumInsuredInRsDropdown, SumInsuredInRs);
			}

			String sumInsuredInRupee;
			sumInsuredInRupee = premiumCalculatorEntity.getStringValueForField("sumInsuredInRupee");
			if ((sumInsuredInRupee != null) && (!sumInsuredInRupee.isEmpty())) {
				selectValueFromList(sumInsuredInRupeeDropdown, sumInsuredInRupee);

			}
			String cityofResidence;
			cityofResidence = premiumCalculatorEntity.getStringValueForField("cityofResidence");
			if ((cityofResidence != null) && (!cityofResidence.isEmpty())) {
				selectValueFromList(cityofResidenceDropdown, cityofResidence);
			}

			String floaterRadioBTN;
			floaterRadioBTN = premiumCalculatorEntity.getStringValueForField("FloaterRadioBTN");
			if ((floaterRadioBTN != null) && (!floaterRadioBTN.isEmpty())) {
				click(floaterRadioButton);
			}
			String individualRadioBTN;
			individualRadioBTN = premiumCalculatorEntity.getStringValueForField("IndividualRadioBTN");
			if ((individualRadioBTN != null) && (!individualRadioBTN.isEmpty())) {
				click(individualRadioButton);
			}

			if ((premiumCalculatorEntity.getStringValueForField("CoverageRequiredFor") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("CoverageRequiredFor").isEmpty())) {
				selectValueFromList(coverageRequiredFor,
						premiumCalculatorEntity.getStringValueForField("CoverageRequiredFor"));
			}

			if ((premiumCalculatorEntity.getStringValueForField("GrossMonthlyIncomeOfTheProposer") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("GrossMonthlyIncomeOfTheProposer").isEmpty())) {
				clearAndSendKeys(grossMonthlyIncomeOfTheProposer,
						premiumCalculatorEntity.getStringValueForField("GrossMonthlyIncomeOfTheProposer"));
			}

			if ((premiumCalculatorEntity.getStringValueForField("OccupationOfTheProposer") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("OccupationOfTheProposer").isEmpty())) {
				selectValueFromList(occupationOfTheProposer,
						premiumCalculatorEntity.getStringValueForField("OccupationOfTheProposer"));
			}
		}
	}

	public void fillmemberInformation(PremiumCalculatorEntity premiumCalculatorEntity) throws InterruptedException {
		if (premiumCalculatorEntity.getAction().equalsIgnoreCase("add")
				&& (premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))|| 
				(premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))) {
			
			String MemberInformationTab = premiumCalculatorEntity.getStringValueForField("MemberInformationTab");
			if ((MemberInformationTab != null) && (!MemberInformationTab.isEmpty())) {
				waitForPageElement(memberInformationTab);
				click(memberInformationTab);
			}
			
			String proposer18yearsto50years = premiumCalculatorEntity.getStringValueForField("proposer18yearsto50years");
			if ((proposer18yearsto50years != null) && (!proposer18yearsto50years.isEmpty())) {
				clearAndSendKeys(proposer18yearsto50yearsTextField, proposer18yearsto50years);
				/*
				 * String
				 * SelectedDate=dateGenerator(premiumCalculatorEntity.getStringValueForField(	
				 * "proposer18yearsto50years"));
				 * clearAndSendKeys(proposer18yearsto50yearsTextField, SelectedDate);
				 */
			}

			String sumInsuredInRs1;
			sumInsuredInRs1 = premiumCalculatorEntity.getStringValueForField("sumInsuredInRs1");
			if ((sumInsuredInRs1 != null) && (!sumInsuredInRs1.isEmpty())) {
				selectValueFromList(sumInsuredInRsDropdown, sumInsuredInRs1);

			}

			String childAddBTN = premiumCalculatorEntity.getStringValueForField("childAddBTN");
			if ((childAddBTN != null) && (!childAddBTN.isEmpty())) {
				click(childAddButton);
				
				Thread.sleep(2000);
				String SelectedDate = premiumCalculatorEntity.getStringValueForField("ChildAge");
				if ((SelectedDate != null) && (!SelectedDate.isEmpty())) {
					
					String SelectedDate1 = dateGenerator(
						premiumCalculatorEntity.getStringValueForField("ChildAge"));
					clearAndSendKeys(daughter1AgeLimitTextField, SelectedDate1);
				}
				String childDOB = premiumCalculatorEntity.getStringValueForField("ChildDOB");
				if ((childDOB != null) && (!childDOB.isEmpty())) {
					clearAndSendKeys(child1AgeLimitTextField, childDOB);
				}

			}
			String suminsuredchild;
			suminsuredchild = premiumCalculatorEntity.getStringValueForField("SumInsuredForChild");
			if ((suminsuredchild != null) && (!suminsuredchild.isEmpty())) {
				selectValueFromList(sumInsuredforChild, suminsuredchild);
			}
			String daughter1AgeLimit = premiumCalculatorEntity.getStringValueForField("daughter1AgeLimit");
			if ((daughter1AgeLimit != null) && (!daughter1AgeLimit.isEmpty())) {
				String SelectedDate = dateGenerator(
						premiumCalculatorEntity.getStringValueForField("daughter1AgeLimit"));
				clearAndSendKeys(daughter1AgeLimitTextField, SelectedDate);
			}
			String dependentType = premiumCalculatorEntity.getStringValueForField("dependentType");
			if ((dependentType != null) && (!dependentType.isEmpty())) {
				selectValueFromList(dependentTypeDropdown, dependentType);
			}

			String thresholdLimitvalue;
			thresholdLimitvalue = premiumCalculatorEntity.getStringValueForField("ThresholdLimitValue");
			if ((thresholdLimitvalue != null) && (!thresholdLimitvalue.isEmpty())) {
				selectValueFromList(thresholdLimit,
						premiumCalculatorEntity.getStringValueForField("ThresholdLimitValue"));
			}
			String suminsuredIn;
			suminsuredIn = premiumCalculatorEntity.getStringValueForField("sumInsuredProposer");
			if ((suminsuredIn != null) && (!suminsuredIn.isEmpty())) {
				selectValueFromList(sumInsuredInRsDropdown,
						premiumCalculatorEntity.getStringValueForField("sumInsuredProposer"));
			}

			String iaGreeWithThe;
			iaGreeWithThe = premiumCalculatorEntity.getStringValueForField("iaGreeWithThe");
			if ((iaGreeWithThe != null) && (!iaGreeWithThe.isEmpty())) {
				click(iaGreeWithTheCheckBox);
			}
		}
		}
	

	public void saveAndcontinue(PremiumCalculatorEntity premiumCalculatorEntity) throws InterruptedException {
		String saveCalculatePremium = premiumCalculatorEntity.getStringValueForField("saveCalculatePremium");
		if ((saveCalculatePremium != null) && (!saveCalculatePremium.isEmpty())) {
			click(saveCalculatePremiumButton);
		}
		
		
		String ContinueButton = premiumCalculatorEntity.getStringValueForField("ContinueButton");
		if ((ContinueButton != null) && (!ContinueButton.isEmpty())) {
			Thread.sleep(2000);		
			click(continueButton);
			 
		}
	}

	public void fillSumInsuredInformation(PremiumCalculatorEntity premiumCalculatorEntity) throws InterruptedException {
		if (premiumCalculatorEntity.getAction().equalsIgnoreCase("add")
				&& (premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))
				|| (premiumCalculatorEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))) {
			
			String sumInsuredInformation = premiumCalculatorEntity.getStringValueForField("SumInsuredInformation");
			if ((sumInsuredInformation != null) && (!sumInsuredInformation.isEmpty())) {
				Thread.sleep(3000);
				click(sumInsuredInformationDROP);
			}
			String suminsuredinformation1 = premiumCalculatorEntity.getStringValueForField("suminsuredinformation1");
			if ((suminsuredinformation1!= null) && (!suminsuredinformation1.isEmpty())) {
				Thread.sleep(3000);
				click(sumInsuredInformationDROP1);
			}
			
			if ((premiumCalculatorEntity.getStringValueForField("SumInsuredDateOfBirth") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("SumInsuredDateOfBirth").isEmpty())) {
				clearAndSendKeys(sumInsuredDateOfBirth,
						premiumCalculatorEntity.getStringValueForField("SumInsuredDateOfBirth"));
			}
			if ((premiumCalculatorEntity.getStringValueForField("SumInsuredForPersonalAccident") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("SumInsuredForPersonalAccident").isEmpty())) {
				selectValueFromList(sumInsuredForPersonalAccident,
						premiumCalculatorEntity.getStringValueForField("SumInsuredForPersonalAccident"));
			}

			if ((premiumCalculatorEntity
					.getStringValueForField("SumInsuredForHospitalExpensesDueToRoadAccident") != null)
					&& (!premiumCalculatorEntity
							.getStringValueForField("SumInsuredForHospitalExpensesDueToRoadAccident").isEmpty())) {
				selectValueFromList(sumInsuredForHospitalExpensesDueToRoadAccident, premiumCalculatorEntity
						.getStringValueForField("SumInsuredForHospitalExpensesDueToRoadAccident"));
			}
			if ((premiumCalculatorEntity.getStringValueForField("SelfProposerDOB") != null)
					&& (!premiumCalculatorEntity.getStringValueForField("SelfProposerDOB").isEmpty())) {
				clearAndSendKeys(selfProposerDOB, premiumCalculatorEntity.getStringValueForField("SelfProposerDOB"));
			}
		}
	}

	public void fillInter_PremiumCalculatorPagePage(PremiumCalculatorEntity premiumCalculatorEntityData,
			CustomAssert customAssert) throws InterruptedException {
		fillBasicInformation(premiumCalculatorEntityData);
		fillSumInsuredInformation(premiumCalculatorEntityData);
		fillmemberInformation(premiumCalculatorEntityData);
		saveAndcontinue(premiumCalculatorEntityData);
	}
}
