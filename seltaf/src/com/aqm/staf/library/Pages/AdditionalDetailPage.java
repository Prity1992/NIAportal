package com.aqm.staf.library.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.PrpslFrm_IntrmdryEntity;

public class AdditionalDetailPage extends BasePage {

	private PageElement personaldetailsDropdown;
	private PageElement relationTypeDropdown;
	private PageElement aadharnoRadioButton;
	private PageElement agreetoLinkRadioButton;
	private PageElement submitButton;
	private PageElement memberinfoDropdown;
	private PageElement occupationDropdown;
	private PageElement daughterDropdown;
	private PageElement nametextarea;
	private PageElement occupationdaghuterDropdown;
	private PageElement nomineenametextarea;
	private PageElement relationwithnomineeDropdown;
	private PageElement relationwithnomineeDropdown1;
	private PageElement saveandcontinueButton;
	private PageElement saveandcontinueButton1;
	private PageElement firstNameTextArea;
	private PageElement lastNameTextArea;
	private PageElement okButton;
	private PageElement nomineeDetailsDropdown;	
	private PageElement nomineetextarea;
	//Miscellnious (Personal accident)
	//private PageElement relationTypeDropdownMisc;
	private PageElement additionalDetailsDropdown;
	//private PageElement occupationDropdownMisc;
	private PageElement nomineenametextareamisc;
	//private PageElement relationWithNomineeMiscDropdown;
	//Motor
	private PageElement financierDetailsOptionalDropdown;
	private PageElement enginenotextarea;
	private PageElement chasisnotextarea;
	private PageElement colourAsPerRCBooktextarea;
	private PageElement colourOfVehicletextDropdown;
	private PageElement financierNametextarea;
	private PageElement typeOfFinancingAgreementDropdown;
	private PageElement personalDetailsDropdownMotor;
	private PageElement relationshipWithRegisteredUserDropdown;
	private PageElement buildingNoStreettextarea;
	private PageElement submitQuoteButton;
	//Travel
	private PageElement travellerDetailsDropdown;
	private PageElement passportno;
	private PageElement passporTexpiryDate;
	private PageElement visatype;
	private PageElement occupationT;
	private PageElement otherDetailsDropDown;
	private PageElement nameOftheNominee;
	private PageElement relationshipNominee;
	private PageElement yesradio;
	private PageElement noradio;
	private PageElement oKButtonT;
	private PageElement additionalVehicleDetails;
	private PageElement saveandcontinueButtonM;
	private PageElement child1infoTab;
	private PageElement physicianInfoTab;
	private PageElement childOccupation;
	private PageElement noRadioButton;
	private PageElement yesRadioButton;
	private PageElement maleChildRadioButton;
	private PageElement femaleChildRadioButton;
	private PageElement proposerDateOfBirth;
	private PageElement natureOfID;
	private PageElement idDocno;
	private PageElement browsebutton;
	private PageElement uploadButton;
	private PageElement addtionalcoverTab;
	private PageElement stateTextfield;
	private PageElement cityTextfield;
	private PageElement pinCodeTextfield;
	private PageElement mobNoTextfield;
	private PageElement emailIDTextfield;
	private PageElement heightText;
	private PageElement weightText;
	private PageElement addressOfBuildingToBeinsured;
	private PageElement noBuildingRadiobtn;
	private PageElement yesBuildingRadiobtn;
	private PageElement buildingNOStreet;
	private PageElement localityAddBuilding;
	private PageElement pincodeAddBuilding;
	private PageElement financierDetails;
	private PageElement yesfinancierRadio;
	private PageElement nofinancierRadio;
	private PageElement universitynametextarea;
	private PageElement universityAddtextarea;
	private PageElement sponsornametextarea;
	private PageElement sponsorAddtextarea;
	private PageElement isTheLoacAddSameRadioButton;
	private PageElement yearOfConstructionDropdown;
	private PageElement loactionAddressDropDown;
	private PageElement additionalDetailsDropDown;
	private PageElement addressOfShopToBeinsured;
	private PageElement typeOfShop;
	private PageElement addressOfOffice;
	private PageElement ownerRadioBtn;
	private PageElement tenantRadioBtn;
	private PageElement yesOffAddress;
	private PageElement noOffAddress;
	private PageElement officeAddTextField;
	private PageElement pinCodeoffiAddTextField;
	private PageElement	occupationDropDown;
	private PageElement DOBTextArea;
	private PageElement dateofRegistration;
	private PageElement registrationNumber1;
	private PageElement registrationNumber2;
	private PageElement registrationNumber3;
	private PageElement registrationNumber4;
	private PageElement uploadFileButton;
	private PageElement browseFileButton;
	
	//MotorCPA
	private PageElement additionalDetailsDropDownCPA;
	//private PageElement occupationCPA;
	//private PageElement doYouHoldValidDrivingLicenseCPA;
	private PageElement occupationDropDownCPA;
	private PageElement licenseTypeOfOwnerDriverDropDownCPA;
	private PageElement ownerDriverDrivingLicenseNoCPA;
	private PageElement ownerDriverLicenseIssueDateCPA;
	private PageElement ownerDriverLicenseExpiryDateCPA;
	private PageElement licenseIssuingAuthorityForOwnerDriverCPA;
	private PageElement nomineeNameCPA;
	private PageElement relationshipWithTheInsuredCPA;
	

