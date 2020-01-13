package com.aqm.staf.library.Pages;

import java.nio.channels.DatagramChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.SendKeysAction;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.GenericEntity;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.PrpslFrm_IntrmdryEntity;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class DetailedQuotePage extends BasePage {

	private PageElement basicInformation;
	private PageElement sumInsured;
	private PageElement cityofRecidence;
	private PageElement memberInfromation; 
	private PageElement addProposerBtn;
	private PageElement addSpouseBtn;
	private PageElement addDaughter1Btn;
	private PageElement proposer;
	private PageElement spouse;
	private PageElement daughter1;
	private PageElement dependentType;
	private PageElement agreeWithTheTermsConditions;
	private PageElement calculatePremium;
	private PageElement saveAndContinue;
	private PageElement saveAndContinue1;
	//Motor-Harshit
	private PageElement buyInsuranceForANewVehicle;
	private PageElement renewExistingPolicyFromAnyInsurer;
	private PageElement yearDropdown;
	private PageElement dateTextField;
	private PageElement personalDetails;
	private PageElement PolicyStartDateLabel;
	private PageElement PolicyEndDateLabel;	
	private PageElement policyPeriodTab;
	private PageElement policyPeriodTab1;
	private PageElement QuoteNoLabel;
	private PageElement personalDetailsField;
	private PageElement makeDropdown;
	private PageElement modelTextField;
	private PageElement nearestCityDropDown;
	private PageElement vehicleZoneDropDown;
	private PageElement previousPolicyExpDateTextField;
	private PageElement coverageEnhancementRadio;
	private PageElement packageTextRadio;
	private PageElement coverageLiabilityRadio;
	private PageElement noButtonRadio;
	private PageElement anywhereInTheWorldExcludingUSAandcanada;
	private PageElement anywhereInTheWorldIncludingUSAandcanada;
	private PageElement businessT;
	private PageElement leavingIndiaon;
	private PageElement returningtoIndiaOn;
	private PageElement dateOfBirth;
	private PageElement bOne;
	private PageElement bTwo;
	private PageElement vehicleIDV;
	private PageElement coverageDetails;
	private PageElement vehicleDetails;
	private PageElement memberInformation;
	private PageElement addchildBtn;
	private PageElement floaterRadioButton;
	private PageElement individualRadioButton;
	private PageElement thresholdLimit ;
	//mis sagar
	private PageElement standardCovers;
	private PageElement standardsumInsured;
	private PageElement jewelleryandValuables;
	private PageElement broadjewelleryandValuablesTestField;
	private PageElement weightforjewelleryTestField;
	private PageElement valueTextFiled;
	private PageElement domesticApplinces;
	private PageElement makeTextFiled;
	private PageElement modelTextFiled;
	private PageElement yearTextFiled;
	private PageElement televisionDesktop;
	private PageElement makeTVTextFiled;
	private PageElement modelTVTextFiled;
	private PageElement yearTVTextFiled;
	private PageElement yesfireAndAlliedRadio;
	private PageElement nofireAndAlliedRadio;
	private PageElement recalculatePreminum;
	private PageElement plandropdown;
	private PageElement oneYearEnhancementRadio;
	private PageElement oneYearPackageRadio;
	private PageElement fiveYearsLiabilityRadio;
	private PageElement fiveYearsPackageRadio;
	private PageElement fiveYearsEnhancementRadio;
	
	//offfice sagar	
	private PageElement sumInsuredBulidingTextField;
	private PageElement provisionsForBuildingTextField;
	private PageElement businessFurnitureCheckBox;
	private PageElement documentsOffCheckBox;
	private PageElement teleGasElectricCheckBox;
	private PageElement tenantsImproveCheckBox;
	private PageElement pedalCyclesCheckBox;
	private PageElement electronicEquipCheckBox;
	private PageElement allotherContentsCheckBox;
	private PageElement professionalInstruCheckBox;
	private PageElement clothPersEffectsCheckBox;																					
	private PageElement tempRemovalCheckBox;
	private PageElement costRemovalCheckBox;
	private PageElement limitburglaryTextField;
	private PageElement businessFurnitureTextField;
	private PageElement documentsOffTextField;
	private PageElement teleGasElectricTextField;
	private PageElement tenantsImproveTextField;
	private PageElement pedalCyclesTextField;
	private PageElement electronicEquipTextField;
	private PageElement allotherContentsTextField;
	private PageElement professionalInstruTextField;
	private PageElement clothPersEffectsTextField;
	private PageElement tempRemovalTextField;
	private PageElement costRemovalTextField;
	private PageElement additionalCovers;
	private PageElement tenantsLiability;
	private PageElement moneyInsurance;
	private PageElement fixedGlassSannitySetting;
	private PageElement tenantsLiabilityCheckBox;
	private PageElement moneyInsuranceCheckBox;
	private PageElement fixedGlassCheckBox;
	private PageElement sumInsuTenantLiabTextFeild;
	private PageElement moneyTransitpolicyTextFeild;
	private PageElement perlimitMITextFeild;
	private PageElement moneyhoursTextFeild;
	private PageElement moneyLockedSafehoursTextFeild;
	private PageElement descriGlassTextFeild;
	private PageElement dimensionGlassTextFeild;
	private PageElement valueOfGlassTextFeild;
	private PageElement valueFittingsTextFeild;
	private PageElement valueOfSignPlateTextFeild;
	//nikhil
	private PageElement AddOnEnhancement;
	private PageElement NilRadio;
	private PageElement rtnToInvCvr;
	private PageElement ConsItemCvr;
	//Harsha
	private PageElement sumInsuredOfBuilding;
	private PageElement selectDwellingContent1;
	private PageElement dwellingContentdescription1;
	private PageElement dwellingContentsumInsured1;
	private PageElement yearTVTextFiled1;
	private PageElement additionalCoversTab;
	private PageElement domesticApplianceschkbox;
	private PageElement TVDVDCDsetchkbox;
	private PageElement pedalCyclechkbox;
	private PageElement workmenCompensationchkbox;
	private PageElement  domesticAppliancesSectionTab;
	private PageElement  selectAppliancesDropDown;
	private PageElement domesticCollapseDescription1;	
	private PageElement enterSumInsuredofeachparticularselected1;
	private PageElement tvDVDandCDsetSection6Tab ;
	private PageElement tvDVDandCDDropDown;
	private PageElement tvDVDCDsetDesc1;
	private PageElement sumInsuredoftheAppliance1;
	private PageElement pedalCyclesSectiontab;
	private PageElement pedalCycleDropdown;
	private PageElement pedalCycleDesc1;
	private PageElement sumInsuredofpedalCycle;
	private PageElement workmenCompensationtab;
	private PageElement  natureOfWorkDropdown;
	private PageElement  numberofEmployees;
	private PageElement	 wagesofEmp;
	private PageElement	furnitureSumInsuredTxtBox;
	private PageElement	goodsSumInsuredTxtBox;
	private PageElement moneyInsuranceSectionchkbox;
	private PageElement moneyInsuranceSectiontab;
	private PageElement moneyInTransit;
	private PageElement moneyInCounter;
	private PageElement moneyInSafe;
	private PageElement valueofAccessories;
	private PageElement sumInsuredInfoTab;
	private PageElement accidentincourseYES;
	private PageElement accidentincourseNo;
	private PageElement hospitalExpOtherAccidentNO;
	private PageElement hospitalExpOtherAccidentYES;
	private PageElement familyMemPhysicalDefectsYES;
	private PageElement familyMemPhysicalDefectsNO;
	private PageElement addFamilyMemberYES;
	private PageElement addFamilyMemberNO;
	private PageElement selfDOB;
	private PageElement sumInsuredForPerAccDropDown;
	private PageElement sumInshospitalExpRoadAccDropDown;
	private PageElement policyDurationDropDown;
	private PageElement okButton;
	//pravina
	private PageElement studiesRadioButton;
	private PageElement employmentRadioButton;
	private PageElement travelDurationdropdown;
	private PageElement planCRadioButton;
	private PageElement policyRequiredforinYearsDropdown;
	private PageElement basicDetails;
	private PageElement coveragerequiredfor;
	private PageElement grossmonthlyincomeoftheProposer;
	private PageElement proposerOccupation;
	private PageElement sumInsuredInformation;
	private PageElement selfProposerDOB;
	private PageElement memberSumInsured;
	private PageElement typeofResidenceDropdown;
	private PageElement costofthehouseflat;
	private PageElement costoffurnitureFittingsFixtures;
	private PageElement propertyDetails;
	private PageElement previousPolicyDetails;
	private PageElement previousPolicyNo;
	private PageElement NameOfPreviousInsurer;
	private PageElement addressOfPreviousInsurer;
	//prity
	private PageElement dateOfBirthForCPA;
	private PageElement okButtonCPA;

	public DetailedQuotePage(WebDriver driver,String pageName) {
		super(driver,pageName);

		basicInformation			 = new PageElement(By.xpath("//span[contains(text(),'Basic Information')]"), "BasicInformation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsured				     = new PageElement(By.xpath("//select[@name='propSumInsured']"), "SumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityofRecidence				 = new PageElement(By.xpath("//select[@name='cityOfResidence']"), "CityofRecidence", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberInfromation			 = new PageElement(By.xpath("//span[contains(text(),'Member Information')]"), "MemberInfromation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addProposerBtn				 = new PageElement(By.xpath("//button[contains(text(),'Add Proposer')]"), "AddProposerBtn", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addSpouseBtn				 = new PageElement(By.xpath("//button[contains(text(),'Add Spouse')]"), "AddSpouseBtn", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addDaughter1Btn				 = new PageElement(By.xpath("//button[contains(text(),'Add Daughter')]"), "AddProposerBtn", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proposer				     = new PageElement(By.xpath("//input[@name = 'proposerDob']"), "Proposer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		spouse					     = new PageElement(By.xpath("//tr[@data-ng-if='detailQuote.healthObj.spouseDetail']//input"), "Spouse", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		daughter1				     = new PageElement(By.xpath("//input[@name='daughterDob0']"), "Daughter1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dependentType				 = new PageElement(By.xpath("//select[@name='dependentType0']"), "DependentType", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreeWithTheTermsConditions  = new PageElement(By.xpath("//input[@name='acceptTerms']"), "AgreeWithTheTermsConditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);
		buyInsuranceForANewVehicle	 = new PageElement(By.xpath("//label//span[contains(text(),'Buy insurance for a new vehicle')]"), "Buy insurance for a new vehicle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		renewExistingPolicyFromAnyInsurer = new PageElement(By.xpath("//span[contains(text(),'Renew existing policy from any insurer')]"), "Renew existing policy from any insurer", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearDropdown				= new PageElement(By.xpath("//select[@id='year']"), "year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		makeDropdown				= new PageElement(By.xpath("//select[@id='make']"), "make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nearestCityDropDown			= new PageElement(By.xpath("//select[@id='cityCode']"), "Nearest City", false, WaitType.WAITFORELEMENTTOBEEENABLED, 20);
		vehicleZoneDropDown			= new PageElement(By.xpath("//select[@id='vehicleZone']"), "Vehicle Zone", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modelTextField				= new PageElement(By.xpath("//input[@id='model']"), "model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageEnhancementRadio	= new PageElement(By.xpath("//input[@id='coverageEnhancement']"), "Coverage Enhancement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		packageTextRadio			= new PageElement(By.xpath("//span[contains(text(),'Package']"), "Package", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageLiabilityRadio		= new PageElement(By.xpath("//input[@id='coverageLiability']"), "Coverage Liability", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noButtonRadio				= new PageElement(By.xpath("//input[@id='ownerDrive1']"), "No Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateTextField				= new PageElement(By.xpath("//input[@id='datefield']"), "Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyExpDateTextField	= new PageElement(By.xpath("//input[@id='previousPolicyExpDate']"), "Previous Policy Exp Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatePremium			= new PageElement(By.xpath("//button[contains(text(),'Calculate Premium')]"), "CalculatePremium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveAndContinue				= new PageElement(By.xpath("//button[contains(text(),'Save & Continue')]"), "saveAndContinue", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);			
		saveAndContinue1				= new PageElement(By.xpath("//div[@class='pull-right']//span[4]"), "saveAndContinue1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);			

		QuoteNoLabel				= new PageElement(By.xpath("//span[contains(text(),'Quote No.')]/following::span[2]"), "Quote No Label", true, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);			
		PolicyStartDateLabel	    = new PageElement(By.name("policyStartDate"), "Policy Start Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);			
		PolicyEndDateLabel			= new PageElement(By.name("policyEndDate"), "Policy End Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		personalDetailsField		= new PageElement(By.xpath("//span[contains(text(),'Personal Details')]"), "Personal Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodTab				= new PageElement(By.xpath("//span[contains(text(),'Policy Period')]"), "policy Period Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		policyPeriodTab1			= new PageElement(By.xpath("//span[contains(text(),'Policy Period')]"), "policy Period Tab1", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		anywhereInTheWorldExcludingUSAandcanada = new PageElement(By.xpath("//span[contains(text(),'Anywhere in the world excluding USA and Canada')]"), "Anywhere in the world excluding USA and Canada", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		anywhereInTheWorldIncludingUSAandcanada = new PageElement(By.xpath("//span[contains(text(),'Anywhere in the world including USA and Canada')]"), "Anywhere in the world including USA and Canada", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessT                   = new PageElement(By.xpath("//span[contains(text(),'Business')]"), "Business", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		leavingIndiaon              = new PageElement(By.name("leavingIndia"), "Leaving India", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		returningtoIndiaOn          = new PageElement(By.name("returningIndia"), "Returning India", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirth                 = new PageElement(By.name("ompDateOfBirth"), "Date Of Birth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bOne                        = new PageElement(By.xpath("//span[contains(text(),'B2')]"), "policy Period Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bTwo                        = new PageElement(By.xpath("//span[contains(text(),'B1')]"), "policy Period Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		vehicleIDV                  = new PageElement(By.id("vehicleIDV"), "vehicle IDV", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageDetails             = new PageElement(By.xpath("//span[contains(text(),'Coverage Details')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//nikhil
		ConsItemCvr                  = new PageElement(By.xpath("//label[@for='consumableItemsCoverYesNo0']"), "consumableItemsCoverYesNo0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rtnToInvCvr                  = new PageElement(By.xpath("//label[@for='returnInvoiceYesNO0']"), "returnInvoiceYesNO0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		NilRadio                    = new PageElement(By.xpath("//label[@for='nilDepreciation0']"), "nilDepreciation0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		AddOnEnhancement            = new PageElement(By.xpath("//span[contains(text(),'Add on Enhancement Coverages')]"),"Add on Enhancement Coverages",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		vehicleDetails              = new PageElement(By.xpath("//span[contains(text(),'Vehicle details')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberInformation           = new PageElement(By.xpath("//span[contains(text(),'		Member Information ')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		standardCovers 				=  new PageElement(By.xpath("//span[contains(text(),'Standard Covers')]"), "Sandard Covers", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		standardsumInsured          = new PageElement(By.xpath("//select[@name='earthQuakeSi']"), "Sandard Sum Insured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		jewelleryandValuables       = new PageElement(By.xpath("//span[contains(text(),'Jewellery and Valuables')]"), "Jewellery and Valuables", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		broadjewelleryandValuablesTestField =  new PageElement(By.xpath("//textarea[@placeholder='Broad description for Jewellery and Valuables']"), "Broadjewellery And Valuables", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		weightforjewelleryTestField = new PageElement(By.xpath("//textarea[@placeholder='Weight/Vol for Jewellery and Valuables']"), "Weight for Jewellery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueTextFiled              = new PageElement(By.xpath("//input[@placeholder='Value']"), "Value TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		domesticApplinces           = new PageElement(By.xpath("//span[contains(text(),'Domestic Appliances')]"), "Domestic Applinces", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		makeTextFiled               = new PageElement(By.xpath("//input[@name='applianceMake_0']"), "Make TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modelTextFiled              = new PageElement(By.xpath("//input[@name='applianceModel_0']"), "Model TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearTextFiled               = new PageElement(By.xpath("//input[@name='applianceYear_0']"), "Model TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		televisionDesktop           = new PageElement(By.xpath("//span[contains(text(),'Television/Desktop')]"), "Domestic Applinces", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		makeTVTextFiled             = new PageElement(By.xpath("//input[@name='tvDeskMake_0']"), "Make TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modelTVTextFiled            = new PageElement(By.xpath("//input[@name='tvDeskModel_0']"), "Make TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearTVTextFiled             = new PageElement(By.xpath("//input[@name='tvDeskYear_0']"), "Make TextFiled", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addchildBtn                 = new PageElement(By.xpath("//button[contains(text(),'Add Child')]"), "Add Child Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		floaterRadioButton          = new PageElement(By.xpath("//label[@for='typeOfCover1']"), "Floater Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		individualRadioButton       = new PageElement(By.xpath("//input[@id='typeOfCover2']"), "Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		thresholdLimit              = new PageElement(By.xpath("//select[@name='propThresholdLimit']"), "Threshold Limit Value", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		recalculatePreminum			= new PageElement(By.xpath("//button[contains(text(),'Recalculate Premium')]"), "Recalculate Preminum", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		plandropdown                = new PageElement(By.xpath("//select[@name='planType']"), "Plan Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yesfireAndAlliedRadio       = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq0']"), "YesRadioFireAndAllied", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nofireAndAlliedRadio        = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq1']"), "NoRadioFireAndAllied", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Harsha house holder/
		// start
		sumInsuredOfBuilding	   		= new PageElement(By.xpath("//input[@name='sumInsuredOfBuilding']"), "sum Insured Of Building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectDwellingContent1	   		= new PageElement(By.xpath("//select[@name='name_0']"), "select Dwelling Content 1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dwellingContentdescription1 	= new PageElement(By.xpath("//textarea[@placeholder='Description']"), "description_0", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dwellingContentsumInsured1		= new PageElement(By.xpath("//input[@name='sumInsured_0']"), "sum Insured_0", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalCoversTab				= new PageElement(By.xpath("//span[contains(text(),'Additional Covers')]"), "Additional Covers Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);					
		domesticApplianceschkbox 		= new PageElement(By.xpath("//div[@class='col-md-1 col-sm-1 col-xs-2 clearfix']//input[@type='checkbox']"), "Domestic Appliances", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TVDVDCDsetchkbox  				= new PageElement(By.xpath("//div[@class='clearfix']//div[2]//div[1]//input[1]"), "TV,DVD and CD set", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCyclechkbox				= new PageElement(By.xpath("//div[@class='clearfix']//div[3]//div[1]//input[1]"), "pedal Cycle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		workmenCompensationchkbox    	= new PageElement(By.xpath("//div[@class='clearfix']//div[4]//div[1]//input[1]"), "workmen Compensation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliancesSectionTab	= new PageElement(By.xpath("//span[contains(text(),'Domestic Appliances, Section 5 (Optional)')]"), "domestic Appliances Section 5 Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		selectAppliancesDropDown		= new PageElement(By.xpath("//select[contains(@name,'name1_0')]"),"Appliances Drop Down ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		domesticCollapseDescription1	= new PageElement(By.xpath("//div[@id='domesticCollapse0']//textarea[contains(@placeholder,'Description')]"), "description_0", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enterSumInsuredofeachparticularselected1= new PageElement(By.xpath("//input[@name='sumInsured1_0']"), "enter Sum Insured of each particular selected 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tvDVDandCDsetSection6Tab 		= new PageElement(By.xpath("//span[contains(text(),'TV, DVD and CD set, Section 6 (Optional)')]"), "tv DVD and CD set Section 6 Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		tvDVDandCDDropDown				= new PageElement(By.xpath("//select[contains(@name,'name4_0')]"),"Appliances Drop Down ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		tvDVDCDsetDesc1					= new PageElement(By.xpath("//span[contains(@class,'relative clearwpr has-error')]//textarea[contains(@placeholder,'Description')]"), " TV DVD And CD description_0", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredoftheAppliance1		= new PageElement(By.xpath("//input[contains(@placeholder,'Sum Insured of the Appliance')]"), "sum Insured Of Building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pedalCyclesSectiontab			= new PageElement(By.xpath("//span[contains(text(),'Pedal Cycle (Optional)')]"), "Pedal Cycles Section 7 Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		pedalCycleDropdown				= new PageElement(By.xpath("//select[contains(@name,'name5_0')]"),"Pedal cycle Drop Down ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		pedalCycleDesc1					= new PageElement(By.xpath("//span[contains(@class,'relative clearwpr has-error')]//textarea[contains(@placeholder,'Description')]"), "pedal cycle description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredofpedalCycle			= new PageElement(By.xpath("//span[contains(@class,'relative clearwpr has-error')]//input[contains(@placeholder,'Sum Insured')]"), "enter Sum Insured of each particular selected ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		workmenCompensationtab		    = new PageElement(By.xpath("//span[contains(text(),'Workmen Compensation Cover Section 10 (Optional)')]"), "Workmen Compensation Cover Section 7 Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		natureOfWorkDropdown			= new PageElement(By.xpath("//select[contains(@name,'natureOfWork_0')]"),"nature of work Drop Down ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		numberofEmployees				= new PageElement(By.xpath("//input[contains(@placeholder,'No. of Employees')]"),"No. of Employees ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wagesofEmp						= new PageElement(By.xpath("//input[contains(@placeholder,'Monthly Wages')]"),"wages of the employee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Shop Keeper 
		furnitureSumInsuredTxtBox       = new PageElement(By.xpath("//input[@name='furnitureSumInsured']"), "sum Insured Of Furniture", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		goodsSumInsuredTxtBox           = new PageElement(By.xpath("//input[@name='goodsSumInsured']"), "sum Insured Of goods Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyInsuranceSectionchkbox     = new PageElement(By.xpath("//div[@class='clearfix']//div[2]//div[1]//input[1]"), "money Insurance Section chkbox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsuranceSectiontab		= new PageElement(By.xpath("//span[contains(text(),'Money Insurance  (Optional)')]"), "Money Insurance", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInTransit    				 = new PageElement(By.xpath("//input[@name='moneyInTransit']"), "money In Transit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyInCounter    				 = new PageElement(By.xpath("//input[@name='moneyInCounter']"), "money In Counter", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyInSafe    				 	= new PageElement(By.xpath("//input[@name='moneyInSafe']"), "money In Safe", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueofAccessories				= new PageElement(By.xpath("//input[@name='sumInsured1_0']"), "Value Including Accessories", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// Raasta Aapatti Kavach Policy
		sumInsuredInfoTab		= new PageElement(By.xpath("//span[contains(text(),'Sum Insured Information')]"), "Sum Insured Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accidentincourseYES				 = new PageElement(By.xpath("//label[@for='hospExpensesDuetoAcc0']"), "hospital expenses due to accident in course of employment extension", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accidentincourseNo				 = new PageElement(By.xpath("//label[@for='hospExpensesDuetoAcc1']"), "hospital expenses due to accident in course of employment extension", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		hospitalExpOtherAccidentYES		 = new PageElement(By.xpath("//label[@for='hospExpensesDuetoOtherAcc0']"), "hospital expenses for any other accident ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		hospitalExpOtherAccidentNO		 = new PageElement(By.xpath("//label[@for='hospExpensesDuetoOtherAcc1']"), "hospital expenses for any other accident ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		familyMemPhysicalDefectsYES		 = new PageElement(By.xpath("//label[@for='physicalDefects0']"), "self and any of the family member have physical defects ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		familyMemPhysicalDefectsNO		 = new PageElement(By.xpath("//label[@for='physicalDefects1']"), "self and any of the family member have physical defects ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addFamilyMemberYES				 = new PageElement(By.xpath("//label[@for='addMember0']"), "add family member to the policy ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addFamilyMemberNO				 = new PageElement(By.xpath("//label[@for='addMember1']"), "add family member to the policy ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		selfDOB							 = new PageElement(By.name("memberDOB0"), "Member info Self Date of birth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		sumInsuredForPerAccDropDown		 = new PageElement(By.name("SIRoadAccident0"), "Sum Insured for Personal	accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInshospitalExpRoadAccDropDown = new PageElement(By.name("SIForHospExpn0"), "Sum Insured for Personal	accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyDurationDropDown			 =new PageElement(By.name("policyDuration"), "Required policy duration.", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		okButton						= new PageElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[6]/button[1]"),"Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//end
		studiesRadioButton              = new PageElement(By.name("TravelPurpose"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//CPA
		dateOfBirthForCPA				= new PageElement(By.name("dateOfBirth"), "DateOfBirth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		okButtonCPA						= new PageElement(By.xpath("//button[@class='btn btn-green alert_ok_btn']"),"Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 25);
		//employmentRadioButton         = new PageElement(By.name("TravelPurpose"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		travelDurationdropdown	        = new PageElement(By.name("travelDuration"), "Travel Duration", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		planCRadioButton                = new PageElement(By.name("Plan"), "Plan", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyRequiredforinYearsDropdown= new PageElement(By.name("policyReqInYears"), "policy Req In Years", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofResidenceDropdown         = new PageElement(By.name("typeOfResidence"), "Type Of Residence", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basicDetails                           = new PageElement(By.xpath("//div[@class='panel-group']//div[2]//a"), "Basic Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coveragerequiredfor                    = new PageElement(By.xpath("//select[@name='covReqData']"), "Coverage required for", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		grossmonthlyincomeoftheProposer        = new PageElement(By.xpath("//input[@name='proposerIncome']"), "Gross monthly income of the Proposer", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proposerOccupation                     = new PageElement(By.xpath("//select[@name='propOccupation']"), "Proposer Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredInformation                  = new PageElement(By.xpath("//div[@class='panel-group']//div[3]//div[1]//h5[1]//a[1]"), "Sum Insured Information", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		selfProposerDOB                        = new PageElement(By.xpath("//input[@name='dobSelf/Proposer']"), "DobSelf/Proposer", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		memberSumInsured                       = new PageElement(By.xpath("//input[@id='input-number1']"), "Member Sum Insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//mis Office Protection sagar
		sumInsuredBulidingTextField 		= new PageElement(By.xpath("//input[@placeholder='Sum Insured of Building']"), "Sum Insured Buliding TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		provisionsForBuildingTextField 		= new PageElement(By.xpath("//input[@name='surveyorsLegalFeeAndDebrisRemoval']"), "Provisions Building TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessFurnitureCheckBox 			= new PageElement(By.xpath("//input[@name='businessFurnitureSafesOfficeMachinerychk']"), "Business Furniture CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentsOffCheckBox 				= new PageElement(By.xpath("//input[@name='documentsChk']"), "Documents Off CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		teleGasElectricCheckBox 			= new PageElement(By.xpath("//input[@name='telephoneGasAndElectricMetersChk']"), "TeleGas Electric CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		tenantsImproveCheckBox   			= new PageElement(By.xpath("//input[contains(@name,'electronicEquipCheckBox')]"), "Tenants Improve CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCyclesCheckBox   				= new PageElement(By.xpath("//input[@name='pedalCyclesChk']"), "Pedal Cycles CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		electronicEquipCheckBox  			= new PageElement(By.xpath("//input[contains(@name,'electronicEquipmentChk')]"), "Electronic Equip CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		allotherContentsCheckBox  			= new PageElement(By.xpath("//input[contains(@name,'allOtherContentsChk')]"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		professionalInstruCheckBox			= new PageElement(By.xpath("//input[contains(@name,'professionalInstrumentsChk')]"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clothPersEffectsCheckBox 			= new PageElement(By.xpath("//input[@name='clothingandPersonalEffectsChk']"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tempRemovalCheckBox  				= new PageElement(By.xpath("//input[@name='temporaryRemovalOfDocumentsChk']"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		costRemovalCheckBox 				= new PageElement(By.xpath("//input[@name='costRemovalOfDebrisChk']"), "Travel Purpose", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		limitburglaryTextField    			= new PageElement(By.xpath("//input[@id='lossLimitForBurglary']"), "limit burglary TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalCovers    				= new PageElement(By.xpath("//span[contains(text(),'Additional Covers')]"), "Additional Covers", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tenantsLiability  					= new PageElement(By.xpath("//span[contains(text(),'Tenants Liability')]"), "Tenants Liability", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsurance  					= new PageElement(By.xpath("//span[contains(text(),'Money Insurance')]"), "Money Insurance", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fixedGlassSannitySetting  			= new PageElement(By.xpath("//span[contains(text(),'Fixed Glass, Sanitary Fittings')]"), "Fixed Glass, Sanitary Fittings", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tenantsLiabilityCheckBox    		= new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[1]"), "tenants Liability CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsuranceCheckBox    			= new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[2]"), "tenants Liability CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fixedGlassCheckBox     				= new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[3]"), "fixed Glass CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuTenantLiabTextFeild    		= new PageElement(By.xpath("//input[@id='totalSumInsured']"), "sumInsu Tenant Liab TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyTransitpolicyTextFeild    		= new PageElement(By.xpath(" //input[@id='moneyInTransit']"), "money Transitpolicy TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		perlimitMITextFeild    				= new PageElement(By.xpath(" //input[@id='carryingLimit']"), "perlimit MI TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyhoursTextFeild    				= new PageElement(By.xpath("//input[@id='moneyInOffice']"), "money hours TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyLockedSafehoursTextFeild    	= new PageElement(By.xpath("//input[@id='moneyInLockedSafe']"), "money LockedSafehours TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriGlassTextFeild    			= new PageElement(By.xpath("//textarea[@id='description']"), "descri Glass TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dimensionGlassTextFeild    			= new PageElement(By.xpath("//textarea[@id='dimensionOfPlateGlass']"), "dimension Glass TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfGlassTextFeild    			= new PageElement(By.xpath("//input[@id='valueOfPlateGlass']"), "value OfGlass TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueFittingsTextFeild    			= new PageElement(By.xpath("//input[@id='valueOfSanitaryFittings']"), "value Fittings TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfSignPlateTextFeild    		= new PageElement(By.xpath("//input[@id='valueOfSignsNamePlates']"), "value OfSignPlate TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		businessFurnitureTextField 			= new PageElement(By.xpath("//input[@id='businessFurnitureSafesOfficeMachinery']"), "business Furniture TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentsOffTextField     			= new PageElement(By.xpath("//input[@id='documents']"), "documents Off TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		teleGasElectricTextField   			= new PageElement(By.xpath("//input[@id='telephoneGasAndElectricMeters']"), "teleGas Electric TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tenantsImproveTextField   			= new PageElement(By.xpath("//input[@id='tenantsImprovementAndDecoration']"), "tenants Improve TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pedalCyclesTextField     			= new PageElement(By.xpath("//input[@id='pedalCycles']"), "pedal Cycles TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		electronicEquipTextField   			= new PageElement(By.xpath("//input[@id='electronicEquipment']"), "electronic Equip TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		allotherContentsTextField   		= new PageElement(By.xpath("//input[@id='allOtherContents']"), "allother Contents TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		professionalInstruTextField   		= new PageElement(By.xpath("//input[@id='professionalInstruments']"), "professional Instru TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clothPersEffectsTextField   		= new PageElement(By.xpath("//input[@id='clothingandPersonalEffects']"), "cloth PersEffects TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tempRemovalTextField       			= new PageElement(By.xpath("//input[@id='temporaryRemovalOfDocuments']"), "temp Removal TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costRemovalTextField    			= new PageElement(By.xpath("//input[@id='costRemovalOfDebris']"), "cost Removal TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofResidenceDropdown         	= new PageElement(By.name("typeOfResidence"), "Type Of Residence", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		costofthehouseflat              	= new PageElement(By.name("houseflatCost"), "Houseflat Cost", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costoffurnitureFittingsFixtures 	= new PageElement(By.name("FFFcost"), "cost of furniture Fittings Fixtures", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		propertyDetails                 	= new PageElement(By.xpath("//span[contains(text(),'Property Details')]"), "Property Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		previousPolicyDetails				= new PageElement(By.xpath("//span[contains(text(),'Previous Policy Details')]"), "Previous Policy Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNo					= new PageElement(By.xpath("//input[@name='previousPolicyNumber']"), "Previous PolicyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NameOfPreviousInsurer				= new PageElement(By.xpath("//select[@name='previousInsurerName']"), "Name Of Previous Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		addressOfPreviousInsurer			= new PageElement(By.xpath("//textarea[@name='previousPolicyAddress']"), "Address Of Previous Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		oneYearEnhancementRadio					= new PageElement(By.xpath("//label[@for='coverage1st year OD with Enhanced Cover+5 years TP']"), "coverage1 Year Package + 5 Years Liability", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		oneYearPackageRadio						= new PageElement(By.xpath("//label[@for='coverage1 Year Enhancement + 4 Years Liability']"), "coverage1 Year Enhancement + 4 Years Liability", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fiveYearsLiabilityRadio					= new PageElement(By.xpath("//label[@for='coverage5 years OD with Enhanced cover+5 years TP']"), "coverage5 years OD with Enhanced cover+5 years TP", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fiveYearsPackageRadio					= new PageElement(By.xpath("//label[@for='coverage5 Years Package']"), "coverage5 Years Package", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fiveYearsEnhancementRadio				= new PageElement(By.xpath("//label[@for='coverage5 Years Enhancement']"), "coverage5 Years Package", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillBasicInformation(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")){
			String BasicInformation;
			BasicInformation = detailedQuoteEntity.getStringValueForField("basicInformation");
			if ((BasicInformation!=null)&&(!BasicInformation.isEmpty())){
				click(basicInformation);				
			}			
			String SumInsured;
			SumInsured = detailedQuoteEntity.getStringValueForField("TestPortalSumInsured");
			if ((SumInsured!=null)&&(!SumInsured.isEmpty())){
				selectValueFromList(sumInsured,detailedQuoteEntity.getStringValueForField("TestPortalSumInsured"));
			}
			String CityofRecidence;
			CityofRecidence = detailedQuoteEntity.getStringValueForField("cityofRecidence");
			if ((CityofRecidence!=null)&&(!CityofRecidence.isEmpty())) {
				selectValueFromList(cityofRecidence,detailedQuoteEntity.getStringValueForField("cityofRecidence"));
			}
			String floaterRadioBTN;
			floaterRadioBTN = detailedQuoteEntity.getStringValueForField("FloaterRadioBTN");
			if ((floaterRadioBTN!=null)&&(!floaterRadioBTN.isEmpty())) {
				click(floaterRadioButton);
			}
			String individualRadioBTN;
			individualRadioBTN = detailedQuoteEntity.getStringValueForField("IndividualRadioBTN");
			if ((individualRadioBTN!=null)&&(!individualRadioBTN.isEmpty())) {
				click(individualRadioButton);
			}
			String planDropdown;
			planDropdown = detailedQuoteEntity.getStringValueForField("PlanDropdown");
			if ((planDropdown!=null)&&(!planDropdown.isEmpty())) {
				click(plandropdown);
			}
		}
	}
	public void fillBasicDetails(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){
			String basicdetails = detailedQuoteEntity.getStringValueForField("BasicDetails");
			if ((basicdetails!=null)&&(!basicdetails.isEmpty())){
				click(basicDetails);	
			}
			String coverageRequiredfor = detailedQuoteEntity.getStringValueForField("CoverageRequiredfor");
			if ((coverageRequiredfor!=null)&&(!coverageRequiredfor.isEmpty())){
				selectValueFromList(coveragerequiredfor,detailedQuoteEntity.getStringValueForField("CoverageRequiredfor"));
			}

			String grossMonthlyincomeoftheProposer = detailedQuoteEntity.getStringValueForField("GrossMonthlyincomePropo");
			if ((grossMonthlyincomeoftheProposer!=null)&&(!grossMonthlyincomeoftheProposer.isEmpty())){
				clearAndSendKeys(grossmonthlyincomeoftheProposer,detailedQuoteEntity.getStringValueForField("GrossMonthlyincomePropo"));
			}
			String proposeroccupation = detailedQuoteEntity.getStringValueForField("ProposerOccupation");
			if ((proposeroccupation!=null)&&(!proposeroccupation.isEmpty())){
				selectValueFromList(proposerOccupation,detailedQuoteEntity.getStringValueForField("ProposerOccupation"));
			}
		}
	}	
	public void fillSumInsuredInformation(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){

			String sumInsuredinformation = detailedQuoteEntity.getStringValueForField("SumInsuredInformation");
			if ((sumInsuredinformation!=null)&&(!sumInsuredinformation.isEmpty())){
				click(sumInsuredInformation);
			}
			String selfProposerDOb = detailedQuoteEntity.getStringValueForField("ProposerDOB");
			if ((selfProposerDOb!=null)&&(!selfProposerDOb.isEmpty())){
				clearAndSendKeys(selfProposerDOB,detailedQuoteEntity.getStringValueForField("ProposerDOB"));
			}
			String memberSuminsured = detailedQuoteEntity.getStringValueForField("MemberSumInsured");
			if ((memberSuminsured!=null)&&(!memberSuminsured.isEmpty())){
				clearAndSendKeys(memberSumInsured,detailedQuoteEntity.getStringValueForField("MemberSumInsured"));
			}
			//Raasta Aapati Kavach Policy
			if((detailedQuoteEntity.getStringValueForField("SumInsuredInformationTab")!=null)&&(!detailedQuoteEntity.getStringValueForField("SumInsuredInformationTab").isEmpty())){
				//click(sumInsuredInfoTab);				

				if((detailedQuoteEntity.getStringValueForField("AccidentincourseYES")!=null)&&(!detailedQuoteEntity.getStringValueForField("AccidentincourseYES").isEmpty())){
					click(accidentincourseYES);				
				}
				if((detailedQuoteEntity.getStringValueForField("AccidentincourseNO")!=null)&&(!detailedQuoteEntity.getStringValueForField("AccidentincourseNO").isEmpty())){
					click(accidentincourseNo);				
				}
				if((detailedQuoteEntity.getStringValueForField("HospitalExpOtherAccidentYES")!=null)&&(!detailedQuoteEntity.getStringValueForField("HospitalExpOtherAccidentYES").isEmpty())){
					click(hospitalExpOtherAccidentYES);				
				}
				if((detailedQuoteEntity.getStringValueForField("HospitalExpOtherAccidentNO")!=null)&&(!detailedQuoteEntity.getStringValueForField("HospitalExpOtherAccidentNO").isEmpty())){
					click(hospitalExpOtherAccidentNO);				
				}
				if((detailedQuoteEntity.getStringValueForField("FamilyMemPhysicalDefectsYES")!=null)&&(!detailedQuoteEntity.getStringValueForField("FamilyMemPhysicalDefectsYES").isEmpty())){
					click(familyMemPhysicalDefectsYES);				
				}
				if((detailedQuoteEntity.getStringValueForField("FamilyMemPhysicalDefectsNO")!=null)&&(!detailedQuoteEntity.getStringValueForField("FamilyMemPhysicalDefectsNO").isEmpty())){
					click(familyMemPhysicalDefectsNO);				
				}
				if((detailedQuoteEntity.getStringValueForField("AddFamilyMemberYES")!=null)&&(!detailedQuoteEntity.getStringValueForField("AddFamilyMemberYES").isEmpty())){
					click(addFamilyMemberYES);				
				}
				if((detailedQuoteEntity.getStringValueForField("AddFamilyMemberNO")!=null)&&(!detailedQuoteEntity.getStringValueForField("AddFamilyMemberNO").isEmpty())){
					click(addFamilyMemberNO);				
				}
				//Sum insured detail of proposal 
				if((detailedQuoteEntity.getStringValueForField("SelfDOB")!=null)&&(!detailedQuoteEntity.getStringValueForField("SelfDOB").isEmpty())){
					clearAndSendKeys(selfDOB,detailedQuoteEntity.getStringValueForField("SelfDOB"));					
				}
				if ((detailedQuoteEntity.getStringValueForField("SumInsuredForPerAccDropDown")!=null)&&(!detailedQuoteEntity.getStringValueForField("SumInsuredForPerAccDropDown").isEmpty())){
					selectValueFromList(sumInsuredForPerAccDropDown,detailedQuoteEntity.getStringValueForField("SumInsuredForPerAccDropDown"));
				}
				if ((detailedQuoteEntity.getStringValueForField("SumInshospitalExpRoadAccDropDown")!=null)&&(!detailedQuoteEntity.getStringValueForField("SumInshospitalExpRoadAccDropDown").isEmpty())){
					selectValueFromList(sumInshospitalExpRoadAccDropDown,detailedQuoteEntity.getStringValueForField("SumInshospitalExpRoadAccDropDown"));
				}
			}
		}
	}

	//MISCELLANEOUS Griha Suvidha
	public void fillStandardCovers(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert) throws InterruptedException{
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){
			String StandardCovers;
			StandardCovers = detailedQuoteEntity.getStringValueForField("StandardCoversTab");
			if ((StandardCovers!=null)&&(!StandardCovers.isEmpty())){
				click(standardCovers);				
			}			
			String StandardSumInsured;
			StandardSumInsured = detailedQuoteEntity.getStringValueForField("StandardSumInsuredTab");
			if ((StandardSumInsured!=null)&&(!StandardSumInsured.isEmpty())){
				selectValueFromList(standardsumInsured,detailedQuoteEntity.getStringValueForField("StandardSumInsuredTab"));
			}
			//Harsha -House holder 

			String sumInsOfBuilding;
			sumInsOfBuilding = detailedQuoteEntity.getStringValueForField("sumInsuredOfBuilding");
			if ((sumInsOfBuilding!=null)&&(!sumInsOfBuilding.isEmpty())){
				clearAndSendKeys(sumInsuredOfBuilding,detailedQuoteEntity.getStringValueForField("sumInsuredOfBuilding"));
			}
			String selectDweContent1;
			selectDweContent1 = detailedQuoteEntity.getStringValueForField("SelectDwellingContent1");
			if ((selectDweContent1!=null)&&(!selectDweContent1.isEmpty())){
				selectValueFromList(selectDwellingContent1,detailedQuoteEntity.getStringValueForField("SelectDwellingContent1"));
			}
			String DwellContentdescrip1;
			DwellContentdescrip1 = detailedQuoteEntity.getStringValueForField("DwellingContentdescription1");
			if ((DwellContentdescrip1!=null)&&(!DwellContentdescrip1.isEmpty())){
				clearAndSendKeys(dwellingContentdescription1,detailedQuoteEntity.getStringValueForField("DwellingContentdescription1"));
			}
			String DwellContentsumIns1;
			DwellContentsumIns1 = detailedQuoteEntity.getStringValueForField("DwellingContentsumInsured1");
			if ((DwellContentsumIns1!=null)&&(!DwellContentsumIns1.isEmpty())){
				clearAndSendKeys(dwellingContentsumInsured1,detailedQuoteEntity.getStringValueForField("DwellingContentsumInsured1"));
			}
			String JewelleryandValuables;
			JewelleryandValuables = detailedQuoteEntity.getStringValueForField("JewelleryandValuablesTab");
			if ((JewelleryandValuables!=null)&&(!JewelleryandValuables.isEmpty())){
				click(jewelleryandValuables);				
			}			
			String BroadjewelleryandValuablesTestField;
			BroadjewelleryandValuablesTestField = detailedQuoteEntity.getStringValueForField("BroadjewelleryandValuablesTestFieldTab");
			if ((BroadjewelleryandValuablesTestField!=null)&&(!BroadjewelleryandValuablesTestField.isEmpty())){
				clearAndSendKeys(broadjewelleryandValuablesTestField,detailedQuoteEntity.getStringValueForField("BroadjewelleryandValuablesTestFieldTab"));
			}

			String WeightforjewelleryTestField;
			WeightforjewelleryTestField = detailedQuoteEntity.getStringValueForField("WeightforjewelleryTestFieldTab");
			if ((WeightforjewelleryTestField!=null)&&(!WeightforjewelleryTestField.isEmpty())){
				clearAndSendKeys(weightforjewelleryTestField,detailedQuoteEntity.getStringValueForField("WeightforjewelleryTestFieldTab"));
			}

			String ValueTextFiled;
			ValueTextFiled = detailedQuoteEntity.getStringValueForField("ValueTextFiledTab");
			if ((ValueTextFiled!=null)&&(!ValueTextFiled.isEmpty())){
				clearAndSendKeys(valueTextFiled,detailedQuoteEntity.getStringValueForField("ValueTextFiledTab"));
			}
			String DomesticApplinces;
			DomesticApplinces = detailedQuoteEntity.getStringValueForField("DomesticApplincesTab");
			if ((DomesticApplinces!=null)&&(!DomesticApplinces.isEmpty())){
				click(domesticApplinces);				
			}
			String MakeTextFiled;
			MakeTextFiled = detailedQuoteEntity.getStringValueForField("MakeTextFiledTab");
			if ((MakeTextFiled!=null)&&(!MakeTextFiled.isEmpty())){
				clearAndSendKeys(makeTextFiled,detailedQuoteEntity.getStringValueForField("MakeTextFiledTab"));
			}
			String ModelTextFiled;
			ModelTextFiled = detailedQuoteEntity.getStringValueForField("ModelTextFiledTab");
			if ((ModelTextFiled!=null)&&(!ModelTextFiled.isEmpty())){
				clearAndSendKeys(modelTextFiled,detailedQuoteEntity.getStringValueForField("ModelTextFiledTab"));
			}
			String YearTextFiled;
			YearTextFiled = detailedQuoteEntity.getStringValueForField("YearTextFiledTab");
			if ((YearTextFiled!=null)&&(!YearTextFiled.isEmpty())){
				clearAndSendKeys(yearTextFiled,detailedQuoteEntity.getStringValueForField("YearTextFiledTab"));
			}
			String TelevisionDesktop;
			TelevisionDesktop = detailedQuoteEntity.getStringValueForField("TelevisionDesktopTab");
			if ((TelevisionDesktop!=null)&&(!TelevisionDesktop.isEmpty())){
				click(televisionDesktop);				
			}
			String MakeTVTextFiled;
			MakeTVTextFiled = detailedQuoteEntity.getStringValueForField("MakeTVTextFiledTab");
			if ((MakeTVTextFiled!=null)&&(!MakeTVTextFiled.isEmpty())){
				clearAndSendKeys(makeTVTextFiled,detailedQuoteEntity.getStringValueForField("MakeTVTextFiledTab"));
			}
			String ModelTVTextFiled;
			ModelTVTextFiled = detailedQuoteEntity.getStringValueForField("ModelTVTextFiledTab");
			if ((ModelTVTextFiled!=null)&&(!ModelTVTextFiled.isEmpty())){
				clearAndSendKeys(modelTVTextFiled,detailedQuoteEntity.getStringValueForField("ModelTVTextFiledTab"));
			}
			String YearTVTextFiled;
			YearTVTextFiled = detailedQuoteEntity.getStringValueForField("YearTVTextFiledTab");
			if ((YearTVTextFiled!=null)&&(!YearTVTextFiled.isEmpty())){
				clearAndSendKeys(yearTVTextFiled,detailedQuoteEntity.getStringValueForField("YearTVTextFiledTab"));
			}

			String YesFireAndAlliedRadiobtn;
			YesFireAndAlliedRadiobtn = detailedQuoteEntity.getStringValueForField("YesfireAndAlliedRadio");
			if ((YesFireAndAlliedRadiobtn!=null)&&(!YesFireAndAlliedRadiobtn.isEmpty())){
				click(yesfireAndAlliedRadio);				
			}
			String NoFireAndAlliedRadiobtn;
			NoFireAndAlliedRadiobtn = detailedQuoteEntity.getStringValueForField("NofireAndAlliedRadioTab");
			if ((NoFireAndAlliedRadiobtn!=null)&&(!NoFireAndAlliedRadiobtn.isEmpty())){
				click(nofireAndAlliedRadio);				
			}
			//misllaneus officeProtection
			String SumInsuredBulidingTextField;
			SumInsuredBulidingTextField = detailedQuoteEntity.getStringValueForField("SumInsuredBulidingTextField");
			if ((SumInsuredBulidingTextField!=null)&&(!SumInsuredBulidingTextField.isEmpty())){
				clearAndSendKeys(sumInsuredBulidingTextField,detailedQuoteEntity.getStringValueForField("SumInsuredBulidingTextField"));
			}
			if ((detailedQuoteEntity.getStringValueForField("FurnitureSumInsured")!=null)&&(!detailedQuoteEntity.getStringValueForField("FurnitureSumInsured").isEmpty())){
				clearAndSendKeys(furnitureSumInsuredTxtBox,detailedQuoteEntity.getStringValueForField("FurnitureSumInsured"));
			}
			if ((detailedQuoteEntity.getStringValueForField("GoodsSumInsured")!=null)&&(!detailedQuoteEntity.getStringValueForField("GoodsSumInsured").isEmpty())){
				clearAndSendKeys(goodsSumInsuredTxtBox,detailedQuoteEntity.getStringValueForField("GoodsSumInsured"));
			}

			String ProvisionsForBuildingTextField = detailedQuoteEntity.getStringValueForField("ProvisionsForBuildingTextField");
			if ((ProvisionsForBuildingTextField!=null)&&(!ProvisionsForBuildingTextField.isEmpty())){
				clearAndSendKeys(provisionsForBuildingTextField,detailedQuoteEntity.getStringValueForField("ProvisionsForBuildingTextField"));
			}

			String BusinessFurnitureCheckBox;
			BusinessFurnitureCheckBox = detailedQuoteEntity.getStringValueForField("BusinessFurnitureCheckBox");
			if ((BusinessFurnitureCheckBox!=null)&&(!BusinessFurnitureCheckBox.isEmpty())){
				click(businessFurnitureCheckBox);
				String BusinessFurnitureTextField;
				BusinessFurnitureTextField = detailedQuoteEntity.getStringValueForField("BusinessFurnitureTextField");
				if ((BusinessFurnitureTextField!=null)&&(!BusinessFurnitureTextField.isEmpty())){
					clearAndSendKeys(businessFurnitureTextField,detailedQuoteEntity.getStringValueForField("BusinessFurnitureTextField"));
				}
				String ClothPersEffectsCheckBox;
				ClothPersEffectsCheckBox = detailedQuoteEntity.getStringValueForField("ClothPersEffectsCheckBox");
				if ((ClothPersEffectsCheckBox!=null)&&(!ClothPersEffectsCheckBox.isEmpty())){
					Thread.sleep(3000);
					click(clothPersEffectsCheckBox);
					String ClothPersEffectsTextField;
					ClothPersEffectsTextField = detailedQuoteEntity.getStringValueForField("ClothPersEffectsTextField");
					if ((ClothPersEffectsTextField!=null)&&(!ClothPersEffectsTextField.isEmpty())){
						clearAndSendKeys(clothPersEffectsTextField,detailedQuoteEntity.getStringValueForField("ClothPersEffectsTextField"));
					}
				}
			}

			String DocumentsOffCheckBox;
			DocumentsOffCheckBox = detailedQuoteEntity.getStringValueForField("DocumentsOffCheckBox");
			if ((DocumentsOffCheckBox!=null)&&(!DocumentsOffCheckBox.isEmpty())){
				click(documentsOffCheckBox);
			}

			String TeleGasElectricCheckBox;
			TeleGasElectricCheckBox = detailedQuoteEntity.getStringValueForField("TeleGasElectricCheckBox");
			if ((TeleGasElectricCheckBox!=null)&&(!TeleGasElectricCheckBox.isEmpty())){
				click(teleGasElectricCheckBox);
			}

			String TenantsImproveCheckBox;
			TenantsImproveCheckBox = detailedQuoteEntity.getStringValueForField("TenantsImproveCheckBox");
			if ((TenantsImproveCheckBox!=null)&&(!TenantsImproveCheckBox.isEmpty())){
				click(tenantsImproveCheckBox);
			}

			String PedalCyclesCheckBox;
			PedalCyclesCheckBox = detailedQuoteEntity.getStringValueForField("PedalCyclesCheckBox");
			if ((PedalCyclesCheckBox!=null)&&(!PedalCyclesCheckBox.isEmpty())){
				click(pedalCyclesCheckBox);

			}

			String ElectronicEquipCheckBox;
			ElectronicEquipCheckBox = detailedQuoteEntity.getStringValueForField("ElectronicEquipCheckBox");
			if ((ElectronicEquipCheckBox!=null)&&(!PedalCyclesCheckBox.isEmpty())){
				click(electronicEquipCheckBox);
			}

			String AllotherContentsCheckBox;
			AllotherContentsCheckBox = detailedQuoteEntity.getStringValueForField("AllotherContentsCheckBox");
			if ((AllotherContentsCheckBox!=null)&&(!AllotherContentsCheckBox.isEmpty())){
				click(allotherContentsCheckBox);
			}

			String ProfessionalInstruCheckBox;
			ProfessionalInstruCheckBox = detailedQuoteEntity.getStringValueForField("ProfessionalInstruCheckBox");
			if ((ProfessionalInstruCheckBox!=null)&&(!ProfessionalInstruCheckBox.isEmpty())){
				click(professionalInstruCheckBox);
			}

			String TempRemovalCheckBox;
			TempRemovalCheckBox = detailedQuoteEntity.getStringValueForField("TempRemovalCheckBox");
			if ((TempRemovalCheckBox!=null)&&(!TempRemovalCheckBox.isEmpty())){
				click(tempRemovalCheckBox);
			}
			String CostRemovalCheckBox;
			CostRemovalCheckBox = detailedQuoteEntity.getStringValueForField("CostRemovalCheckBox");
			if ((CostRemovalCheckBox!=null)&&(!CostRemovalCheckBox.isEmpty())){
				click(costRemovalCheckBox);
			}
			String LimitburglaryTextField;
			LimitburglaryTextField = detailedQuoteEntity.getStringValueForField("LimitburglaryTextField");
			if ((LimitburglaryTextField!=null)&&(!LimitburglaryTextField.isEmpty())){
				clearAndSendKeys(limitburglaryTextField,detailedQuoteEntity.getStringValueForField("LimitburglaryTextField"));
			}

			String DocumentsOffTextField;
			DocumentsOffTextField = detailedQuoteEntity.getStringValueForField("DocumentsOffTextField");
			if ((DocumentsOffTextField!=null)&&(!DocumentsOffTextField.isEmpty())){
				clearAndSendKeys(documentsOffTextField,detailedQuoteEntity.getStringValueForField("DocumentsOffTextField"));
			}

			String TeleGasElectricTextField;
			TeleGasElectricTextField = detailedQuoteEntity.getStringValueForField("TeleGasElectricTextField");
			if ((TeleGasElectricTextField!=null)&&(!TeleGasElectricTextField.isEmpty())){
				clearAndSendKeys(teleGasElectricTextField,detailedQuoteEntity.getStringValueForField("TeleGasElectricTextField"));
			}

			String TenantsImproveTextField;
			TenantsImproveTextField = detailedQuoteEntity.getStringValueForField("TenantsImproveTextField");
			if ((TenantsImproveTextField!=null)&&(!TenantsImproveTextField.isEmpty())){
				clearAndSendKeys(tenantsImproveTextField,detailedQuoteEntity.getStringValueForField("TenantsImproveTextField"));
			}

			String PedalCyclesTextField;
			PedalCyclesTextField = detailedQuoteEntity.getStringValueForField("PedalCyclesTextField");
			if ((PedalCyclesTextField!=null)&&(!PedalCyclesTextField.isEmpty())){
				clearAndSendKeys(pedalCyclesTextField,detailedQuoteEntity.getStringValueForField("PedalCyclesTextField"));
			}

			String ElectronicEquipTextField;
			ElectronicEquipTextField = detailedQuoteEntity.getStringValueForField("ElectronicEquipTextField");
			if ((ElectronicEquipTextField!=null)&&(!ElectronicEquipTextField.isEmpty())){
				clearAndSendKeys(electronicEquipTextField,detailedQuoteEntity.getStringValueForField("ElectronicEquipTextField"));
			}

			String AllotherContentsTextField;
			AllotherContentsTextField = detailedQuoteEntity.getStringValueForField("AllotherContentsTextField");
			if ((AllotherContentsTextField!=null)&&(!AllotherContentsTextField.isEmpty())){
				clearAndSendKeys(allotherContentsTextField,detailedQuoteEntity.getStringValueForField("AllotherContentsTextField"));
			}

			String ProfessionalInstruTextField;
			ProfessionalInstruTextField = detailedQuoteEntity.getStringValueForField("ProfessionalInstruTextField");
			if ((ProfessionalInstruTextField!=null)&&(!ProfessionalInstruTextField.isEmpty())){
				clearAndSendKeys(professionalInstruTextField,detailedQuoteEntity.getStringValueForField("ProfessionalInstruTextField"));
			}

			String TempRemovalTextField;
			TempRemovalTextField = detailedQuoteEntity.getStringValueForField("TempRemovalTextField");
			if ((TempRemovalTextField!=null)&&(!TempRemovalTextField.isEmpty())){
				clearAndSendKeys(tempRemovalTextField,detailedQuoteEntity.getStringValueForField("TempRemovalTextField"));
			}

			String CostRemovalTextField;
			CostRemovalTextField = detailedQuoteEntity.getStringValueForField("CostRemovalTextField");
			if ((CostRemovalTextField!=null)&&(!CostRemovalTextField.isEmpty())){
				clearAndSendKeys(costRemovalTextField,detailedQuoteEntity.getStringValueForField("CostRemovalTextField"));
			}
		}
	}

	public void fillAdditionalCovers(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){
			String AdditionalCovers;
			AdditionalCovers = detailedQuoteEntity.getStringValueForField("AdditionalCoversTab");
			if ((AdditionalCovers!=null)&&(!AdditionalCovers.isEmpty())){
				click(additionalCoversTab);	
			}
			// if the  Domestic Appliances check box clicked
			String DomesticAppliances;
			DomesticAppliances = detailedQuoteEntity.getStringValueForField("DomesticApplianceschkbox");
			if ((DomesticAppliances!=null)&&(!DomesticAppliances.isEmpty())){
				click(domesticApplianceschkbox);					
				String domesticAppliancesSection5;
				domesticAppliancesSection5 = detailedQuoteEntity.getStringValueForField("DomesticAppliancesSectionTab");
				if ((domesticAppliancesSection5!=null)&&(!domesticAppliancesSection5.isEmpty())){
					click(domesticAppliancesSectionTab);	
				}						
				String SelectAppliances;
				SelectAppliances= detailedQuoteEntity.getStringValueForField("SelectAppliancesDropDown");
				if ((SelectAppliances!=null)&&(!SelectAppliances.isEmpty())){
					selectValueFromList(selectAppliancesDropDown,detailedQuoteEntity.getStringValueForField("SelectAppliancesDropDown"));				
				}
				String domesticCollapseDes;
				domesticCollapseDes= detailedQuoteEntity.getStringValueForField("DomesticCollapseDescription1");
				if ((domesticCollapseDes!=null)&&(!domesticCollapseDes.isEmpty())){
					clearAndSendKeys(domesticCollapseDescription1,detailedQuoteEntity.getStringValueForField("DomesticCollapseDescription1"));				
				}
				String enterSumInsofparticularselected1;
				enterSumInsofparticularselected1 = detailedQuoteEntity.getStringValueForField("EnterSumInsuredofeachparticularselected1");
				if ((enterSumInsofparticularselected1!=null)&&(!enterSumInsofparticularselected1.isEmpty())){
					clearAndSendKeys(enterSumInsuredofeachparticularselected1,detailedQuoteEntity.getStringValueForField("EnterSumInsuredofeachparticularselected1"));
				}
			}
			// if the  TV, DVD, CD,set check box  clicked
			String TVDVDCDset ;
			TVDVDCDset = detailedQuoteEntity.getStringValueForField("TVDVDCDSetChkbox");
			if ((TVDVDCDset!=null)&&(!TVDVDCDset.isEmpty())){
				click(TVDVDCDsetchkbox );	
				String tvDVDandCDsetSection6;
				tvDVDandCDsetSection6 = detailedQuoteEntity.getStringValueForField("TVDVDandCDsetSection6Tab");
				if ((tvDVDandCDsetSection6!=null)&&(!tvDVDandCDsetSection6.isEmpty())){
					click(tvDVDandCDsetSection6Tab);	
				}
				String tvDVDandCD;
				tvDVDandCD= detailedQuoteEntity.getStringValueForField("TVDVDandCDDropDown");
				if ((tvDVDandCD!=null)&&(!tvDVDandCD.isEmpty())){
					selectValueFromList(tvDVDandCDDropDown,detailedQuoteEntity.getStringValueForField("TVDVDandCDDropDown"));				
				}

				String TVDVDCDsetDesc;
				TVDVDCDsetDesc= detailedQuoteEntity.getStringValueForField("TVDVDCDsetDesc1");
				if ((TVDVDCDsetDesc!=null)&&(!TVDVDCDsetDesc.isEmpty())){
					clearAndSendKeys(tvDVDCDsetDesc1,detailedQuoteEntity.getStringValueForField("TVDVDCDsetDesc1"));				
				}

				if((detailedQuoteEntity.getStringValueForField("SumInsuredoftheAppliance1")!=null)&&(!detailedQuoteEntity.getStringValueForField("SumInsuredoftheAppliance1").isEmpty())){
					clearAndSendKeys(sumInsuredoftheAppliance1,detailedQuoteEntity.getStringValueForField("SumInsuredoftheAppliance1"));
				}
			}
			// if the  pedal Cycle check box  clicked
			String pedalCycle ;
			pedalCycle = detailedQuoteEntity.getStringValueForField("PedalCyclechkbox");
			if ((pedalCycle!=null)&&(!pedalCycle.isEmpty())){
				click(pedalCyclechkbox );	
				//Click on  pedal cycle  additional info tab				
				if ((detailedQuoteEntity.getStringValueForField("PedalCyclesSection")!=null)&&(!detailedQuoteEntity.getStringValueForField("PedalCyclesSection").isEmpty())){
					click(pedalCyclesSectiontab);	
				}
				if ((detailedQuoteEntity.getStringValueForField("PedalCycleDropdown")!=null)&&(!detailedQuoteEntity.getStringValueForField("PedalCycleDropdown").isEmpty())){
					selectValueFromList(pedalCycleDropdown,detailedQuoteEntity.getStringValueForField("PedalCycleDropdown"));				
				}
				if ((detailedQuoteEntity.getStringValueForField("PedalCycleDesc1")!=null)&&(!detailedQuoteEntity.getStringValueForField("PedalCycleDesc1").isEmpty())){
					clearAndSendKeys(pedalCycleDesc1,detailedQuoteEntity.getStringValueForField("PedalCycleDesc1"));				
				}
				if((detailedQuoteEntity.getStringValueForField("SumInsuredofpedalCycle")!=null)&&(!detailedQuoteEntity.getStringValueForField("SumInsuredofpedalCycle").isEmpty()))
				{
					clearAndSendKeys(sumInsuredofpedalCycle,detailedQuoteEntity.getStringValueForField("SumInsuredofpedalCycle"));
				}
				if((detailedQuoteEntity.getStringValueForField("ValueofAccessories")!=null)&&(!detailedQuoteEntity.getStringValueForField("ValueofAccessories").isEmpty()))
				{
					clearAndSendKeys(valueofAccessories,detailedQuoteEntity.getStringValueForField("ValueofAccessories"));
				}
			}
			// if the  workmen Compensation check box  clicked
			String workmenCompensation ;
			workmenCompensation = detailedQuoteEntity.getStringValueForField("WorkmenCompensationchkbox");
			if ((workmenCompensation!=null)&&(!workmenCompensation.isEmpty())){
				click(workmenCompensationchkbox );	
				if ((detailedQuoteEntity.getStringValueForField("WorkmenCompensationtab")!=null)&&(!detailedQuoteEntity.getStringValueForField("WorkmenCompensationtab").isEmpty())){
					click(workmenCompensationtab);	
				}
				if ((detailedQuoteEntity.getStringValueForField("NatureOfWorkDropdown")!=null)&&(!detailedQuoteEntity.getStringValueForField("NatureOfWorkDropdown").isEmpty())){
					selectValueFromList(natureOfWorkDropdown,detailedQuoteEntity.getStringValueForField("NatureOfWorkDropdown"));				
				}
				if ((detailedQuoteEntity.getStringValueForField("NumberofEmployees")!=null)&&(!detailedQuoteEntity.getStringValueForField("NumberofEmployees").isEmpty())){
					clearAndSendKeys(numberofEmployees,detailedQuoteEntity.getStringValueForField("NumberofEmployees"));				
				}
				if((detailedQuoteEntity.getStringValueForField("WagesofEmp")!=null)&&(!detailedQuoteEntity.getStringValueForField("WagesofEmp").isEmpty()))
				{
					clearAndSendKeys(wagesofEmp,detailedQuoteEntity.getStringValueForField("WagesofEmp"));
				}

			}
			//mis officer protection
			String TenantsLiabilityCheckBox;
			TenantsLiabilityCheckBox = detailedQuoteEntity.getStringValueForField("TenantsLiabilityCheckBox");
			if ((TenantsLiabilityCheckBox!=null)&&(!TenantsLiabilityCheckBox.isEmpty())){
				click(tenantsLiabilityCheckBox);
				String TenantsLiability;
				TenantsLiability = detailedQuoteEntity.getStringValueForField("TenantsLiability");
				if ((TenantsLiability!=null)&&(!TenantsLiability.isEmpty())){
					click(tenantsLiability);
					String SumInsuTenantLiabTextFeild;
					SumInsuTenantLiabTextFeild = detailedQuoteEntity.getStringValueForField("SumInsuTenantLiabTextFeild");
					if ((SumInsuTenantLiabTextFeild!=null)&&(!SumInsuTenantLiabTextFeild.isEmpty())){
						clearAndSendKeys(sumInsuTenantLiabTextFeild,detailedQuoteEntity.getStringValueForField("SumInsuTenantLiabTextFeild"));
					}
				}
			}

			String MoneyInsuranceCheckBox;
			MoneyInsuranceCheckBox = detailedQuoteEntity.getStringValueForField("MoneyInsuranceCheckBox");
			if ((MoneyInsuranceCheckBox!=null)&&(!MoneyInsuranceCheckBox.isEmpty())){
				click(moneyInsuranceCheckBox);
				String MoneyInsurance;
				MoneyInsurance = detailedQuoteEntity.getStringValueForField("MoneyInsurance");
				if ((MoneyInsurance!=null)&&(!MoneyInsurance.isEmpty())){
					click(moneyInsurance);
					String MoneyTransitpolicyTextFeild;
					MoneyTransitpolicyTextFeild = detailedQuoteEntity.getStringValueForField("MoneyTransitpolicyTextFeild");
					if ((MoneyTransitpolicyTextFeild!=null)&&(!MoneyTransitpolicyTextFeild.isEmpty())){
						clearAndSendKeys(moneyTransitpolicyTextFeild,detailedQuoteEntity.getStringValueForField("MoneyTransitpolicyTextFeild"));

						String PerlimitMITextFeild;
						PerlimitMITextFeild = detailedQuoteEntity.getStringValueForField("PerlimitMITextFeild");
						if ((PerlimitMITextFeild!=null)&&(!PerlimitMITextFeild.isEmpty())){
							clearAndSendKeys(perlimitMITextFeild,detailedQuoteEntity.getStringValueForField("PerlimitMITextFeild"));

							String MoneyhoursTextFeild;
							MoneyhoursTextFeild = detailedQuoteEntity.getStringValueForField("MoneyhoursTextFeild");
							if ((MoneyhoursTextFeild!=null)&&(!MoneyhoursTextFeild.isEmpty())){
								clearAndSendKeys(moneyhoursTextFeild,detailedQuoteEntity.getStringValueForField("MoneyhoursTextFeild"));
								String MoneyLockedSafehoursTextFeild;
								MoneyLockedSafehoursTextFeild = detailedQuoteEntity.getStringValueForField("MoneyLockedSafehoursTextFeild");
								if ((MoneyLockedSafehoursTextFeild!=null)&&(!MoneyLockedSafehoursTextFeild.isEmpty())){
									clearAndSendKeys(moneyLockedSafehoursTextFeild,detailedQuoteEntity.getStringValueForField("MoneyLockedSafehoursTextFeild"));
								}
							}
						}
					}
				}
			}
			String FixedGlassCheckBox;
			FixedGlassCheckBox = detailedQuoteEntity.getStringValueForField("FixedGlassCheckBox");
			if ((FixedGlassCheckBox!=null)&&(!FixedGlassCheckBox.isEmpty())){
				click(fixedGlassCheckBox);
				String FixedGlassSannitySetting;
				FixedGlassSannitySetting = detailedQuoteEntity.getStringValueForField("FixedGlassSannitySetting");
				if ((FixedGlassSannitySetting!=null)&&(!FixedGlassSannitySetting.isEmpty())){
					click(fixedGlassSannitySetting);
					String DescriGlassTextFeild;
					DescriGlassTextFeild = detailedQuoteEntity.getStringValueForField("DescriGlassTextFeild");
					if ((DescriGlassTextFeild!=null)&&(!DescriGlassTextFeild.isEmpty())){
						clearAndSendKeys(descriGlassTextFeild,detailedQuoteEntity.getStringValueForField("DescriGlassTextFeild"));
						String DimensionGlassTextFeild;
						DimensionGlassTextFeild = detailedQuoteEntity.getStringValueForField("DimensionGlassTextFeild");
						if ((DimensionGlassTextFeild!=null)&&(!DimensionGlassTextFeild.isEmpty())){
							clearAndSendKeys(dimensionGlassTextFeild,detailedQuoteEntity.getStringValueForField("DimensionGlassTextFeild"));
							String ValueOfGlassTextFeild ;
							ValueOfGlassTextFeild = detailedQuoteEntity.getStringValueForField("ValueOfGlassTextFeild");
							if ((ValueOfGlassTextFeild!=null)&&(!ValueOfGlassTextFeild.isEmpty())){
								clearAndSendKeys(valueOfGlassTextFeild,detailedQuoteEntity.getStringValueForField("ValueOfGlassTextFeild"));
								String ValueFittingsTextFeild ;
								ValueFittingsTextFeild = detailedQuoteEntity.getStringValueForField("ValueFittingsTextFeild");
								if ((ValueFittingsTextFeild!=null)&&(!ValueFittingsTextFeild.isEmpty())){
									clearAndSendKeys(valueFittingsTextFeild,detailedQuoteEntity.getStringValueForField("ValueFittingsTextFeild"));
									String ValueOfSignPlateTextFeild ;
									ValueOfSignPlateTextFeild = detailedQuoteEntity.getStringValueForField("ValueOfSignPlateTextFeild");
									if ((ValueOfSignPlateTextFeild!=null)&&(!ValueOfSignPlateTextFeild.isEmpty())){
										clearAndSendKeys(valueOfSignPlateTextFeild,detailedQuoteEntity.getStringValueForField("ValueOfSignPlateTextFeild"));
									}
								}
							}
						}
					}
				}
			}
			/*String MoneyTransitpolicyTextFeild;
			MoneyTransitpolicyTextFeild = detailedQuoteEntity.getStringValueForField("MoneyTransitpolicyTextFeild");
			if ((MoneyTransitpolicyTextFeild!=null)&&(!MoneyTransitpolicyTextFeild.isEmpty())){
				clearAndSendKeys(moneyTransitpolicyTextFeild,detailedQuoteEntity.getStringValueForField("MoneyTransitpolicyTextFeild"));
			}*/
			// money Insurance Section
			if ((detailedQuoteEntity.getStringValueForField("MoneyInsuSecChkbox")!=null)&&(!detailedQuoteEntity.getStringValueForField("MoneyInsuSecChkbox").isEmpty()))
			{
				click(moneyInsuranceSectionchkbox);	

				if ((detailedQuoteEntity.getStringValueForField("MoneyInsuranceSectiontab")!=null)&&(!detailedQuoteEntity.getStringValueForField("MoneyInsuranceSectiontab").isEmpty())){
					click(moneyInsuranceSectiontab);	
				}
				if ((detailedQuoteEntity.getStringValueForField("MoneyInTransit")!=null)&&(!detailedQuoteEntity.getStringValueForField("MoneyInTransit").isEmpty())){
					clearAndSendKeys(moneyInTransit,detailedQuoteEntity.getStringValueForField("MoneyInTransit"));				
				}
				if ((detailedQuoteEntity.getStringValueForField("MoneyInCounter")!=null)&&(!detailedQuoteEntity.getStringValueForField("MoneyInCounter").isEmpty())){
					clearAndSendKeys(moneyInCounter,detailedQuoteEntity.getStringValueForField("MoneyInCounter"));				
				}
				if((detailedQuoteEntity.getStringValueForField("MoneyInSafe")!=null)&&(!detailedQuoteEntity.getStringValueForField("MoneyInSafe").isEmpty()))
				{
					clearAndSendKeys(moneyInSafe,detailedQuoteEntity.getStringValueForField("MoneyInSafe"));
				}
			}
		}
	}

	public void fillMemberInformation(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert) {

		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") 
				&& (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")
				||detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")
				||(detailedQuoteEntity.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover")))){
			String MemberInformation;
			MemberInformation = detailedQuoteEntity.getStringValueForField("memberInfromation");
			if ((MemberInformation!=null)&&(!MemberInformation.isEmpty())){
				click(memberInfromation);
			}	
			String DateOfBirthForCPA;
			DateOfBirthForCPA = detailedQuoteEntity.getStringValueForField("DateOfBirthForCPA");
			if ((DateOfBirthForCPA!=null)&&(!DateOfBirthForCPA.isEmpty())){
				clearAndSendKeys(dateOfBirthForCPA, DateOfBirthForCPA);
			}
			String Proposer;
			Proposer = detailedQuoteEntity.getStringValueForField("proposer");
			if ((Proposer!=null)&&(!Proposer.isEmpty())){
				clearAndSendKeys(proposer, detailedQuoteEntity.getStringValueForField("proposer"));		
			}
			String AddProposerBtn;
			AddProposerBtn = detailedQuoteEntity.getStringValueForField("addProposerBtn");
			if ((AddProposerBtn!=null)&&(!AddProposerBtn.isEmpty())){
				click(addProposerBtn);
			}	
			String AddSpouseBtn;
			AddSpouseBtn = detailedQuoteEntity.getStringValueForField("addSpouseBtn");
			if ((AddSpouseBtn!=null)&&(!AddSpouseBtn.isEmpty())){
				click(addSpouseBtn);				
			}
			String AddDaughter1Btn;
			AddDaughter1Btn = detailedQuoteEntity.getStringValueForField("addDaughter1Btn");
			if ((AddDaughter1Btn!=null)&&(!AddDaughter1Btn.isEmpty())){
				click(addDaughter1Btn);				
			}

			String Spouse;
			Spouse = detailedQuoteEntity.getStringValueForField("spouse");
			if ((Spouse!=null)&&(!Spouse.isEmpty())){
				clearAndSendKeys(spouse, detailedQuoteEntity.getStringValueForField("spouse"));		
			}
			String Daughter1;
			Daughter1 = detailedQuoteEntity.getStringValueForField("daughter1");
			if ((Daughter1!=null)&&(!Daughter1.isEmpty())){
				clearAndSendKeys(daughter1, detailedQuoteEntity.getStringValueForField("daughter1"));		
			}
			String AddChildBtn;
			AddChildBtn = detailedQuoteEntity.getStringValueForField("addChildBtn");
			if ((AddChildBtn!=null)&&(!AddChildBtn.isEmpty())){
				click(addchildBtn);	
				clearAndSendKeys(daughter1, detailedQuoteEntity.getStringValueForField("child1"));	
			}
			String DependentType;
			DependentType = detailedQuoteEntity.getStringValueForField("dependentType");
			if ((DependentType!=null)&&(!DependentType.isEmpty())) {
				selectValueFromList(dependentType,detailedQuoteEntity.getStringValueForField("dependentType"));
			}
			//Misc-Harshit
			String thresholdLimitvalue;
			thresholdLimitvalue = detailedQuoteEntity.getStringValueForField("ThresholdLimitValue");
			if ((thresholdLimitvalue!=null)&&(!thresholdLimitvalue.isEmpty())) {
				selectValueFromList(thresholdLimit,detailedQuoteEntity.getStringValueForField("ThresholdLimitValue"));
			}

			String thresholdSumInsured;
			thresholdSumInsured = detailedQuoteEntity.getStringValueForField("ThresholdSumInsured");
			if ((thresholdSumInsured!=null)&&(!thresholdSumInsured.isEmpty())) {
				selectValueFromList(sumInsured,detailedQuoteEntity.getStringValueForField("ThresholdSumInsured"));
			}
			String TestPortalSumInsured;
			TestPortalSumInsured = detailedQuoteEntity.getStringValueForField("TestPortalSumInsured");
			if ((TestPortalSumInsured!=null)&&(!TestPortalSumInsured.isEmpty())) {
				selectValueFromList(sumInsured,detailedQuoteEntity.getStringValueForField("TestPortalSumInsured"));
			}

			String agreeWithTheTermsCond;
			agreeWithTheTermsCond = detailedQuoteEntity.getStringValueForField("agreeWithTheTermsConditions");
			if ((agreeWithTheTermsCond!=null)&&(!agreeWithTheTermsCond.isEmpty())) {
				if(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")|| detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
					Boolean AgreeWithTheTermsConditions=true;					
					checkOrUncheck(agreeWithTheTermsConditions,AgreeWithTheTermsConditions);
				}
			}
		}
	}

	public void fillVehicledetails(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")
				&& (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))){
			String year;
			year = detailedQuoteEntity.getStringValueForField("Year");
			if ((year!=null)&&(!year.isEmpty())){
				selectValueFromList(yearDropdown,detailedQuoteEntity.getStringValueForField("Year"));				
			}
			String datefield;
			datefield = detailedQuoteEntity.getStringValueForField("Datefield");
			if ((datefield!=null)&&(!datefield.isEmpty())){
				clearAndEnterDate(dateTextField,RandomCodeGenerator.dateGenerator(datefield));
			}
			String make;
			make = detailedQuoteEntity.getStringValueForField("Make");
			if ((make!=null)&&(!make.isEmpty())){
				selectValueFromList(makeDropdown,detailedQuoteEntity.getStringValueForField("Make"));	
			}
			String model;
			model = detailedQuoteEntity.getStringValueForField("Model");
			if ((model!=null)&&(!model.isEmpty())){
				clearAndSendKeys(modelTextField, detailedQuoteEntity.getStringValueForField("Model"));
				driver.findElement(By.id("model")).sendKeys(Keys.RETURN);
			}
			String nearestCity;
			nearestCity = detailedQuoteEntity.getStringValueForField("NearestCity");
			if ((nearestCity!=null)&&(!nearestCity.isEmpty())){
				selectValueFromList(nearestCityDropDown,detailedQuoteEntity.getStringValueForField("NearestCity"));	
			}
			String vehicleZone;
			vehicleZone = detailedQuoteEntity.getStringValueForField("VehicleZone");
			if ((vehicleZone!=null)&&(!vehicleZone.isEmpty())){
				selectValueFromList(vehicleZoneDropDown,detailedQuoteEntity.getStringValueForField("VehicleZone"));	
			}
			String vIDV;
			vIDV = detailedQuoteEntity.getStringValueForField("InsuredDeclared");
			if ((vIDV!=null)&&(!vIDV.isEmpty()))
				clearAndSendKeys(vehicleIDV,detailedQuoteEntity.getStringValueForField("InsuredDeclared"));	
			}
			String previousPolicyExpDate;
			previousPolicyExpDate = detailedQuoteEntity.getStringValueForField("PreviousPolicyExpDate");
			if ((previousPolicyExpDate!=null)&&(!previousPolicyExpDate.isEmpty())){
				clearAndEnterDate(previousPolicyExpDateTextField,RandomCodeGenerator.dateGenerator(previousPolicyExpDate));
				detailedQuoteEntity.setStringValueForField("PolicyExpiryDate",fetchValueFromTextFields(PolicyEndDateLabel));
			}
		}
	
	
	public void fillPolicyPeriodForTwoWheeler(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")
				&& (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))){
			
			String policyPeriodT;
			policyPeriodT = detailedQuoteEntity.getStringValueForField("PolicyPeriodTab1");
			if ((policyPeriodT!=null)&&(!policyPeriodT.isEmpty())){
				click(policyPeriodTab1);	
			}
			
			if ((detailedQuoteEntity.getStringValueForField("PolicyDurationForTWDropDown")!=null)&&(!detailedQuoteEntity.getStringValueForField("PolicyDurationForTWDropDown").isEmpty())){
				selectValueFromList(policyDurationDropDown,detailedQuoteEntity.getStringValueForField("PolicyDurationForTWDropDown"));	
			}
			
		}
	}
	
	public void fillCoverageDetails(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert) {
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")))
			{
			String Str_coverageDetails;				
			Str_coverageDetails = detailedQuoteEntity.getStringValueForField("CoverageDetails");
			if ((Str_coverageDetails!=null)&&(!Str_coverageDetails.isEmpty())){
				click(coverageDetails);	
			}
			

			String coverageEnhancement;
			coverageEnhancement = detailedQuoteEntity.getStringValueForField("CoverageEnhancement");
			if ((coverageEnhancement!=null)&&(!coverageEnhancement.isEmpty())){
				click(coverageEnhancementRadio);	
			}
			String packageText;
			packageText = detailedQuoteEntity.getStringValueForField("PackageText");
			if ((packageText!=null)&&(!packageText.isEmpty())){
				click(packageTextRadio);	
			}
			String coverageLiability;
			coverageLiability = detailedQuoteEntity.getStringValueForField("coverageLiabilityRadio");
			if ((coverageLiability!=null)&&(!coverageLiability.isEmpty())){
				click(coverageLiabilityRadio);	
			}
			String noButton;
			noButton = detailedQuoteEntity.getStringValueForField("NoButton");
			if ((noButton!=null)&&(!noButton.isEmpty())){
				click(noButtonRadio);
			}
			String OneYrEnhancement;
			OneYrEnhancement = detailedQuoteEntity.getStringValueForField("OneYrEnhancementRdo");
			if ((OneYrEnhancement!=null)&&(!OneYrEnhancement.isEmpty())){
				click(oneYearEnhancementRadio);
			}
			String OneYrPackage;
			OneYrPackage = detailedQuoteEntity.getStringValueForField("OneYrPackageRdo");
			if ((OneYrPackage!=null)&&(!OneYrPackage.isEmpty())){
				click(oneYearPackageRadio);
			}
			String FiveYrLiability;
			FiveYrLiability = detailedQuoteEntity.getStringValueForField("FiveYrLiabilityRdo");
			if ((FiveYrLiability!=null)&&(!FiveYrLiability.isEmpty())){
				click(fiveYearsLiabilityRadio);
			}
			String FiveYrPackage;
			FiveYrPackage = detailedQuoteEntity.getStringValueForField("FiveYrPackageRdo");
			if ((FiveYrPackage!=null)&&(!FiveYrPackage.isEmpty())){
				click(fiveYearsPackageRadio);
			}
			
			String FiveYrEnhancement;
			FiveYrEnhancement = detailedQuoteEntity.getStringValueForField("FiveYrEnhancementRdo");
			if ((FiveYrEnhancement!=null)&&(!FiveYrEnhancement.isEmpty())){
				click(fiveYearsEnhancementRadio);
			}
		}
		
	}

	public void calculatePremium(DetailedQuoteEntity detailedQuoteEntity) throws InterruptedException {

		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")){
			String CalculatePremium;
			CalculatePremium = detailedQuoteEntity.getStringValueForField("calculatePremium");
			if ((CalculatePremium!=null)&&(!CalculatePremium.isEmpty())){
				click(calculatePremium);
				Thread.sleep(5000);
				waitForPageElement(QuoteNoLabel);
				detailedQuoteEntity.setStringValueForField("QuoteNo", fetchValueFromFields(QuoteNoLabel));
			}	
			//Raasta Aapatti Kavach Policy
			String okbtn;
			okbtn = detailedQuoteEntity.getStringValueForField("SummaryOKButton");
			if ((okbtn!=null)&&(!okbtn.isEmpty())){
				if(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
					waitForPageElement(okButton);						
					click(okButton);
				}
			}
		}
	}

	public void RecalculatePremium(DetailedQuoteEntity detailedQuoteEntity) {

		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")){
			String RecalculatePremium;
			RecalculatePremium = detailedQuoteEntity.getStringValueForField("recalculatePremiumTab");
			if ((RecalculatePremium!=null)&&(!RecalculatePremium.isEmpty())){
				click(recalculatePreminum);
				waitForPageElement(QuoteNoLabel);
				detailedQuoteEntity.setStringValueForField("QuoteNo", fetchValueFromFields(QuoteNoLabel));

			}	
		}
	}
	public void saveAndcontinue(DetailedQuoteEntity detailedQuoteEntity) {
		try {
			if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")) {

				String SaveAndContinue	 = detailedQuoteEntity.getStringValueForField("saveAndContinue");
				if ((SaveAndContinue!=null)&&(!SaveAndContinue.isEmpty())) {
					click(saveAndContinue);	}
			}
		}
		catch(Exception e) {
			System.out.println(e);}
		}
		public void okAlert(DetailedQuoteEntity detailedQuoteEntity) {
			
		try
		{
		if(detailedQuoteEntity.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover")) {
			click(okButtonCPA);
		} 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void saveAndcontinue1(DetailedQuoteEntity detailedQuoteEntity) {
		try {
			if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")) {

				String SaveAndContinue	 = detailedQuoteEntity.getStringValueForField("SaveAndContinue1");
				if ((SaveAndContinue!=null)&&(!SaveAndContinue.isEmpty())) {
					click1(saveAndContinue1);	
					Thread.sleep(4000);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void fillPolicyPeriod(DetailedQuoteEntity detailedQuoteEntity){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")
				&&(!detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")) 
				|| (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))
				||(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {

			       if(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
					||(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))) {
					String BuyInsuranceForANewVehicle;
					BuyInsuranceForANewVehicle = detailedQuoteEntity.getStringValueForField("BuyInsuranceForANewVehicle");
					if ((BuyInsuranceForANewVehicle!=null)&&(!BuyInsuranceForANewVehicle.isEmpty())){
						click(buyInsuranceForANewVehicle);				
					}
					String RenewExistingPolicyFromAnyInsurer;
					RenewExistingPolicyFromAnyInsurer = detailedQuoteEntity.getStringValueForField("RenewExistingPolicyFromAnyInsurer");
					if ((RenewExistingPolicyFromAnyInsurer!=null)&&(!RenewExistingPolicyFromAnyInsurer.isEmpty())){
						click(renewExistingPolicyFromAnyInsurer);				
					}	

					String policyPeriodT;
						
					policyPeriodT = detailedQuoteEntity.getStringValueForField("PolicyPeriodTab");
					if ((policyPeriodT!=null)&&(!policyPeriodT.isEmpty())) {
						click(policyPeriodTab);	
						}
						
								
					// Raasta Aapatti Kavach Policy
					if ((detailedQuoteEntity.getStringValueForField("PolicyDurationDropDown")!=null)&&(!detailedQuoteEntity.getStringValueForField("PolicyDurationDropDown").isEmpty())){
						selectValueFromList(policyDurationDropDown,detailedQuoteEntity.getStringValueForField("PolicyDurationDropDown"));	
						}
					
					if (!detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")&&detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
						//Policy period for standard fire 
						String policyRequiredforinYears;
						policyRequiredforinYears = detailedQuoteEntity.getStringValueForField("PolicyRequiredforinYears");
						if ((policyRequiredforinYears != null) && (!policyRequiredforinYears.isEmpty())) {
							selectValueFromList(policyRequiredforinYearsDropdown,detailedQuoteEntity.getStringValueForField("PolicyRequiredforinYears"));
						}
						if (!detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
							detailedQuoteEntity.setStringValueForField("PolicyStartDate",
									fetchValueFromTextFields(PolicyStartDateLabel));
						if (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
							PolicyEndDateLabel = new PageElement(By.name("policyExpiryDate"), "Policy End Date Label",
									false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					detailedQuoteEntity.setStringValueForField("PolicyExpiryDate",fetchValueFromTextFields(PolicyEndDateLabel));
						} else {
							detailedQuoteEntity.setStringValueForField("PolicyExpiryDate",
									fetchValueFromTextFields(PolicyEndDateLabel));
						} 
					}
				}
			}
	}
	
	public void fillpreviousPolicyDetails(DetailedQuoteEntity detailedQuoteEntity){
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") 
				&&(detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {
			String PreviousPolicyDetails;
			PreviousPolicyDetails = detailedQuoteEntity.getStringValueForField("PreviousPolicyDetails");
			if ((PreviousPolicyDetails!=null)&&(!PreviousPolicyDetails.isEmpty())){
			click(previousPolicyDetails);
			}
			String PreviousPolicyNo;
			PreviousPolicyNo = detailedQuoteEntity.getStringValueForField("previousPolicyNo");
			if ((PreviousPolicyNo!=null)&&(!PreviousPolicyNo.isEmpty())){
				clearAndSendKeys(previousPolicyNo,PreviousPolicyNo);
			}
			
			String nameOfPreviousInsurer;
			nameOfPreviousInsurer = detailedQuoteEntity.getStringValueForField("NameOfPreviousInsurer");
			if ((nameOfPreviousInsurer!=null)&&(!nameOfPreviousInsurer.isEmpty())){
				selectValueFromList(NameOfPreviousInsurer,nameOfPreviousInsurer);
			}
			String AddressOfPreviousInsurer;
			AddressOfPreviousInsurer = detailedQuoteEntity.getStringValueForField("addressOfPreviousInsurer");
			if ((AddressOfPreviousInsurer!=null)&&(!AddressOfPreviousInsurer.isEmpty())){
				clearAndSendKeys(addressOfPreviousInsurer,AddressOfPreviousInsurer);
			}
		}
	}
	public void personalDetails(DetailedQuoteEntity detailedQuoteEntity, CustomAssert customAssert) {
		try {
			if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")) {

				String PersonalDetails= detailedQuoteEntity.getStringValueForField("personalDetails");
				if ((PersonalDetails!=null)&&(!PersonalDetails.isEmpty())) {

					isElementEnabled(personalDetailsField);
				}
			}
		}
		catch(Exception e) {
		}
	}
	public void fillTravelDetails(DetailedQuoteEntity detailedQuoteEntity, CustomAssert customAssert) {
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && (detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))){
			String anywhereInTheWorldExcludingUSAandCanada;
			anywhereInTheWorldExcludingUSAandCanada = detailedQuoteEntity.getStringValueForField("AnywhereInTheWorldExcludingUSAandCanada");
			if ((anywhereInTheWorldExcludingUSAandCanada!=null)&&(!anywhereInTheWorldExcludingUSAandCanada.isEmpty())){
				click(anywhereInTheWorldExcludingUSAandcanada);	
			}
			String anywhereInTheWorldIncludingUSAandCanada;
			anywhereInTheWorldIncludingUSAandCanada = detailedQuoteEntity.getStringValueForField("AnywhereInTheWorldIncludingUSAandCanada");
			if ((anywhereInTheWorldIncludingUSAandCanada!=null)&&(!anywhereInTheWorldIncludingUSAandCanada.isEmpty())){
				click(anywhereInTheWorldIncludingUSAandcanada);	
			}
			String business;
			business = detailedQuoteEntity.getStringValueForField("Business");
			if ((business!=null)&&(!business.isEmpty())){
				click(businessT);	
			}
			String employment;
			employment = detailedQuoteEntity.getStringValueForField("Employment");
			if ((employment!=null)&&(!employment.isEmpty())){
				click(employmentRadioButton);
			}
			String studies;
			studies = detailedQuoteEntity.getStringValueForField("Studies");
			if ((studies!=null)&&(!studies.isEmpty())){
				click(studiesRadioButton);
			}
			String leavingIndiaOn;
			leavingIndiaOn = dateGenerator(detailedQuoteEntity.getStringValueForField("LeavingIndiaOn"));
			if ((leavingIndiaOn!=null)&&(!leavingIndiaOn.isEmpty())){
				clearAndSendKeys(leavingIndiaon, leavingIndiaOn);
			}
			String returningtoIndiaon;
			returningtoIndiaon = dateGenerator(detailedQuoteEntity.getStringValueForField("ReturningtoIndiaOn"));
			if ((returningtoIndiaon!=null)&&(!returningtoIndiaon.isEmpty())){
				clearAndSendKeys(returningtoIndiaOn, returningtoIndiaon);

			}
			String dateofBirth;
			dateofBirth = detailedQuoteEntity.getStringValueForField("DateofBirth");
			if ((dateofBirth!=null)&&(!dateofBirth.isEmpty())){
				clearAndSendKeys(dateOfBirth, detailedQuoteEntity.getStringValueForField("DateofBirth"));
			}
			String  b1;
			b1 = detailedQuoteEntity.getStringValueForField("B1");
			if ((b1!=null)&&(!b1.isEmpty())){
				click(bOne);
			}
			String b2;
			b2 = detailedQuoteEntity.getStringValueForField("B2");
			if ((b2!=null)&&(!b2.isEmpty())){
				click(bTwo);
			}
			//pravina

			String travelDuration;
			travelDuration = detailedQuoteEntity.getStringValueForField("TravelDuration");
			if ((travelDuration!=null)&&(!travelDuration.isEmpty())){
				selectValueFromList(travelDurationdropdown,detailedQuoteEntity.getStringValueForField("TravelDuration"));	
			}
			String planC;
			planC = detailedQuoteEntity.getStringValueForField("PlanC");
			if ((planC!=null)&&(!planC.isEmpty())){
				click(planCRadioButton);
			}
		}
	}

	public void fillPropertyDetails(DetailedQuoteEntity detailedQuoteEntity) {
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){
			if(detailedQuoteEntity.getAction().equalsIgnoreCase("add")){
				String Str_propertyDetai;
				Str_propertyDetai = detailedQuoteEntity.getStringValueForField("PropertyDetails");
				if ((Str_propertyDetai!=null)&&(!Str_propertyDetai.isEmpty())){
				click(propertyDetails);
				}
				String typeofResidence;
				typeofResidence = detailedQuoteEntity.getStringValueForField("TypeofResidence");
				if ((typeofResidence!=null)&&(!typeofResidence.isEmpty())){
					selectValueFromList(typeofResidenceDropdown,detailedQuoteEntity.getStringValueForField("TypeofResidence"));
				}
				String costOfTheHouseFlat;
				costOfTheHouseFlat = detailedQuoteEntity.getStringValueForField("CostOfTheHouseFlat");
				if ((costOfTheHouseFlat!=null)&&(!costOfTheHouseFlat.isEmpty())){
					clearAndSendKeys(costofthehouseflat, detailedQuoteEntity.getStringValueForField("CostOfTheHouseFlat"));
				}
				String costoffurniturefittingsfixtures;
				costoffurniturefittingsfixtures = detailedQuoteEntity.getStringValueForField("CostofFurnitureFittingsFixtures");
				if ((costoffurniturefittingsfixtures!=null)&&(!costoffurniturefittingsfixtures.isEmpty())){
					clearAndSendKeys(costoffurnitureFittingsFixtures, detailedQuoteEntity.getStringValueForField("CostofFurnitureFittingsFixtures"));
				}
			}
		}
	}
	private void fillagreeWithTheTermsConditions(DetailedQuoteEntity detailedQuoteEntity,CustomAssert customAssert) {
		if(detailedQuoteEntity.getAction().equalsIgnoreCase("add") && detailedQuoteEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")){
			if((detailedQuoteEntity.getStringValueForField("agreeWithTheTermsConditions")!=null)&&(!detailedQuoteEntity.getStringValueForField("agreeWithTheTermsConditions").isEmpty())){
				Boolean AgreeWithTheTermsConditions=true;					
				checkOrUncheck(agreeWithTheTermsConditions,AgreeWithTheTermsConditions);			
			}
		}
	}
	//Add on Enhancement details 07/06/2019	
	private void fillAddOnEnhancementDetails(DetailedQuoteEntity detailedQuoteEntityData) {		
		if(detailedQuoteEntityData.getAction().equalsIgnoreCase("add") 
				&&(detailedQuoteEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {
			String  OneYrEnhancementRd=detailedQuoteEntityData.getStringValueForField("OneYrEnhancementRdo");
			String FiveYrLiabilityRd=detailedQuoteEntityData.getStringValueForField("FiveYrLiabilityRdo");
			
			if((OneYrEnhancementRd!=null && !OneYrEnhancementRd.isEmpty())||(FiveYrLiabilityRd!=null && !FiveYrLiabilityRd.isEmpty())) {
			if((detailedQuoteEntityData.getStringValueForField("AddOnEnhancement")!=null)&&(!detailedQuoteEntityData.getStringValueForField("AddOnEnhancement").isEmpty()))
					{
				  click(AddOnEnhancement);
				    }
		      String Nlrd=	detailedQuoteEntityData.getStringValueForField("NilRdo");
		      String RtInv=	detailedQuoteEntityData.getStringValueForField("RtnToCover");
		      String ConsitmCvr=	detailedQuoteEntityData.getStringValueForField("ConsCover");
			  // if((Nlrd!=null && !Nlrd.isEmpty())||(RtInv!=null && !RtInv.isEmpty())||(ConsitmCvr!=null && !ConsitmCvr.isEmpty())) {

				  // click(rtnToInvCvr);
				   
				   if((Nlrd!=null && !Nlrd.isEmpty()))
				   {
					   NilRadio= new PageElement(By.xpath("//label[@for='nilDepreciation0']"), "nilDepreciation0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					   click(NilRadio);
				   }
				   if(RtInv!=null && !RtInv.isEmpty())
				   {
					   rtnToInvCvr   = new PageElement(By.xpath("//label[@for='returnInvoiceYesNO0']"), "returnInvoiceYesNO0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					   click(rtnToInvCvr);
				   }
				   if(ConsitmCvr!=null && !ConsitmCvr.isEmpty())
				   {
					   ConsItemCvr = new PageElement(By.xpath("//label[@for='consumableItemsCoverYesNo0']"), "consumableItemsCoverYesNo0", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					   click(ConsItemCvr);
				   }
			 //  }
			   }
			}
			
			//first cover check
//			if()
//			{
//				if()
//					//additioanl field to be filled
//			
//			}
	}

	public void fillDetailQuoteInformationPage(DetailedQuoteEntity detailedQuoteEntityData,CustomAssert customAssert) throws InterruptedException{
		fillSumInsuredInformation(detailedQuoteEntityData, customAssert);
		fillPolicyPeriod(detailedQuoteEntityData);
		fillVehicledetails(detailedQuoteEntityData, customAssert);
		fillCoverageDetails(detailedQuoteEntityData, customAssert);
		fillAddOnEnhancementDetails(detailedQuoteEntityData);
		fillPolicyPeriodForTwoWheeler(detailedQuoteEntityData, customAssert);
		//fillGetprotectionForAccess
		fillpreviousPolicyDetails(detailedQuoteEntityData);
		fillPropertyDetails(detailedQuoteEntityData);
		fillBasicInformation(detailedQuoteEntityData, customAssert);
		fillBasicDetails(detailedQuoteEntityData, customAssert);
		fillStandardCovers(detailedQuoteEntityData, customAssert);
		//fillPropertyDetails(detailedQuoteEntityData);
		fillAdditionalCovers(detailedQuoteEntityData, customAssert);
		fillMemberInformation(detailedQuoteEntityData, customAssert);
		fillTravelDetails(detailedQuoteEntityData, customAssert);	
		fillTravelDetails(detailedQuoteEntityData, customAssert);
		calculatePremium(detailedQuoteEntityData);
		RecalculatePremium(detailedQuoteEntityData);
		saveAndcontinue(detailedQuoteEntityData);
		saveAndcontinue1(detailedQuoteEntityData);
		personalDetails(detailedQuoteEntityData, customAssert);
		okAlert(detailedQuoteEntityData);
	}

	
}