	public AdditionalDetailPage(WebDriver driver,String pageName){
		super(driver,pageName);
		browseFileButton  = new PageElement(By.name("mandatoryFilesProp"), "Browse", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		uploadFileButton  = new PageElement(By.name("uploadProp"), "Upload;", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		personaldetailsDropdown      = new PageElement(By.xpath("//span[contains(text(),'Personal Details')]"), "personaldetails", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationTypeDropdown         = new PageElement(By.xpath("//select[@name='relationType']"), "RelationType", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		aadharnoRadioButton          = new PageElement(By.xpath("//input[@id='temp1']"), "aadhar no", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		agreetoLinkRadioButton       = new PageElement(By.xpath("//input[@id='temp1']//following::input[1]"),"AgreeAadharLink", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		submitButton                 = new PageElement(By.xpath("//button[contains(text(),'Submit')]"),"submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberinfoDropdown           = new PageElement(By.xpath("//span[contains(text(),'Member Information')]"), "memberinfo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		occupationDropdown           = new PageElement(By.xpath("//select[@name='propOccupation']"), "occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		daughterDropdown             = new PageElement(By.xpath("//label[contains(text(),'Daughter1')]"), "Daughter", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nametextarea                 = new PageElement(By.xpath("//input[@placeholder='Please enter the Name']"), "name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationdaghuterDropdown   = new PageElement(By.xpath("//select[@name='childOccupation0']"), "Dagoccupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineetextarea              = new PageElement(By.xpath("//input[@placeholder='Nominee Name']"), "Nominee Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationwithnomineeDropdown	 = new PageElement(By.xpath("//select[@name='nomineeRel']"), "Relationwithnominee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationwithnomineeDropdown1	= new PageElement(By.xpath("//select[@name='nomineeRelationship']"), "Relationwithnominee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveandcontinueButton        = new PageElement(By.xpath("//button[@class='btn btn-blue']"),"SaveandContinue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveandcontinueButton1=		new PageElement(By.xpath("//button[@class='btn btn-blue']"),"SaveAndContinue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveandcontinueButtonM       = new PageElement(By.xpath("//button[contains(@class,'save_btn_np mr-15')]"),"SaveandContinue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		firstNameTextArea            = new PageElement(By.name("firstName"), "First Name Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lastNameTextArea             = new PageElement(By.name("lastName"), "last Name Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		okButton					 = new PageElement(By.xpath("//button[@class='btn btn-green alert_ok_btn']"),"Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 25);
		nomineeDetailsDropdown		 = new PageElement(By.xpath("//span[contains(text(),'Nominee Details')]"), "Nominee Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//relationTypeDropdownMisc	 = new PageElement(By.xpath("//select[@name='relationType']"), "RelationTypeMiscPersonal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalDetailsDropdown	 = new PageElement(By.xpath("//span[contains(text(),'Additional Details')]"), "Additional Details in additional details page ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//occupationDropdownMisc	 = new PageElement(By.xpath("//select[@name='propOccupation']"), "occupationMisc", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineenametextareamisc		 = new PageElement(By.xpath("//input[@placeholder='Nominee Name']"), "NomineenameMisc", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//relationWithNomineeMiscDropdown=new PageElement(By.xpath("//select[@name='nomineeRel']"), "RelationWithNomineeMisc", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		enginenotextarea 			 = new PageElement(By.xpath("//input[@name='engineNo']"), "Engine no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chasisnotextarea 			 = new PageElement(By.xpath("//input[@name='chasisNo']"), "chasis no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		colourAsPerRCBooktextarea 	 = new PageElement(By.xpath("//input[@name='ColourasperRCBook']"), "colour As Per RC Book", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 15); 
		colourOfVehicletextDropdown  = new PageElement(By.xpath("//div//select[@name='vehicleColor']"), "colour Of Vehicle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		financierNametextarea 	     = new PageElement(By.xpath("//input[@name='financierName']"), "financier Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfFinancingAgreementDropdown 	= new PageElement(By.xpath("//div//select[@name='financeAgreementType']"), "finance Agreement Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		financierDetailsOptionalDropdown 	= new PageElement(By.xpath("//span[contains(text(),'Financier Details(Optional)')]"), "FinancierDetailsOptional", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		personalDetailsDropdownMotor 	    = new PageElement(By.xpath("//span[contains(text(),'Personal Details')]"), "Personal Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);//span[contains(text(),'Personal Details')]
		relationshipWithRegisteredUserDropdown 	= new PageElement(By.xpath("//select[@id='relationType']"), "Relation ship With Registered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buildingNoStreettextarea 			= new PageElement(By.xpath(" //textarea[@name='addresslineNo1']"), "building No Street", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		submitQuoteButton					= new PageElement(By.xpath("//button[@class='btn btn-blue']"), "Submit Quote Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		travellerDetailsDropdown    = new PageElement(By.xpath("//span[contains(text(),'Traveller Details')]"), "Traveller Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		passportno                  = new PageElement(By.xpath("//input[@name='passport']"), "Passport", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passporTexpiryDate          = new PageElement(By.xpath("//input[@name='passportExpDt']"), "Passport Exp ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		visatype                    = new PageElement(By.xpath("//input[@name='visaType']"), "Visa Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationT                 = new PageElement(By.xpath("//select[@name='occupation']"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherDetailsDropDown        = new PageElement(By.xpath("//span[contains(text(),'Other Details')]"), "Other Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOftheNominee            = new PageElement(By.xpath(" //input[@name='nameOftheNominee']"), "Name Of the Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipNominee         = new PageElement(By.xpath("//select[@name='relationshipNominee']"), "Relationship Nominee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yesradio                    = new PageElement(By.xpath("//input[@id='optionsRadios0']"), "Yes Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noradio                     = new PageElement(By.xpath("//input[@id='optionsRadios1']"), "No Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		oKButtonT                   = new PageElement(By.xpath("//button[@class='btn btn-green btn-width alert_ok_btn']"), "OK Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		additionalVehicleDetails    = new PageElement(By.xpath("//span[contains(text(),'Additional Vehicle Details')]"), "Additional Vehicle Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		child1infoTab               = new PageElement(By.xpath("//label[contains(text(),'Child1')]"), " Child1 Info Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		physicianInfoTab            = new PageElement(By.xpath("//span[contains(text(),'Physician Information')]"), "Physician Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		childOccupation             = new PageElement(By.xpath("//select[@name='childOccupation0']"), "Child Occupation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noRadioButton               = new PageElement(By.xpath("//input[@id='physicianDetails1']"), "No Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yesRadioButton              = new PageElement(By.xpath("//input[@id='physicianDetails0']"), "Yes Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maleChildRadioButton        = new PageElement(By.xpath("//label[@for='childgender00']"), "Male Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		femaleChildRadioButton      = new PageElement(By.xpath("//label[@for='childgender10']"), "Female Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proposerDateOfBirth         = new PageElement(By.xpath("//input[@placeholder='Date Of Birth (dd/mm/yyyy)']"), "Proposer Date Of Birth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		natureOfID                  = new PageElement(By.xpath("//select[@name='propNatureOfId']"), "Nature Of ID", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		idDocno                     = new PageElement(By.xpath("//input[@placeholder='ID Doc No.']"), "Id Doc No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		browsebutton                = new PageElement(By.xpath("//input[@id='mandatoryFilesProp']"), "Browse Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		uploadButton                = new PageElement(By.xpath("//button[@name='uploadProp']"), "Upload Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addtionalcoverTab           = new PageElement(By.xpath("//div[@class='panel-heading']//a[@class='accordion-toggle']"), "Addtional Covers", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		stateTextfield			    = new PageElement(By.xpath("//input[@placeholder='State']"), "State Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cityTextfield			    = new PageElement(By.xpath("//input[@placeholder='City']"), "City Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeTextfield		    = new PageElement(By.xpath("//input[@name='pincodeInd']"), "PinCode Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mobNoTextfield			    = new PageElement(By.xpath("//input[@name='mobileNo']"), "MobNo.Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		emailIDTextfield		    = new PageElement(By.xpath("//input[@name='emailID']"), "PinCode Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		heightText                  = new PageElement(By.xpath(" //input[@placeholder='Height (in meters)']"), "Height", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		weightText                  = new PageElement(By.xpath(" //input[@placeholder='Weight(in kg)']"), "Weight", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addressOfBuildingToBeinsured= new PageElement(By.xpath("//span[contains(text(),'Address of the Building to be Insured')]"), "Address Of Building", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noBuildingRadiobtn	        = new PageElement(By.xpath("//label[@for='sameAddrAsBuilding1']"), "No Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yesBuildingRadiobtn      	= new PageElement(By.xpath(" //label[@for='sameAddrAsBuilding0']"), "Yes Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buildingNOStreet	        = new PageElement(By.xpath("//textarea[@placeholder='Building no., Street']"), "BuildingNo Street ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		localityAddBuilding	        = new PageElement(By.xpath("//input[@placeholder='Locality']"), "Locality", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pincodeAddBuilding	        = new PageElement(By.xpath("//input[@name='buildingPinCode']"), "PinCode Building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		financierDetails	        = new PageElement(By.xpath("//span[contains(text(),'Financier Details')]"), "Financer Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yesfinancierRadio	        = new PageElement(By.xpath(" //label[@for='premisesHypBank0']"), "Yes Financer Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nofinancierRadio 	        = new PageElement(By.xpath(" //label[@for='premisesHypBank1']"), "No Financer Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		universitynametextarea 	    = new PageElement(By.name("universityName"), "university Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		universityAddtextarea 	    = new PageElement(By.name("universityAddress"), "university Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sponsornametextarea 	    = new PageElement(By.name("sponsorName"), "sponsor Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sponsorAddtextarea 	        = new PageElement(By.name("sponsorAddress"), "sponsor Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheLoacAddSameRadioButton = new PageElement(By.xpath("//li[@class='clearfix']//label[@class='rdb']"), "is The Loacation Add Same", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		yearOfConstructionDropdown  = new PageElement(By.name("yearOfConstruction"), "Year Of Construction", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loactionAddressDropDown     = new PageElement(By.xpath("//span[contains(text(),'Location Address')]"), "Location Address", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//additionalDetailsDropDown    = new PageElement(By.xpath("//span[contains(text(),'Additional Details')]"), "Additional Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// harsha
		addressOfShopToBeinsured  = new PageElement(By.xpath("//span[contains(text(),'Address of the Shop to be Insured')]"), "Address Of Shop", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfShop    			 = new PageElement(By.name("type"), "type of shop", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationDropDown		= new PageElement(By.name("occupation0"), "occupation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	sagar
		addressOfOffice = new PageElement(By.xpath("//span[contains(text(),'Address of Office to be Insured')]"), "Address Office Insured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ownerRadioBtn = new PageElement(By.xpath("//input[contains(@id,'typeOfOccupant1')]/following::label[1]"), "Owner RadioBtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tenantRadioBtn = new PageElement(By.xpath("//input[contains(@id,'typeOfOccupant2')]/following::label[1]"), "Tenant Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yesOffAddress = new PageElement(By.xpath("//input[contains(@id,'sameAddrAsBuilding0')]/following::label[1]"), "Yes RadioBtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noOffAddress = new PageElement(By.xpath("//input[contains(@id,'sameAddrAsBuilding1')]/following::label[1]"), "No Radiobtn", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		officeAddTextField = new PageElement(By.xpath("//textarea[@id='locality']"), "Office AddTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeoffiAddTextField = new PageElement(By.xpath("//input[@name='pincodeAadd']"), "Pin Code Add", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DOBTextArea = new PageElement(By.name("dob"), "DOB ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateofRegistration  = new PageElement(By.xpath("//input[@value='validation.today']"), "Date of Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);
		registrationNumber1 =new PageElement(By.name("registrationNumber1"), "Registration Number1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//end 

		registrationNumber2	= new PageElement(By.xpath("//input[@name='registrationNumber2']"), "Registration Number2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNumber3	= new PageElement(By.xpath("//input[@name='registrationNumber3']"), "Registration Number3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNumber4 =	new PageElement(By.xpath("//input[@name='registrationNumber4']"), "Registration Number4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//CPA Prity
		additionalDetailsDropDownCPA= new PageElement(By.xpath("//span[contains(text(),'Additional Details')]//following::label[24]"), "Additional Details in additional details page ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		occupationDropDownCPA=new PageElement(By.xpath("//select[@name='occupation']"), "Occupation CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseTypeOfOwnerDriverDropDownCPA=new PageElement(By.xpath("//select[@name='licType']"), "license Type Of Owner Driver DropDown CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ownerDriverDrivingLicenseNoCPA=new PageElement(By.xpath("//input[@name='ownerLicensenumber']"), "owner Driver Driving License No CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ownerDriverLicenseIssueDateCPA=new PageElement(By.xpath("//input[@name='licIssueDate']"), "owner Driver License Issue Date CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ownerDriverLicenseExpiryDateCPA=new PageElement(By.xpath("//input[@name='licExpiryDate']"), "owner Driver License Expiry Date CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseIssuingAuthorityForOwnerDriverCPA=new PageElement(By.xpath("//input[@name='licAuth']"), "license Issuing Authority For Owner Driver CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 nomineeNameCPA=new PageElement(By.xpath("//input[@name='nomineeName']"), "nominee Name CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 relationshipWithTheInsuredCPA=new PageElement(By.xpath("//select[@name='nomineeRelation']"), "relationship With The Insured CPA ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
	
	}

	public void fillAndSubmitPersonalDetailPage(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) throws InterruptedException {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")) {
			//switchToWindow("The New India Assurance Co. Ltd.");
			if((additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
					||(additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))) {
				if(!(additionalDetailEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover")))
				{
				String personaldetail;
				personaldetail= additionalDetailEntityData.getStringValueForField("personaldetailsDropdown");
				if ((personaldetail!=null)&&(!personaldetail.isEmpty())){
					click(personaldetailsDropdown);
				}
			}
			}

			String Relationtype;
			Relationtype = additionalDetailEntityData.getStringValueForField("RelationType");

			if ((Relationtype!=null)&&(!Relationtype.isEmpty())){
				selectValueFromList(relationTypeDropdown,additionalDetailEntityData.getStringValueForField("RelationType"));
				Thread.sleep(2000);
				waitForPageElement(okButton);
				if(additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
					click(oKButtonT);
				} 
				else {
					click(okButton);
					if(additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
							||additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {								
						click(okButton);
					}
				}

				additionalDetailEntityData.setStringValueForField("FirstName", fetchValueFromTextFields(firstNameTextArea));
				additionalDetailEntityData.setStringValueForField("LastName", fetchValueFromTextFields(lastNameTextArea));
				additionalDetailEntityData.setStringValueForField("DOB", fetchValueFromTextFields(DOBTextArea));
				String aadharnoRadioBTN;
				aadharnoRadioBTN = additionalDetailEntityData.getStringValueForField("AadharnoRadioBTN");
				if ((aadharnoRadioBTN!=null)&&(!aadharnoRadioBTN.isEmpty())){	
					click(aadharnoRadioButton);
				}
				String agreetoLinkRadioBTN;
				agreetoLinkRadioBTN = additionalDetailEntityData.getStringValueForField("AgreetoLinkRadioBTN");
				if ((agreetoLinkRadioBTN!=null)&&(!agreetoLinkRadioBTN.isEmpty())){	
					click(agreetoLinkRadioButton);
				}
				String submitBTN;
				submitBTN = additionalDetailEntityData.getStringValueForField("SubmitBTN");
				if ((submitBTN!=null)&&(!submitBTN.isEmpty())){	
					click(submitButton);
				}
				String relationshipWithRegisteredUser;
				relationshipWithRegisteredUser = additionalDetailEntityData.getStringValueForField("relationshipWithRegisteredUser");
				if ((relationshipWithRegisteredUser!=null)&&(!relationshipWithRegisteredUser.isEmpty())){
					selectValueFromList(typeOfFinancingAgreementDropdown,additionalDetailEntityData.getStringValueForField("relationshipWithRegisteredUser"));
				}

				String buildingNoStreet;
				buildingNoStreet = additionalDetailEntityData.getStringValueForField("buildingNoStreet");
				if ((buildingNoStreet!=null)&&(!buildingNoStreet.isEmpty())){
					clearAndSendKeys(buildingNoStreettextarea,additionalDetailEntityData.getStringValueForField("buildingNoStreet"));
				}
				String NomineeName;
				NomineeName = additionalDetailEntityData.getStringValueForField("NomineeName1");
				if ((NomineeName!=null)&&(!NomineeName.isEmpty())){
					clearAndSendKeys(nomineetextarea,additionalDetailEntityData.getStringValueForField("NomineeName1"));
				}
				String RelationWithNominee;
				RelationWithNominee = additionalDetailEntityData.getStringValueForField("RelationWithNominee1");
				if ((RelationWithNominee!=null)&&(!NomineeName.isEmpty())){
					selectValueFromList(relationwithnomineeDropdown1,additionalDetailEntityData.getStringValueForField("RelationWithNominee1"));
				}
			}
		}
	}

	private void fillAndSubmitSELFPage(AdditionalDetailEntity additionalDetailEntity, CustomAssert customAssert) {
		if((additionalDetailEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))&&
				(additionalDetailEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))) {

			if ((additionalDetailEntity.getStringValueForField("Occupation")!=null)&&(!additionalDetailEntity.getStringValueForField("Occupation").isEmpty())){
				selectValueFromList(occupationDropDown,additionalDetailEntity.getStringValueForField("Occupation"));

				String NomineeName;
				NomineeName = additionalDetailEntity.getStringValueForField("NomineeName1");
				if ((NomineeName!=null)&&(!NomineeName.isEmpty())){
					clearAndSendKeys(nomineetextarea,additionalDetailEntity.getStringValueForField("NomineeName1"));

				}
				String RelationWithNominee;
				RelationWithNominee = additionalDetailEntity.getStringValueForField("RelationWithNominee1");
				if ((RelationWithNominee!=null)&&(!NomineeName.isEmpty())){
					selectValueFromList(relationwithnomineeDropdown1,additionalDetailEntity.getStringValueForField("RelationWithNominee1"));
				}
			}
		}
	}
	public void fillAndSubmitMemberInfoPage(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) throws InterruptedException, IOException, AWTException {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			click(memberinfoDropdown);	
			String propDateOfBirth;
			propDateOfBirth = additionalDetailEntityData.getStringValueForField("ProposerDateOfBirth");
			if ((propDateOfBirth!=null)&&(!propDateOfBirth.isEmpty())){
				clearAndSendKeys(proposerDateOfBirth, additionalDetailEntityData.getStringValueForField("ProposerDateOfBirth"));
			}
			String Occupation;
			Occupation = additionalDetailEntityData.getStringValueForField("Occupation");
			if ((Occupation!=null)&&(!Occupation.isEmpty())){
				selectValueFromList(occupationDropdown,additionalDetailEntityData.getStringValueForField("Occupation"));	
			}

			String natureofID = additionalDetailEntityData.getStringValueForField("NatureofID");
			if ((natureofID!=null)&&(!natureofID.isEmpty())){
				selectValueFromList(natureOfID,additionalDetailEntityData.getStringValueForField("NatureofID"));	
			}
			String idDocNo = additionalDetailEntityData.getStringValueForField("IdDocNo");
			if ((idDocNo!=null)&&(!idDocNo.isEmpty())){
				clearAndSendKeys(idDocno,additionalDetailEntityData.getStringValueForField("IdDocNo"));	
			}
			/*String browseButton = additionalDetailEntityData.getStringValueForField("BrowseButton");
			if ((browseButton!=null)&&(!browseButton.isEmpty())){
				click(browsebutton);
			}
			String uploadbutton = additionalDetailEntityData.getStringValueForField("UploadButton");
			if ((uploadbutton!=null)&&(!uploadbutton.isEmpty())){
				click(uploadButton);

			}*/
			String height = additionalDetailEntityData.getStringValueForField("Height");
			if ((height!=null)&&(!height.isEmpty())){
				clearAndSendKeys(heightText,additionalDetailEntityData.getStringValueForField("Height"));	
			}
			String weight = additionalDetailEntityData.getStringValueForField("Weight");
			if ((weight!=null)&&(!weight.isEmpty())){
				clearAndSendKeys(weightText,additionalDetailEntityData.getStringValueForField("Weight"));	
			}

			fillchild(additionalDetailEntityData, assertReference);
			filldaughter(additionalDetailEntityData, assertReference);
			
			
			
			/*String windowTitle = null;
			switchToWindow1(windowTitle);*/

			clickOnUploadFileButton(additionalDetailEntityData, assertReference);		
		}
	}
	public void filldaughter(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			String daughterDropdownTab;
			daughterDropdownTab = additionalDetailEntityData.getStringValueForField("Daughter1dropdown");
			if ((daughterDropdownTab!=null)&&(!daughterDropdownTab.isEmpty())){	
				click(daughterDropdown);	
				String Name;
				Name = additionalDetailEntityData.getStringValueForField("Name");
				if ((Name!=null)&&(!Name.isEmpty())){
					clearAndSendKeys(nametextarea, additionalDetailEntityData.getStringValueForField("Name"));
					String OccupationDaughter;
					OccupationDaughter = additionalDetailEntityData.getStringValueForField("OccupationDaughter");
					if ((OccupationDaughter!=null)&&(!OccupationDaughter.isEmpty())){
						selectValueFromList(occupationdaghuterDropdown,additionalDetailEntityData.getStringValueForField("OccupationDaughter"));
					}
				}
			}
		}
	}

	public void fillchild(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) throws InterruptedException {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			String childDropdown;
			childDropdown = additionalDetailEntityData.getStringValueForField("Child1dropdown");
			if ((childDropdown!=null)&&(!childDropdown.isEmpty())){	
				click(child1infoTab);				
				String Name;
				Name = additionalDetailEntityData.getStringValueForField("Name");
				if ((Name!=null)&&(!Name.isEmpty())){
					clearAndSendKeys(nametextarea, additionalDetailEntityData.getStringValueForField("Name"));
					String occupationchild;
					occupationchild = additionalDetailEntityData.getStringValueForField("OccupationChild");
					if ((occupationchild!=null)&&(!occupationchild.isEmpty())){
						selectValueFromList(childOccupation,additionalDetailEntityData.getStringValueForField("OccupationChild"));
						String maleChildRadio;
						maleChildRadio= additionalDetailEntityData.getStringValueForField("MaleChildRadioBTN");
						if ((maleChildRadio!=null)&&(!maleChildRadio.isEmpty())){
							click(maleChildRadioButton);
						}	

						String femaleChildRadio;
						femaleChildRadio= additionalDetailEntityData.getStringValueForField("FemaleChildRadioBTN");
						if ((femaleChildRadio!=null)&&(!femaleChildRadio.isEmpty())){
							click(femaleChildRadioButton);
						}
					}	
				}
			}
		}
	}

	public void fillPhysicianInformation(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			String physicianInformation;
			physicianInformation = additionalDetailEntityData.getStringValueForField("PhysicianInfoTab");
			if ((physicianInformation!=null)&&(!physicianInformation.isEmpty())){
				click(physicianInfoTab);
				String yesRadioBtn;
				yesRadioBtn = additionalDetailEntityData.getStringValueForField("YesRadioBTN");
				if ((yesRadioBtn!=null)&&(!yesRadioBtn.isEmpty())){
					click(yesRadioButton);
				}
				String noRadioBTN;
				noRadioBTN = additionalDetailEntityData.getStringValueForField("NoRadioBTN");
				if ((noRadioBTN!=null)&&(!noRadioBTN.isEmpty())){
					click(noRadioButton);
				}	
			}
		}
	}

	public void fillAddressOfBuilding(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
			String AddressOfBuilding;
			AddressOfBuilding = additionalDetailEntityData.getStringValueForField("AddressOfBuildingTab");
			if ((AddressOfBuilding!=null)&&(!AddressOfBuilding.isEmpty())){
				click(addressOfBuildingToBeinsured);
				String yesRadioBtn;
				yesRadioBtn = additionalDetailEntityData.getStringValueForField("YesBuildingRadiobtn");
				if ((yesRadioBtn!=null)&&(!yesRadioBtn.isEmpty())){
					click(yesBuildingRadiobtn);
				}
				String noRadioBtn;
				yesRadioBtn = additionalDetailEntityData.getStringValueForField("NoBuildingRadiobtn");
				if ((yesRadioBtn!=null)&&(!yesRadioBtn.isEmpty())){
					click(noBuildingRadiobtn);
				}																											

				String BuildingNOStreet;
				BuildingNOStreet = additionalDetailEntityData.getStringValueForField("BuildingNOStreetTextFiled");
				if ((BuildingNOStreet!=null)&&(!BuildingNOStreet.isEmpty())){
					clearAndSendKeys(buildingNOStreet,additionalDetailEntityData.getStringValueForField("BuildingNOStreetTextFiled"));
				}

				String LocalityAddBuilding;
				LocalityAddBuilding = additionalDetailEntityData.getStringValueForField("LocalityAddBuildingTextfield");
				if ((LocalityAddBuilding!=null)&&(!LocalityAddBuilding.isEmpty())){
					clearAndSendKeys(localityAddBuilding,additionalDetailEntityData.getStringValueForField("LocalityAddBuildingTextfield"));
				}

				String PincodeAddBuilding;
				PincodeAddBuilding = additionalDetailEntityData.getStringValueForField("PincodeAddBuildingTextFiled");
				if ((PincodeAddBuilding!=null)&&(!PincodeAddBuilding.isEmpty())){
					clearAndSendKeys(pincodeAddBuilding,additionalDetailEntityData.getStringValueForField("PincodeAddBuildingTextFiled"));
				}

				String FinancierDetails;
				FinancierDetails = additionalDetailEntityData.getStringValueForField("FinancierDetailsTab");
				if ((FinancierDetails!=null)&&(!FinancierDetails.isEmpty())){
					click(financierDetails);
				}
				String YesRadioBtn;
				YesRadioBtn = additionalDetailEntityData.getStringValueForField("YesfinancierRadio");
				if ((YesRadioBtn!=null)&&(!YesRadioBtn.isEmpty())){
					click(yesfinancierRadio);
				}

				String NoRadioBtn;
				NoRadioBtn = additionalDetailEntityData.getStringValueForField("NofinancierRadio");
				if ((NoRadioBtn!=null)&&(!NoRadioBtn.isEmpty())){
					click(nofinancierRadio);
				}
			}
		}
	}
	public void fillAddressOfOfficeInsured(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
			String AddressOfOffice;
			AddressOfOffice = additionalDetailEntityData.getStringValueForField("AddressOfOfficeTab");
			if ((AddressOfOffice!=null)&&(!AddressOfOffice.isEmpty())){
				click(addressOfOffice);
			}
			String OwnerRadioBtn;
			OwnerRadioBtn = additionalDetailEntityData.getStringValueForField("OwnerRadioBtnTab");
			if ((OwnerRadioBtn!=null)&&(!OwnerRadioBtn.isEmpty())){
				click(ownerRadioBtn);
			}
			String TenantRadioBtn;
			TenantRadioBtn = additionalDetailEntityData.getStringValueForField("TenantRadioBtnTab");
			if ((TenantRadioBtn!=null)&&(!TenantRadioBtn.isEmpty())){
				click(tenantRadioBtn);
			}
			String YesOffAddress;
			YesOffAddress = additionalDetailEntityData.getStringValueForField("YesOffAddressTab");
			if ((YesOffAddress!=null)&&(!YesOffAddress.isEmpty())){
				click(yesOffAddress);
			}
			String NoOffAddress;
			NoOffAddress = additionalDetailEntityData.getStringValueForField("NoOffAddressTab");
			if ((NoOffAddress!=null)&&(!NoOffAddress.isEmpty())){
				click(noOffAddress);
			}
			String OfficeAddTextField;
			OfficeAddTextField = additionalDetailEntityData.getStringValueForField("OfficeAddTextFieldTab");
			if ((OfficeAddTextField!=null)&&(!OfficeAddTextField.isEmpty())){
				clearAndSendKeys(officeAddTextField,additionalDetailEntityData.getStringValueForField("OfficeAddTextFieldTab"));
			}
			String PinCodeoffiAddTextField;
			PinCodeoffiAddTextField = additionalDetailEntityData.getStringValueForField("PinCodeoffiAddTextFieldTab");
			if ((PinCodeoffiAddTextField!=null)&&(!PinCodeoffiAddTextField.isEmpty())){
				clearAndSendKeys(pinCodeoffiAddTextField,additionalDetailEntityData.getStringValueForField("PinCodeoffiAddTextFieldTab"));
			}
		}
	}
	public void fillAddressOfShop(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {

			if ((additionalDetailEntityData.getStringValueForField("AddressOfShopTab")!=null)&&(!additionalDetailEntityData.getStringValueForField("AddressOfShopTab").isEmpty())){
				click(addressOfShopToBeinsured);
			}
			if ((additionalDetailEntityData.getStringValueForField("TypeOfShop")!=null)&&(!additionalDetailEntityData.getStringValueForField("TypeOfShop").isEmpty())){
				clearAndSendKeys(typeOfShop,additionalDetailEntityData.getStringValueForField("TypeOfShop"));
			}			
			if ((additionalDetailEntityData.getStringValueForField("YesBuildingRadiobtn")!=null)&&(!additionalDetailEntityData.getStringValueForField("YesBuildingRadiobtn").isEmpty())){
				click(yesBuildingRadiobtn);
			}
		}			
	}

	public void fillAddtionalCovers(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {

		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			String addtionalCoverTab = additionalDetailEntityData.getStringValueForField("AddtionalCoverTab");
			if ((addtionalCoverTab!=null)&&(!addtionalCoverTab.isEmpty())){
				click(addtionalcoverTab);
			}
		}
	}
	public void fillAndSubmitNomineePage(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") && additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {	
			click(nomineeDetailsDropdown);
			String NomineeName;
			NomineeName = additionalDetailEntityData.getStringValueForField("NomineeName");
			if ((NomineeName!=null)&&(!NomineeName.isEmpty())){
				clearAndSendKeys(nomineetextarea,additionalDetailEntityData.getStringValueForField("NomineeName"));

			}
			String RelationWithNominee;
			RelationWithNominee = additionalDetailEntityData.getStringValueForField("RelationWithNominee");
			if ((RelationWithNominee!=null)&&(!NomineeName.isEmpty())){
				selectValueFromList(relationwithnomineeDropdown,additionalDetailEntityData.getStringValueForField("RelationWithNominee"));
			}
			waitForElement(submitQuoteButton, 10000);
		}
	}

	public void fillAndSubmitAdditionalDetailsMiscPersonal(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") 
				&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))
		{	
			String additionaldetailsDropdown;
			additionaldetailsDropdown = additionalDetailEntityData.getStringValueForField("AdditionalDetailsDropdown");
			if ((additionaldetailsDropdown!=null)&&(!additionaldetailsDropdown.isEmpty())){
				click(additionalDetailsDropdown);
				String Occupation;
				Occupation = additionalDetailEntityData.getStringValueForField("Occupation");
				if ((Occupation!=null)&&(!Occupation.isEmpty())){
					selectValueFromList(occupationDropdown,additionalDetailEntityData.getStringValueForField("Occupation"));
				}
				String NomineeName;
				NomineeName = additionalDetailEntityData.getStringValueForField("NomineeName");
				if ((NomineeName!=null)&&(!NomineeName.isEmpty())){
					clearAndSendKeys(nomineetextarea,additionalDetailEntityData.getStringValueForField("NomineeName"));
				}
				String RelationWithNominee;
				RelationWithNominee = additionalDetailEntityData.getStringValueForField("RelationWithNominee");
				if ((RelationWithNominee!=null)&&(!RelationWithNominee.isEmpty())){
					selectValueFromList(relationwithnomineeDropdown,additionalDetailEntityData.getStringValueForField("RelationWithNominee"));
				}
			}
		}
	}

	private void fillAndSubmitAdditionalDetails(AdditionalDetailEntity additionalDetailEntity,CustomAssert customAssert) {
		if(additionalDetailEntity.getAction().equalsIgnoreCase("add") 
				&& (!additionalDetailEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))) {
			
			String additionalDetails;
			additionalDetails = additionalDetailEntity.getStringValueForField("AdditionalDetailsDropdown");
			if ((additionalDetails!=null)&&(!additionalDetails.isEmpty())){		
				click(additionalDetailsDropDown);
			}

			String yearOfConstruction;
			yearOfConstruction = additionalDetailEntity.getStringValueForField("YearOfConstruction");
			if ((yearOfConstruction!=null)&&(!yearOfConstruction.isEmpty())){
				selectValueFromList(yearOfConstructionDropdown,additionalDetailEntity.getStringValueForField("YearOfConstruction"));
			}
		}
	}
	
	//CPA
	private void fillAndSubmitAdditionalDetailsCPA(AdditionalDetailEntity additionalDetailEntity,CustomAssert customAssert) {
		if(additionalDetailEntity.getAction().equalsIgnoreCase("add") 
				&& (additionalDetailEntity.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover"))) {
			
			String additionalDetails;
			additionalDetails = additionalDetailEntity.getStringValueForField("AdditionalDetailsDropdownCPA");
			if ((additionalDetails!=null)&&(!additionalDetails.isEmpty())){		
				click(additionalDetailsDropDownCPA);
			}
		}
		
		String OccupationDropDownCPA;
		OccupationDropDownCPA = additionalDetailEntity.getStringValueForField("OccupationDropDownCPA");
		if ((OccupationDropDownCPA!=null)&&(!OccupationDropDownCPA.isEmpty())){
			selectValueFromList(occupationDropDownCPA,additionalDetailEntity.getStringValueForField("OccupationDropDownCPA"));
		}
		
		String LicenseTypeofOwnerDriverCPA;
		LicenseTypeofOwnerDriverCPA = additionalDetailEntity.getStringValueForField("LicenseTypeofOwnerDriverCPA");
		if ((LicenseTypeofOwnerDriverCPA!=null)&&(!LicenseTypeofOwnerDriverCPA.isEmpty())){
			selectValueFromList(licenseTypeOfOwnerDriverDropDownCPA,additionalDetailEntity.getStringValueForField("LicenseTypeofOwnerDriverCPA"));
		}
		
		String OwnerDriverDrivingLicenseNoCPA;
		OwnerDriverDrivingLicenseNoCPA = additionalDetailEntity.getStringValueForField("OwnerDriverDrivingLicenseNoCPA");
		if ((OwnerDriverDrivingLicenseNoCPA!=null)&&(!OwnerDriverDrivingLicenseNoCPA.isEmpty())){
			clearAndSendKeys(ownerDriverDrivingLicenseNoCPA,additionalDetailEntity.getStringValueForField("OwnerDriverDrivingLicenseNoCPA"));
		}
		
		String OwnerDriverLicenseIssueDateCPA;
		OwnerDriverLicenseIssueDateCPA = additionalDetailEntity.getStringValueForField("OwnerDriverLicenseIssueDateCPA");
		if ((OwnerDriverLicenseIssueDateCPA!=null)&&(!OwnerDriverLicenseIssueDateCPA.isEmpty())){
			clearAndSendKeys(ownerDriverLicenseIssueDateCPA,additionalDetailEntity.getStringValueForField("OwnerDriverLicenseIssueDateCPA"));		
		}
		
		String OwnerDriverLicenseExpiryDateCPA;
		OwnerDriverLicenseExpiryDateCPA = additionalDetailEntity.getStringValueForField("OwnerDriverLicenseExpiryDateCPA");
		if ((OwnerDriverLicenseExpiryDateCPA!=null)&&(!OwnerDriverLicenseExpiryDateCPA.isEmpty())){
			clearAndSendKeys(ownerDriverLicenseExpiryDateCPA,additionalDetailEntity.getStringValueForField("OwnerDriverLicenseExpiryDateCPA"));		
		}
		
		String LicenseIssuingAuthorityForOwnerDriverCPA;
		LicenseIssuingAuthorityForOwnerDriverCPA = additionalDetailEntity.getStringValueForField("LicenseIssuingAuthorityForOwnerDriverCPA");
		if ((LicenseIssuingAuthorityForOwnerDriverCPA!=null)&&(!LicenseIssuingAuthorityForOwnerDriverCPA.isEmpty())){
			clearAndSendKeys(licenseIssuingAuthorityForOwnerDriverCPA,additionalDetailEntity.getStringValueForField("LicenseIssuingAuthorityForOwnerDriverCPA"));		
		}
		
		String NomineeNameCPA;
		NomineeNameCPA = additionalDetailEntity.getStringValueForField("NomineeNameCPA");
		if ((NomineeNameCPA!=null)&&(!NomineeNameCPA.isEmpty())){
			clearAndSendKeys(nomineeNameCPA,additionalDetailEntity.getStringValueForField("NomineeNameCPA"));		
		}
		
		String RelationshipWithTheInsuredCPA;
		RelationshipWithTheInsuredCPA = additionalDetailEntity.getStringValueForField("RelationshipWithTheInsuredCPA");
		if ((RelationshipWithTheInsuredCPA!=null)&&(!RelationshipWithTheInsuredCPA.isEmpty())){
			selectValueFromList(relationshipWithTheInsuredCPA,additionalDetailEntity.getStringValueForField("RelationshipWithTheInsuredCPA"));
		}
	}

	//Motor
	public void fillAndSubmitAdditonalVehicleDetails(AdditionalDetailEntity additionalDetailEntityData, CustomAssert assertReference) throws InterruptedException {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add") 
				&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
			//	switchToWindow("The New India Assurance Co. Ltd.");
			//click(additionalVehicleDetails);	
			String Engineno;
			Engineno = additionalDetailEntityData.getStringValueForField("Engineno");
			if ((Engineno!=null)&&(!Engineno.isEmpty())){
				clearAndSendKeys(enginenotextarea,additionalDetailEntityData.getStringValueForField("Engineno"));
			}

			String Chasisno;
			Chasisno = additionalDetailEntityData.getStringValueForField("Chasisno");
			if ((Chasisno!=null)&&(!Chasisno.isEmpty())){
				clearAndSendKeys(chasisnotextarea,additionalDetailEntityData.getStringValueForField("Chasisno"));

			}		

			String colourOfVehicle;
			colourOfVehicle = additionalDetailEntityData.getStringValueForField("colourOfVehicle");
			if ((colourOfVehicle!=null)&&(!colourOfVehicle.isEmpty())){
				selectValueFromList(colourOfVehicletextDropdown,additionalDetailEntityData.getStringValueForField("colourOfVehicle"));
			}

			String colourasperRCBook1;
			colourasperRCBook1 = additionalDetailEntityData.getStringValueForField("ColourasperRCBook");
			if ((colourasperRCBook1!=null)&&(!colourasperRCBook1.isEmpty())){
				clearAndSendKeys(colourAsPerRCBooktextarea,additionalDetailEntityData.getStringValueForField("ColourasperRCBook"));
			}		


			String DateofRegistration;
			DateofRegistration = additionalDetailEntityData.getStringValueForField("DateofRegistration");
			if ((DateofRegistration!=null)&&(!DateofRegistration.isEmpty())){
				clearAndSendKeys(dateofRegistration,additionalDetailEntityData.getStringValueForField("DateofRegistration"));		
			}

			String RegistrationNumber1;
			RegistrationNumber1 = additionalDetailEntityData.getStringValueForField("RegistrationNumber1");
			if ((RegistrationNumber1!=null)&&(!RegistrationNumber1.isEmpty())){

				clearAndSendKeys(registrationNumber1,additionalDetailEntityData.getStringValueForField("RegistrationNumber1"));		
			}
			String RegistrationNumber2;
			RegistrationNumber2 = additionalDetailEntityData.getStringValueForField("RegistrationNumber2");
			if ((RegistrationNumber2!=null)&&(!RegistrationNumber2.isEmpty())){
				clearAndSendKeys(registrationNumber2,additionalDetailEntityData.getStringValueForField("RegistrationNumber2"));		
			}
			String RegistrationNumber3;
			RegistrationNumber3 = additionalDetailEntityData.getStringValueForField("RegistrationNumber3");
			if ((RegistrationNumber3!=null)&&(!RegistrationNumber3.isEmpty())){
				clearAndSendKeys(registrationNumber3,additionalDetailEntityData.getStringValueForField("RegistrationNumber3"));		
			}
			String RegistrationNumber4;
			RegistrationNumber4 = additionalDetailEntityData.getStringValueForField("RegistrationNumber4");
			if ((RegistrationNumber4!=null)&&(!RegistrationNumber1.isEmpty())){
				clearAndSendKeys(registrationNumber4,additionalDetailEntityData.getStringValueForField("RegistrationNumber4"));		
			}
		}
	}


	public void fillTravellerDetails(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {

		String travellerDetails;
		travellerDetails = additionalDetailEntityData.getStringValueForField("TravellerDetailsDropdown");
		if ((travellerDetails!=null)&&(!travellerDetails.isEmpty())){
			click(travellerDetailsDropdown);
		}
		String passportNo;
		passportNo = additionalDetailEntityData.getStringValueForField("PassportNo");
		if ((passportNo!=null)&&(!passportNo.isEmpty())){
			clearAndSendKeys(passportno,additionalDetailEntityData.getStringValueForField("PassportNo"));
		}
		String passporTexpirydate;
		passporTexpirydate = additionalDetailEntityData.getStringValueForField("PassporTexpirydate");
		if ((passporTexpirydate!=null)&&(!passporTexpirydate.isEmpty())){
			clearAndSendKeys(passporTexpiryDate,additionalDetailEntityData.getStringValueForField("PassporTexpirydate"));
		}

		String visaType;
		visaType = additionalDetailEntityData.getStringValueForField("VisaType");
		if ((visaType!=null)&&(!visaType.isEmpty())){
			clearAndSendKeys(visatype,additionalDetailEntityData.getStringValueForField("VisaType"));
		}
		String occupation;
		occupation = additionalDetailEntityData.getStringValueForField("OccupationT");
		if ((occupation!=null)&&(!occupation.isEmpty())){
			selectValueFromList(occupationT,additionalDetailEntityData.getStringValueForField("OccupationT"));
		}
		String universityname;
		universityname = additionalDetailEntityData.getStringValueForField("Universityname");
		if ((universityname!=null)&&(!universityname.isEmpty())){
			clearAndSendKeys(universitynametextarea,additionalDetailEntityData.getStringValueForField("Universityname"));
		}
		String universityAddress;
		universityAddress = additionalDetailEntityData.getStringValueForField("UniversityAddress");
		if ((universityAddress!=null)&&(!universityAddress.isEmpty())){
			clearAndSendKeys(universityAddtextarea,additionalDetailEntityData.getStringValueForField("UniversityAddress"));
		}
		String sponsorName;
		sponsorName = additionalDetailEntityData.getStringValueForField("SponsorName");
		if ((sponsorName!=null)&&(!sponsorName.isEmpty())){
			clearAndSendKeys(sponsornametextarea,additionalDetailEntityData.getStringValueForField("SponsorName"));
		}

		String sponsorAdd;
		sponsorAdd = additionalDetailEntityData.getStringValueForField("SponsorAddress");
		if ((sponsorAdd!=null)&&(!sponsorAdd.isEmpty())){
			clearAndSendKeys(sponsorAddtextarea,additionalDetailEntityData.getStringValueForField("SponsorAddress"));
		}
	}
	public void fillOtherDetails(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference) {
		String otherdetailsDropDown;
		otherdetailsDropDown = additionalDetailEntityData.getStringValueForField("OtherdetailsDropDown");
		if ((otherdetailsDropDown!=null)&&(!otherdetailsDropDown.isEmpty())){
			click(otherDetailsDropDown);
		}

		String nameOfThenominee;
		nameOfThenominee = additionalDetailEntityData.getStringValueForField("NameOfThenominee");
		if ((nameOfThenominee!=null)&&(!nameOfThenominee.isEmpty())){
			clearAndSendKeys(nameOftheNominee,additionalDetailEntityData.getStringValueForField("NameOfThenominee"));
		}

		String relationshipnominee;
		relationshipnominee = additionalDetailEntityData.getStringValueForField("Relationshipnominee");
		if ((relationshipnominee!=null)&&(!relationshipnominee.isEmpty())){
			selectValueFromList(relationshipNominee,additionalDetailEntityData.getStringValueForField("Relationshipnominee"));
		}

		String yesRadio;
		yesRadio = additionalDetailEntityData.getStringValueForField("YesRadio");
		if ((yesRadio!=null)&&(!yesRadio.isEmpty())){
			click(yesradio);
		}
		String noRadio;
		noRadio = additionalDetailEntityData.getStringValueForField("NoRadio");
		if ((noRadio!=null)&&(!noRadio.isEmpty())){
			click(noradio);
		}
	}
	public void saveAndContinue(AdditionalDetailEntity additionalDetailEntityData,CustomAssert assertReference){
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")
				&& additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
				//&&(!additionalDetailEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover"))) {
			click(saveandcontinueButtonM);
		}
		else if(additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")) {
			click(saveandcontinueButton);
			try {
				click(oKButtonT);
				switchToFrame("formViews");
			}catch (Exception e) {
			}
		}
		else if(additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")
			&&(!additionalDetailEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover"))){
			click(saveandcontinueButton1);
			try {
				click(oKButtonT);
				switchToFrame("formViews");
			}catch (Exception e) {
			}
		}
		else if(!(additionalDetailEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone CPA cover"))) {
			click(saveandcontinueButton1);
		}
		
	}

	private void fillAndSubmitLocationAddress(AdditionalDetailEntity additionalDetailEntityData, CustomAssert customAssert) {
		if(additionalDetailEntityData.getAction().equalsIgnoreCase("add")&& !additionalDetailEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS"))  {
			String loactionAddressDD;
			loactionAddressDD = additionalDetailEntityData.getStringValueForField("LoactionAddressDropDown");
			if ((loactionAddressDD!=null)&&(!loactionAddressDD.isEmpty())){				
				click(loactionAddressDropDown); 			
			}

			String isTheLoacAddSame;
			isTheLoacAddSame = additionalDetailEntityData.getStringValueForField("IsTheLoacAddSame");
			if ((isTheLoacAddSame!=null)&&(!isTheLoacAddSame.isEmpty())){
				click(isTheLoacAddSameRadioButton);
			}
		}
	}
	


	public void clickOnUploadFileButton(AdditionalDetailEntity additionalDetailEntityData,CustomAssert customAssert) throws IOException, InterruptedException, AWTException  {

		String UploadFile;
		UploadFile  = additionalDetailEntityData.getStringValueForField("BrowseFile");
		if ((UploadFile!=null)&&(!UploadFile.isEmpty())){

			//switchToWindow1("Alert");
			//click(uploadFileButton);
			doubleClick(browseFileButton);			
			//Thread.sleep(2000);
			Runtime.getRuntime().exec("D:\\NIATestPortal\\AutoIT\\UploadScript1.exe");
			//Runtime.getRuntime().exec(FrameworkServices.getConfigProperties().getProperty("ExePath"));
			Thread.sleep(2000);
			System.out.println("File Uploded Successfully");
			click(uploadFileButton);

			/*  //For IE Browser
			WebElement path =driver.findElement(By.name("txtUpload"));
			path.sendKeys("‪D:\\NIATestPortal\\AutoIT");
			path.sendKeys("axis.pdf");
			path.sendKeys(Keys.ENTER);*/

			/* ClipboardOwner owner=null;
		    String claim=("D:\\Users\\Temp\\Desktop\\sagar\\uploadDemoFile.xlsx");
		    Robot r= new Robot();
		    StringSelection Attachment_path=new StringSelection(claim);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Attachment_path, owner);
		    r.setAutoDelay(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		    Thread.sleep(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_V);
		    Thread.sleep(5000);
		    r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		    r.setAutoDelay(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		    Thread.sleep(5000);
		    r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);*/


		}
	}
	public void fillAdditionalDetailPage(AdditionalDetailEntity additionalDetailEntity,CustomAssert customAssert) throws InterruptedException, IOException, AWTException{
		fillAndSubmitAdditonalVehicleDetails(additionalDetailEntity, customAssert);
		fillAndSubmitPersonalDetailPage(additionalDetailEntity, customAssert);
		fillAndSubmitSELFPage(additionalDetailEntity, customAssert);
		fillAndSubmitLocationAddress(additionalDetailEntity, customAssert);
		fillAndSubmitAdditionalDetails(additionalDetailEntity, customAssert);
		fillAndSubmitMemberInfoPage(additionalDetailEntity, customAssert);
		fillPhysicianInformation(additionalDetailEntity, customAssert);
		fillAddressOfBuilding(additionalDetailEntity, customAssert);
		fillAddressOfOfficeInsured(additionalDetailEntity, customAssert);
		fillAddressOfShop(additionalDetailEntity, customAssert);
		fillAddtionalCovers(additionalDetailEntity, customAssert);
		fillAndSubmitNomineePage(additionalDetailEntity, customAssert);
		fillAndSubmitAdditionalDetailsMiscPersonal(additionalDetailEntity, customAssert);
		fillTravellerDetails(additionalDetailEntity, customAssert);
		fillOtherDetails(additionalDetailEntity, customAssert);
		fillAndSubmitAdditionalDetailsCPA(additionalDetailEntity, customAssert);
		saveAndContinue(additionalDetailEntity, customAssert);
		
	
	}
}	

