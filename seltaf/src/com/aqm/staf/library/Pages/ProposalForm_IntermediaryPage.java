package com.aqm.staf.library.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.exceptions.ScriptExecutionException;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.PrpslFrm_IntrmdryEntity;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class ProposalForm_IntermediaryPage extends BasePage {
	private PageElement policyHolderInfoDropdown;
	private PageElement newCustomerRadioButton;
	private PageElement categoryRadioButton;
	private PageElement titleDropDown;
	private PageElement firstNametextarea;
	private PageElement lastNametextarea;
	private PageElement genderMaleRadioButton;
	private PageElement genderfemaleRadioButton;
	private PageElement dateTextField;
	private PageElement buildinotextarea;
	private PageElement statetextarea;
	private PageElement pincodetextarea;
	private PageElement mobilenotextarea;
	private PageElement createButton;
	private PageElement memberinfoDropdown;
	private PageElement occupation1Dropdown;
	private PageElement daughterDropdown;
	private PageElement daughterNametextarea;
	private PageElement daughterOccupationDropdown;
	private PageElement nomineeDetailsDropdown;
	private PageElement nomineeNametextarea;
	private PageElement nomineeRelationshipdropDown;
	private PageElement nomineeRelshipdropDown;
	private PageElement relationDetailsdropDown;
	private PageElement agentRequiredRadioButton;
	private PageElement saveButton;
	private PageElement approveAndPaybtn;
	private PageElement confirmbtn;
	private PageElement selectstate;
	private PageElement selectpincode;
	private PageElement travellerDetailsDropdown;
	private PageElement passportTextField;
	private PageElement visaTypeTextField;
	private PageElement passportExpDtTextField;
	private PageElement additionalDetailsDropdown;
	private PageElement occupationDropdown;
	private PageElement nomineeNameTextareaPA;
	private PageElement relationwithNomineeDropdown;
	private PageElement livestockTypeDropDown;
	private PageElement tagNumberTextField;
	private PageElement maleRedioButton;
	private PageElement femaleRedioButton;
	private PageElement ageTextField;
	private PageElement purchaseDate;
	private PageElement sumInsuredDropDown;
	private PageElement livestockDetailsTab;
	private PageElement enginenotextarea;
	private PageElement chasisnotextarea;
	private PageElement colourAsPerRCBooktextarea;
	private PageElement colourOfVehicletextDropdown;
	private PageElement anywhereInTheWorldExcludingUSAandcanada;
	private PageElement anywhereInTheWorldIncludingUSAandcanada;
	private PageElement businessT;
	private PageElement holidaysRadioBtn;
	private PageElement leavingIndiaon;
	private PageElement returningtoIndiaOn;
	private PageElement dateOfBirth;
	private PageElement bOne;
	private PageElement bTwo;
	private PageElement otherDetailsDropDown;
	private PageElement nameOftheNominee;
	private PageElement relationshipNominee;
	private PageElement yesradio;
	private PageElement noradio;
	private PageElement transitDetailsTab;
	private PageElement modeOfTransportDropDown;
	private PageElement fromCountryTextField;
	private PageElement toCountryTextField;
	private PageElement fromCityTextField;
	private PageElement toCityTextField;
	private PageElement portOfLoadingTextField;
	private PageElement portOfDischargeTextField;
	private PageElement quoteNoLabel;
	private PageElement travelDestinationRadioButton;
	private PageElement travelPurposeRadioButton;
	private PageElement leavingIndiaTextField;
	private PageElement returningIndiaTextField;
	private PageElement dateOfBirthTextField;
	private PageElement planRadioButton;
	private PageElement travelDurationDroDown;
	private PageElement occupationsDropdown;
	private PageElement cargoDetailsTab;
	private PageElement cargoTypeDropdown;
	private PageElement packagingDropdown;
	private PageElement cargoSumInsuredInRStextarea;
	private PageElement cargoRatepercentagetextarea;
	private PageElement invoiceNumbertextarea;
	private PageElement percentageExtratextarea;
	private PageElement buyInsuranceForANewVehicle;
	private PageElement renewExistingPolicyFromAnyInsurer;
	private PageElement policyPeriodTab;
	private PageElement yearDropdown;
	private PageElement makeDropdown;
	private PageElement vehicleZoneDropDown;
	private PageElement vehicleZoneDropDown1;
	private PageElement modelTextField;
	private PageElement vehicleDetails;
	private PageElement saveAndCalculatePremiumButton;
	private PageElement inlandTransitClauseA;
	private PageElement inlandTransitClauseB;
	private PageElement inlandTransitClauseC;
	private PageElement policyStartDatetextarea;
	private PageElement policyEndDatetextarea;
	private PageElement nametextarea;
	private PageElement femaleRadioButton;
	private PageElement maleRadioButton;
	private PageElement policyPeriodTabForRural;
	private PageElement travelDetails;
	private PageElement maleRedioButtonForRural;
	private PageElement physicianInformationTab;
	private PageElement physicianName;
	private PageElement addressofFamilyPhysician;
	private PageElement yesRadioButton;
	private PageElement noRadioButton;
	private PageElement childDropdown;
	private PageElement childfemaleRadiobutton;
	private PageElement newCustomer;
	private PageElement existingCustomer;
	private PageElement individual;
	private PageElement organization;
	private PageElement typeOfShop;
	private PageElement shopAddrsYesRadio;
	private PageElement shopAddrsNoRadio;
	private PageElement shopAddress;
	private PageElement pINCode;
	private PageElement sumInsureBuildng;
	private PageElement sumInsurfireFurnitur;
	private PageElement sumInsurStockTrade;
	private PageElement shopAddrssToInsurTab;
	private PageElement standrdCoversTab;
	private PageElement additionalCoversTab;
	private PageElement publicLiability;
	private PageElement moneyInsurancSec3;
	private PageElement pedalCycle;
	private PageElement plateGlass;
	private PageElement neonGlownSign;
	private PageElement workmenCompensatnCover;
	private PageElement electrncQuipmnt;
	private PageElement publicLiabilitySubTab;
	private PageElement limitForPublicLiablty;
	private PageElement moneyInsurncSubTab;
	private PageElement moneyInTransit;
	private PageElement moneyInCounter;
	private PageElement moneyInLocked;
	private PageElement planC;
	private PageElement universitynameTextField;
	private PageElement universityAddTextField;
	private PageElement sponsornameTextField;
	private PageElement sponsoraddressTextField;
	private PageElement riskDetailsTab;
	private PageElement detailsOfExistingPhysicalDisabilities;
	private PageElement nomineeName;
	private PageElement relationshipOfTheNomineeWithInsured;
	private PageElement nomineeAddress;
	private PageElement sumInsuredOnTheDwellingUnit;
	private PageElement sumInsuredOnTheContents;
	private PageElement totalSumInsured;
	private PageElement excessIn;
	private PageElement doYouWantToCoverYourTractor;
	private PageElement identificationNoOfTheDwellingUnitHouse;
	private PageElement locationOfDwellingUnitHouse;
	private PageElement descriptionAboutDwellingUnitHouse;
	private PageElement isItKatchaConstruction;
	private PageElement descriptionAboutTheContentsInTheDwelling;
	private PageElement isLoadingApplicable;
	private PageElement fireAlliedPerilsEarthauake;
	private PageElement relationDetails;
	private PageElement isAgentRequired;
	private PageElement selectCommercialVehicleTypeDropDown;
	// private PageElement DOBTextField ;
	private PageElement typeOfGoodsCarryingDropdown;
	private PageElement GoodscarryingvehicledescriptionDropdown;
	private PageElement TypeofbodyDropdown;
	private PageElement TypeofbodyPrivateCar;
	private PageElement vehicalpurchaseDate;
	private PageElement seatingCapacitytextarea;
	private PageElement vehiclePermitDetailsDropdown;
	private PageElement IMT23YesRadioButton;
	private PageElement IMT23NoRadioButton;
	// private PageElement vehicleZone;
	private PageElement registrationDatetextarea;
	private PageElement registrationDateofcommercialcar;
	private PageElement RegistrationNo1textarea;
	private PageElement RegistrationNo2textarea;
	private PageElement RegistrationNo3textarea;
	private PageElement RegistrationNo4textarea;
	private PageElement fuelTypeDropdown;
	private PageElement applicableNCBPercentDropdown;
	private PageElement coverageDetailsTab;
	private PageElement ownerDriveYesRadiobutton;
	private PageElement ownerDriveNoRadiobutton;
	private PageElement ownerLicenseTypeDropdown;
	private PageElement gstinIndTextBox;
	private PageElement typeOfRegIndDropDown;
	private PageElement PreviousInsurerDetailsTabButton;
	private PageElement previousInsurerName;
	private PageElement previousPolicyNumber;
	private PageElement previousPolicyAddress;
	private PageElement previousPolicyExpDate;
	private PageElement previousPolicyExpDateforCV;
	private PageElement riskDetails;
	private PageElement physicalDisabilityfarmerCov;
	private PageElement sumInsuredDwelling;
	private PageElement excessPercent;
	// DHK Start
	private PageElement isTheAboveBuildingAddressRadioButtonYes;
	private PageElement isTheAboveBuildingAddressRadioButtonNo;
	private PageElement buildingNoStreet;
	private PageElement locality;
	private PageElement pINCodeBuildingAddress;
	private PageElement burglaryAndHousebreakingDropDown;
	private PageElement jewelleryAndValuablesDropDown;
	private PageElement domesticApplianceDropDown;
	private PageElement televisionDesktopDropDown;
	private PageElement fireAndAlliedPerilsReqYes;
	private PageElement fireAndAlliedPerilsReqNo;
	private PageElement sumInsuredEarthquakeTerrorismDropDown;
	private PageElement addJewelleryButton;
	private PageElement broadDescriptionForJewelleryAndValuables;
	private PageElement weightVolForJewelleryAndValuables;
	private PageElement value;
	private PageElement addApplianceButton;
	private PageElement domesticMake;
	private PageElement domesticModel;
	private PageElement domesticYear;
	private PageElement tvMake;
	private PageElement tvModel;
	private PageElement tvYear;
	private PageElement fireAndAlliedPerilsTelevisionDesktopYes;
	private PageElement fireAndAlliedPerilsTelevisionDesktopNo;
	private PageElement sumInsuredTelevisionDesktop;
	private PageElement financierDetailsDropDown;
	private PageElement premisesHypBankRadioButtonYes;
	private PageElement premisesHypBankRadioButtonNo;
	private PageElement nameOfTheBankAndBranch;
	private PageElement sumInsuredOfBuildingSection1A;
	private PageElement dwellingContent;
	private PageElement description;
	private PageElement sumInsuredInRs;
	private PageElement domesticAppliances;
	private PageElement jewelleryCover;
	private PageElement portableEquipment;
	private PageElement TVDVDandCDset;
	private PageElement pedalCycleAdditionalCover;
	private PageElement workmenCompensation;
	private PageElement domesticAppliancesSectionFive;
	private PageElement domesticAppliancesOneAppliance;
	private PageElement domesticAppliancesOneDescription;
	private PageElement domesticAppliancesOneSumInsured;
	private PageElement jewelleryCoverSection3A;
	private PageElement jewelleryTypeOfJewelleryOrnament;
	private PageElement descriptionOfJewelleryOrnaments;
	private PageElement valueSumInsuredOfJewellery;
	private PageElement portableEquipmentSection3BOptional;
	private PageElement typeOfPortableEquipment;
	private PageElement descriptionOfPortableEquipment;
	private PageElement valueSumInsuredOfPortableEquipment;
	private PageElement tVDVDAndCDSetSection6Optional;
	private PageElement tVDVDCD;
	private PageElement tVDVDCDDescription;
	private PageElement tVDVDCDSumInsured;
	private PageElement pedalCyclesSection7Optional;
	private PageElement pedalCycleSectionSeven;
	private PageElement descriptionSectionSeven;
	private PageElement sumInsuredSectionSeven;
	private PageElement workmenCompensationCoverSection10Optional;
	private PageElement natureOfWork;
	private PageElement noOfEmployees;
	private PageElement monthlyWages;
	private PageElement typeOfOccupantOwner;
	private PageElement typeOfOccupantTenant;
	private PageElement officeAddress;
	private PageElement isYourAboveAddressSameAsOfficeAddressYes;
	private PageElement isYourAboveAddressSameAsOfficeAddressNo;
	private PageElement pINCodeOfficeToBeInsured;
	private PageElement addressOfOfficeToBeInsured;
	private PageElement sumInsuredOfBuildingIncludingFixtureAndFittings;
	private PageElement provisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval;
	private PageElement totalSumInsuredInRsSection1;
	private PageElement businessFurnitureFurnishingsSafesOfficeMachineryCheckBox;
	private PageElement businessFurnitureFurnishingsSafesOfficeMachineryTextBox;
	private PageElement documentsInRsCheckBox;
	private PageElement documentsInRsTextBox;
	private PageElement telephoneGasAndElectricMetersInRsCheckBox;
	private PageElement telephoneGasAndElectricMetersInRsTextBox;
	private PageElement tenantsImprovementAndDecorationInRsCheckBox;
	private PageElement tenantsImprovementAndDecorationInRsTextBox;
	private PageElement pedalCyclesInRsCheckBox;
	private PageElement pedalCyclesInRsTextBox;
	private PageElement electronicEquipmentInRsCheckBox;
	private PageElement electronicEquipmentInRsTextBox;
	private PageElement allOtherContentsInRsCheckBox;
	private PageElement allOtherContentsInRsTextBox;
	private PageElement professionalInstrumentsAndEquipmentsInRsCheckBox;
	private PageElement professionalInstrumentsAndEquipmentsInRsTextBox;
	private PageElement totalSumInsuredInRs;
	private PageElement clothingAndPersonalEffectsInRsCheckBox;
	private PageElement clothingAndPersonalEffectsInRsTextBox;
	private PageElement temporaryRemovalOfDocumentsInRsCheckBox;
	private PageElement temporaryRemovalOfDocumentsInRsTextBox;
	private PageElement costOfRemovalOfDebrisInRsCheckBox;
	private PageElement costOfRemovalOfDebrisInRsTextBox;
	private PageElement ancilliaryCoversTotalSumInsuredInRs;
	private PageElement burglaryDetailsLimitAnyOneLossForBurglaryContentsInRs;
	private PageElement totalSumInsuredForTheTenantLiabilityInRs;
	private PageElement moneyInTransitOverThePolicyPeriodAnnualTurnover;
	private PageElement perCarryingLimitInRs;
	private PageElement moneyInOfficeDuringDusinessHoursInRs;
	private PageElement moneyInLockedSafeInOfficeOutsideBusinessHoursInRs;
	private PageElement descriptionOfPlateGlass;
	private PageElement dimensionOfPlateGlass;
	private PageElement valueOfPlateGlassInRs;
	private PageElement totalValueOfPlateGlassInRs;
	private PageElement valueOfSanitaryFittingsInRs;
	private PageElement valueOfSignsNamePlatesInRs;
	private PageElement totalSumInsuredOfFixedGlassSanitaryFittingsInRs;
	private PageElement machineName;
	private PageElement machineMake;
	private PageElement equipmentId;
	private PageElement yearOfManufacture;
	private PageElement sumInsuredMachineInRs;
	private PageElement sumInsuredForDamageToElectronicEquipmentInRs;
	private PageElement limitOfIndemnityInRs;
	private PageElement indemnityPeriodInMonths;
	private PageElement descriptionOfItem;
	private PageElement yearOfMake;
	private PageElement valueInRs;
	private PageElement totalSumInsuredForBreakDownOfOfficeAppliances;
	private PageElement tenantsLabilitySection3Optional;
	private PageElement moneyInsuranceSection4Optional;
	private PageElement fixedGlassSanitaryFittingsSection5Optional;
	private PageElement damageToElectronicEquipmentsSection7Optional;
	private PageElement additionalExpensesOfRentSection10Optional;
	private PageElement breakDownOfficeAppliancesSection12Optional;
	private PageElement tenantsLabilityCheckBox;
	private PageElement moneyInsuranceCheckBox;
	private PageElement fixedGlassSanitaryFittingsCheckBox;
	private PageElement damageToElectronicEquipmentsCheckBox;
	private PageElement additionalExpensesOfRentCheckBox;
	private PageElement breakDownOfficeAppliancesCheckBox;
	private PageElement addressOfTheBuildingToBeInsuredDropDown;
	private PageElement localityTextbox;
	private PageElement passportNumber;
	private PageElement dateOfIssueOfPassport;
	private PageElement countryOfVisit;
	private PageElement nameOfTheEmployer;
	private PageElement profession;
	private PageElement countryOfVisitFlashText;
	// End DHK
	// Pravina
	private PageElement cattleDetailsDropDown;
	private PageElement tagNo;
	private PageElement typeofPolicyNonSchemeRadioButton;
	private PageElement schemeTypeNSDropDown;
	private PageElement addCattleButton;
	private PageElement cattleTypeDropDown;
	private PageElement originOfcattle;
	private PageElement cattlegenderMaleRadioButton;
	private PageElement cattlegenderFemaleRadioButton;
	private PageElement ageYearstextfield;
	private PageElement ageMonthstextfield;
	private PageElement nameOfOwner;
	private PageElement purposeOfUse;
	private PageElement breedColorMark;
	private PageElement marketValue;
	private PageElement natureOfId;
	private PageElement idDocno;
	private PageElement heightText;
	private PageElement weightText;
	private PageElement policyStartDatePopUp;
	private PageElement insuredDetailsTab;
	private PageElement titleDrpDown;
	private PageElement firstNmeTextField;
	private PageElement midddleNmeTextField;
	private PageElement lastNmeTextField;
	private PageElement maleRadiobtn;
	private PageElement femaleRadiobtn;
	private PageElement dOB;
	private PageElement buildingStretNOTxtField;
	private PageElement localityTextField;
	private PageElement stateTextField;
	private PageElement pinCodeTextField;
	private PageElement cityTextFieled;
	private PageElement mobNOTextField;
	private PageElement createbtn;
	private PageElement occupationDropDown;
	private PageElement dboInsuredDatails;
	private PageElement maleRadiobtnInsuredD;
	private PageElement femaleRadiobtnInsuredD;
	private PageElement physicalDisTextField;
	private PageElement grossAnnualIncome;
	private PageElement nomineeNameTextFiled;
	private PageElement nomineeAddTextFiled;
	private PageElement nomineeRelationDrop;
	private PageElement insureddropdown;
	private PageElement relationshipWithTheNominee;
	private PageElement originOfRiskDropDown;
	private PageElement hutDetailsdropdown;
	private PageElement nameofItemtextfiled;
	private PageElement sumInsuredforpukkawRCCDropDown;
	private PageElement sumInsuredPukkatextfiled;
	private PageElement typeOfHutRadioButton;
	private PageElement typeOfHelathIn;
	private PageElement addMemberButton;
	private PageElement dateOfBirthMemm;
	private PageElement nomineenameMember;
	private PageElement relwithNomineeDropDown;
	private PageElement preexstingCond;
	private PageElement sumInsuredmemDropDown;
	private PageElement sumInsuredmemJPSB;
	private PageElement anyPhysicalprbradiobutton;
	private PageElement occupationMemDropDwn;
	private PageElement nameOfTheInsuredSelf;
	private PageElement occupationOfTheMemberSelf;
	private PageElement nomineeNameSelf;
	private PageElement relationshipWithTheNomineeSelf;
	private PageElement selfTab;
	private PageElement relationshipWithNomineePolicyHolder;
	private PageElement nomineeNamePolicyHolder;
	private PageElement earnHeadYesRadioButton;
	private PageElement earnHeadNoRadioButton;
	private PageElement preexistingDisease;
	private PageElement policyDurationDropDown;
	private PageElement nomineeDOB;
	private PageElement earningMemberWS;
	private PageElement nonEarningMemberWS;
	private PageElement minorWS;
	private PageElement JanataPAInsOccupation;
	private PageElement janataPASumInsured;
	private PageElement janataPAInsDOB;
	private PageElement janataPAInsPhyDis;
	private PageElement janataPANomineeName;
	private PageElement janataPANomineeRelation;
	private PageElement janataPANomineeAddress;
	private PageElement janataPANomineeDOB;
	private PageElement marketValue1;
	private PageElement oKButton;
	private PageElement childNatureOfID;
	private PageElement childIdDocNo;
	private PageElement policyHolderCode;
	// sagar motor CV
	private PageElement typeOfPasengerCarrying;
	private PageElement carryingCapacity;
	private PageElement vehicleInvoiceValue;
	private PageElement insuredDeclaredValue;
	private PageElement purpuseOfPassengerVehicle;
	private PageElement typeofbodyPassengerCarrying;
	private PageElement typeOfMiseAndSpecialType;
	private PageElement distanceCovered;
	private PageElement transitToTextField;
	private PageElement transitFromTextField;
	private PageElement typeOfRaodRisk;
	private PageElement basisOfRoadTransitDropDown;
	private PageElement nameOfDriver;
	private PageElement tradecertificateValue;
	private PageElement drivinglicenceValue;
	private PageElement salryOfDriverTextfield;
	private PageElement typeofbodyMiscCarrying;
	private PageElement typeofbodyOther;
	private PageElement typeofbodyMiseSpecialType;
	private PageElement uploadFileButton;
	private PageElement continueButton;
	private PageElement browseProposerButton;
	private PageElement browseChildButton;
	
	//Manage Quote : MOtor for CV
	private PageElement manageQuote;
	private PageElement quoteNoText;
	private PageElement quoteNoSearchbtn;
	private PageElement collectionPremiumIcon;
	
	//StandAloneODDetails
	private PageElement StandaloneODDetailsTab;
	private PageElement insurernmofexistingBundledLiabilitypolicy;
	private PageElement existingBundledPolicyNo;
	private PageElement BundledPolicyStartDate;
	private PageElement BundledPolicyExpiryDate;
	private PageElement dateoffirstpurchaseofvehiclebyoriginalpurchaser;
	private PageElement panNo;

	// ("//label[contains(text(),'Coverage Details')]/following::input[1]")
	public ProposalForm_IntermediaryPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyHolderInfoDropdown = new PageElement(By.xpath("//span[contains(text(),'Policy holder information')]"),
				"Policy HolderInfo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		newCustomerRadioButton = new PageElement(By.xpath("//span[contains(text(),'New Customer')]"), "New Customer",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		categoryRadioButton = new PageElement(By.xpath("//span[contains(text(),'Individual')]"), "Category", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		titleDropDown = new PageElement(By.xpath("//select[@name='typeOfOrg']"), "Title", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		firstNametextarea = new PageElement(By.xpath("//input[@name='firstNameCreate']"), "first Name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lastNametextarea = new PageElement(By.xpath("//input[@name='lastNameCreate']"), "Last Name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		genderMaleRadioButton = new PageElement(By.xpath("//span[contains(text(),'Male')]"), "Gender Male", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		genderfemaleRadioButton = new PageElement(By.xpath("//span[contains(text(),'Female')]"), "Gender Female", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateTextField = new PageElement(By.xpath("//input[@placeholder='Date of Birth (dd/mm/yyyy)']"), "Date Field",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		buildinotextarea = new PageElement(By.xpath("//textarea[@name='address1']"), "building no", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statetextarea = new PageElement(By.xpath("//input[@name='stateInd']"), "State", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pincodetextarea = new PageElement(By.xpath("//input[@name='pincodeInd']"), "Pincode", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);
		mobilenotextarea = new PageElement(By.xpath("//input[@name='mobileInd']"), "Mobile no", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		createButton = new PageElement(By.xpath("//button[contains(text(),'Create')]"), "createBtn", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderCode = new PageElement(By.xpath("//table[@class='table table-striped']//th[@scope='row']"),
				"Policy holder code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberinfoDropdown = new PageElement(By.xpath("//span[contains(text(),'Member Information ')]"),
				"Member Information ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		occupation1Dropdown = new PageElement(By.xpath("//select[@name='propOccupation']"), "occupation", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		daughterNametextarea = new PageElement(By.xpath("//input[@name='childName0']"), "Daughter name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		daughterOccupationDropdown = new PageElement(By.xpath("//select[@name='childOccupation0']"),
				"Daughter occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		daughterDropdown = new PageElement(By.xpath("//label[contains(text(),'Daughter1')]"), "Daughter", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		nomineeDetailsDropdown = new PageElement(By.xpath("//span[contains(text(),'Nominee Details')]"),
				"Nominee Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeNametextarea = new PageElement(By.xpath("//input[@placeholder='Nominee Name']"), "Nominee name", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		travelDetails = new PageElement(By.xpath("//span[contains(text(),'Travel Details')]"), "Travel Details", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeRelationshipdropDown = new PageElement(By.xpath("//select[@name='nomineeRel']"), "Nominee Realtinship",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeRelshipdropDown = new PageElement(By.xpath("//select[@id='relOfNomineeWithIns']"), "Nominee Realtinship",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relationDetailsdropDown = new PageElement(By.xpath("//span[contains(text(),'Relation Details')]"),
				"Relation Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		agentRequiredRadioButton = new PageElement(By.xpath("//input[@id='agentRequired2']"), "Agent Required", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton = new PageElement(By.xpath("//button[contains(text(),'Save')]"), "Save Btn", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		approveAndPaybtn = new PageElement(By.xpath("//button[contains(text(),'Approve') ]"), "Approve and Pay Btn",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		confirmbtn = new PageElement(By.xpath("//button[contains(text(),'Confirm')]"), "Confirm Btn", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectstate = new PageElement(By.xpath("//a[@class='ng-binding']"), "Select State", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectpincode = new PageElement(By.xpath("//strong[contains(text(),'416229')]"), "Select pincode", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		travelDestinationRadioButton = new PageElement(By.id("TravelDestination0"), "Travel Destination", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		travelPurposeRadioButton = new PageElement(By.id("TravelPurpose0"), "Travel Purpose", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		leavingIndiaTextField = new PageElement(By.name("leavingIndia"), "leaving India", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		returningIndiaTextField = new PageElement(By.name("returningIndia"), "returning India", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField = new PageElement(By.name("ompDateOfBirth"), "Date Of Birth", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		planRadioButton = new PageElement(By.name("Plan0"), "Plan", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		occupationsDropdown = new PageElement(By.xpath("//select[@name='occupation']"), "occupations", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		travellerDetailsDropdown = new PageElement(By.xpath("//span[contains(text(),'Traveller Details')]"),
				"Traveller Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		passportTextField = new PageElement(By.name("passport"), "Passport", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		visaTypeTextField = new PageElement(By.name("visaType"), "VisaType", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		passportExpDtTextField = new PageElement(By.name("passportExpDt"), "PassportExpDt", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalDetailsDropdown = new PageElement(By.xpath("//span[contains(text(),'Additional Details')]"),
				"AdditionalDetails", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		occupationDropdown = new PageElement(By.xpath("//select[@name='propOccupation']"), "occupation", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeNameTextareaPA = new PageElement(By.name("nomineeName"), "NomineeNmae PA", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationwithNomineeDropdown = new PageElement(By.name("nomineeRel"), "Relationwithnominee", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buyInsuranceForANewVehicle = new PageElement(By.id("newVehicle1"), "Buy insurance for a new vehicle", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// renewExistingPolicyFromAnyInsurer = new
		// PageElement(By.xpath("//span[contains(text(),'Renew existing policy from any
		// insurer')]"), "Renew existing policy from any insurer", false,
		// WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		renewExistingPolicyFromAnyInsurer = new PageElement(By.xpath("//input[@id='newVehicle2']"),
				"Renew existing policy from any insurer", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		// policyPeriodTab = new PageElement(By.xpath("//span[contains(text(),'Policy
		// Period')]"), "policy Period Tab", false,
		// WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPeriodTab = new PageElement(By.xpath("//span[contains(text(),'Policy') and contains(text(),'Period')]"),
				"policy Period Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		oKButton = new PageElement(By.xpath("//button[contains(text(),'OK')]"), "OK Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearDropdown = new PageElement(By.xpath("//select[@name='manufactureYear']"), "Manufacture Year", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		makeDropdown = new PageElement(By.xpath("//select[@name='vehicleMake']"), "make", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleZoneDropDown = new PageElement(By.xpath("//select[@name='vehicleZone']"), "Vehicle Zone", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleZoneDropDown1 = new PageElement(By.xpath("//select[@name='Zone']"), "Vehicle Zone", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modelTextField = new PageElement(By.xpath("//input[@name='vehicleModel']"), "model", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 15);
		vehicleDetails = new PageElement(By.xpath("//span[contains(text(),'Vehicle')]"), "Vehicle Details", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// shreeya
		cargoDetailsTab = new PageElement(By.xpath("//a/span[contains(text(),'Vessel Details')]/following::a[1]"),"cargo Details Tab	", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 30);
		cargoTypeDropdown = new PageElement(By.name("CargoType"), "Cargo Type", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 30);
		packagingDropdown = new PageElement(By.name("Packaging1"), "Packaging", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 30);
		cargoSumInsuredInRStextarea = new PageElement(By.name("CargoSumInsured"), "Cargo Sum Insured(In Rs.)", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		cargoRatepercentagetextarea = new PageElement(By.name("CargoRatept"), "Cargo Rate(%)", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		invoiceNumbertextarea = new PageElement(By.name("invoiceNumber"), "Invoice Numbe", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		percentageExtratextarea = new PageElement(By.name("ExtraPt"), "% Extra", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		enginenotextarea = new PageElement(By.xpath("//input[@name='engineNo']"), "Engine no", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chasisnotextarea = new PageElement(By.xpath("//input[@name='chasisNo']"), "chasis no", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		colourAsPerRCBooktextarea = new PageElement(By.name("colorAsPerRCbook"), "colour As Per RC Book", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		colourOfVehicletextDropdown = new PageElement(By.name("vehicleColor"), "colour Of Vehicle", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anywhereInTheWorldExcludingUSAandcanada = new PageElement(
				By.xpath("//span[contains(text(),'Anywhere in the world excluding USA and Canada')]"),
				"Anywhere in the world excluding USA and Canada", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		anywhereInTheWorldIncludingUSAandcanada = new PageElement(
				By.xpath("//span[contains(text(),'Anywhere in the world including USA and Canada')]"),
				"Anywhere in the world including USA and Canada", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessT = new PageElement(By.xpath("//span[contains(text(),'Business')]"), "Business", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		holidaysRadioBtn = new PageElement(By.xpath("//span[contains(text(),'Holiday')]"), "Business", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		leavingIndiaon = new PageElement(By.name("leavingIndia"), "Leaving India", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyStartDatetextarea = new PageElement(By.xpath("//input[@name='policyStartDate']"), "policyStartDate",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyEndDatetextarea = new PageElement(By.name("policyEndDate"), "policyEndDate", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nametextarea = new PageElement(By.name("propName"), "name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		femaleRadioButton = new PageElement(By.xpath("//label[@for='propGender1']"), "female Radio Button", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maleRadioButton = new PageElement(By.xpath("//label[@for='propGender0']"), "male Radio Button", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		returningtoIndiaOn = new PageElement(By.name("returningIndia"), "Returning India", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirth = new PageElement(By.name("ompDateOfBirth"), "Date Of Birth", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		bOne = new PageElement(By.xpath("//span[contains(text(),'B2')]"), "policy Period Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		bTwo = new PageElement(By.xpath("//span[contains(text(),'B1')]"), "policy Period Tab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		otherDetailsDropDown = new PageElement(By.xpath("//span[contains(text(),'Other Details')]"), "Other Details",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOftheNominee = new PageElement(By.xpath(" //input[@name='nameOftheNominee']"), "Name Of the Nominee", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipNominee = new PageElement(By.xpath("//select[@name='relationshipNominee']"), "Relationship Nominee",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yesradio = new PageElement(By.xpath("//input[@id='optionsRadios0']"), "Yes Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noradio = new PageElement(By.xpath("//input[@id='optionsRadios1']"), "No Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationshipNominee = new PageElement(By.xpath("//select[@name='relationshipNominee']"), "Relationship Nominee",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yesradio = new PageElement(By.xpath("//input[@id='optionsRadios0']"), "Yes Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noradio = new PageElement(By.xpath("//input[@id='optionsRadios1']"), "No Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// ajit
		livestockTypeDropDown = new PageElement(By.id("cattleType"), "Livestock Type Drop Down", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tagNumberTextField = new PageElement(By.id("tagNumber"), "Tag Number Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maleRedioButton = new PageElement(By.xpath("//span[contains(text(),'Male')]"), "Male Redio Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		femaleRedioButton = new PageElement(
				By.xpath("//label[@title='Select Gender']//span[@class='ml-10'][contains(text(),'Female')]"),
				"Female Redio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		maleRedioButtonForRural = new PageElement(By.id("gender0"), "Male Redio Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ageTextField = new PageElement(By.id("AgeinYrs"), "Age Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		purchaseDate = new PageElement(By.id("purchaseDate"), "Purchase Date", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredDropDown = new PageElement(By.id("sumInsured"), "Sum Insured Drop Down", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		livestockDetailsTab = new PageElement(By.xpath("//span[contains(text(),'Policy Period')]/following::a[1]"),
				"Livestock Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transitDetailsTab = new PageElement(
				By.xpath("//span[contains(text(),'Policy holder information')]/following::a[2]"), "Transit Details Tab",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		modeOfTransportDropDown = new PageElement(By.name("ModeOfTransport"), "Mode Of Transport Drop Down", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fromCountryTextField = new PageElement(By.name("fromCountry"), "From Country Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toCountryTextField = new PageElement(By.name("ToCountry"), "To Country Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromCityTextField = new PageElement(By.name("FromCity"), "From City Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toCityTextField = new PageElement(By.name("ToCity"), "To City Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfLoadingTextField = new PageElement(By.name("portOfLoading"), "Port Of Loading Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfDischargeTextField = new PageElement(By.name("portOfDischarge"), "Port Of Discharge Text Field", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath("//span[contains(text(),'Quote no.')]/following::span[2]"),
				"Quote No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		// button[contains(text(),'Save & Calculate Premium')]
		saveAndCalculatePremiumButton = new PageElement(
				By.xpath("//button[contains(text(),'Save & Calculate Premium')]"), "Save And Calculate Premium Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 30);
		inlandTransitClauseA = new PageElement(
				By.xpath("//label[contains(text(),'Coverage Details')]/following::input[1]"), "inland Transit Clause A",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		inlandTransitClauseB = new PageElement(
				By.xpath("//label[contains(text(),'Coverage Details')]/following::input[2]"), "inland Transit Clause B",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		inlandTransitClauseC = new PageElement(
				By.xpath("//label[contains(text(),'Coverage Details')]/following::input[3]"), "inland Transit Clause C",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPeriodTabForRural = new PageElement(By.xpath("//span[contains(text(),'Policy Period')]"),
				"policy Period Tab For Rural", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		physicianInformationTab = new PageElement(By.xpath("//span[contains(text(),'Physician Information')]"),
				"Physician Information Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		physicianName = new PageElement(By.xpath("//input[@placeholder='Physician Name']"), "Physician Name", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addressofFamilyPhysician = new PageElement(By.xpath("//textarea[@placeholder='Address of Family Physician']"),
				"Address of Family Physician", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yesRadioButton = new PageElement(By.xpath("//input[@id='physicianDetails0']"), "Yes Radio Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noRadioButton = new PageElement(By.xpath("//input[@id='physicianDetails1']"), "No Radio Button", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		childDropdown = new PageElement(By.xpath("//label[contains(text(),'Child1')]"), "Child Dropdown", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		childfemaleRadiobutton = new PageElement(By.xpath(" //label[@for='childgender10']"),
				" Child Female Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// Pal
		// START
		newCustomer = new PageElement(By.xpath("//span[contains(text(),'New Customer')]"), "New Customer", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		existingCustomer = new PageElement(By.xpath("//span[contains(text(),'Existing Customer')]"),
				"policy Period Tab For Rural", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		individual = new PageElement(By.xpath("//span[contains(text(),'Individual')]"), " Individual Category", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		organization = new PageElement(By.xpath("//span[contains(text(),'Organization')]"), "organization", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfShop = new PageElement(By.xpath("//textarea[@placeholder='Type of Shop']"), "typeOfShop", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shopAddrsYesRadio = new PageElement(By.xpath("//span[@class='ml-10'][contains(text(),'Yes')]"),
				"shopAddrsYesRadio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shopAddrsNoRadio = new PageElement(By.xpath("//span[@class='ml-10'][contains(text(),'No')]"),
				"shopAddrsNoRadio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shopAddress = new PageElement(By.xpath("//textarea[@placeholder='Shop Address']"), "shopAddress", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pINCode = new PageElement(By.xpath("//input[@placeholder='PIN Code']"), "PINCode", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsureBuildng = new PageElement(By.xpath("//input[@name='sumInsuredOfBuilding']"), "sum Insure Buildng",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsurfireFurnitur = new PageElement(
				By.xpath("//input[@placeholder='Sum Insured for Fire-Furniture,Fixture and Fittings']"),
				"sum Insur fire Furnitur", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsurStockTrade = new PageElement(
				By.xpath("//input[@placeholder='Sum Insured for Stock in Trade + Goods Held in Trust']"),
				"sum Insur Stock Trade", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shopAddrssToInsurTab = new PageElement(By.xpath("//span[contains(text(),'Address of the Shop to be Insured')]"),
				"Shop Addrss To Insur Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		standrdCoversTab = new PageElement(By.xpath("//span[contains(text(),'Standard Covers')]"), "standrd Covers Tab",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		publicLiability = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[1]"),
				"publicLiability", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsurancSec3 = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[2]"),
				"moneyInsurancSec3", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCycle = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[3]"), "pedalCycle",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		plateGlass = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[4]"), "plateGlass",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		neonGlownSign = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[5]"),
				"neonGlownSign", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		workmenCompensatnCover = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[6]"),
				"workmen Compensatn Cover", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		electrncQuipmnt = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[7]"),
				"electrnc Quipmnt", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		additionalCoversTab = new PageElement(By.xpath("//span[contains(text(),'Additional Covers')]"),
				"additional Covers Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		publicLiabilitySubTab = new PageElement(
				By.xpath("//span[contains(text(),'Public Liability, Section 10A (Optional)')]"),
				"Public Liability Sub Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		limitForPublicLiablty = new PageElement(
				By.xpath("//input[contains(@placeholder,'Limit of liability for Public Liability')]"),
				"Limit For Public Liablty", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsurncSubTab = new PageElement(By.xpath("//span[contains(text(),'Money Insurance Section 3')]"),
				"moneyInsurncSubTab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInTransit = new PageElement(By.xpath("//input[contains(@placeholder,'Money in Transit')]"),
				"moneyInTransit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInCounter = new PageElement(
				By.xpath("//input[contains(@placeholder,'Money in Counter During Business Hours')]"), "moneyInCounter",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInLocked = new PageElement(
				By.xpath("//input[contains(@placeholder,'Money in Locked Safe in Office Outside Business Hours')]"),
				"moneyInLocked", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// END
		planC = new PageElement(By.xpath("//div[@class='clearfix']//label[@class='rdb']"), "plan", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		universitynameTextField = new PageElement(By.name("universityName"), "UniversityName", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		universityAddTextField = new PageElement(By.name("universityAddress"), "UniversityAddress", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sponsornameTextField = new PageElement(By.name("sponsorName"), "SponsorName", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sponsoraddressTextField = new PageElement(By.name("sponsorAddress"), "SponsorAdd", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// Start UBN
		riskDetailsTab = new PageElement(By.xpath("//span[contains(text(),'Risk Details')]"), "Risk DetailsTab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailsOfExistingPhysicalDisabilities = new PageElement(
				By.xpath("//input[@placeholder='Details of existing Physical Disabilities']"),
				"Details Of Existing Physical Disabilities", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nomineeName = new PageElement(By.xpath("//input[@placeholder='Nominee Name']"), "Risk DetailsTab", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationshipOfTheNomineeWithInsured = new PageElement(By.xpath("//select[@name='nomineeRelationship']"),
				"Relationship Of The Nominee With Insured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nomineeAddress = new PageElement(By.xpath("//textarea[@placeholder='Nominee Address']"), "Nominee Address",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredOnTheDwellingUnit = new PageElement(By.xpath("//input[@name='sumInsuredDwelling']"),
				"SumInsured On The Dwelling Unit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredOnTheContents = new PageElement(By.xpath("//input[@name='sumInsuredContents']"),
				"Sum Insured On The Contents", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsured = new PageElement(By.xpath("//input[@name='sumInsuredContents']"),
				"Sum Insured On The Contents", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		excessIn = new PageElement(
				By.xpath("//label[@class='block'][contains(text(),'Excess in (%)')]//following::select[1]"),
				"Excess In", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		doYouWantToCoverYourTractor = new PageElement(By.xpath("//label[@for='tractorRisk1']"), "Excess In", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		identificationNoOfTheDwellingUnitHouse = new PageElement(By.xpath("//input[@placeholder='Identification No']"),
				"Identification No Of The Dwelling Unit House", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fireAlliedPerilsEarthauake = new PageElement(
				By.xpath("//span[contains(text(),'Fire Allied Perils Earthquake (SC)')]"),
				"Identification No Of The Dwelling Unit House", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		locationOfDwellingUnitHouse = new PageElement(
				By.xpath("//textarea[@placeholder='Location of Dwelling Unit/House']"),
				"Location Of Dwelling Unit House", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionAboutDwellingUnitHouse = new PageElement(By.xpath("//textarea[@name='descriptionDwelling']"),
				"Description About Dwelling Unit House", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isItKatchaConstruction = new PageElement(By.xpath("//input[@id='katchaConst1']"), "Is It Katcha Construction",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionAboutTheContentsInTheDwelling = new PageElement(By.xpath("//textarea[@name='descriptionContents']"),
				"Description About The Contents In The Dwelling", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isLoadingApplicable = new PageElement(By.xpath("//input[@id='loadingApp1']"), "Is Loading Applicable", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationDetails = new PageElement(By.xpath("//span[contains(text(),'Relation details')]"), "Relation Details",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isAgentRequired = new PageElement(By.xpath("//label[@for='agentRequired2']"), "Relation Details", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// End
		// DHK Start
		isTheAboveBuildingAddressRadioButtonYes = new PageElement(By.xpath("//label[@for='sameAddrAsBuilding0']"),
				"Yes Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isTheAboveBuildingAddressRadioButtonNo = new PageElement(By.xpath("//label[@for='sameAddrAsBuilding1']"),
				"No Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		buildingNoStreet = new PageElement(By.xpath("//textarea[@placeholder='Building no., Street']"),
				"Building No., Street Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		locality = new PageElement(By.xpath("//input[@placeholder='Locality']"), "Locality Text Area", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pINCodeBuildingAddress = new PageElement(
				By.xpath("//span[@class='relative clearwpr has-error']//input[@placeholder='PIN Code']"), "Pin Code",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		burglaryAndHousebreakingDropDown = new PageElement(
				By.xpath("//span[contains(text(),'Burglary and Housebreaking')]"),
				"Burglary and Housebreaking DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		jewelleryAndValuablesDropDown = new PageElement(By.xpath("//span[contains(text(),'Jewellery and Valuables')]"),
				"Jewellery and Valuables DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticApplianceDropDown = new PageElement(By.xpath("//span[contains(text(),'Domestic Appliances')]"),
				"Domestic Appliances DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		televisionDesktopDropDown = new PageElement(By.xpath("//span[contains(text(),'Television/Desktop')]"),
				"Television/Desktop DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		fireAndAlliedPerilsReqYes = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq0']"),
				"fire And Allied Perils Req Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fireAndAlliedPerilsReqNo = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq1']"),
				"fire And Allied Perils Req No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredEarthquakeTerrorismDropDown = new PageElement(By.xpath("//select[@name='earthQuakeSi']"),
				"Sum insured Earthquake & Terrorism DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addJewelleryButton = new PageElement(By.xpath("//button[contains(text(),'Add Jewellery')]"),
				"Add Jewellery Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		broadDescriptionForJewelleryAndValuables = new PageElement(
				By.xpath("//textarea[@placeholder='Broad description for Jewellery and Valuables']"),
				"Broad description for Jewellery and Valuables Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		weightVolForJewelleryAndValuables = new PageElement(
				By.xpath("//textarea[@placeholder='Weight/Vol for Jewellery and Valuables']"),
				"Weight/Vol for Jewellery and Valuables Text Area", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		value = new PageElement(By.xpath("//input[@placeholder='Value']"), "Value Text Area", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addApplianceButton = new PageElement(By.xpath("//button[contains(text(),'Add Appliance')]"),
				"Add Appliance Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticMake = new PageElement(By.xpath("//div[@id='domesticCollapse0']//input[@placeholder='Make']"),
				"Make Text Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		domesticModel = new PageElement(By.xpath("//div[@id='domesticCollapse0']//input[@placeholder='Model']"),
				"Model Text Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		domesticYear = new PageElement(By.xpath("//div[@id='domesticCollapse0']//input[@placeholder='Year']"),
				"Year Text Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		tvMake = new PageElement(By.name("tvDeskMake_0"), "Make Text Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				15);
		tvModel = new PageElement(By.name("tvDeskModel_0"), "Model Text Box", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		tvYear = new PageElement(By.xpath("//div[@id='tvDvdCollapse0']//input[@placeholder='Year']"), "Year Text Box",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		fireAndAlliedPerilsTelevisionDesktopYes = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq0']"),
				"Fire And Allied Perils Yes Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fireAndAlliedPerilsTelevisionDesktopNo = new PageElement(By.xpath("//label[@for='fireAndAlliedPerilsReq1']"),
				"Fire And Allied Perils No Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredTelevisionDesktop = new PageElement(
				By.xpath("//div[@class='col-md-6 mt-10 clearfix']//input[@placeholder='Sum Insured']"),
				"Sum Insured Desktop/Television Text Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		financierDetailsDropDown = new PageElement(By.xpath("//span[contains(text(),'Financier Details')]"),
				"Financier Details Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premisesHypBankRadioButtonYes = new PageElement(By.xpath("//label[@for='premisesHypBank0']"),
				"Premises hypothecated Radio Button Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premisesHypBankRadioButtonNo = new PageElement(By.xpath("//label[@for='premisesHypBank1']"),
				"Premises hypothecated Radio Button No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOfTheBankAndBranch = new PageElement(By.xpath("//input[@placeholder='Name of the bank and branch']"),
				"Name of the bank and branch", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredOfBuildingSection1A = new PageElement(
				By.xpath("//input[contains(@placeholder,'Sum Insured of Building')]"), "Sum Insured of Building", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dwellingContent = new PageElement(By.xpath("//select[contains(@name,'name_0')]"), "Dwelling Content", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		description = new PageElement(By.xpath("//textarea[contains(@placeholder,'Description')]"), "Description",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredInRs = new PageElement(
				By.xpath("//div[@id='dwelling0']//input[contains(@placeholder,'Sum Insured')]"), "Sum Insured", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliances = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[1]"),
				"Domestic Appliances", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		jewelleryCover = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[2]"),
				"Jewellery Cover", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		portableEquipment = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[3]"),
				"Portable Equipment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TVDVDandCDset = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[4]"),
				"TV DVD and CD set", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCycleAdditionalCover = new PageElement(
				By.xpath("//p[contains(@class,'alert-danger')]/following::input[5]"), "Pedal Cycle Additional Cover",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		workmenCompensation = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[6]"),
				"Workmen Compensation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliancesSectionFive = new PageElement(
				By.xpath("//span[contains(text(),'Domestic Appliances, Section 5 (Optional)')]"),
				"Domestic Appliances, Section 5 (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliancesOneAppliance = new PageElement(By.xpath("//select[@name='name1_0']"), "Appliances", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliancesOneDescription = new PageElement(
				By.xpath("//div[@id='domesticCollapse0']//textarea[@placeholder='Description']"), "Description", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		domesticAppliancesOneSumInsured = new PageElement(
				By.xpath("//div[@id='domesticCollapse0']//input[@placeholder='Sum Insured']"),
				"Enter Sum Insured of each particular selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		jewelleryCoverSection3A = new PageElement(
				By.xpath("//span[contains(text(),'Jewellery Cover,Section 3A (Optional)')]"),
				"Jewellery Cover,Section 3A (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		jewelleryTypeOfJewelleryOrnament = new PageElement(By.xpath("//select[@name='name2_0']"),
				"Type of Jewellery/Ornament", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionOfJewelleryOrnaments = new PageElement(
				By.xpath("//textarea[@placeholder='Description of Jewellery/Ornaments']"),
				"Description of Jewellery/Ornaments", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueSumInsuredOfJewellery = new PageElement(
				By.xpath("//input[@placeholder='Value/Sum Insured of Jewellery (in Rs.)']"),
				"Value/Sum Insured of Jewellery (in Rs.)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		portableEquipmentSection3BOptional = new PageElement(
				By.xpath("//span[contains(text(),'Portable Equipment,Section 3B (Optional)')]"),
				"Portable Equipment,Section 3B (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfPortableEquipment = new PageElement(By.xpath("//input[@placeholder='Type of Portable Equipment']"),
				"Portable Equipment,Section 3B (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionOfPortableEquipment = new PageElement(
				By.xpath("//textarea[@placeholder='Description of Portable Equipment']"),
				"Description of Portable Equipment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueSumInsuredOfPortableEquipment = new PageElement(
				By.xpath("//input[@placeholder='Value/Sum Insured of the Portable Equipment']"),
				"Value/Sum Insured of the Portable Equipment", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tVDVDAndCDSetSection6Optional = new PageElement(
				By.xpath("//span[contains(text(),'TV, DVD and CD set, Section 6 (Optional)')]"),
				"TV, DVD and CD set, Section 6 (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tVDVDCD = new PageElement(By.xpath("//select[@name='name4_0']"), "TV/DVD/CD", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tVDVDCDDescription = new PageElement(
				By.xpath("//div[@id='tvDvdCollapse0']//textarea[@placeholder='Description']"), "Description", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tVDVDCDSumInsured = new PageElement(By.xpath("//div[@id='tvDvdCollapse0']//input[@placeholder='Sum Insured']"),
				"Sum Insured (in Rs.)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCyclesSection7Optional = new PageElement(
				By.xpath("//span[contains(text(),'Pedal Cycles Section 7 (Optional)')]"),
				"Pedal Cycles Section 7 (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCycleSectionSeven = new PageElement(By.xpath("//select[@name='name5_0']"), "Pedal Cycle", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionSectionSeven = new PageElement(
				By.xpath("//div[@id='pedalCollapse0']//textarea[@placeholder='Description']"), "Description", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredSectionSeven = new PageElement(
				By.xpath("//div[@id='pedalCollapse0']//input[contains(@placeholder,'Sum Insured')]"),
				"Sum Insured (in Rs.)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		workmenCompensationCoverSection10Optional = new PageElement(
				By.xpath("//span[contains(text(),'Workmen Compensation Cover Section 10 (Optional)')]"),
				"Workmen Compensation Cover Section 10 (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		natureOfWork = new PageElement(By.xpath("//select[@name='natureOfWork_0']"), "Nature of Work", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		noOfEmployees = new PageElement(By.xpath("//input[@placeholder='No. of Employees']"), "No. of Employees", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		monthlyWages = new PageElement(By.xpath("//input[@placeholder='Monthly Wages']"), "Monthly Wages", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// addressOfOfficeToBeInsured = new
		// PageElement(By.xpath("//span[contains(text(),'Address of Office to be
		// Insured')]"), "Address of Office to be Insured", false,
		// WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfOccupantOwner = new PageElement(By.xpath("//span[contains(text(),'Owner')]"), "Owner Check Box", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfOccupantTenant = new PageElement(By.xpath("//span[contains(text(),'Tenant')]"), "Tenant Check Box", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		officeAddress = new PageElement(By.xpath("//textarea[@id='locality']"), "Office Address Text Area", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isYourAboveAddressSameAsOfficeAddressYes = new PageElement(
				By.xpath("//span[@class='ml-10'][contains(text(),'Yes')]"),
				"Is your above Address same as Office Address Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isYourAboveAddressSameAsOfficeAddressNo = new PageElement(
				By.xpath("//span[@class='ml-10'][contains(text(),'No')]"),
				"Is your above Address same as Office Address NO", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pINCodeOfficeToBeInsured = new PageElement(By.xpath("//input[@placeholder='PIN Code']"),
				"PIN Code Office To Be Insured ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addressOfOfficeToBeInsured = new PageElement(
				By.xpath("//span[contains(text(),'Address of Office to be Insured')]"),
				"Address of Office to be Insured ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredOfBuildingIncludingFixtureAndFittings = new PageElement(
				By.xpath("//input[@id='sumInsuredOfBuilding']"),
				"Sum Insured of Building including Fixture and Fittings (in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		provisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval = new PageElement(
				By.xpath("//input[@id='surveyorsLegalFeeAndDebrisRemoval']"),
				"Provisions for Architects,Surveyors Legal Fee and Debris Removal (in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsuredInRsSection1 = new PageElement(By.xpath("//input[@id='totalSumInsuredofBuilding']"),
				"Total Sum Insured (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessFurnitureFurnishingsSafesOfficeMachineryCheckBox = new PageElement(
				By.xpath("//input[@name='businessFurnitureSafesOfficeMachinerychk']"),
				"Business Furniture,Furnishings,Safes,Office Machinery (in Rs.) CheckBox ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		businessFurnitureFurnishingsSafesOfficeMachineryTextBox = new PageElement(
				By.xpath("//input[@id='businessFurnitureSafesOfficeMachinery']"),
				"Business Furniture,Furnishings,Safes,Office Machinery (in Rs.) Text Box ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentsInRsCheckBox = new PageElement(By.xpath("//input[@name='documentsChk']"),
				"Documents (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentsInRsTextBox = new PageElement(By.xpath("//input[@id='documents']"), "Documents (in Rs.) Text Box ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		telephoneGasAndElectricMetersInRsCheckBox = new PageElement(
				By.xpath("//input[@name='telephoneGasAndElectricMetersChk']"),
				"Telephone,Gas and Electric Meters (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		telephoneGasAndElectricMetersInRsTextBox = new PageElement(
				By.xpath("//input[@id='telephoneGasAndElectricMeters']"),
				"Telephone,Gas and Electric Meters (in Rs.) Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		tenantsImprovementAndDecorationInRsCheckBox = new PageElement(
				By.xpath("//input[@name='tenantsImprovementAndDecorationChk']"),
				"Tenants Improvement and Decoration (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		tenantsImprovementAndDecorationInRsTextBox = new PageElement(
				By.xpath("//input[@id='tenantsImprovementAndDecoration']"),
				"Tenants Improvement and Decoration (in Rs.)Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		pedalCyclesInRsCheckBox = new PageElement(By.xpath("//input[@name='pedalCyclesChk']"),
				"Pedal Cycles (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		pedalCyclesInRsTextBox = new PageElement(By.xpath("//input[@id='pedalCycles']"),
				"Pedal Cycles (in Rs.)Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		electronicEquipmentInRsCheckBox = new PageElement(By.xpath("//input[@name='electronicEquipmentChk']"),
				"Electronic Equipment(in Rs. if not insured under section 6) Check Box ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		electronicEquipmentInRsTextBox = new PageElement(By.xpath("//input[@id='electronicEquipment']"),
				"Electronic Equipment(in Rs. if not insured under section 6)Text Box ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		allOtherContentsInRsCheckBox = new PageElement(By.xpath("//input[@name='allOtherContentsChk']"),
				"All other Contents (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		allOtherContentsInRsTextBox = new PageElement(By.xpath("//input[@id='allOtherContents']"),
				"All other Contents (in Rs.)Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		professionalInstrumentsAndEquipmentsInRsCheckBox = new PageElement(
				By.xpath("//input[@name='professionalInstrumentsChk']"),
				"Professional Instruments and Equipments (in Rs.) Check Box", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		professionalInstrumentsAndEquipmentsInRsTextBox = new PageElement(
				By.xpath("//input[@id='professionalInstruments']"),
				"Professional Instruments and Equipments (in Rs.)Text Box ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsuredInRs = new PageElement(By.xpath("//input[@id='subTotal1']"),
				"Total Sum Insured (in Rs.) Content Details (Section 2A) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		clothingAndPersonalEffectsInRsCheckBox = new PageElement(
				By.xpath("//input[@name='clothingandPersonalEffectsChk']"),
				"Clothing and Personal Effects (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clothingAndPersonalEffectsInRsTextBox = new PageElement(By.xpath("//input[@id='clothingandPersonalEffects']"),
				"Clothing and Personal Effects (in Rs.) Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		temporaryRemovalOfDocumentsInRsCheckBox = new PageElement(
				By.xpath("//input[contains(@name,'temporaryRemovalOfDocumentsChk')]"),
				"Temporary Removal of Documents (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		temporaryRemovalOfDocumentsInRsTextBox = new PageElement(By.xpath("//input[@id='temporaryRemovalOfDocuments']"),
				"Temporary Removal of Documents (in Rs.) Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		costOfRemovalOfDebrisInRsCheckBox = new PageElement(
				By.xpath("//input[contains(@name,'costRemovalOfDebrisChk')]"),
				"Cost of Removal of Debris (in Rs.) Check Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		costOfRemovalOfDebrisInRsTextBox = new PageElement(By.xpath("//input[@id='costRemovalOfDebris']"),
				"Cost of Removal of Debris (in Rs.) Text Box ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ancilliaryCoversTotalSumInsuredInRs = new PageElement(By.xpath("//input[@id='subTotal2']"),
				"Total Sum Insured (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		burglaryDetailsLimitAnyOneLossForBurglaryContentsInRs = new PageElement(
				By.xpath("//input[@id='lossLimitForBurglary']"), "Limit any one loss for Burglary Contents (in Rs.) ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsuredForTheTenantLiabilityInRs = new PageElement(By.xpath("//input[@id='totalSumInsured']"),
				"Total Sum Insured for the Tenant's Liability (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		moneyInTransitOverThePolicyPeriodAnnualTurnover = new PageElement(By.xpath("//input[@id='moneyInTransit']"),
				"Money in Transit Over the policy Period (Annual Turnover) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		perCarryingLimitInRs = new PageElement(By.xpath("//input[@id='carryingLimit']"), "Per carrying limit (in Rs.) ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInOfficeDuringDusinessHoursInRs = new PageElement(By.xpath("//input[@id='moneyInOffice']"),
				"Money in Office during business hours(in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInLockedSafeInOfficeOutsideBusinessHoursInRs = new PageElement(
				By.xpath("//input[@id='moneyInLockedSafe']"),
				"Money in locked safe in office outside business hours (in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionOfPlateGlass = new PageElement(By.xpath("//div[@id='collapse_0']//textarea[@id='description']"),
				"Description of Plate glass ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dimensionOfPlateGlass = new PageElement(By.xpath("//textarea[@id='dimensionOfPlateGlass']"),
				"Dimension of Plate glass ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueOfPlateGlassInRs = new PageElement(By.xpath("//input[@id='valueOfPlateGlass']"),
				"Value of Plate Glass (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalValueOfPlateGlassInRs = new PageElement(By.xpath("//input[@id='totalValueOfPlateGlass']"),
				"Total value of Plate Glass (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueOfSanitaryFittingsInRs = new PageElement(By.xpath("//input[@id='valueOfSanitaryFittings']"),
				"Value of Sanitary Fittings (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueOfSignsNamePlatesInRs = new PageElement(By.xpath("//input[@id='valueOfSignsNamePlates']"),
				"Value of Signs,Name Plates (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsuredOfFixedGlassSanitaryFittingsInRs = new PageElement(
				By.xpath("//input[@id='totalSumInsuredGlass']"),
				"Total Sum Insured of Fixed Glass,Sanitary Fittings (in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		machineName = new PageElement(By.xpath("//select[@id='name']"), "Machine Name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		machineMake = new PageElement(By.xpath("//input[@id='make']"), "Machine Make ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		equipmentId = new PageElement(By.xpath("//input[@id='id']"), "Equipment Id ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearOfManufacture = new PageElement(By.xpath("//select[contains(@name,'yearOfMake1')]"), "Year of Manufacture ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredMachineInRs = new PageElement(By.xpath("//input[@id='sumInsuredee']"), "Sum Insured(in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForDamageToElectronicEquipmentInRs = new PageElement(By.xpath("//input[@id='totalSumInsuredEE']"),
				"Sum Insured for Damage to Electronic Equipment (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		limitOfIndemnityInRs = new PageElement(By.xpath("//input[@id='limitOfIndemnity']"),
				"Limit of Indemnity (in Rs.) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		indemnityPeriodInMonths = new PageElement(By.xpath("//input[@id='indemnityPeriod']"),
				"Indemnity period(in Months) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		descriptionOfItem = new PageElement(By.xpath("//div[@id='collapse2_0']//textarea[@id='description']"),
				"Description of Item ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearOfMake = new PageElement(By.xpath("//div[@id='collapse2_0']//select[contains(@name,'yearOfMake')]"),
				"Year of Make ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		valueInRs = new PageElement(By.xpath("//input[@id='sumInsured']"), "Value (in Rs.) ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		totalSumInsuredForBreakDownOfOfficeAppliances = new PageElement(By.xpath("//input[@id='totalSumInsuredOA']"),
				"Total Sum insured for BreakDown of office appliances  ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		tenantsLabilityCheckBox = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[1]"),
				"Tenants Liability ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsuranceCheckBox = new PageElement(By.xpath("//p[contains(@class,'alert-danger')]/following::input[2]"),
				"Money Insurance ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fixedGlassSanitaryFittingsCheckBox = new PageElement(
				By.xpath("//p[contains(@class,'alert-danger')]/following::input[3]"), "Fixed Glass, Sanitary Fittings ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		damageToElectronicEquipmentsCheckBox = new PageElement(
				By.xpath("//p[contains(@class,'alert-danger')]/following::input[4]"),
				"Damage to Electronic Equipments ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		additionalExpensesOfRentCheckBox = new PageElement(
				By.xpath("//p[contains(@class,'alert-danger')]/following::input[5]"), "Additional Expenses of Rent ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		breakDownOfficeAppliancesCheckBox = new PageElement(
				By.xpath("//p[contains(@class,'alert-danger')]/following::input[6]"), "Break Down office Appliances ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		tenantsLabilitySection3Optional = new PageElement(
				By.xpath("//span[contains(text(),'Tenants Liability,Section 3 (Optional)')]"),
				"Tenants Liability,Section 3 (Optional)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		moneyInsuranceSection4Optional = new PageElement(
				By.xpath("//span[contains(text(),'Money Insurance,Section 4(Optional)')]"),
				"Money Insurance,Section 4(Optional) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		fixedGlassSanitaryFittingsSection5Optional = new PageElement(
				By.xpath("//span[contains(text(),'Fixed Glass, Sanitary Fittings,Section 5 (Optional')]"),
				"Fixed Glass, Sanitary Fittings,Section 5 (Optional') ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		damageToElectronicEquipmentsSection7Optional = new PageElement(
				By.xpath("//span[contains(text(),'Damage to Electronic Equipments,Section 7 (Optiona')]"),
				"Damage to Electronic Equipments,Section 7 (Optiona') ", false, WaitType.WAITFORELEMENTTOBECLICKABLE,
				10);
		additionalExpensesOfRentSection10Optional = new PageElement(
				By.xpath("//span[contains(text(),'Additional Expenses of Rent,Section 10 (Optional)')]"),
				"//span[contains(text(),'Additional Expenses of Rent,Section 10 (Optional)')] ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		breakDownOfficeAppliancesSection12Optional = new PageElement(
				By.xpath("//span[contains(text(),'Break Down office Appliances,Section 12 (Optional)')]"),
				"Break Down office Appliances,Section 12 (Optional) ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addressOfTheBuildingToBeInsuredDropDown = new PageElement(
				By.xpath("//span[contains(text(),'Address of the Building to be Insured')]"),
				"Address of the Building to be Insured ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		passportNumber = new PageElement(By.xpath("//input[@id='PassportNo']"), "PassportNo ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfIssueOfPassport = new PageElement(By.xpath("//input[@placeholder='Date of Issue']"),
				"Date of Issue Passport ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		countryOfVisit = new PageElement(By.xpath("//input[@placeholder='Country of Visit']"), "Country of Visit ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 15);
		countryOfVisitFlashText = new PageElement(By.xpath("//input[@placeholder='Country of Visit']"),
				"Country of Visit ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOfTheEmployer = new PageElement(By.xpath("//textarea[@id='EmployerName']"), "EmployerName ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		profession = new PageElement(By.xpath("//textarea[@id='Profession']"), "Profession ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredDetailsTab = new PageElement(By.xpath("//span[contains(text(),'Insured Details')]"),
				"Insured Details Tab ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationshipWithTheNominee = new PageElement(By.xpath("//input[@id='relationwithNominee']"),
				"Relation with Nominee ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationshipWithNomineePolicyHolder = new PageElement(By.xpath("//select[@name='propNomRel']"),
				"Relation with Nominee ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nomineeNamePolicyHolder = new PageElement(By.xpath("//input[@placeholder='Nominee name']"), "Nominee name ",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selfTab = new PageElement(By.xpath("//input[@placeholder='Nominee name']"), "Nominee name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameOfTheInsuredSelf = new PageElement(By.xpath("//input[@id='insuredName']"), "Nominee name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		occupationOfTheMemberSelf = new PageElement(By.xpath("//select[@name='occupation0']"), "Nominee name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nomineeNameSelf = new PageElement(By.xpath("//input[@placeholder='Nominee Name']"), "Nominee name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationshipWithTheNomineeSelf = new PageElement(By.xpath("//select[@name='nomineeRel0']"), "Nominee name ",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		selfTab = new PageElement(By.xpath("//span[contains(text(),'SELF')]"), "SELF Tab Clicked ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// DHK End

		// Harsha :- Commercial Vehical
		selectCommercialVehicleTypeDropDown = new PageElement(By.name("commercialVehicleType"),
				"commercial Vehicle Type Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// DOBTextField = new PageElement(By.name("ompDateOfBirth"), "Date Of Birth",
		// false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfGoodsCarryingDropdown = new PageElement(By.name("goodsCarryingType"), "goods Carrying Type Drop Down",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		GoodscarryingvehicledescriptionDropdown = new PageElement(By.name("goodsVehDesc"),
				"Goods carrying vehicle description Type Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		TypeofbodyDropdown = new PageElement(By.name("bodyGoodsCarrying"), " Type of body Drop Down", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		TypeofbodyPrivateCar = new PageElement(By.name("typeOfBody"), " Type of body For private car", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicalpurchaseDate = new PageElement(By.id("datefield"), "Vehical Purchase Date", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seatingCapacitytextarea = new PageElement(By.name("seatingCapacity"), "seating Capacity", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehiclePermitDetailsDropdown = new PageElement(By.name("vehiclePermitDetails"), "vehicle Permit Details", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IMT23YesRadioButton = new PageElement(By.xpath("//span[contains(text(),'Yes')]"), "IMT23 Yes Button", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IMT23NoRadioButton = new PageElement(By.xpath("//span[contains(text(),'No')]"), "IMT23 No Button", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// vehicleZone = new PageElement(By.name("vehicleZone"), "vehicle Zone", false,
		// WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationDatetextarea = new PageElement(By.name("registrationDate"), "registration Date", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationDateofcommercialcar = new PageElement(By.name("registrationDateOld"), "registration Date", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RegistrationNo1textarea = new PageElement(By.name("registrationNumber1"), "registrationNumber1", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RegistrationNo2textarea = new PageElement(By.name("registrationNumber2"), "registrationNumber2", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RegistrationNo3textarea = new PageElement(By.name("registrationNumber3"), "registrationNumber3", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		RegistrationNo4textarea = new PageElement(By.name("registrationNumber4"), "registrationNumber4", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fuelTypeDropdown = new PageElement(By.name("fuelType"), "fuel Type Details", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableNCBPercentDropdown = new PageElement(By.name("applicableNCBPercent"),
				"applicable NCB Percent Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// coverage Details
		coverageDetailsTab = new PageElement(By.xpath("//span[contains(text(),'Coverage details')]"),
				"additional Covers Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ownerDriveYesRadiobutton = new PageElement(By.xpath("//span[contains(text(),'Yes')]"), "owner Drive Yes Button",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ownerDriveNoRadiobutton = new PageElement(By.xpath("//span[contains(text(),'No')]"), "owner Drive No Button",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ownerLicenseTypeDropdown = new PageElement(By.name("ownerLicenseType"), "owner License Type Drop Down", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		gstinIndTextBox = new PageElement(By.name("gstinInd"), "gstin Ind", false, WaitType.WAITFORELEMENTTOBEEENABLED,
				10);
		typeOfRegIndDropDown = new PageElement(By.name("typeOfRegInd"), "gstin Ind", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyStartDatePopUp = new PageElement(By.xpath("//button[@class='btn btn-blue btn-width']"),
				"Start Date PopUp", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		physicalDisabilityfarmerCov = new PageElement(By.name("preExistingIllness"),
				"Details of existing Physical Disabilities", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyDurationDropDown = new PageElement(By.id("policyDuration"), "policy Duration", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 15);
		nomineeDOB = new PageElement(By.id("dobNomineeYJ"), "Nominee date of birth", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earningMemberWS = new PageElement(By.xpath("//label[@for='workingStatus1']"), "earning Member", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nonEarningMemberWS = new PageElement(By.xpath("//label[@for='workingStatus2']"), "earning Member", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minorWS = new PageElement(By.xpath("//label[@for='workingStatus3']"), "earning Member", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		JanataPAInsOccupation = new PageElement(By.id("occupationYJ"), "Janata PA Insured occupation YJ", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 20);
		janataPAInsDOB = new PageElement(By.id("dobOfInsYJ"), "dob Of Ins YJ", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		janataPAInsPhyDis = new PageElement(By.id("existing_Physical_Disabilities"), "existing_Physical_Disabilities",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 15);
		janataPASumInsured = new PageElement(By.name("sumInsuredYJ"), "sum Insured YJ", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		janataPANomineeName = new PageElement(By.name("nomineeNameYJ"), "Nominee name ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		janataPANomineeRelation = new PageElement(By.name("relOfNomineeWithInsYJ"), "Nominee Relation ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		janataPANomineeAddress = new PageElement(By.name("nomineeAddressYJ"), "Nominee address ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		janataPANomineeDOB = new PageElement(By.name("dobNomineeYJ"), "Nominee DOB ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		manageQuote= new PageElement(By.xpath("//a[contains(text(),'Manage Quotes')]"), "Manage quote tab ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoText= new PageElement(By.xpath("//div[@class='col-md-4 inp-sel-group clearfix']//input[@placeholder='Quote no.']"), "quote No text ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoSearchbtn= new PageElement(By.xpath("//div[@class='text-right col-md-12 clearfix mb-10']//button[@class='btn btn-blue'][contains(text(),'Search')]"), "quote No text ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionPremiumIcon= new PageElement(By.xpath("//span[@class='collect_premium icon-sm']"), "Collection Premium icon ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// PreviousInsuredDetails Pravina
		PreviousInsurerDetailsTabButton = new PageElement(
				By.xpath("//span[contains(text(),'Previous Insurer Details')]"), "Previous Insurer Details", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousInsurerName = new PageElement(By.name("previousInsurerName"), "previous Insurer Name", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyNumber = new PageElement(By.name("previousPolicyNumber"), "previous Policy Number", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyAddress = new PageElement(By.name("previousPolicyAddress"), "previous Policy Address", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyExpDate = new PageElement(By.name("previousPolicyExpDate"), "previous Policy ExpDate", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 15);
		previousPolicyExpDateforCV = new PageElement(
				By.xpath("//input[@placeholder='Previous policy expiry date (dd/mm/yyyy)']"), "previous Policy ExpDate",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 15);
		sumInsuredDwelling = new PageElement(By.name("sumInsuredDwelling"), "sum Insured Dwelling", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessPercent = new PageElement(By
				.xpath("//select[@class='form-control ng-valid ng-valid-required ng-touched ng-dirty ng-valid-parse']"),
				"Please select Excess in (%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		travelDurationDroDown = new PageElement(By.name("travelDuration"), "Travel Duration", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cattleDetailsDropDown = new PageElement(By.xpath("//span[contains(text(),'Cattle Details')]"), "Cattle Details",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tagNo = new PageElement(By.name("TagNumber0"), "Tag Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofPolicyNonSchemeRadioButton = new PageElement(By.xpath("//span[contains(text(),'Non-scheme')]"),
				"Non-scheme", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		schemeTypeNSDropDown = new PageElement(By.name("Scheme"), "Scheme", false, WaitType.WAITFORELEMENTTOBEEENABLED,
				10);
		addCattleButton = new PageElement(By.xpath("//button[contains(text(),'Add Cattle')]"), "Add cattle", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cattleTypeDropDown = new PageElement(By.name("typeOfRiskForCattle0"), "Type Of Cattle", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		originOfcattle = new PageElement(By.xpath("//span[contains(text(),'Indigenous')]"), "Indigenous Radio Button",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cattlegenderMaleRadioButton = new PageElement(
				By.xpath("//div[@id='collapse_0']//span[@class='ml-10'][contains(text(),'Male')]"), "male", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cattlegenderFemaleRadioButton = new PageElement(
				By.xpath("//div[@class='col-md-5 clearfix']//span[@class='ml-10'][contains(text(),'Female')]"),
				"female", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageYearstextfield = new PageElement(By.name("AgeinYrs0"), "Age in Years", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageMonthstextfield = new PageElement(By.id("AgeinMths"), "Age in months", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfOwner = new PageElement(By.name("owner0"), "Name of Owner", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,
				10);
		purposeOfUse = new PageElement(By.name("purpose0"), "purpose", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breedColorMark = new PageElement(By.name("breed0"), "Breed and Color", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValue = new PageElement(By.id("eksumInsured"), "Market Value", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marketValue1 = new PageElement(By.id("ycMarkectValue"), "Market Value1", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		localityTextbox = new PageElement(By.xpath("//textarea[@placeholder='Locality']"), "Locality", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 15);
		natureOfId = new PageElement(By.name("propNatureOfId"), "Nature Of ID", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		idDocno = new PageElement(By.xpath("//span[@class='relative clearwpr']//input[@placeholder='ID Doc No.']"),
				"ID Doc No", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		heightText = new PageElement(By.xpath(" //input[@placeholder='Height (in meters)']"), "Height", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		weightText = new PageElement(By.name("Propweight"), "Weight", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// Rural sagar
		titleDrpDown = new PageElement(By.xpath("//select[@name='typeOfOrg']"), "title DrpDown", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		firstNmeTextField = new PageElement(By.xpath("//input[@placeholder='First Name']"), "FirstNme TextField ",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		midddleNmeTextField = new PageElement(By.xpath("//input[@placeholder='Middle Name']"), "MidddleNme TextField",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lastNmeTextField = new PageElement(By.xpath("//input[@placeholder='Middle Name']"), "LastNme TextField", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maleRadiobtn = new PageElement(By.xpath("//input[@name='gender' and @value='M']"), "MaleRadiobtn", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		femaleRadiobtn = new PageElement(By.xpath("//input[@name='gender' and @value='F']"), "FemaleRadiobtn", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dOB = new PageElement(By.xpath("//section[@class='input-group']//input"), "dOB", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		buildingStretNOTxtField = new PageElement(By.xpath("//textarea[@placeholder='Locality']"),
				"buildingStretNOTxtField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		localityTextField = new PageElement(By.xpath("//section[@class='input-group']//input"), "LocalityTextField",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		stateTextField = new PageElement(By.xpath("//input[@placeholder='State']"), "stateTextField", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pinCodeTextField = new PageElement(By.xpath("//input[@placeholder='PIN Code']"), "pinCodeTextField", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cityTextFieled = new PageElement(By.xpath("//input[@placeholder='City']"), "cityTextFieled", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		mobNOTextField = new PageElement(By.xpath("//input[@placeholder='Mobile No.']"), "mobNOTextField", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		createbtn = new PageElement(By.xpath("//input[@placeholder='Mobile No.']"), "createbtn", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		occupationDropDown = new PageElement(By.xpath("//select[@id='occupationEJ']"), "occupationDropDown", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dboInsuredDatails = new PageElement(By.xpath("//input[@id='dobOfInsEJ']"), "dboInsuredDatails", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// maleRadiobtnInsuredD = new PageElement(By.xpath("//input[@placeholder='Mobile
		// No.']"), "Locality", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		// femaleRadiobtnInsuredD = new
		// PageElement(By.xpath("//input[@placeholder='Mobile No.']"), "Locality",
		// false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		physicalDisTextField = new PageElement(By.xpath("//textarea[@id='existing_Physical_Disabilities']"),
				"physicalDisTextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		grossAnnualIncome = new PageElement(By.xpath("//input[@id='grossAnnualIncome']"), "grossAnnualIncome", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeNameTextFiled = new PageElement(By.xpath("//input[@id='nominee_Name']"), "nomineeNameTextFiled", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nomineeAddTextFiled = new PageElement(By.xpath("//textarea[@id='nominee_Address']"), "nomineeAddTextFiled",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 20);
		nomineeRelationDrop = new PageElement(By.xpath("//select[@id='relOfNomineeWithIns']"), "nomineeRelationDrop",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insureddropdown = new PageElement(By.xpath("//span[contains(text(),'Insured Details')]"), "Insureddropdown",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		originOfRiskDropDown = new PageElement(By.id("originType"), "Origin Type", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hutDetailsdropdown = new PageElement(By.xpath("//span[contains(text(),'Hut Details')]"), "Hut Details", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nameofItemtextfiled = new PageElement(By.name("nameOfItem0"), "Name Of Item", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforpukkawRCCDropDown = new PageElement(By.name("sumInsuredType10"), "Sum Insured for pukka RCC",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPukkatextfiled = new PageElement(By.name("sumInsuredContens0"), "Sum Insured for pukka", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfHutRadioButton = new PageElement(By.xpath("//span[contains(text(),'Pukka')]"), "Type Of Hut", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfHelathIn = new PageElement(By.xpath("//span[contains(text(),'Mediclaim')]"), "Type Of Health Insurence",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addMemberButton = new PageElement(By.xpath("//button[contains(text(),'Add Member')]"), "Add Member Button",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateOfBirthMemm = new PageElement(By.name("memDob"), "Date Of Birth Member", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineenameMember = new PageElement(By.name("nomineeName0"), "Nominee name member", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relwithNomineeDropDown = new PageElement(By.name("relationOfNomineeWithInsured($index)"),
				"Relation with nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preexstingCond = new PageElement(By.name("preExisting_Conditions"), "preExsitng condition", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
		sumInsuredmemDropDown = new PageElement(By.xpath("  //div[@id='collapse_0']//select[@id='memberSumInsured']"),
				"Member Sum insured", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredmemJPSB = new PageElement(By.name("sumInsured00"), "Member Sum insured Of Janata PA Sukshma Bima",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		anyPhysicalprbradiobutton = new PageElement(By.id("anyPhysicalProblems01"), "any Physical Problems ", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationMemDropDwn = new PageElement(By.name("occupation00"), "Occupation Member", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		earnHeadYesRadioButton = new PageElement(By.xpath("//span[@class='ml-10'][contains(text(),'Yes')]"),
				"Yes Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		earnHeadNoRadioButton = new PageElement(By.xpath("//span[@class='ml-10'][contains(text(),'No')]"),
				"No Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		preexistingDisease = new PageElement(By.xpath("//select[@name='propPreExistDisease']"), "Pre Exist Disease",
				false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		childNatureOfID = new PageElement(By.xpath("//select[@name='childNatureOfId0']"), "Child's nature of ID", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		childIdDocNo = new PageElement(By.name("childIdDocNo0"), "Child Id Doc No ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfPasengerCarrying = new PageElement(By.xpath("//select[@name='passengerCarryingType']"),
				"passenger Carrying Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		carryingCapacity = new PageElement(By.xpath("//input[@placeholder='Carrying Capacity (including driver)']"),
				"Carrying Capacity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleInvoiceValue = new PageElement(By.xpath("//input[@placeholder='Vehicle invoice value (In Rs.)']"),
				"Vehicle invoice value ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredDeclaredValue = new PageElement(
				By.xpath("//input[@placeholder=\"Insured's declared value (IDV in Rs.)\"]"), "Insured's declared value",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		purpuseOfPassengerVehicle = new PageElement(By.xpath("//select[@name='purposeOfVehicle_C1']"),
				"purpose Of Vehicle_C1", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeofbodyPassengerCarrying = new PageElement(By.xpath("//select[@name='bodyPassengerCarrying']"),
				" Type of body Passenger Carrying", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfMiseAndSpecialType = new PageElement(By.xpath("//select[@name='miscCarryingType']"),
				" Type of body Passenger Carrying", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		distanceCovered = new PageElement(By.xpath("//input[@placeholder='Distance covered (In Km.)']"),
				"Distance covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitToTextField = new PageElement(By.xpath("//textarea[@placeholder='Transit to']"), "Transit to", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitFromTextField = new PageElement(By.xpath("//textarea[@placeholder='Transit from']"), "Transit from",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfRaodRisk = new PageElement(By.xpath("//select[@name='roadRiskType']"), " road Risk Type", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfRoadTransitDropDown = new PageElement(By.xpath("//select[@name='roadTransitBasis']"),
				" road Transit Basis", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfDriver = new PageElement(By.xpath("//input[@placeholder='Name of the driver']"), "Name of the driver",
				false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tradecertificateValue = new PageElement(By.xpath("//input[@placeholder='Trade certificate value']"),
				"Trade certificate value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		drivinglicenceValue = new PageElement(By.xpath("//input[@placeholder='Driving license no.']"),
				"Driving license no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		salryOfDriverTextfield = new PageElement(By.xpath("//input[@placeholder='Salary of the driver']"),
				"Salary of the driver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofbodyMiscCarrying = new PageElement(By.xpath("//select[@name='bodyMiscCarrying']"), "body Misc Carrying",
				false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofbodyOther = new PageElement(By.xpath("//select[@name='bodyType']"), "bodyType", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofbodyMiseSpecialType = new PageElement(By.xpath(" //select[@name='bodyMiscCarrying']"), "bodyType", false,
				WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		browseProposerButton = new PageElement(By.id("mandatoryFiles"), "browse Button ", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		browseChildButton = new PageElement(By.xpath("//h5[contains(text(),'Child (EFEEEE) ')]//following::span[1]"),
				"browse Button ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		continueButton = new PageElement(By.xpath("//button[contains(text(),'Continue')]"), "Continue", false,
				WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		//StandaloneODDetailsTabMotor_Prity
		
		StandaloneODDetailsTab=new PageElement(By.xpath("//span[contains(text(),'Standalone OD Details')]"), "StandaloneODDetailsTab",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insurernmofexistingBundledLiabilitypolicy=new PageElement(By.xpath("//select[@name='existingInsurerName']"), "Insurer name of existing Bundled/Long Term Liability policy",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		existingBundledPolicyNo=new PageElement(By.xpath("//input[@name='existingPolicyNumber']"), "Existing Bundled/Long Term Policy No",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		BundledPolicyStartDate=new PageElement(By.xpath("//input[@name='bundStartDate']"), "Bundled/Long Term Policy Start Date",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		BundledPolicyExpiryDate=new PageElement(By.xpath("//input[@name='bundExpiryDate']"), "Bundled/Long Term Policy Expiry Date",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		dateoffirstpurchaseofvehiclebyoriginalpurchaser=new PageElement(By.xpath("//input[@name=\"firstPurchaseDate\"]"), "Date of first purchase of vehicle by original purchaser",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		panNo=new PageElement(By.xpath("//input[@name=\"panNumber\"]"), "PAN No",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPolicyHolderinfo(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
					|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")
					|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")
					|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")
					|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE")
					|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {

				String policyHolderInfodropdown = proposalForm_IntermediaryEntityData
						.getStringValueForField("PolicyHolderInfoDropdown");
				if ((policyHolderInfodropdown != null) && (!policyHolderInfodropdown.isEmpty())) {
					click(policyHolderInfoDropdown);
				}
				// click(newCustomerRadioButton);
				// click(categoryRadioButton);
				Thread.sleep(10000);
				if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
						|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")) {
					String selectCommercialVehicleType;
					selectCommercialVehicleType = proposalForm_IntermediaryEntityData
							.getStringValueForField("SelectCommercialVehicleType");
					if ((selectCommercialVehicleType != null) && (!selectCommercialVehicleType.isEmpty())) {
						selectValueFromList(selectCommercialVehicleTypeDropDown, proposalForm_IntermediaryEntityData
								.getStringValueForField("SelectCommercialVehicleType"));
					}

					String BuyInsuranceForANewVehicle;
					BuyInsuranceForANewVehicle = proposalForm_IntermediaryEntityData
							.getStringValueForField("BuyInsuranceForANewVehicle");
					if ((BuyInsuranceForANewVehicle != null) && (!BuyInsuranceForANewVehicle.isEmpty())) {
						click(buyInsuranceForANewVehicle);
					}
					String RenewExistingPolicyFromAnyInsurer;
					RenewExistingPolicyFromAnyInsurer = proposalForm_IntermediaryEntityData
							.getStringValueForField("RenewExistingPolicyFromAnyInsurer");
					if ((RenewExistingPolicyFromAnyInsurer != null) && (!RenewExistingPolicyFromAnyInsurer.isEmpty())) {
						click(renewExistingPolicyFromAnyInsurer);
					}
				}
				// MISC For ShopKeeper
				// START
				// if(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")
				// &&
				// proposalForm_IntermediaryEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Shop
				// Keeper")) {
				String newCustomerRadio;
				newCustomerRadio = proposalForm_IntermediaryEntityData.getStringValueForField("NewCustomerRadio");
				if ((newCustomerRadio != null) && (!newCustomerRadio.isEmpty())) {
					click(newCustomer);
				}

				String existingCustomerRadio;
				existingCustomerRadio = proposalForm_IntermediaryEntityData
						.getStringValueForField("ExistingCustomerRadio");
				if ((existingCustomerRadio != null) && (!existingCustomerRadio.isEmpty())) {
					click(existingCustomer);
				}

				String individualRadio;
				individualRadio = proposalForm_IntermediaryEntityData.getStringValueForField("IndividualRadio");
				if ((individualRadio != null) && (!individualRadio.isEmpty())) {
					click(individual);
				}

				String organiztnRadio;
				organiztnRadio = proposalForm_IntermediaryEntityData.getStringValueForField("OrganiztnRadio");
				if ((organiztnRadio != null) && (!organiztnRadio.isEmpty())) {
					click(organization);
				}

				// }
				// END

				String Title;
				Title = proposalForm_IntermediaryEntityData.getStringValueForField("Title");
				if ((Title != null) && (!Title.isEmpty())) {
					selectValueFromList(titleDropDown,
							proposalForm_IntermediaryEntityData.getStringValueForField("Title"));

				}
				String FirstName;
				FirstName = proposalForm_IntermediaryEntityData.getStringValueForField("FirstName");
				if ((FirstName != null) && (!FirstName.isEmpty())) {
					clearAndSendKeys(firstNametextarea,
							proposalForm_IntermediaryEntityData.getStringValueForField("FirstName"));
				}

				String LastName;
				LastName = proposalForm_IntermediaryEntityData.getStringValueForField("LastName");
				if ((LastName != null) && (!LastName.isEmpty())) {
					clearAndSendKeys(lastNametextarea,
							proposalForm_IntermediaryEntityData.getStringValueForField("LastName"));
				}
				String maleRedio1;
				maleRedio1 = proposalForm_IntermediaryEntityData.getStringValueForField("MaleRedio");
				if ((maleRedio1 != null) && (!maleRedio1.isEmpty())) {
					if (!(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
							.equalsIgnoreCase("RURAL"))) {
						click(maleRedioButton);
					} else {
						click(maleRedioButtonForRural);
					}
				}
				String femaleRedio1;
				femaleRedio1 = proposalForm_IntermediaryEntityData.getStringValueForField("FemaleRedio");
				if ((femaleRedio1 != null) && (!femaleRedio1.isEmpty())) {
					click(femaleRedioButton);
				}

				String Date;
				Date = proposalForm_IntermediaryEntityData.getStringValueForField("Date");
				if ((Date != null) && (!Date.isEmpty())) {
					clearAndSendKeys(dateTextField, proposalForm_IntermediaryEntityData.getStringValueForField("Date"));
				}

				String typeOfRegInd;
				typeOfRegInd = proposalForm_IntermediaryEntityData.getStringValueForField("typeOfRegInd");
				if ((typeOfRegInd != null) && (!typeOfRegInd.isEmpty())) {
					selectValueFromList(typeOfRegIndDropDown,
							proposalForm_IntermediaryEntityData.getStringValueForField("typeOfRegInd"));
				}

				String gstinInd;
				gstinInd = proposalForm_IntermediaryEntityData.getStringValueForField("gstinInd");
				if ((gstinInd != null) && (!gstinInd.isEmpty())) {
					clearAndSendKeys(gstinIndTextBox,
							proposalForm_IntermediaryEntityData.getStringValueForField("gstinInd"));
				}

				String BuildiNo;
				BuildiNo = proposalForm_IntermediaryEntityData.getStringValueForField("BuildiNo");
				if ((BuildiNo != null) && (!BuildiNo.isEmpty())) {
					clearAndSendKeys(buildinotextarea,
							proposalForm_IntermediaryEntityData.getStringValueForField("BuildiNo"));
				}

				String locality = proposalForm_IntermediaryEntityData.getStringValueForField("Locality");
				if ((locality != null) && (!locality.isEmpty())) {
					clearAndSendKeys(localityTextbox,
							proposalForm_IntermediaryEntityData.getStringValueForField("Locality"));
				}
				String State;
				State = proposalForm_IntermediaryEntityData.getStringValueForField("State");
				if ((State != null) && (!State.isEmpty())) {
					clearAndSendKeys(statetextarea,
							proposalForm_IntermediaryEntityData.getStringValueForField("State"));
					// click(selectstate);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//input[@name='stateInd']")).sendKeys(Keys.TAB);
				}

				String policyHolderPinCode = proposalForm_IntermediaryEntityData.getStringValueForField("Pincode");
				if ((policyHolderPinCode != null) && (!policyHolderPinCode.isEmpty())) {
					Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
							.withTimeout(30, TimeUnit.SECONDS) 			
							.pollingEvery(5, TimeUnit.SECONDS) 			
							.ignoring(NoSuchElementException.class);
					
					clearAndSendKeys(pINCode, policyHolderPinCode);
					// click(selectstate);
					Thread.sleep(7000);
					driver.findElement(By.xpath("//input[@placeholder='PIN Code']//following::a")).click();
					//driver.findElement(By.xpath("//input[@placeholder='PIN Code']")).sendKeys(Keys.TAB);
				}
				// }
				// else {
				// String Pincode;
				// Pincode =
				// proposalForm_IntermediaryEntityData.getStringValueForField("Pincode");
				// if ((Pincode != null) && (!Pincode.isEmpty())) {
				// clearAndSendKeys(localityTextbox,proposalForm_IntermediaryEntityData.getStringValueForField("Locality"));
				// }

				// WebElement ele = driver.findElement(By.xpath("//input[@placeholder='PIN
				// Code']"));
				// String input =
				// proposalForm_IntermediaryEntityData.getStringValueForField("Pincode");
				// for (int i = 0; i < input.length(); i++) {
				// char c = input.charAt(i);
				// String s = new StringBuilder().append(c).toString();
				// ele.sendKeys(s);
				// }
				Thread.sleep(7000);
				// ele.sendKeys(Keys.TAB);
				// Thread.sleep(6000);
				// }
				// }
				String PANNo;
				PANNo = proposalForm_IntermediaryEntityData.getStringValueForField("PANNo");
				if ((PANNo != null) && (!PANNo.isEmpty())) {
					clearAndSendKeys(panNo,proposalForm_IntermediaryEntityData.getStringValueForField("PANNo"));
				}
				
				String MobileNo;
				MobileNo = proposalForm_IntermediaryEntityData.getStringValueForField("MobileNo");
				if ((MobileNo != null) && (!MobileNo.isEmpty())) {
					clearAndSendKeys(mobilenotextarea,
							proposalForm_IntermediaryEntityData.getStringValueForField("MobileNo"));
					click(createButton);
					Thread.sleep(2000);
					proposalForm_IntermediaryEntityData.setStringValueForField("PolicyHolderCode",
							fetchValueFromFields(policyHolderCode));
				}
				
				String NomineeNamePolicyholder1;
				NomineeNamePolicyholder1 = proposalForm_IntermediaryEntityData
						.getStringValueForField("NomineeNamePolicyHolder");
				if ((NomineeNamePolicyholder1 != null) && (!NomineeNamePolicyholder1.isEmpty())) {

					clearAndSendKeys(nomineeNamePolicyHolder,
							proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNamePolicyHolder"));
				}

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("RelationshipWithNomineePolicyHolder") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("RelationshipWithNomineePolicyHolder").isEmpty())) {
					selectValueFromList(relationshipWithNomineePolicyHolder, proposalForm_IntermediaryEntityData
							.getStringValueForField("RelationshipWithNomineePolicyHolder"));
				}
			}
		}
	}

	public void fillMemberInfo(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS"))
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL"))
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {

			String memberinfo = proposalForm_IntermediaryEntityData.getStringValueForField("MemberinfoDropdown");
			if ((memberinfo != null) && (!memberinfo.isEmpty())) {
				click(memberinfoDropdown);
			}
			// Are you the earning head of the family?
			String earnHeadYesRadioBtn = proposalForm_IntermediaryEntityData
					.getStringValueForField("EarnHeadYesRadioBtn");
			if ((earnHeadYesRadioBtn != null) && (!earnHeadYesRadioBtn.isEmpty())) {
				click(earnHeadYesRadioButton);
			}
			String earnHeadNoRadioBtn = proposalForm_IntermediaryEntityData
					.getStringValueForField("EarnHeadNoRadioBtn");
			if ((earnHeadNoRadioBtn != null) && (!earnHeadNoRadioBtn.isEmpty())) {
				click(earnHeadNoRadioButton);
			}
			String Occupation1 = proposalForm_IntermediaryEntityData.getStringValueForField("Occupation1");
			if ((Occupation1 != null) && (!Occupation1.isEmpty())) {
				selectValueFromList(occupation1Dropdown, Occupation1);
			}
			String preexistingdisease = proposalForm_IntermediaryEntityData
					.getStringValueForField("PreExistingDisease");
			if ((preexistingdisease != null) && (!preexistingdisease.isEmpty())) {
				selectValueFromList(preexistingDisease,
						proposalForm_IntermediaryEntityData.getStringValueForField("PreExistingDisease"));
			}
			String height = proposalForm_IntermediaryEntityData.getStringValueForField("Height");
			if ((height != null) && (!height.isEmpty())) {
				clearAndSendKeys(heightText, proposalForm_IntermediaryEntityData.getStringValueForField("Height"));
			}
			String weight = proposalForm_IntermediaryEntityData.getStringValueForField("Weight");
			if ((weight != null) && (!weight.isEmpty())) {
				clearAndSendKeys(weightText, proposalForm_IntermediaryEntityData.getStringValueForField("Weight"));
			}
			String natureOfid = proposalForm_IntermediaryEntityData.getStringValueForField("NatureOfID");
			if ((natureOfid != null) && (!natureOfid.isEmpty())) {
				selectValueFromList(natureOfId,
						proposalForm_IntermediaryEntityData.getStringValueForField("NatureOfID"));
			}

			String idDocNo = proposalForm_IntermediaryEntityData.getStringValueForField("IdDocNo");
			if ((idDocNo != null) && (!idDocNo.isEmpty())) {
				clearAndSendKeys(idDocno, proposalForm_IntermediaryEntityData.getStringValueForField("IdDocNo"));
			}
			String ProductName;
			ProductName = proposalForm_IntermediaryEntityData.getStringValueForField("ProductName");
			switch (ProductName.toUpperCase()) {
			case "ASHA KIRAN":
				filldaughter(proposalForm_IntermediaryEntityData, assertReference);
				break;
			case "NEW FAMILY FLOATER 2012":
				fillchild(proposalForm_IntermediaryEntityData, assertReference);
				break;
			case "NEW INDIA FLOATER MEDICLAIM":
				fillchild(proposalForm_IntermediaryEntityData, assertReference);
				break;
			case "NEW INDIA MEDICLAIM POLICY":
				fillchild(proposalForm_IntermediaryEntityData, assertReference);
				break;
			default:
				break;
			}
			String name;
			name = proposalForm_IntermediaryEntityData.getStringValueForField("name");
			if ((name != null) && (!name.isEmpty())) {
				clearAndSendKeys(pincodetextarea, proposalForm_IntermediaryEntityData.getStringValueForField("name"));
				Thread.sleep(2000);
			}

			String Gender = proposalForm_IntermediaryEntityData.getStringValueForField("Gender");
			if ((Gender != null) && (!Gender.isEmpty())) {
				if (Gender.equals("female") || Gender.equals("Female")) {
					selectValueFromList(femaleRadioButton,
							proposalForm_IntermediaryEntityData.getStringValueForField("Gender"));

				} else {
					selectValueFromList(maleRadioButton,
							proposalForm_IntermediaryEntityData.getStringValueForField("childGender"));
				}
			}
		}
	}

	private void filldaughter(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		String daughterdropdown = proposalForm_IntermediaryEntityData.getStringValueForField("DaughterDropdown");
		if ((daughterdropdown != null) && (!daughterdropdown.isEmpty())) {
			click(daughterDropdown);
			String DaughterName = proposalForm_IntermediaryEntityData.getStringValueForField("DaughterName");
			if ((DaughterName != null) && (!DaughterName.isEmpty())) {
				clearAndSendKeys(daughterNametextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("DaughterName"));
			}

			String DaughterOccupation;
			DaughterOccupation = proposalForm_IntermediaryEntityData.getStringValueForField("DaughterOccupation");
			if ((DaughterOccupation != null) && (!DaughterOccupation.isEmpty())) {
				selectValueFromList(daughterOccupationDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("DaughterOccupation"));
			}
		}
	}

	private void fillchild(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData, CustomAssert assertReference) {
		String childdropdown = proposalForm_IntermediaryEntityData.getStringValueForField("ChildDropdown");
		if ((childdropdown != null) && (!childdropdown.isEmpty())) {
			click(childDropdown);
			String childName;
			childName = proposalForm_IntermediaryEntityData.getStringValueForField("DaughterName");
			if ((childName != null) && (!childName.isEmpty())) {
				clearAndSendKeys(daughterNametextarea, childName);
			}

			String childOccupation;
			childOccupation = proposalForm_IntermediaryEntityData.getStringValueForField("DaughterOccupation");
			if ((childOccupation != null) && (!childOccupation.isEmpty())) {
				selectValueFromList(daughterOccupationDropdown, childOccupation);
			}
			String childfemaleRedio1;
			childfemaleRedio1 = proposalForm_IntermediaryEntityData.getStringValueForField("ChildFemaleRedio");
			if ((childfemaleRedio1 != null) && (!childfemaleRedio1.isEmpty())) {
				click(childfemaleRadiobutton);
			}
			String ChildID = proposalForm_IntermediaryEntityData.getStringValueForField("ChildNatureOfID");
			if ((ChildID != null) && (!ChildID.isEmpty())) {
				selectValueFromList(childNatureOfID, ChildID);
			}

			String childDocNo = proposalForm_IntermediaryEntityData.getStringValueForField("ChildIdDocNo");
			if ((childDocNo != null) && (!childDocNo.isEmpty())) {
				clearAndSendKeys(childIdDocNo, childDocNo);
			}
		}
	}

	public void fillPhysicianInfo(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))) {
			String physicianInformation = proposalForm_IntermediaryEntityData
					.getStringValueForField("PhysicianInformationTab");
			if ((physicianInformation != null) && (!physicianInformation.isEmpty())) {
				click(physicianInformationTab);
			}

			String noRedio1;
			noRedio1 = proposalForm_IntermediaryEntityData.getStringValueForField("NoRedioBTN");
			if ((noRedio1 != null) && (!noRedio1.isEmpty())) {
				click(noRadioButton);
			}
			String yesRedio1;
			yesRedio1 = proposalForm_IntermediaryEntityData.getStringValueForField("YesRedioBTN");
			if ((yesRedio1 != null) && (!yesRedio1.isEmpty())) {
				if (!(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("HEALTH"))) {
					click(yesRadioButton);
				}
			}
		}
	}

	public void fillNomineeDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")
						&& !proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
								.equalsIgnoreCase("Farmers Package Insurance"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS")
						&& proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
								.equalsIgnoreCase("Pravasi Bhartiya Bima Yojana"))) {

			String nomineeDetailsdropdown = proposalForm_IntermediaryEntityData
					.getStringValueForField("NomineeDetailsDropdownTab");
			if ((nomineeDetailsdropdown != null) && (!nomineeDetailsdropdown.isEmpty())) {
				click(nomineeDetailsDropdown);
			}
			String NomineeName;
			NomineeName = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeName");
			if ((NomineeName != null) && (!NomineeName.isEmpty())) {
				clearAndSendKeys(nomineeNametextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("NomineeName"));
			}
			String nomineeRelationship;
			nomineeRelationship = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeRelationship");
			String strProductname = proposalForm_IntermediaryEntityData.getStringValueForField("ProductName");
			if ((nomineeRelationship != null) && (!nomineeRelationship.isEmpty())) {
				switch (strProductname) {
				case "Janata Personal Accident": {
					selectValueFromList(nomineeRelshipdropDown, nomineeRelationship);
				}
					break;
				default: {
					selectValueFromList(nomineeRelationshipdropDown, nomineeRelationship);
				}
					break;
				}
			}
			Thread.sleep(2000);
			String NomineeAddTextFiled;
			NomineeAddTextFiled = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeAddressFiled");
			if ((NomineeAddTextFiled != null) && (!NomineeAddTextFiled.isEmpty())) {
				clearAndSendKeys(nomineeAddTextFiled, NomineeAddTextFiled);
			}
			String NomineeDOBTextFiled;
			NomineeDOBTextFiled = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeDOB");
			if ((NomineeDOBTextFiled != null) && (!NomineeDOBTextFiled.isEmpty())) {
				clearAndSendKeys(nomineeDOB, NomineeDOBTextFiled);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNominee") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNominee")
							.isEmpty())) {
				clearAndSendKeys(relationshipWithTheNominee,
						proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNominee"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeName") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeName").isEmpty())) {
				clearAndSendKeys(janataPANomineeName,
						proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeName"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeRelation") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeRelation")
							.isEmpty())) {
				selectValueFromList(janataPANomineeRelation,
						proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeRelation"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeAddress") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeAddress")
							.isEmpty())) {
				clearAndSendKeys(janataPANomineeAddress,
						proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeAddress"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeDOB") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeDOB").isEmpty())) {
				clearAndSendKeys(janataPANomineeDOB,
						proposalForm_IntermediaryEntityData.getStringValueForField("JanataPANomineeDOB"));
			}
		}

	}

	public void fillRelationDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL"))
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))
				|| (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))) {

			String agentRequiredRadiobutton = proposalForm_IntermediaryEntityData
					.getStringValueForField("AgentRequiredRadioButton");
			if ((agentRequiredRadiobutton != null) && (!agentRequiredRadiobutton.isEmpty())) {
				click(agentRequiredRadioButton);
			}

		}
	}

	public void VerifyAndSubmitProposalPage(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {

	}

	public void fillAdditionalDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS"))) {

			String AdditionalDetailsDropdown = proposalForm_IntermediaryEntityData
					.getStringValueForField("AdditionalDetailsDropdown");
			if ((AdditionalDetailsDropdown != null) && (!AdditionalDetailsDropdown.isEmpty())) {
				click(additionalDetailsDropdown);
			}

			String occupationn;
			occupationn = proposalForm_IntermediaryEntityData.getStringValueForField("Occupationn");
			if ((occupationn != null) && (!occupationn.isEmpty())) {
				selectValueFromList(occupationDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("Occupationn"));

			}
			String nomineeName;
			nomineeName = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNamePA");
			if ((nomineeName != null) && (!nomineeName.isEmpty())) {
				clearAndSendKeys(nomineeNameTextareaPA,
						proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNamePA"));

			}
			String RelationWithNominee;
			RelationWithNominee = proposalForm_IntermediaryEntityData.getStringValueForField("RelationWithNomineePA");
			if ((RelationWithNominee != null) && (!RelationWithNominee.isEmpty())) {
				selectValueFromList(relationwithNomineeDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("RelationWithNomineePA"));

			}
		}
	}

	public void fillTravellerDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))) {
			String travellerDetails = proposalForm_IntermediaryEntityData
					.getStringValueForField("TravellerDetailsDropdown");
			if ((travellerDetails != null) && (!travellerDetails.isEmpty())) {
				click(travellerDetailsDropdown);
			}

			String occupations = proposalForm_IntermediaryEntityData.getStringValueForField("OccupationsTrv");
			if ((occupations != null) && (!occupations.isEmpty())) {
				selectValueFromList(occupationsDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("OccupationsTrv"));
			}

			String passPort;
			passPort = proposalForm_IntermediaryEntityData.getStringValueForField("PassPort");
			if ((passPort != null) && (!passPort.isEmpty())) {
				clearAndSendKeys(passportTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("PassPort"));
			}

			String passportExpDt;
			passportExpDt = proposalForm_IntermediaryEntityData.getStringValueForField("PassportExpDt");
			if ((passportExpDt != null) && (!passportExpDt.isEmpty())) {
				clearAndSendKeys(passportExpDtTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("PassportExpDt"));
			}

			String visaType;
			visaType = proposalForm_IntermediaryEntityData.getStringValueForField("VisaType");
			if ((visaType != null) && (!visaType.isEmpty())) {
				clearAndSendKeys(visaTypeTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("VisaType"));
			}
			String universityname;
			universityname = proposalForm_IntermediaryEntityData.getStringValueForField("Universityname");
			if ((universityname != null) && (!universityname.isEmpty())) {
				clearAndSendKeys(universitynameTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("Universityname"));
			}
			String universityAdd;
			universityAdd = proposalForm_IntermediaryEntityData.getStringValueForField("UniversityAdd");
			if ((universityAdd != null) && (!universityAdd.isEmpty())) {
				clearAndSendKeys(universityAddTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("UniversityAdd"));
			}
			String sponsorName;
			sponsorName = proposalForm_IntermediaryEntityData.getStringValueForField("SponsorName");
			if ((sponsorName != null) && (!sponsorName.isEmpty())) {
				clearAndSendKeys(sponsornameTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("SponsorName"));
			}
			String sponsorAdd;
			sponsorAdd = proposalForm_IntermediaryEntityData.getStringValueForField("SponsorAdd");
			if ((sponsorAdd != null) && (!sponsorAdd.isEmpty())) {
				clearAndSendKeys(sponsoraddressTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("SponsorAdd"));
			}
		}
	}

	public void fillLiveStockDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
						|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
								.equalsIgnoreCase("RURAL")
								&& proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
										.equalsIgnoreCase("Rural Laghu Bima Cattle or Livestock Insurance")))) {
			String livestockdetailsTab = proposalForm_IntermediaryEntityData
					.getStringValueForField("LivestockDetailsTab");
			if ((livestockdetailsTab != null) && (!livestockdetailsTab.isEmpty())) {
				click(livestockDetailsTab);
			}

			String livestocktype;
			livestocktype = proposalForm_IntermediaryEntityData.getStringValueForField("Livestocktype");
			if ((livestocktype != null) && (!livestocktype.isEmpty())) {
				selectValueFromList(livestockTypeDropDown, livestocktype);
			}
			String tagNumber;
			tagNumber = proposalForm_IntermediaryEntityData.getStringValueForField("TagNumber");
			if ((tagNumber != null) && (!tagNumber.isEmpty())) {
				clearAndSendKeys(tagNumberTextField, tagNumber);
			}
			if (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
							.equalsIgnoreCase("MOTOR"))
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Cattle Insurance"))
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Farmers Package Insurance"))) {
				String maleRedio;
				maleRedio = proposalForm_IntermediaryEntityData.getStringValueForField("MaleRedioLivestock");
				if ((maleRedio != null) && (!maleRedio.isEmpty())) {
					click(maleRedioButton);
				}
				String femaleRedio;
				femaleRedio = proposalForm_IntermediaryEntityData.getStringValueForField("FemaleRedioLivestock");
				if ((femaleRedio != null) && (!femaleRedio.isEmpty())) {
					click(femaleRedioButton);
				}
			}
			String age = proposalForm_IntermediaryEntityData.getStringValueForField("Age");
			if ((age != null) && (!age.isEmpty())) {
				clearAndSendKeys(ageTextField, age);
			}
			String purchaseDate1;
			purchaseDate1 = proposalForm_IntermediaryEntityData.getStringValueForField("PurchaseDate");
			if ((purchaseDate1 != null) && (!purchaseDate1.isEmpty())) {
				clearAndSendKeys(purchaseDate, purchaseDate1);
			}
			String sumInsured;
			sumInsured = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsured");
			if ((sumInsured != null) && (!sumInsured.isEmpty())) {
				selectValueFromList(sumInsuredDropDown, sumInsured);
			}
		}
	}

	private void fillFarmerRiskandFireAlliedPerilsEarthquake(
			PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData, CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {

			if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
					&& (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Farmers Package Insurance"))) {
				{

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("RiskDetailsTab") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("RiskDetailsTab")
									.isEmpty())) {
						click(riskDetailsTab);
					}

					String DetailsOfExistingPhysicalDisabilities = proposalForm_IntermediaryEntityData
							.getStringValueForField("DetailsOfExistingPhysicalDisabilities");
					if ((DetailsOfExistingPhysicalDisabilities != null)
							&& (!DetailsOfExistingPhysicalDisabilities.isEmpty())) {
						clearAndSendKeys(detailsOfExistingPhysicalDisabilities, DetailsOfExistingPhysicalDisabilities);
					}
					String NomineeName = proposalForm_IntermediaryEntityData.getStringValueForField("NomineesName");
					if ((NomineeName != null) && (!NomineeName.isEmpty())) {
						clearAndSendKeys(nomineeName, NomineeName);
					}
					String RelationshipOfTheNomineeWithInsured = proposalForm_IntermediaryEntityData
							.getStringValueForField("RelationshipOfTheNomineeWithInsured");
					if ((RelationshipOfTheNomineeWithInsured != null)
							&& (!RelationshipOfTheNomineeWithInsured.isEmpty())) {
						selectValueFromList(relationshipOfTheNomineeWithInsured, RelationshipOfTheNomineeWithInsured);
					}
					String NomineeAddress = proposalForm_IntermediaryEntityData
							.getStringValueForField("NomineesAddress");
					if ((NomineeAddress != null) && (!NomineeAddress.isEmpty())) {
						clearAndSendKeys(nomineeAddress, NomineeAddress);
					}
					String SumInsuredOnTheDwellingUnit = proposalForm_IntermediaryEntityData
							.getStringValueForField("SumInsuredOnTheDwellingUnit");
					if ((SumInsuredOnTheDwellingUnit != null) && (!SumInsuredOnTheDwellingUnit.isEmpty())) {
						clearAndSendKeys(sumInsuredOnTheDwellingUnit, SumInsuredOnTheDwellingUnit);
					}
					String SumInsuredOnTheContents = proposalForm_IntermediaryEntityData
							.getStringValueForField("SumInsuredOnTheContents");
					if ((SumInsuredOnTheContents != null) && (!SumInsuredOnTheContents.isEmpty())) {
						clearAndSendKeys(sumInsuredOnTheContents, SumInsuredOnTheContents);
					}
					String TotalSumInsured = proposalForm_IntermediaryEntityData
							.getStringValueForField("TotalSumInsured");
					if ((TotalSumInsured != null) && (!TotalSumInsured.isEmpty())) {
						getText(totalSumInsured);
					}
					String ExcessIn = proposalForm_IntermediaryEntityData.getStringValueForField("ExcessIn");
					if ((ExcessIn != null) && (!ExcessIn.isEmpty())) {
						selectValueFromList(excessIn, ExcessIn);
					}
					String DoYouWantToCoverYourTractor = proposalForm_IntermediaryEntityData
							.getStringValueForField("DoYouWantToCoverYourTractor");
					if ((DoYouWantToCoverYourTractor != null) && (!DoYouWantToCoverYourTractor.isEmpty())) {
						click(doYouWantToCoverYourTractor);
					}
					String FireAlliedPerilsEarthauake = proposalForm_IntermediaryEntityData
							.getStringValueForField("FireAlliedPerilsEarthauake");
					if ((FireAlliedPerilsEarthauake != null) && (!FireAlliedPerilsEarthauake.isEmpty())) {
						click(fireAlliedPerilsEarthauake);
					}
					String LocationOfDwellingUnitHouse = proposalForm_IntermediaryEntityData
							.getStringValueForField("LocationOfDwellingUnitHouse");
					if ((LocationOfDwellingUnitHouse != null) && (!LocationOfDwellingUnitHouse.isEmpty())) {
						clearAndSendKeys(locationOfDwellingUnitHouse, LocationOfDwellingUnitHouse);
					}
					String DescriptionAboutDwellingUnitHouse = proposalForm_IntermediaryEntityData
							.getStringValueForField("DescriptionAboutDwellingUnitHouse");
					if ((DescriptionAboutDwellingUnitHouse != null) && (!DescriptionAboutDwellingUnitHouse.isEmpty())) {
						clearAndSendKeys(descriptionAboutDwellingUnitHouse, DescriptionAboutDwellingUnitHouse);
					}
					String IdentificationNoOfTheDwellingUnitHouse = proposalForm_IntermediaryEntityData
							.getStringValueForField("IdentificationNoOfTheDwellingUnitHouse");
					if ((IdentificationNoOfTheDwellingUnitHouse != null)
							&& (!IdentificationNoOfTheDwellingUnitHouse.isEmpty())) {
						clearAndSendKeys(identificationNoOfTheDwellingUnitHouse,
								IdentificationNoOfTheDwellingUnitHouse);
					}
					String DescriptionAboutTheContentsInTheDwelling = proposalForm_IntermediaryEntityData
							.getStringValueForField("DescriptionAboutTheContentsInTheDwelling");
					if ((DescriptionAboutTheContentsInTheDwelling != null)
							&& (!DescriptionAboutTheContentsInTheDwelling.isEmpty())) {
						clearAndSendKeys(descriptionAboutTheContentsInTheDwelling,
								DescriptionAboutTheContentsInTheDwelling);
					}
					String IsItKatchaConstruction = proposalForm_IntermediaryEntityData
							.getStringValueForField("IsItKatchaConstruction");
					if ((IsItKatchaConstruction != null) && (!IsItKatchaConstruction.isEmpty())) {
						click(isItKatchaConstruction);
					}
					String IsLoadingApplicable = proposalForm_IntermediaryEntityData
							.getStringValueForField("IsLoadingApplicable");
					if ((IsLoadingApplicable != null) && (!IsLoadingApplicable.isEmpty())) {
						click(isLoadingApplicable);
					}
					String RelationDetails = proposalForm_IntermediaryEntityData
							.getStringValueForField("RelationDetails");
					if ((RelationDetails != null) && (!RelationDetails.isEmpty())) {
						click(relationDetails);
					}
					String IsAgentRequired = proposalForm_IntermediaryEntityData
							.getStringValueForField("IsAgentRequired");
					if ((IsAgentRequired != null) && (!IsAgentRequired.isEmpty())) {
						click(isAgentRequired);
					}
				}
			}
		}
	}

	public void fillTransitDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))) {

			String transitdetailsTab = proposalForm_IntermediaryEntityData.getStringValueForField("TransitDetailsTab");
			if ((transitdetailsTab != null) && (!transitdetailsTab.isEmpty())) {
				click(transitDetailsTab);
			}
			String modeOfTransport;
			modeOfTransport = proposalForm_IntermediaryEntityData.getStringValueForField("ModeOfTransport");
			if ((modeOfTransport != null) && (!modeOfTransport.isEmpty())) {
				selectValueFromList(modeOfTransportDropDown, modeOfTransport);
			}
			String fromCountry;
			fromCountry = proposalForm_IntermediaryEntityData.getStringValueForField("FromCountry");
			if ((fromCountry != null) && (!fromCountry.isEmpty())) {
				clearAndSendKeys(fromCountryTextField, fromCountry);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
			}
			String toCountry;
			toCountry = proposalForm_IntermediaryEntityData.getStringValueForField("ToCountry");
			if ((toCountry != null) && (!toCountry.isEmpty())) {
				clearAndSendKeys(toCountryTextField, toCountry);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
			}
			String fromCity;
			fromCity = proposalForm_IntermediaryEntityData.getStringValueForField("FromCity");
			if ((fromCity != null) && (!fromCity.isEmpty())) {
				clearAndSendKeys(fromCityTextField, fromCity);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
			}
			String toCity;
			toCity = proposalForm_IntermediaryEntityData.getStringValueForField("ToCity");
			if ((toCity != null) && (!toCity.isEmpty())) {
				clearAndSendKeys(toCityTextField, toCity);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
			}

			String portOfLoading;
			portOfLoading = proposalForm_IntermediaryEntityData.getStringValueForField("PortOfLoading");
			if ((portOfLoading != null) && (!portOfLoading.isEmpty())) {
				clearAndSendKeys(portOfLoadingTextField, portOfLoading);
			}
			String portOfDischarge;
			portOfDischarge = proposalForm_IntermediaryEntityData.getStringValueForField("PortOfDischarge");
			if ((portOfDischarge != null) && (!portOfDischarge.isEmpty())) {
				clearAndSendKeys(portOfDischargeTextField, portOfDischarge);
			}
			Thread.sleep(5000);
		}
	}

	public void fillCargoDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {

		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))) {
			// shreeya
			Thread.sleep(5000);
			switchToWindow("chrome");
			
			String cargodetailsTab = proposalForm_IntermediaryEntityData.getStringValueForField("CargoDetailsTab");
			if ((cargodetailsTab != null) && (!cargodetailsTab.isEmpty())) {
				doubleClick(cargoDetailsTab);
			}
			String CargoType;
			CargoType = proposalForm_IntermediaryEntityData.getStringValueForField("CargoType");
			if ((CargoType != null) && (!CargoType.isEmpty())) {
				selectValueFromList(cargoTypeDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("CargoType"));
			}
			String Packaging;
			Packaging = proposalForm_IntermediaryEntityData.getStringValueForField("PackagingCargo");
			if ((Packaging != null) && (!Packaging.isEmpty())) {
				selectValueFromList(packagingDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("PackagingCargo"));
				click(inlandTransitClauseA);
			}
			String cargoSumInsuredInRS;
			cargoSumInsuredInRS = proposalForm_IntermediaryEntityData.getStringValueForField("cargoSumInsuredInRS");
			if ((cargoSumInsuredInRS != null) && (!cargoSumInsuredInRS.isEmpty())) {
				clearAndSendKeys(cargoSumInsuredInRStextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("cargoSumInsuredInRS"));
			}
			String cargoRatepercentage;
			cargoRatepercentage = proposalForm_IntermediaryEntityData.getStringValueForField("cargoRatepercentage");
			if ((cargoRatepercentage != null) && (!cargoRatepercentage.isEmpty())) {
				clearAndSendKeys(cargoRatepercentagetextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("cargoRatepercentage"));
			}
			String percentageExtra;
			percentageExtra = proposalForm_IntermediaryEntityData.getStringValueForField("percentageExtra");
			if ((percentageExtra != null) && (!percentageExtra.isEmpty())) {
				clearAndSendKeys(percentageExtratextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("percentageExtra"));
			}
			String invoiceNumber;
			invoiceNumber = proposalForm_IntermediaryEntityData.getStringValueForField("invoiceNumber");
			if ((invoiceNumber != null) && (!invoiceNumber.isEmpty())) {
				clearAndSendKeys(invoiceNumbertextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("invoiceNumber"));
			}
		}
	}
	
	public void fillStandaloneODDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData, CustomAssert assertReference)
	{
		if(proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")&& 
				(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
				&&(proposalForm_IntermediaryEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone OD for Motor PC"))
				||(proposalForm_IntermediaryEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Standalone OD for Motor TW")))
			{
			String standaloneODDetails = proposalForm_IntermediaryEntityData.getStringValueForField("StandaloneODDetailsTab");
			if((standaloneODDetails != null)&& (!standaloneODDetails.isEmpty())) {
				click(StandaloneODDetailsTab);
			}
			
			String InsurernmofexistingBundledLiabilitypolicy;
			InsurernmofexistingBundledLiabilitypolicy = proposalForm_IntermediaryEntityData.getStringValueForField("InsurernmofexistingBundledLiabilitypolicy");
			if ((InsurernmofexistingBundledLiabilitypolicy != null)&&(!InsurernmofexistingBundledLiabilitypolicy.isEmpty())) {
				selectValueFromList(insurernmofexistingBundledLiabilitypolicy, InsurernmofexistingBundledLiabilitypolicy);
			}
			String ExistingBundledPolicyNo;
			ExistingBundledPolicyNo = proposalForm_IntermediaryEntityData.getStringValueForField("ExistingBundledPolicyNo");
			if ((ExistingBundledPolicyNo != null) && (!ExistingBundledPolicyNo.isEmpty())) {
				clearAndSendKeys(existingBundledPolicyNo,
						proposalForm_IntermediaryEntityData.getStringValueForField("ExistingBundledPolicyNo"));
			}
			String bundledPolicyStartDate;
			bundledPolicyStartDate = proposalForm_IntermediaryEntityData.getStringValueForField("BundledPolicyStartDate");
			if ((bundledPolicyStartDate != null) && (!bundledPolicyStartDate.isEmpty())) {
				clearAndSendKeys(BundledPolicyStartDate,
						proposalForm_IntermediaryEntityData.getStringValueForField("BundledPolicyStartDate"));
			}
			String bundledPolicyExpiryDate;
			bundledPolicyExpiryDate = proposalForm_IntermediaryEntityData.getStringValueForField("BundledPolicyExpiryDate");
			if ((bundledPolicyExpiryDate != null) && (!bundledPolicyExpiryDate.isEmpty())) {
				clearAndSendKeys(BundledPolicyExpiryDate,
						proposalForm_IntermediaryEntityData.getStringValueForField("BundledPolicyExpiryDate"));
			}	
			}
		}

	public void fillVehicleDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {
			String vehicledetails = proposalForm_IntermediaryEntityData.getStringValueForField("VehicleDetailsTab");
			if ((vehicledetails != null) && (!vehicledetails.isEmpty())) {
				click(vehicleDetails);
			}
			// Vehical detail of Commercial Vehical

			String Typeofgoodscarrying;
			Typeofgoodscarrying = proposalForm_IntermediaryEntityData.getStringValueForField("Typeofgoodscarrying");
			if ((Typeofgoodscarrying != null) && (!Typeofgoodscarrying.isEmpty())) {
				selectValueFromList(typeOfGoodsCarryingDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("Typeofgoodscarrying"));
			}

			String TypeOfPasengerCarrying;
			TypeOfPasengerCarrying = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeOFPasengerCarrying");
			if ((TypeOfPasengerCarrying != null) && (!TypeOfPasengerCarrying.isEmpty())) {
				selectValueFromList(typeOfPasengerCarrying,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeOFPasengerCarrying"));
			}
			String TypeOfMiseAndSpecialType;
			TypeOfMiseAndSpecialType = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeOfMiseAndSpecialType");
			if ((TypeOfMiseAndSpecialType != null) && (!TypeOfMiseAndSpecialType.isEmpty())) {
				selectValueFromList(typeOfMiseAndSpecialType,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfMiseAndSpecialType"));
			}

			String Goodscarryingvehicledescription;
			Goodscarryingvehicledescription = proposalForm_IntermediaryEntityData
					.getStringValueForField("Goodscarryingvehicledescription");
			if ((Goodscarryingvehicledescription != null) && (!Goodscarryingvehicledescription.isEmpty())) {
				clearAndSendKeys(GoodscarryingvehicledescriptionDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("Goodscarryingvehicledescription"));
			}

			String typeofbodyCommercialVehicle;
			typeofbodyCommercialVehicle = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeofbodyCommercialVehicle");
			if ((typeofbodyCommercialVehicle != null) && (!typeofbodyCommercialVehicle.isEmpty())) {
				selectValueFromList(TypeofbodyDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyCommercialVehicle"));
			}
			String TypeofbodyPassengerCarrying;
			TypeofbodyPassengerCarrying = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeOfbodyPassengerCarrying");
			if ((TypeofbodyPassengerCarrying != null) && (!TypeofbodyPassengerCarrying.isEmpty())) {
				selectValueFromList(typeofbodyPassengerCarrying,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfbodyPassengerCarrying"));
			}
			String TypeofbodyMiscCarrying;
			TypeofbodyMiscCarrying = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeofbodyMiscCarrying");
			if ((TypeofbodyMiscCarrying != null) && (!TypeofbodyMiscCarrying.isEmpty())) {
				selectValueFromList(typeofbodyMiscCarrying,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyMiscCarrying"));
			}

			String TypeofbodyMiseSpecialType;
			TypeofbodyMiseSpecialType = proposalForm_IntermediaryEntityData
					.getStringValueForField("TypeofbodyMiseSpecialType");
			if ((TypeofbodyMiseSpecialType != null) && (!TypeofbodyMiseSpecialType.isEmpty())) {
				selectValueFromList(typeofbodyMiseSpecialType,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyMiseSpecialType"));
			}

			String TypeofbodyOther;
			TypeofbodyOther = proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyOther");
			if ((TypeofbodyOther != null) && (!TypeofbodyOther.isEmpty())) {
				selectValueFromList(typeofbodyOther,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyOther"));
			}

			String PurpuseOfPassengerVehicle;
			PurpuseOfPassengerVehicle = proposalForm_IntermediaryEntityData
					.getStringValueForField("PurpuseOfPassengerVehicle");
			if ((PurpuseOfPassengerVehicle != null) && (!PurpuseOfPassengerVehicle.isEmpty())) {
				selectValueFromList(purpuseOfPassengerVehicle,
						proposalForm_IntermediaryEntityData.getStringValueForField("PurpuseOfPassengerVehicle"));
			}

			String DistanceCovered;
			DistanceCovered = proposalForm_IntermediaryEntityData.getStringValueForField("DistanceCovered");
			if ((DistanceCovered != null) && (!DistanceCovered.isEmpty())) {
				clearAndSendKeys(distanceCovered,
						proposalForm_IntermediaryEntityData.getStringValueForField("DistanceCovered"));
			}

			String TransitFromTextField;
			TransitFromTextField = proposalForm_IntermediaryEntityData.getStringValueForField("TransitFromTextField");
			if ((TransitFromTextField != null) && (!TransitFromTextField.isEmpty())) {
				clearAndSendKeys(transitFromTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("TransitFromTextField"));
			}

			String TransitToTextField;
			TransitToTextField = proposalForm_IntermediaryEntityData.getStringValueForField("TransitToTextField");
			if ((TransitToTextField != null) && (!TransitToTextField.isEmpty())) {
				clearAndSendKeys(transitToTextField,
						proposalForm_IntermediaryEntityData.getStringValueForField("TransitToTextField"));
			}

			String TypeOfRaodRisk;
			TypeOfRaodRisk = proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfRaodRisk");
			if ((TypeOfRaodRisk != null) && (!TypeOfRaodRisk.isEmpty())) {
				selectValueFromList(typeOfRaodRisk,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfRaodRisk"));
			}

			String Year;
			Year = proposalForm_IntermediaryEntityData.getStringValueForField("ManufactureYear");
			if ((Year != null) && (!Year.isEmpty())) {
				selectValueFromList(yearDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("ManufactureYear"));
			}

			String BasisOfRoadTransitDropDown;
			BasisOfRoadTransitDropDown = proposalForm_IntermediaryEntityData
					.getStringValueForField("BasisOfRoadTransitDropDown");
			if ((BasisOfRoadTransitDropDown != null) && (!BasisOfRoadTransitDropDown.isEmpty())) {
				selectValueFromList(basisOfRoadTransitDropDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("BasisOfRoadTransitDropDown"));
				String NameOfDriver;
				NameOfDriver = proposalForm_IntermediaryEntityData.getStringValueForField("NameOfDriverTextField");
				if ((NameOfDriver != null) && (!NameOfDriver.isEmpty())) {
					clearAndSendKeys(nameOfDriver,
							proposalForm_IntermediaryEntityData.getStringValueForField("NameOfDriverTextField"));

					String TradecertificateValue;
					TradecertificateValue = proposalForm_IntermediaryEntityData
							.getStringValueForField("TradecertificateValueTextField");
					if ((TradecertificateValue != null) && (!TradecertificateValue.isEmpty())) {
						clearAndSendKeys(tradecertificateValue, proposalForm_IntermediaryEntityData
								.getStringValueForField("TradecertificateValueTextField"));

						String DrivinglicenceValue;
						DrivinglicenceValue = proposalForm_IntermediaryEntityData
								.getStringValueForField("DrivinglicenceValueTextField");
						if ((DrivinglicenceValue != null) && (!DrivinglicenceValue.isEmpty())) {
							clearAndSendKeys(drivinglicenceValue, proposalForm_IntermediaryEntityData
									.getStringValueForField("DrivinglicenceValueTextField"));

							String SalryOfDriverTextfield;
							SalryOfDriverTextfield = proposalForm_IntermediaryEntityData
									.getStringValueForField("SalryOfDriverTextfield");
							if ((SalryOfDriverTextfield != null) && (!SalryOfDriverTextfield.isEmpty())) {
								clearAndSendKeys(salryOfDriverTextfield, proposalForm_IntermediaryEntityData
										.getStringValueForField("SalryOfDriverTextfield"));
							}
						}
					}
				}
			}

			/*
			 * String year; year =
			 * proposalForm_IntermediaryEntityData.getStringValueForField("ManufactureYear")
			 * ; if ((year!=null)&&(!year.isEmpty())){
			 * selectValueFromList(yearDropdown,proposalForm_IntermediaryEntityData.
			 * getStringValueForField("ManufactureYear")); }
			 */

			String vehicalPurchasedate;
			// vehicalPurchasedate =
			// proposalForm_IntermediaryEntityData.getStringValueForField("VehicalPurchaseDate");
			// if ((vehicalPurchasedate!=null)&&(!vehicalPurchasedate.isEmpty())){
			// clearAndSendKeys(vehicalpurchaseDate, vehicalPurchasedate);
			// }
			vehicalPurchasedate = (proposalForm_IntermediaryEntityData.getStringValueForField("VehicalPurchaseDate"));
			if ((vehicalPurchasedate != null) && (!vehicalPurchasedate.isEmpty())) {
				clearAndEnterDate(vehicalpurchaseDate, RandomCodeGenerator.dateGenerator(vehicalPurchasedate));
				// dismissAlertAndReturnConfirmationMessage();
				// if(policyStartDatePopUp.getWebElement().isDisplayed())
				// policyStartDatePopUp.getWebElement().click();
				try {
					if (driver.findElement(By.xpath("//button[@class='btn btn-blue btn-width']")).isDisplayed()) {
						driver.findElement(By.xpath("//button[@class='btn btn-blue btn-width']")).click();
					}
				} catch (Exception e) {
					System.out.println(e.toString());
				}

			}
			String make;
			make = proposalForm_IntermediaryEntityData.getStringValueForField("Make");
			if ((make != null) && (!make.isEmpty())) {
				selectValueFromList(makeDropdown, proposalForm_IntermediaryEntityData.getStringValueForField("Make"));
			}
			String model;
			model = proposalForm_IntermediaryEntityData.getStringValueForField("Model");
			if ((model != null) && (!model.isEmpty())) {
				clearAndSendKeys(modelTextField, proposalForm_IntermediaryEntityData.getStringValueForField("Model"));
				Thread.sleep(5000);
				driver.findElement(By.name("vehicleModel")).sendKeys(Keys.ENTER);
				Thread.sleep(8000);
			}
			String seatingCapacity;
			seatingCapacity = proposalForm_IntermediaryEntityData.getStringValueForField("seatingCapacity");
			if ((seatingCapacity != null) && (!seatingCapacity.isEmpty())) {
				clearAndSendKeys(seatingCapacitytextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("seatingCapacity"));
			}

			String CarryingCapacity;
			CarryingCapacity = proposalForm_IntermediaryEntityData.getStringValueForField("CarryingCapacity");
			if ((CarryingCapacity != null) && (!CarryingCapacity.isEmpty())) {
				clearAndSendKeys(carryingCapacity,
						proposalForm_IntermediaryEntityData.getStringValueForField("CarryingCapacity"));
			}

			String vehiclePermitDetails;
			vehiclePermitDetails = proposalForm_IntermediaryEntityData.getStringValueForField("vehiclePermitDetails");
			if ((vehiclePermitDetails != null) && (!vehiclePermitDetails.isEmpty())) {
				selectValueFromList(vehiclePermitDetailsDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("vehiclePermitDetails"));
			}

			String IMT23YesRadio;
			IMT23YesRadio = proposalForm_IntermediaryEntityData.getStringValueForField("IMT23YesRadio");
			if ((IMT23YesRadio != null) && (!IMT23YesRadio.isEmpty())) {
				if (!(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MOTOR"))) {
					click(IMT23YesRadioButton);
				} else {
					click(IMT23YesRadioButton);
				}
			}
			String IMT23NORadio;
			IMT23NORadio = proposalForm_IntermediaryEntityData.getStringValueForField("IMT23NORadio");
			if ((IMT23NORadio != null) && (!IMT23NORadio.isEmpty())) {
				click(IMT23NoRadioButton);
			}

			if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
					&& (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Commercial Vehicle"))) {
				String vehicleZone;
				vehicleZone = proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone");
				if ((vehicleZone != null) && (!vehicleZone.isEmpty())) {
					selectValueFromList(vehicleZoneDropDown,
							proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone"));
				}
			}
			if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
					&& (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Private Car")
							|| (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
									.equalsIgnoreCase("Two Wheeler")))) {
				String vehicleZone;
				vehicleZone = proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone");
				if ((vehicleZone != null) && (!vehicleZone.isEmpty())) {
					selectValueFromList(vehicleZoneDropDown1,
							proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone"));
				}
			}

			String Registrationdate;
			Registrationdate = (proposalForm_IntermediaryEntityData.getStringValueForField("VehicleRegistrationDate"));
			if ((Registrationdate != null) && (!Registrationdate.isEmpty())) {
				if (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
						.equalsIgnoreCase("Commercial Vehicle")) {
					clearAndEnterDate(registrationDateofcommercialcar,
							RandomCodeGenerator.dateGenerator(Registrationdate));
				} else {
					clearAndEnterDate(registrationDatetextarea, RandomCodeGenerator.dateGenerator(Registrationdate));
				}
			}
			
			String Dateoffirstpurchaseofvehiclebyoriginalpurchaser;
			Dateoffirstpurchaseofvehiclebyoriginalpurchaser= proposalForm_IntermediaryEntityData.getStringValueForField("Dateoffirstpurchaseofvehiclebyoriginalpurchaser");
			if((Dateoffirstpurchaseofvehiclebyoriginalpurchaser!= null) && (!Dateoffirstpurchaseofvehiclebyoriginalpurchaser.isEmpty())) {
				clearAndSendKeys(dateoffirstpurchaseofvehiclebyoriginalpurchaser, Dateoffirstpurchaseofvehiclebyoriginalpurchaser);
			}
			
			String vehicleZone;
			vehicleZone = proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone");
			if ((vehicleZone != null) && (!vehicleZone.isEmpty())) {
				selectValueFromList(vehicleZoneDropDown1,
						proposalForm_IntermediaryEntityData.getStringValueForField("VehicleZone"));
			}
			
			String VehicleInvoiceValue;
			VehicleInvoiceValue = proposalForm_IntermediaryEntityData.getStringValueForField("VehicleInvoiceValue");
			if ((VehicleInvoiceValue != null) && (!VehicleInvoiceValue.isEmpty())) {
				clearAndSendKeys(vehicleInvoiceValue,
						proposalForm_IntermediaryEntityData.getStringValueForField("VehicleInvoiceValue"));
			}

			/*
			 * String InsuredDeclaredValue; InsuredDeclaredValue =
			 * proposalForm_IntermediaryEntityData.getStringValueForField(
			 * "InsuredDeclaredValue"); if
			 * ((InsuredDeclaredValue!=null)&&(!InsuredDeclaredValue.isEmpty())){
			 * clearAndSendKeys(insuredDeclaredValue,proposalForm_IntermediaryEntityData.
			 * getStringValueForField("InsuredDeclaredValue")); }
			 */

			String RegistrationNo1;
			RegistrationNo1 = proposalForm_IntermediaryEntityData.getStringValueForField("RegistrationNo1");
			if ((RegistrationNo1 != null) && (!RegistrationNo1.isEmpty())) {
				clearAndSendKeys(RegistrationNo1textarea, RegistrationNo1);
			}

			String RegistrationNo2;
			RegistrationNo2 = proposalForm_IntermediaryEntityData.getStringValueForField("RegistrationNo2");
			if ((RegistrationNo2 != null) && (!RegistrationNo2.isEmpty())) {
				clearAndSendKeys(RegistrationNo2textarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("RegistrationNo2"));
			}
			String RegistrationNo3;
			RegistrationNo3 = proposalForm_IntermediaryEntityData.getStringValueForField("RegistrationNo3");
			if ((RegistrationNo3 != null) && (!RegistrationNo3.isEmpty())) {
				clearAndSendKeys(RegistrationNo3textarea, RegistrationNo3);
			}
			String RegistrationNo4;
			RegistrationNo4 = proposalForm_IntermediaryEntityData.getStringValueForField("RegistrationNo4");
			if ((RegistrationNo4 != null) && (!RegistrationNo4.isEmpty())) {
				clearAndSendKeys(RegistrationNo4textarea, RegistrationNo4);
			}

			String Engineno;
			Engineno = proposalForm_IntermediaryEntityData.getStringValueForField("Engineno");
			if ((Engineno != null) && (!Engineno.isEmpty())) {
				clearAndSendKeys(enginenotextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("Engineno"));
			}
			String Chasisno;
			Chasisno = proposalForm_IntermediaryEntityData.getStringValueForField("Chasisno");
			if ((Chasisno != null) && (!Chasisno.isEmpty())) {
				clearAndSendKeys(chasisnotextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("Chasisno"));
			}
			String colourOfVehicle;
			colourOfVehicle = proposalForm_IntermediaryEntityData.getStringValueForField("colourOfVehicle");
			if ((colourOfVehicle != null) && (!colourOfVehicle.isEmpty())) {
				selectValueFromList(colourOfVehicletextDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("colourOfVehicle"));
			}
			String ColourasperRCBook;
			ColourasperRCBook = proposalForm_IntermediaryEntityData.getStringValueForField("ColourasperRCBook");
			if ((ColourasperRCBook != null) && (!ColourasperRCBook.isEmpty())) {
				clearAndSendKeys(colourAsPerRCBooktextarea,
						proposalForm_IntermediaryEntityData.getStringValueForField("ColourasperRCBook"));
			}
			String typeofbodyPrivateCar;
			typeofbodyPrivateCar = proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyPrivateCar");
			if ((typeofbodyPrivateCar != null) && (!typeofbodyPrivateCar.isEmpty())) {
				selectValueFromList(TypeofbodyPrivateCar,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeofbodyPrivateCar"));
			}
			String fuelType;
			fuelType = proposalForm_IntermediaryEntityData.getStringValueForField("fuelType");
			if ((fuelType != null) && (!fuelType.isEmpty())) {
				selectValueFromList(fuelTypeDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("fuelType"));
			}
			String applicableNCBPercent;
			applicableNCBPercent = proposalForm_IntermediaryEntityData.getStringValueForField("applicableNCBPercent");
			if ((applicableNCBPercent != null) && (!applicableNCBPercent.isEmpty())) {
				selectValueFromList(applicableNCBPercentDropdown,
						proposalForm_IntermediaryEntityData.getStringValueForField("applicableNCBPercent"));
			}
		}
	}

	public void fillCoverageDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {
			// click on coverage details tab
			String CoverageDetailsTab;
			CoverageDetailsTab = proposalForm_IntermediaryEntityData.getStringValueForField("CoverageDetailsTab");
			if ((CoverageDetailsTab != null) && (!CoverageDetailsTab.isEmpty())) {
				click(coverageDetailsTab);
			}
			// Does the owner drive the vehicle?
			String ownerDriveYesRadio;
			ownerDriveYesRadio = proposalForm_IntermediaryEntityData.getStringValueForField("ownerDriveYesRadio");
			if ((ownerDriveYesRadio != null) && (!ownerDriveYesRadio.isEmpty())) {
				if (!(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MOTOR"))) {
					click(ownerDriveYesRadiobutton);

					// Click on the owner drive license Type
					String ownerLicenseType;
					ownerLicenseType = proposalForm_IntermediaryEntityData.getStringValueForField("ownerLicenseType");
					if ((ownerLicenseType != null) && (!ownerLicenseType.isEmpty())) {
						selectValueFromList(ownerLicenseTypeDropdown,
								proposalForm_IntermediaryEntityData.getStringValueForField("ownerLicenseType"));
					}
				}
				// else {
				// click(ownerDriveYesRadiobutton);
				// }
			}
			String ownerDriveNORadio;
			ownerDriveNORadio = proposalForm_IntermediaryEntityData.getStringValueForField("ownerDriveNORadio");
			if ((ownerDriveNORadio != null) && (!ownerDriveNORadio.isEmpty())) {
				click(ownerDriveNoRadiobutton);
			}
		}
	}

	public void fillPreviousInsurerDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {
			// click on coverage details tab
			String PreviousInsurerDetailsTab;
			PreviousInsurerDetailsTab = proposalForm_IntermediaryEntityData
					.getStringValueForField("PreviousInsurerDetailsTab");
			if ((PreviousInsurerDetailsTab != null) && (!PreviousInsurerDetailsTab.isEmpty())) {
				click(PreviousInsurerDetailsTabButton);
			}
			String previousInsName;
			previousInsName = proposalForm_IntermediaryEntityData.getStringValueForField("PreviousInsurerName");
			if ((previousInsName != null) && (!previousInsName.isEmpty())) {
				selectValueFromList(previousInsurerName,
						proposalForm_IntermediaryEntityData.getStringValueForField("PreviousInsurerName"));
			}
			String previousPolicyNum;
			previousPolicyNum = proposalForm_IntermediaryEntityData.getStringValueForField("PreviousPolicyNumber");
			if ((previousPolicyNum != null) && (!previousPolicyNum.isEmpty())) {
				clearAndSendKeys(previousPolicyNumber,
						proposalForm_IntermediaryEntityData.getStringValueForField("PreviousPolicyNumber"));
			}
			String PreviousPolicyAdd;
			PreviousPolicyAdd = proposalForm_IntermediaryEntityData.getStringValueForField("PreviousPolicyAddress");
			if ((PreviousPolicyAdd != null) && (!PreviousPolicyAdd.isEmpty())) {
				clearAndSendKeys(previousPolicyAddress,
						proposalForm_IntermediaryEntityData.getStringValueForField("PreviousPolicyAddress"));
			}
			String PreviousPolicyExp;
			PreviousPolicyExp = (proposalForm_IntermediaryEntityData.getStringValueForField("PreviousPolicyExpDate"));
			if ((PreviousPolicyExp != null) && (!PreviousPolicyExp.isEmpty())) {

				if (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
						.equalsIgnoreCase("Commercial Vehicle")) {
					clearAndEnterDate(previousPolicyExpDateforCV, RandomCodeGenerator.dateGenerator(PreviousPolicyExp));
				} else {
					clearAndEnterDate(previousPolicyExpDate, RandomCodeGenerator.dateGenerator(PreviousPolicyExp));
					Thread.sleep(1000);
				}
			}

			try {
				click(oKButton);
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}
	}

	public void fillOtherDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))) {
			String otherdetailsDropDown;
			otherdetailsDropDown = proposalForm_IntermediaryEntityData.getStringValueForField("OtherdetailsDropDown");
			if ((otherdetailsDropDown != null) && (!otherdetailsDropDown.isEmpty())) {
				click(otherDetailsDropDown);
			}
			String nameOfThenominee;
			nameOfThenominee = proposalForm_IntermediaryEntityData.getStringValueForField("NameOfThenominee");
			if ((nameOfThenominee != null) && (!nameOfThenominee.isEmpty())) {
				clearAndSendKeys(nameOftheNominee,
						proposalForm_IntermediaryEntityData.getStringValueForField("NameOfThenominee"));
			}

			String relationshipnominee;
			relationshipnominee = proposalForm_IntermediaryEntityData.getStringValueForField("Relationshipnominee");
			if ((relationshipnominee != null) && (!relationshipnominee.isEmpty())) {
				selectValueFromList(relationshipNominee,
						proposalForm_IntermediaryEntityData.getStringValueForField("Relationshipnominee"));
			}

			String yesRadio;
			yesRadio = proposalForm_IntermediaryEntityData.getStringValueForField("YesRadio");
			if ((yesRadio != null) && (!yesRadio.isEmpty())) {
				click(yesradio);

			}
			String noRadio;
			noRadio = proposalForm_IntermediaryEntityData.getStringValueForField("NoRadio");
			if ((noRadio != null) && (!noRadio.isEmpty())) {
				click(noradio);
			}
		}
	}

	public void fillPolicyPeriod(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) throws InterruptedException {
		if ((proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add"))
				&& proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
								.equalsIgnoreCase("Rural Laghu Bima Cattle or Livestock Insurance")))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))) {

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PolicyPeriodTab") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PolicyPeriodTab").isEmpty())) {
				if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")) {
					click(policyPeriodTabForRural);
				} else {
					click(policyPeriodTab);
				}
			}
			String policyStartDate;
			policyStartDate = (proposalForm_IntermediaryEntityData.getStringValueForField("policyStartDate"));
			if ((policyStartDate != null) && (!policyStartDate.isEmpty())) {
				clearAndEnterDate(policyStartDatetextarea, RandomCodeGenerator.dateGenerator(policyStartDate));
				policyStartDatetextarea.getWebElement().sendKeys(Keys.TAB);
			}
			// String policyEndDate;
			// policyEndDate =
			// proposalForm_IntermediaryEntityData.getStringValueForField("policyEndDate");
			// if ((policyEndDate!=null)&&(!policyEndDate.isEmpty())){
			// clearAndSendKeys(policyEndDatetextarea,proposalForm_IntermediaryEntityData.getStringValueForField("policyEndDate"));
			// }
			String policyduration;
			policyduration = proposalForm_IntermediaryEntityData.getStringValueForField("PolicyDuration");
			if ((policyduration != null) && (!policyduration.isEmpty())) {
				try {
					if (!proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
							.equalsIgnoreCase("Two Wheeler")) {
						selectValueFromList(policyDurationDropDown, policyduration);
						Thread.sleep(2000);
					}
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				// selectValueFromList(policyDurationDropDown,policyduration);
				// Thread.sleep(2000);
			}
		}
	}

	private void fillPolicyPeriodForTwoWheeler(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) throws InterruptedException {
		if ((proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add"))
				&& ((proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
						&& (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
								.equalsIgnoreCase("Two Wheeler")))) {
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PolicyPeriodTab") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PolicyPeriodTab").isEmpty())) {
				click(policyPeriodTab);
				Thread.sleep(2000);
			}

			String policydurationforTwoWheeler;
			policydurationforTwoWheeler = proposalForm_IntermediaryEntityData
					.getStringValueForField("PolicyDurationforTwoWheeler");
			if ((policydurationforTwoWheeler != null) && (!policydurationforTwoWheeler.isEmpty())) {
				try {
					policyDurationDropDown = new PageElement(By.xpath("//select[@name='policyDuration']"),"Policy duration for two wheeler", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
					selectValueFromList(policyDurationDropDown, policydurationforTwoWheeler);

				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
		}
	}

	public void clickButton(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")
				|| (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL")
				|| proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")))) {
			String saveAndcal;
			saveAndcal = proposalForm_IntermediaryEntityData.getStringValueForField("SaveAndCalculatePremium");
			if ((saveAndcal != null) && (!saveAndcal.isEmpty())) {
			click(saveAndCalculatePremiumButton);
				Thread.sleep(20000);
			//	System.out.println(proposalForm_IntermediaryEntityData.getStringValueForField("QuoteNo"));
						
				quoteNoLabel.setWaitType(WaitType.WAITFORELEMENTTOBEDISPLAYED);
				proposalForm_IntermediaryEntityData.setValueOfCustomField("QuoteNo",fetchValueFromFields(quoteNoLabel));
			}
			String saveB;
			saveB = proposalForm_IntermediaryEntityData.getStringValueForField("SaveB");
			if ((saveB != null) && (!saveB.isEmpty())) {
				click(saveButton);

				Thread.sleep(3000);
				proposalForm_IntermediaryEntityData.setStringValueForField("QuoteNo",fetchValueFromFields(quoteNoLabel));
			}
			String approveAndPay;
			approveAndPay = proposalForm_IntermediaryEntityData.getStringValueForField("ApproveAndPaybtn");
			if ((approveAndPay != null) && (!approveAndPay.isEmpty())) {
				if (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")
						&& proposalForm_IntermediaryEntityData.getStringValueForField("ProductName").equalsIgnoreCase("Private Car")) {
					approveAndPaybtn = new PageElement(By.xpath("//button[contains(text(),'Save & Calculate Premium')]//following::button[1]"),"Approve Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 20);
					click(approveAndPaybtn);
				} else {

					click(approveAndPaybtn);
					Thread.sleep(8000);

				}
				try {
					
					click(confirmbtn);
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public void fillAddressOfShop(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {

			String ShopAddrssToInsurTab;
			ShopAddrssToInsurTab = proposalForm_IntermediaryEntityData.getStringValueForField("ShopAddrssToInsurTab");
			if ((ShopAddrssToInsurTab != null) && (!ShopAddrssToInsurTab.isEmpty())) {
				click(shopAddrssToInsurTab);
			}

			String TypeOfShop;
			TypeOfShop = proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfShop");
			if ((TypeOfShop != null) && (!TypeOfShop.isEmpty())) {
				// TypeOfShop
				clearAndSendKeys(typeOfShop, proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfShop"));
			}

			String ShopAddrsYesRadio;
			ShopAddrsYesRadio = proposalForm_IntermediaryEntityData.getStringValueForField("ShopAddrsYesRadio");
			if ((ShopAddrsYesRadio != null) && (!ShopAddrsYesRadio.isEmpty())) {
				click(shopAddrsYesRadio);
			}

			String ShopAddrsNoRadio;
			ShopAddrsNoRadio = proposalForm_IntermediaryEntityData.getStringValueForField("ShopAddrsNoRadio");
			if ((ShopAddrsNoRadio != null) && (!ShopAddrsNoRadio.isEmpty())) {
				click(shopAddrsNoRadio);
			}

			String ShopAddress;
			ShopAddress = proposalForm_IntermediaryEntityData.getStringValueForField("ShopAddress");
			if ((ShopAddress != null) && (!ShopAddress.isEmpty())) {
				clearAndSendKeys(shopAddress,
						proposalForm_IntermediaryEntityData.getStringValueForField("ShopAddress"));
			}

			String PINCode;
			PINCode = proposalForm_IntermediaryEntityData.getStringValueForField("ShopPINCode");
			if ((PINCode != null) && (!PINCode.isEmpty())) {
				clearAndSendKeys(pINCode, proposalForm_IntermediaryEntityData.getStringValueForField("ShopPINCode"));
			}
		}
	}

	public void fillStandardCovers(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {

			String StandrdCoversTab;
			StandrdCoversTab = proposalForm_IntermediaryEntityData.getStringValueForField("StandrdCoversTab");
			if ((StandrdCoversTab != null) && (!StandrdCoversTab.isEmpty())) {
				click(standrdCoversTab);
			}

			String SumInsureBuildng;
			SumInsureBuildng = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsureBuildng");
			if ((SumInsureBuildng != null) && (!SumInsureBuildng.isEmpty())) {
				clearAndSendKeys(sumInsureBuildng,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsureBuildng"));
			}

			String SumInsurfireFurnitur;
			SumInsurfireFurnitur = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsurfireFurnitur");
			if ((SumInsurfireFurnitur != null) && (!SumInsurfireFurnitur.isEmpty())) {
				clearAndSendKeys(sumInsurfireFurnitur,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsurfireFurnitur"));
			}
			String SumInsurStockTrade;
			SumInsurStockTrade = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsurStockTrade");
			if ((SumInsurStockTrade != null) && (!SumInsurStockTrade.isEmpty())) {
				clearAndSendKeys(sumInsurStockTrade,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsurStockTrade"));
			}
			// DHk
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredEarthquakeTerrorism") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredEarthquakeTerrorism")
							.isEmpty())) {
				selectValueFromList(sumInsuredEarthquakeTerrorismDropDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredEarthquakeTerrorism"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("BurglaryAndHousebreakingDropDown") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("BurglaryAndHousebreakingDropDown")
							.isEmpty())) {
				click(burglaryAndHousebreakingDropDown);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryAndValuablesDropDown") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryAndValuablesDropDown")
							.isEmpty())) {
				click(jewelleryAndValuablesDropDown);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AddJewelleryButton") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AddJewelleryButton").isEmpty())) {
				click(addJewelleryButton);
			}
			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("BroadDescriptionForJewelleryAndValuables") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("BroadDescriptionForJewelleryAndValuables").isEmpty())) {
				clearAndSendKeys(broadDescriptionForJewelleryAndValuables, proposalForm_IntermediaryEntityData
						.getStringValueForField("BroadDescriptionForJewelleryAndValuables"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("WeightVolForJewelleryAndValuables") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("WeightVolForJewelleryAndValuables")
							.isEmpty())) {
				clearAndSendKeys(weightVolForJewelleryAndValuables, proposalForm_IntermediaryEntityData
						.getStringValueForField("WeightVolForJewelleryAndValuables"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryValue") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryValue").isEmpty())) {
				clearAndSendKeys(value, proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryValue"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DomesticApplianceDropDown") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticApplianceDropDown")
							.isEmpty())) {
				click(domesticApplianceDropDown);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DomesticMake") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticMake").isEmpty())) {
				clearAndSendKeys(domesticMake,
						proposalForm_IntermediaryEntityData.getStringValueForField("DomesticMake"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DomesticModel") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticModel").isEmpty())) {
				clearAndSendKeys(domesticModel,
						proposalForm_IntermediaryEntityData.getStringValueForField("DomesticModel"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DomesticYear") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticYear").isEmpty())) {
				clearAndSendKeys(domesticYear,
						proposalForm_IntermediaryEntityData.getStringValueForField("DomesticYear"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AddApplianceButton") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AddApplianceButton").isEmpty())) {
				click(addApplianceButton);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TelevisionDesktopDropDown") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TelevisionDesktopDropDown")
							.isEmpty())) {
				click(televisionDesktopDropDown);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVMake") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVMake").isEmpty())) {
				clearAndSendKeys(tvMake, proposalForm_IntermediaryEntityData.getStringValueForField("TVMake"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVModel") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVModel").isEmpty())) {
				clearAndSendKeys(tvModel, proposalForm_IntermediaryEntityData.getStringValueForField("TVModel"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVYear") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVYear").isEmpty())) {
				clearAndSendKeys(tvYear, proposalForm_IntermediaryEntityData.getStringValueForField("TVYear"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("FireAndAlliedPerilsTelevisionDesktopYes") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("FireAndAlliedPerilsTelevisionDesktopYes").isEmpty())) {
				click(fireAndAlliedPerilsTelevisionDesktopYes);
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("FireAndAlliedPerilsTelevisionDesktopNo") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("FireAndAlliedPerilsTelevisionDesktopNo").isEmpty())) {
				click(fireAndAlliedPerilsTelevisionDesktopNo);
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredTelevisionDesktop") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredTelevisionDesktop")
							.isEmpty())) {
				clearAndSendKeys(sumInsuredTelevisionDesktop,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredTelevisionDesktop"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("FireAndAlliedPerilsReqYes") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("FireAndAlliedPerilsReqYes")
							.isEmpty())) {
				click(fireAndAlliedPerilsReqYes);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("FireAndAlliedPerilsReqNo") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("FireAndAlliedPerilsReqNo")
							.isEmpty())) {
				click(fireAndAlliedPerilsReqNo);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredOfBuildingSection1A") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredOfBuildingSection1A")
							.isEmpty())) {
				clearAndSendKeys(sumInsuredOfBuildingSection1A,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredOfBuildingSection1A"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DwellingContent") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DwellingContent").isEmpty())) {
				selectValueFromList(dwellingContent,
						proposalForm_IntermediaryEntityData.getStringValueForField("DwellingContent"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("Description") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("Description").isEmpty())) {
				clearAndSendKeys(description,
						proposalForm_IntermediaryEntityData.getStringValueForField("Description"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredInRs") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredInRs").isEmpty())) {
				clearAndSendKeys(sumInsuredInRs,
						proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredInRs"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("SumInsuredOfBuildingIncludingFixtureAndFittings") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("SumInsuredOfBuildingIncludingFixtureAndFittings").isEmpty())) {
				clearAndSendKeys(sumInsuredOfBuildingIncludingFixtureAndFittings, proposalForm_IntermediaryEntityData
						.getStringValueForField("SumInsuredOfBuildingIncludingFixtureAndFittings"));
			}
			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("ProvisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("ProvisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval")
							.isEmpty())) {
				clearAndSendKeys(provisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval,
						proposalForm_IntermediaryEntityData
								.getStringValueForField("ProvisionsForArchitectsSurveyorsLegalFeeAndDebrisRemoval"));
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRsSection1") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRsSection1")
							.isEmpty())) {
				clearAndSendKeys(totalSumInsuredInRsSection1,
						proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRsSection1"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachineryCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachineryCheckBox")
							.isEmpty())) {
				click(businessFurnitureFurnishingsSafesOfficeMachineryCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachineryTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachineryTextBox")
								.isEmpty())) {
					clearAndSendKeys(businessFurnitureFurnishingsSafesOfficeMachineryTextBox,
							proposalForm_IntermediaryEntityData
									.getStringValueForField("BusinessFurnitureFurnishingsSafesOfficeMachineryTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DocumentsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DocumentsInRsCheckBox")
							.isEmpty())) {
				click(documentsInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData.getStringValueForField("DocumentsInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DocumentsInRsTextBox")
								.isEmpty())) {
					clearAndSendKeys(documentsInRsTextBox,
							proposalForm_IntermediaryEntityData.getStringValueForField("DocumentsInRsTextBox"));
				}
			}
			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("TelephoneGasAndElectricMetersInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("TelephoneGasAndElectricMetersInRsCheckBox").isEmpty())) {
				click(telephoneGasAndElectricMetersInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("TelephoneGasAndElectricMetersInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("TelephoneGasAndElectricMetersInRsTextBox").isEmpty())) {
					clearAndSendKeys(telephoneGasAndElectricMetersInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("TelephoneGasAndElectricMetersInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("TenantsImprovementAndDecorationInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("TenantsImprovementAndDecorationInRsCheckBox").isEmpty())) {
				click(tenantsImprovementAndDecorationInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("TenantsImprovementAndDecorationInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("TenantsImprovementAndDecorationInRsTextBox").isEmpty())) {
					clearAndSendKeys(tenantsImprovementAndDecorationInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("TenantsImprovementAndDecorationInRsTextBox"));
				}
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesInRsCheckBox")
							.isEmpty())) {
				click(pedalCyclesInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesInRsTextBox")
								.isEmpty())) {
					clearAndSendKeys(pedalCyclesInRsTextBox,
							proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesInRsTextBox"));
				}
			}
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("ElectronicEquipmentInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ElectronicEquipmentInRsCheckBox")
							.isEmpty())) {
				click(electronicEquipmentInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("ElectronicEquipmentInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("ElectronicEquipmentInRsTextBox").isEmpty())) {
					clearAndSendKeys(electronicEquipmentInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("ElectronicEquipmentInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AllOtherContentsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AllOtherContentsInRsCheckBox")
							.isEmpty())) {
				click(allOtherContentsInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData.getStringValueForField("AllOtherContentsInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AllOtherContentsInRsTextBox")
								.isEmpty())) {
					clearAndSendKeys(allOtherContentsInRsTextBox,
							proposalForm_IntermediaryEntityData.getStringValueForField("AllOtherContentsInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsCheckBox").isEmpty())) {
				click(professionalInstrumentsAndEquipmentsInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsTextBox").isEmpty())) {
					clearAndSendKeys(professionalInstrumentsAndEquipmentsInRsTextBox,
							proposalForm_IntermediaryEntityData
									.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRs") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRs").isEmpty())) {
				clearAndSendKeys(totalSumInsuredInRs,
						proposalForm_IntermediaryEntityData.getStringValueForField("TotalSumInsuredInRs"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("ClothingAndPersonalEffectsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("ClothingAndPersonalEffectsInRsCheckBox").isEmpty())) {
				click(clothingAndPersonalEffectsInRsCheckBox);
			}
			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox").isEmpty())) {
				clearAndSendKeys(clothingAndPersonalEffectsInRsTextBox, proposalForm_IntermediaryEntityData
						.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("ProfessionalInstrumentsAndEquipmentsInRsCheckBox").isEmpty())) {
				click(temporaryRemovalOfDocumentsInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox").isEmpty())) {
					clearAndSendKeys(clothingAndPersonalEffectsInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("ClothingAndPersonalEffectsInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("TemporaryRemovalOfDocumentsInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("TemporaryRemovalOfDocumentsInRsCheckBox").isEmpty())) {
				click(temporaryRemovalOfDocumentsInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("TemporaryRemovalOfDocumentsInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("TemporaryRemovalOfDocumentsInRsTextBox").isEmpty())) {
					clearAndSendKeys(temporaryRemovalOfDocumentsInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("TemporaryRemovalOfDocumentsInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("CostOfRemovalOfDebrisInRsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("CostOfRemovalOfDebrisInRsCheckBox")
							.isEmpty())) {
				click(costOfRemovalOfDebrisInRsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("CostOfRemovalOfDebrisInRsTextBox") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("CostOfRemovalOfDebrisInRsTextBox").isEmpty())) {
					clearAndSendKeys(costOfRemovalOfDebrisInRsTextBox, proposalForm_IntermediaryEntityData
							.getStringValueForField("CostOfRemovalOfDebrisInRsTextBox"));
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("AncilliaryCoversTotalSumInsuredInRs") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("AncilliaryCoversTotalSumInsuredInRs").isEmpty())) {
				clearAndSendKeys(ancilliaryCoversTotalSumInsuredInRs, proposalForm_IntermediaryEntityData
						.getStringValueForField("AncilliaryCoversTotalSumInsuredInRs"));
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("BurglaryDetailsLimitAnyOneLossForBurglaryContentsInRs") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("BurglaryDetailsLimitAnyOneLossForBurglaryContentsInRs")
							.isEmpty())) {
				clearAndSendKeys(burglaryDetailsLimitAnyOneLossForBurglaryContentsInRs,
						proposalForm_IntermediaryEntityData
								.getStringValueForField("BurglaryDetailsLimitAnyOneLossForBurglaryContentsInRs"));
			}
			// End DHK
		}
	}

	public void fillAdditionalCovers(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalCoversTab") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalCoversTab").isEmpty())) {
				click(additionalCoversTab);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PublicLiability") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PublicLiability").isEmpty())) {
				click(publicLiability);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInsurancSec3") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInsurancSec3").isEmpty())) {
				click(moneyInsurancSec3);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycle") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycle").isEmpty())) {
				click(pedalCycle);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PlateGlass") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PlateGlass").isEmpty())) {
				click(plateGlass);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("NeonGlownSign") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NeonGlownSign").isEmpty())) {
				click(neonGlownSign);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("WorkmenCompensatnCover") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("WorkmenCompensatnCover")
							.isEmpty())) {
				click(workmenCompensatnCover);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("ElectrncQuipmnt") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ElectrncQuipmnt").isEmpty())) {
				click(electrncQuipmnt);
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("DomesticAppliances") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticAppliances").isEmpty())) {
				click(domesticAppliances);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("DomesticAppliancesSectionFive") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DomesticAppliancesSectionFive")
								.isEmpty())) {
					click(domesticAppliancesSectionFive);

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("DomesticAppliancesOneAppliance") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("DomesticAppliancesOneAppliance").isEmpty())) {
						selectValueFromList(domesticAppliancesOneAppliance, proposalForm_IntermediaryEntityData
								.getStringValueForField("DomesticAppliancesOneAppliance"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("DomesticAppliancesOneDescription") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("DomesticAppliancesOneDescription").isEmpty())) {
						clearAndSendKeys(domesticAppliancesOneDescription, proposalForm_IntermediaryEntityData
								.getStringValueForField("DomesticAppliancesOneDescription"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("DomesticAppliancesOneSumInsured") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("DomesticAppliancesOneSumInsured").isEmpty())) {
						clearAndSendKeys(domesticAppliancesOneSumInsured, proposalForm_IntermediaryEntityData
								.getStringValueForField("DomesticAppliancesOneSumInsured"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryCover") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryCover").isEmpty())) {
				click(jewelleryCover);

				if ((proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryCoverSection3A") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JewelleryCoverSection3A")
								.isEmpty())) {
					click(jewelleryCoverSection3A);

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("JewelleryTypeOfJewelleryOrnament") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("JewelleryTypeOfJewelleryOrnament").isEmpty())) {
						selectValueFromList(jewelleryTypeOfJewelleryOrnament, proposalForm_IntermediaryEntityData
								.getStringValueForField("JewelleryTypeOfJewelleryOrnament"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("DescriptionOfJewelleryOrnaments") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("DescriptionOfJewelleryOrnaments").isEmpty())) {
						clearAndSendKeys(descriptionOfJewelleryOrnaments, proposalForm_IntermediaryEntityData
								.getStringValueForField("DescriptionOfJewelleryOrnaments"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("ValueSumInsuredOfJewellery") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("ValueSumInsuredOfJewellery").isEmpty())) {
						clearAndSendKeys(valueSumInsuredOfJewellery, proposalForm_IntermediaryEntityData
								.getStringValueForField("ValueSumInsuredOfJewellery"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PortableEquipment") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PortableEquipment").isEmpty())) {
				click(portableEquipment);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("PortableEquipmentSection3BOptional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("PortableEquipmentSection3BOptional").isEmpty())) {
					click(portableEquipmentSection3BOptional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfPortableEquipment") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfPortableEquipment")
									.isEmpty())) {
						clearAndSendKeys(typeOfPortableEquipment, proposalForm_IntermediaryEntityData
								.getStringValueForField("JewelleryTypeOfJewelleryOrnament"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("DescriptionOfPortableEquipment") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("DescriptionOfPortableEquipment").isEmpty())) {
						clearAndSendKeys(descriptionOfPortableEquipment, proposalForm_IntermediaryEntityData
								.getStringValueForField("DescriptionOfPortableEquipment"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("ValueSumInsuredOfPortableEquipment") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("ValueSumInsuredOfPortableEquipment").isEmpty())) {
						clearAndSendKeys(valueSumInsuredOfPortableEquipment, proposalForm_IntermediaryEntityData
								.getStringValueForField("ValueSumInsuredOfPortableEquipment"));
					}

				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDandCDsetCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDandCDsetCheckBox")
							.isEmpty())) {
				click(TVDVDandCDset);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("TVDVDAndCDSetSection6Optional") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDAndCDSetSection6Optional")
								.isEmpty())) {
					click(tVDVDAndCDSetSection6Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCD") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCD").isEmpty())) {
						selectValueFromList(tVDVDCD,
								proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCD"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDDescription") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDDescription")
									.isEmpty())) {
						clearAndSendKeys(tVDVDCDDescription,
								proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDDescription"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDSumInsured") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDSumInsured")
									.isEmpty())) {
						clearAndSendKeys(tVDVDCDSumInsured,
								proposalForm_IntermediaryEntityData.getStringValueForField("TVDVDCDSumInsured"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycleAdditionalCover") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycleAdditionalCover")
							.isEmpty())) {
				click(pedalCycleAdditionalCover);

				if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesSection7Optional") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCyclesSection7Optional")
								.isEmpty())) {
					click(pedalCyclesSection7Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycleSectionSeven") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycleSectionSeven")
									.isEmpty())) {
						selectValueFromList(pedalCycleSectionSeven,
								proposalForm_IntermediaryEntityData.getStringValueForField("PedalCycleSectionSeven"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionSectionSeven") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionSectionSeven")
									.isEmpty())) {
						clearAndSendKeys(descriptionSectionSeven,
								proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionSectionSeven"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredSectionSeven") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredSectionSeven")
									.isEmpty())) {
						clearAndSendKeys(sumInsuredSectionSeven,
								proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredSectionSeven"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("WorkmenCompensation") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("WorkmenCompensation").isEmpty())) {
				click(workmenCompensation);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("WorkmenCompensationCoverSection10Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("WorkmenCompensationCoverSection10Optional").isEmpty())) {
					click(workmenCompensationCoverSection10Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("NatureOfWork") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NatureOfWork")
									.isEmpty())) {
						selectValueFromList(natureOfWork,
								proposalForm_IntermediaryEntityData.getStringValueForField("NatureOfWork"));
					}
					if ((proposalForm_IntermediaryEntityData.getStringValueForField("NoOfEmployees") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NoOfEmployees")
									.isEmpty())) {
						clearAndSendKeys(noOfEmployees,
								proposalForm_IntermediaryEntityData.getStringValueForField("NoOfEmployees"));
					}
					if ((proposalForm_IntermediaryEntityData.getStringValueForField("MonthlyWages") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MonthlyWages")
									.isEmpty())) {
						clearAndSendKeys(monthlyWages,
								proposalForm_IntermediaryEntityData.getStringValueForField("MonthlyWages"));
					}
				}
			}

			/*
			 * if ((proposalForm_IntermediaryEntityData.getStringValueForField(
			 * "AdditionalCovers")!=null)&&(!proposalForm_IntermediaryEntityData.
			 * getStringValueForField("AdditionalCovers").isEmpty())){
			 * 
			 * List<WebElement> additionalCoversList = driver.findElements(By.xpath(
			 * "//div[contains(@class,'clearfix')]/div[contains(@class,'clearfix')]/child::div"
			 * )); for(int i =0;i<additionalCoversList.size();i++) {
			 * if(additionalCoversList.get(i).getText().equalsIgnoreCase(
			 * proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalCovers"
			 * ))){ additionalCoversList.get(i-1).click(); additionalCovers = new
			 * PageElement(By.xpath("//span[contains(text(),'"+
			 * proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalCovers"
			 * )+"')]"),
			 * proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalCovers"
			 * ), false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			 * if(additionalCovers.getWebElement().isDisplayed()) { click(additionalCovers);
			 * das } } } }
			 */

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("TenantsLabilityCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TenantsLabilityCheckBox")
							.isEmpty())) {
				click(tenantsLabilityCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("TenantsLabilitySection3Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("TenantsLabilitySection3Optional").isEmpty())) {
					click(tenantsLabilitySection3Optional);

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("TotalSumInsuredForTheTenantLiabilityInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("TotalSumInsuredForTheTenantLiabilityInRs").isEmpty())) {
						clearAndSendKeys(totalSumInsuredForTheTenantLiabilityInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("TotalSumInsuredForTheTenantLiabilityInRs"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInsuranceCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInsuranceCheckBox")
							.isEmpty())) {
				click(moneyInsuranceCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("MoneyInsuranceSection4Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("MoneyInsuranceSection4Optional").isEmpty())) {
					click(moneyInsuranceSection4Optional);
					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("MoneyInTransitOverThePolicyPeriodAnnualTurnover") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("MoneyInTransitOverThePolicyPeriodAnnualTurnover")
									.isEmpty())) {
						clearAndSendKeys(moneyInTransitOverThePolicyPeriodAnnualTurnover,
								proposalForm_IntermediaryEntityData
										.getStringValueForField("MoneyInTransitOverThePolicyPeriodAnnualTurnover"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("PerCarryingLimitInRs") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PerCarryingLimitInRs")
									.isEmpty())) {
						clearAndSendKeys(perCarryingLimitInRs,
								proposalForm_IntermediaryEntityData.getStringValueForField("PerCarryingLimitInRs"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("MoneyInOfficeDuringDusinessHoursInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("MoneyInOfficeDuringDusinessHoursInRs").isEmpty())) {
						clearAndSendKeys(moneyInOfficeDuringDusinessHoursInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("MoneyInOfficeDuringDusinessHoursInRs"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("MoneyInLockedSafeInOfficeOutsideBusinessHoursInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("MoneyInLockedSafeInOfficeOutsideBusinessHoursInRs")
									.isEmpty())) {
						clearAndSendKeys(moneyInLockedSafeInOfficeOutsideBusinessHoursInRs,
								proposalForm_IntermediaryEntityData
										.getStringValueForField("MoneyInLockedSafeInOfficeOutsideBusinessHoursInRs"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("FixedGlassSanitaryFittingsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("FixedGlassSanitaryFittingsCheckBox").isEmpty())) {
				click(fixedGlassSanitaryFittingsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("FixedGlassSanitaryFittingsSection5Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("FixedGlassSanitaryFittingsSection5Optional").isEmpty())) {
					click(fixedGlassSanitaryFittingsSection5Optional);
					if ((proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfPlateGlass") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfPlateGlass")
									.isEmpty())) {
						clearAndSendKeys(descriptionOfPlateGlass,
								proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfPlateGlass"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("DimensionOfPlateGlass") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DimensionOfPlateGlass")
									.isEmpty())) {
						clearAndSendKeys(dimensionOfPlateGlass,
								proposalForm_IntermediaryEntityData.getStringValueForField("DimensionOfPlateGlass"));
					}
					if ((proposalForm_IntermediaryEntityData.getStringValueForField("ValueOfPlateGlassInRs") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ValueOfPlateGlassInRs")
									.isEmpty())) {
						clearAndSendKeys(valueOfPlateGlassInRs,
								proposalForm_IntermediaryEntityData.getStringValueForField("ValueOfPlateGlassInRs"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("TotalValueOfPlateGlassInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("TotalValueOfPlateGlassInRs").isEmpty())) {
						clearAndSendKeys(totalValueOfPlateGlassInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("TotalValueOfPlateGlassInRs"));
					}
					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("ValueOfSanitaryFittingsInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("ValueOfSanitaryFittingsInRs").isEmpty())) {
						clearAndSendKeys(valueOfSanitaryFittingsInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("ValueOfSanitaryFittingsInRs"));
					}
					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("ValueOfSignsNamePlatesInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("ValueOfSignsNamePlatesInRs").isEmpty())) {
						clearAndSendKeys(valueOfSignsNamePlatesInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("ValueOfSignsNamePlatesInRs"));
					}
					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("ValueOfSignsNamePlatesInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("ValueOfSignsNamePlatesInRs").isEmpty())) {
						clearAndSendKeys(valueOfSignsNamePlatesInRs, proposalForm_IntermediaryEntityData
								.getStringValueForField("ValueOfSignsNamePlatesInRs"));
					}
					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("TotalSumInsuredOfFixedGlassSanitaryFittingsInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("TotalSumInsuredOfFixedGlassSanitaryFittingsInRs")
									.isEmpty())) {
						clearAndSendKeys(totalSumInsuredOfFixedGlassSanitaryFittingsInRs,
								proposalForm_IntermediaryEntityData
										.getStringValueForField("TotalSumInsuredOfFixedGlassSanitaryFittingsInRs"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("DamageToElectronicEquipmentsCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("DamageToElectronicEquipmentsCheckBox").isEmpty())) {
				click(damageToElectronicEquipmentsCheckBox);
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("DamageToElectronicEquipmentsSection7Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("DamageToElectronicEquipmentsSection7Optional").isEmpty())) {
					click(damageToElectronicEquipmentsSection7Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("MachineName") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MachineName").isEmpty())) {
						clearAndSendKeys(machineName,
								proposalForm_IntermediaryEntityData.getStringValueForField("MachineName"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("MachineMake") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MachineMake").isEmpty())) {
						clearAndSendKeys(machineMake,
								proposalForm_IntermediaryEntityData.getStringValueForField("MachineMake"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("EquipmentId") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("EquipmentId").isEmpty())) {
						clearAndSendKeys(equipmentId,
								proposalForm_IntermediaryEntityData.getStringValueForField("EquipmentId"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("YearOfManufacture") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("YearOfManufacture")
									.isEmpty())) {
						selectValueFromList(yearOfManufacture,
								proposalForm_IntermediaryEntityData.getStringValueForField("YearOfManufacture"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredMachineInRs") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredMachineInRs")
									.isEmpty())) {
						clearAndSendKeys(sumInsuredMachineInRs,
								proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredMachineInRs"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("SumInsuredForDamageToElectronicEquipmentInRs") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("SumInsuredForDamageToElectronicEquipmentInRs")
									.isEmpty())) {
						clearAndSendKeys(sumInsuredForDamageToElectronicEquipmentInRs,
								proposalForm_IntermediaryEntityData
										.getStringValueForField("SumInsuredForDamageToElectronicEquipmentInRs"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalExpensesOfRentCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AdditionalExpensesOfRentCheckBox")
							.isEmpty())) {
				click(additionalExpensesOfRentCheckBox);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("AdditionalExpensesOfRentSection10Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("AdditionalExpensesOfRentSection10Optional").isEmpty())) {
					click(additionalExpensesOfRentSection10Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("LimitOfIndemnityInRs") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("LimitOfIndemnityInRs")
									.isEmpty())) {
						clearAndSendKeys(limitOfIndemnityInRs,
								proposalForm_IntermediaryEntityData.getStringValueForField("LimitOfIndemnityInRs"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("IndemnityPeriodInMonths") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("IndemnityPeriodInMonths")
									.isEmpty())) {
						clearAndSendKeys(indemnityPeriodInMonths,
								proposalForm_IntermediaryEntityData.getStringValueForField("IndemnityPeriodInMonths"));
					}
				}
			}

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("BreakDownOfficeAppliancesCheckBox") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("BreakDownOfficeAppliancesCheckBox")
							.isEmpty())) {
				click(breakDownOfficeAppliancesCheckBox);

				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("BreakDownOfficeAppliancesSection12Optional") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("BreakDownOfficeAppliancesSection12Optional").isEmpty())) {
					click(breakDownOfficeAppliancesSection12Optional);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfItem") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfItem")
									.isEmpty())) {
						clearAndSendKeys(descriptionOfItem,
								proposalForm_IntermediaryEntityData.getStringValueForField("DescriptionOfItem"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("YearOfMake") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("YearOfMake").isEmpty())) {
						selectValueFromList(yearOfMake,
								proposalForm_IntermediaryEntityData.getStringValueForField("YearOfMake"));
					}

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("ValueInRs") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("ValueInRs").isEmpty())) {
						clearAndSendKeys(valueInRs,
								proposalForm_IntermediaryEntityData.getStringValueForField("ValueInRs"));
					}

					if ((proposalForm_IntermediaryEntityData
							.getStringValueForField("TotalSumInsuredForBreakDownOfOfficeAppliances") != null)
							&& (!proposalForm_IntermediaryEntityData
									.getStringValueForField("TotalSumInsuredForBreakDownOfOfficeAppliances")
									.isEmpty())) {
						clearAndSendKeys(totalSumInsuredForBreakDownOfOfficeAppliances,
								proposalForm_IntermediaryEntityData
										.getStringValueForField("TotalSumInsuredForBreakDownOfOfficeAppliances"));
					}
				}
			}
		}
	}

	public void fillPublicLiabilitySubTab(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			String PublicLiabilitySubTab;
			PublicLiabilitySubTab = proposalForm_IntermediaryEntityData.getStringValueForField("PublicLiabilitySubTab");
			if ((PublicLiabilitySubTab != null) && (!PublicLiabilitySubTab.isEmpty())) {
				click(publicLiabilitySubTab);
			}
			String LimitForPublicLiablty;
			LimitForPublicLiablty = proposalForm_IntermediaryEntityData.getStringValueForField("LimitForPublicLiablty");
			if ((LimitForPublicLiablty != null) && (!LimitForPublicLiablty.isEmpty())) {
				clearAndSendKeys(limitForPublicLiablty,
						proposalForm_IntermediaryEntityData.getStringValueForField("LimitForPublicLiablty"));
			}
		}
	}

	public void fillMoneyInsurancSubTab(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert assertReference) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			String MoneyInsurncSubTab;
			MoneyInsurncSubTab = proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInsurncSubTab");
			if ((MoneyInsurncSubTab != null) && (!MoneyInsurncSubTab.isEmpty())) {
				click(moneyInsurncSubTab);
			}

			String MoneyInTransit;
			MoneyInTransit = proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInTransit");
			if ((MoneyInTransit != null) && (!MoneyInTransit.isEmpty())) {
				clearAndSendKeys(moneyInTransit,
						proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInTransit"));
			}

			String MoneyInCounter;
			MoneyInCounter = proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInCounter");
			if ((MoneyInCounter != null) && (!MoneyInCounter.isEmpty())) {
				clearAndSendKeys(moneyInCounter,
						proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInCounter"));
			}

			String MoneyInLocked;
			MoneyInLocked = proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInLocked");
			if ((MoneyInLocked != null) && (!MoneyInLocked.isEmpty())) {
				clearAndSendKeys(moneyInLocked,
						proposalForm_IntermediaryEntityData.getStringValueForField("MoneyInLocked"));
			}
		}
	}

	public void fillAddressOfBuildingToBeInsured(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) throws InterruptedException {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& ((proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS")))) {

			if ((proposalForm_IntermediaryEntityData
					.getStringValueForField("AddressOfTheBuildingToBeInsuredDropDown") != null)
					&& (!proposalForm_IntermediaryEntityData
							.getStringValueForField("AddressOfTheBuildingToBeInsuredDropDown").isEmpty())) {
				click(addressOfTheBuildingToBeInsuredDropDown);
			}
			String IsTheAboveBuildingAddressRadioButtonYes;
			IsTheAboveBuildingAddressRadioButtonYes = proposalForm_IntermediaryEntityData
					.getStringValueForField("IsTheAboveBuildingAddressRadioButtonYes");
			if ((IsTheAboveBuildingAddressRadioButtonYes != null)
					&& (!IsTheAboveBuildingAddressRadioButtonYes.isEmpty())) {
				click(isTheAboveBuildingAddressRadioButtonYes);
			}

			String IsTheAboveBuildingAddressRadioButtonNo;
			IsTheAboveBuildingAddressRadioButtonNo = proposalForm_IntermediaryEntityData
					.getStringValueForField("IsTheAboveBuildingAddressRadioButtonNo");
			if ((IsTheAboveBuildingAddressRadioButtonNo != null)
					&& (!IsTheAboveBuildingAddressRadioButtonNo.isEmpty())) {
				click(isTheAboveBuildingAddressRadioButtonNo);
			}

			String BuildingNoStreet;
			BuildingNoStreet = proposalForm_IntermediaryEntityData.getStringValueForField("BuildingNoStreet");
			if ((BuildingNoStreet != null) && (!BuildingNoStreet.isEmpty())) {
				clearAndSendKeys(buildingNoStreet,
						proposalForm_IntermediaryEntityData.getStringValueForField("BuildingNoStreet"));
			}

			String Locality;
			Locality = proposalForm_IntermediaryEntityData.getStringValueForField("LocalityyForMisc");
			if ((Locality != null) && (!Locality.isEmpty())) {
				clearAndSendKeys(locality,
						proposalForm_IntermediaryEntityData.getStringValueForField("LocalityyForMisc"));
			}

			String PINCodeBuildingAddress;
			PINCodeBuildingAddress = proposalForm_IntermediaryEntityData
					.getStringValueForField("PINCodeBuildingAddress");
			if ((PINCodeBuildingAddress != null) && (!PINCodeBuildingAddress.isEmpty())) {
				clearAndSendKeys(pINCodeBuildingAddress, PINCodeBuildingAddress);
				Thread.sleep(3000);
			}
		}
	}

	public void fillFinancierDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {

			String FinancierDetailsDropDown;
			FinancierDetailsDropDown = proposalForm_IntermediaryEntityData
					.getStringValueForField("FinancierDetailsDropDown");
			if ((FinancierDetailsDropDown != null) && (!FinancierDetailsDropDown.isEmpty())) {
				click(financierDetailsDropDown);
			}

			String PremisesHypBankRadioButtonYes;
			PremisesHypBankRadioButtonYes = proposalForm_IntermediaryEntityData
					.getStringValueForField("PremisesHypBankRadioButtonYes");
			if ((PremisesHypBankRadioButtonYes != null) && (!PremisesHypBankRadioButtonYes.isEmpty())) {
				click(premisesHypBankRadioButtonYes);

				String NameOfTheBankAndBranch;
				NameOfTheBankAndBranch = proposalForm_IntermediaryEntityData
						.getStringValueForField("NameOfTheBankAndBranch");
				if ((NameOfTheBankAndBranch != null) && (!NameOfTheBankAndBranch.isEmpty())) {
					click(nameOfTheBankAndBranch);
				}
			}
			String PremisesHypBankRadioButtonNo;
			PremisesHypBankRadioButtonNo = proposalForm_IntermediaryEntityData
					.getStringValueForField("PremisesHypBankRadioButtonNo");
			if ((PremisesHypBankRadioButtonNo != null) && (!PremisesHypBankRadioButtonNo.isEmpty())) {
				click(premisesHypBankRadioButtonNo);
			}
		}
	}

	private void fillTravelDetailsforTravel(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("TRAVEL")
						&& (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
								.equalsIgnoreCase("Overseas Mediclaim (Bus & Hol)")
								|| (proposalForm_IntermediaryEntityData.getStringValueForField("ProductName")
										.equalsIgnoreCase("Overseas Mediclaim (ES)"))))) {
			String anywhereInTheWorldExcludingUSAandCanada = proposalForm_IntermediaryEntityData.getStringValueForField("AnywhereInTheWorldExcludingUSAandCanada");
			if ((anywhereInTheWorldExcludingUSAandCanada != null)
					&& (!anywhereInTheWorldExcludingUSAandCanada.isEmpty())) {
				click(anywhereInTheWorldExcludingUSAandcanada);
			}
			String anywhereInTheWorldIncludingUSAandCanada = proposalForm_IntermediaryEntityData
					.getStringValueForField("AnywhereInTheWorldIncludingUSAandCanada");
			if ((anywhereInTheWorldIncludingUSAandCanada != null)
					&& (!anywhereInTheWorldIncludingUSAandCanada.isEmpty())) {
				click(anywhereInTheWorldIncludingUSAandcanada);
			}
			String travelPurpose = proposalForm_IntermediaryEntityData.getStringValueForField("TravelPurpose");
			if ((travelPurpose != null) && (!travelPurpose.isEmpty())) {
				click(travelPurposeRadioButton);
			}
			/*
			 * String leavingIndiaOn =
			 * proposalForm_IntermediaryEntityData.getStringValueForField("LeavingIndiaOn");
			 * if ((leavingIndiaOn!=null)&&(!leavingIndiaOn.isEmpty())){
			 * clearAndSendKeys(leavingIndiaon,
			 * proposalForm_IntermediaryEntityData.getStringValueForField("LeavingIndiaOn"))
			 * ; }
			 */
			String leavingIndOn;
			leavingIndOn = (proposalForm_IntermediaryEntityData.getStringValueForField("LeavingIndiaOn"));
			if ((leavingIndOn != null) && (!leavingIndOn.isEmpty())) {
				clearAndEnterDate(leavingIndiaon, RandomCodeGenerator.dateGenerator(leavingIndOn));
			}

			String returningtoIndiaon;
			returningtoIndiaon = proposalForm_IntermediaryEntityData.getStringValueForField("ReturningtoIndiaOn");
			if ((returningtoIndiaon != null) && (!returningtoIndiaon.isEmpty())) {
				clearAndEnterDate(returningtoIndiaOn, RandomCodeGenerator.dateGenerator(returningtoIndiaon));

			}
			String dateofBirth = proposalForm_IntermediaryEntityData.getStringValueForField("DateofBirth");
			if ((dateofBirth != null) && (!dateofBirth.isEmpty())) {
				clearAndSendKeys(dateOfBirth,
						proposalForm_IntermediaryEntityData.getStringValueForField("DateofBirth"));
				/*
				 * String SelectedDate=dateGenerator(proposalForm_IntermediaryEntityData.
				 * getStringValueForField("DateofBirth")); clearAndSendKeys(dateOfBirth,
				 * SelectedDate);
				 */
			}
			String b1;
			b1 = proposalForm_IntermediaryEntityData.getStringValueForField("B1");
			if ((b1 != null) && (!b1.isEmpty())) {
				click(bOne);
			}
			String b2;
			b2 = proposalForm_IntermediaryEntityData.getStringValueForField("B2");
			if ((b2 != null) && (!b2.isEmpty())) {
				click(bTwo);
			}
			String travelDuration = proposalForm_IntermediaryEntityData.getStringValueForField("TravelDuration");
			if ((travelDuration != null) && (!travelDuration.isEmpty())) {
				selectValueFromList(travelDurationDroDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("TravelDuration"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("PlanC") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PlanC").isEmpty())) {
				click(planC);
			}
		}
	}

	private void fillCattleDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			String Cattledetails = proposalForm_IntermediaryEntityData.getStringValueForField("CattleDetails");
			if ((Cattledetails != null) && (!Cattledetails.isEmpty())) {
				click(cattleDetailsDropDown);
			}
			String nonScheme = proposalForm_IntermediaryEntityData.getStringValueForField("NonScheme");
			if ((nonScheme != null) && (!nonScheme.isEmpty())) {
				click(typeofPolicyNonSchemeRadioButton);
			}
			String schemeTypeNS = proposalForm_IntermediaryEntityData.getStringValueForField("SchemeTypeNS");
			if ((schemeTypeNS != null) && (!schemeTypeNS.isEmpty())) {
				selectValueFromList(schemeTypeNSDropDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("SchemeTypeNS"));
			}
			fillAddCattle(proposalForm_IntermediaryEntityData, customAssert);
		}
	}

	public void fillAddCattle(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData, CustomAssert customAssert) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")) {
			/*
			 * String addCattle; addCattle =
			 * proposalForm_IntermediaryEntityData.getStringValueForField("AddCattle");
			 * if((addCattle!=null)&&(!addCattle.isEmpty())) { click(addCattleButton); }
			 */
			String tagno;
			tagno = proposalForm_IntermediaryEntityData.getStringValueForField("TagNo");
			if ((tagno != null) && (!tagno.isEmpty())) {
				clearAndSendKeys(tagNo, proposalForm_IntermediaryEntityData.getStringValueForField("TagNo"));
			}

			String cattletype;
			cattletype = proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfCattle");
			if ((cattletype != null) && (!cattletype.isEmpty())) {
				selectValueFromList(cattleTypeDropDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfCattle"));
				;
			}

			String indigenousradioButton;
			indigenousradioButton = proposalForm_IntermediaryEntityData.getStringValueForField("Indigenous");
			if ((indigenousradioButton != null) && (!indigenousradioButton.isEmpty())) {
				click(originOfcattle);
			}

			String genderYes;
			genderYes = proposalForm_IntermediaryEntityData.getStringValueForField("CattleGenderMale");
			if ((genderYes != null) && (!genderYes.isEmpty())) {
				click(cattlegenderMaleRadioButton);
			}
			String genderNo;
			genderNo = proposalForm_IntermediaryEntityData.getStringValueForField("CattleGenderFemale");
			if ((genderNo != null) && (!genderNo.isEmpty())) {
				click(cattlegenderFemaleRadioButton);
			}
			String ageYears;
			ageYears = proposalForm_IntermediaryEntityData.getStringValueForField("AgeYears");
			if ((ageYears != null) && (!ageYears.isEmpty())) {
				clearAndSendKeys(ageYearstextfield,
						proposalForm_IntermediaryEntityData.getStringValueForField("AgeYears"));
			}
			String ageMonth;
			ageMonth = proposalForm_IntermediaryEntityData.getStringValueForField("AgeMonths");
			if ((ageMonth != null) && (!ageMonth.isEmpty())) {
				clearAndSendKeys(ageMonthstextfield,
						proposalForm_IntermediaryEntityData.getStringValueForField("AgeMonths"));
			}
			String originofRisk;
			originofRisk = proposalForm_IntermediaryEntityData.getStringValueForField("OriginOfRiskType");
			if ((originofRisk != null) && (!originofRisk.isEmpty())) {
				selectValueFromList(originOfRiskDropDown,
						proposalForm_IntermediaryEntityData.getStringValueForField("OriginOfRiskType"));
				;
			}

			String nameofOwner;
			nameofOwner = proposalForm_IntermediaryEntityData.getStringValueForField("NameOFOwner");
			if ((nameofOwner != null) && (!nameofOwner.isEmpty())) {
				clearAndSendKeys(nameOfOwner,
						proposalForm_IntermediaryEntityData.getStringValueForField("NameOFOwner"));
			}
			String purposeofUse;
			purposeofUse = proposalForm_IntermediaryEntityData.getStringValueForField("PurposeOfUse");
			if ((purposeofUse != null) && (!purposeofUse.isEmpty())) {
				clearAndSendKeys(purposeOfUse,
						proposalForm_IntermediaryEntityData.getStringValueForField("PurposeOfUse"));
			}
			String breedColor;
			breedColor = proposalForm_IntermediaryEntityData.getStringValueForField("BreedColorOrMark");
			if ((breedColor != null) && (!breedColor.isEmpty())) {
				clearAndSendKeys(breedColorMark,
						proposalForm_IntermediaryEntityData.getStringValueForField("BreedColorOrMark"));
			}
			String marketVal;
			marketVal = proposalForm_IntermediaryEntityData.getStringValueForField("MarketValue");
			if ((marketVal != null) && (!marketVal.isEmpty())) {
				clearAndSendKeys(marketValue,
						proposalForm_IntermediaryEntityData.getStringValueForField("MarketValue"));
			}
			String marketValu1;
			marketValu1 = proposalForm_IntermediaryEntityData.getStringValueForField("MarketValue1");
			if ((marketValu1 != null) && (!marketValu1.isEmpty())) {
				clearAndSendKeys(marketValue1,
						proposalForm_IntermediaryEntityData.getStringValueForField("MarketValue1"));
			}

		}
	}

	public void fillAddressOfOfficeToBeInsured(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) {
		if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
				&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName")
						.equalsIgnoreCase("MISCELLANEOUS"))) {
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("AddressOfOfficeToBeInsured") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("AddressOfOfficeToBeInsured")
							.isEmpty())) {
				click(addressOfOfficeToBeInsured);

				if ((proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfOccupantOwner") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfOccupantOwner")
								.isEmpty())) {
					click(typeOfOccupantOwner);
				}
				if ((proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfOccupantTenant") != null)
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfOccupantTenant")
								.isEmpty())) {
					click(typeOfOccupantTenant);
				}
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("IsYourAboveAddressSameAsOfficeAddressYes") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("IsYourAboveAddressSameAsOfficeAddressYes").isEmpty())) {
					click(isYourAboveAddressSameAsOfficeAddressYes);
				}
				if ((proposalForm_IntermediaryEntityData
						.getStringValueForField("IsYourAboveAddressSameAsOfficeAddressNo") != null)
						&& (!proposalForm_IntermediaryEntityData
								.getStringValueForField("IsYourAboveAddressSameAsOfficeAddressNo").isEmpty())) {
					click(isYourAboveAddressSameAsOfficeAddressNo);

					if ((proposalForm_IntermediaryEntityData.getStringValueForField("OfficeAddress") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("OfficeAddress")
									.isEmpty())) {
						clearAndSendKeys(officeAddress,
								proposalForm_IntermediaryEntityData.getStringValueForField("OfficeAddress"));
					}
					if ((proposalForm_IntermediaryEntityData.getStringValueForField("Pincode") != null)
							&& (!proposalForm_IntermediaryEntityData.getStringValueForField("Pincode").isEmpty())) {
						clearAndSendKeys(pINCodeOfficeToBeInsured,
								proposalForm_IntermediaryEntityData.getStringValueForField("Pincode"));
					}
				}
			}
		}
	}

	public void fillInsuredDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) throws InterruptedException {
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("InsuredDetailsTab") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("InsuredDetailsTab").isEmpty())) {
			click(insuredDetailsTab);
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("PassportNumber") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("PassportNumber").isEmpty())) {
			clearAndSendKeys(passportNumber,
					proposalForm_IntermediaryEntityData.getStringValueForField("PassportNumber"));
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("DateOfIssueOfPassport") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("DateOfIssueOfPassport").isEmpty())) {
			clearAndSendKeys(dateOfIssueOfPassport,
					proposalForm_IntermediaryEntityData.getStringValueForField("DateOfIssueOfPassport"));
		}
		String strcountryOfVisit = proposalForm_IntermediaryEntityData.getStringValueForField("CountryOfVisit");
		if ((strcountryOfVisit != null) && (!strcountryOfVisit.isEmpty())) {
			clearAndSendKeys(countryOfVisit, strcountryOfVisit);
			Thread.sleep(5000);

			// driver.findElement(By.xpath("//input[@placeholder='Country of
			// Visit']")).sendKeys(Keys.TAB);

			WebElement cty = driver.findElement(By.xpath("//input[@placeholder='Country of Visit']"));
			String input = proposalForm_IntermediaryEntityData.getStringValueForField("CountryOfVisit");
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				String s = new StringBuilder().append(c).toString();
				cty.sendKeys(s);

			}
			cty.sendKeys(Keys.TAB);
			Thread.sleep(6000);
			// new
			// Actions(driver).moveToElement(countryOfVisitFlashText.getWebElement()).click();
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheEmployer") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheEmployer").isEmpty())) {
			clearAndSendKeys(nameOfTheEmployer,
					proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheEmployer"));
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("Profession") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("Profession").isEmpty())) {
			clearAndSendKeys(profession, proposalForm_IntermediaryEntityData.getStringValueForField("Profession"));
		}
		String Insureddropdown = proposalForm_IntermediaryEntityData.getStringValueForField("Insureddropdown");
		if ((Insureddropdown != null) && (!Insureddropdown.isEmpty())) {
			click(insureddropdown);
		}

		if ((proposalForm_IntermediaryEntityData.getStringValueForField("EarningMemberWS") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("EarningMemberWS").isEmpty())) {
			click(earningMemberWS);
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("NonEarningMemberWS") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NonEarningMemberWS").isEmpty())) {
			click(nonEarningMemberWS);
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("MinorWS") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("MinorWS").isEmpty())) {
			click(minorWS);
		}

		if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsOccupation") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsOccupation").isEmpty())) {
			click(JanataPAInsOccupation);
			selectValueFromList(JanataPAInsOccupation,
					proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsOccupation"));
		}

		if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsDOB") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsDOB").isEmpty())) {
			clearAndSendKeys(janataPAInsDOB,
					proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsDOB"));
		}
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsPhyDis") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsPhyDis").isEmpty())) {
			clearAndSendKeys(janataPAInsPhyDis,
					proposalForm_IntermediaryEntityData.getStringValueForField("JanataPAInsPhyDis"));
		}

		String OccupationDropDown = proposalForm_IntermediaryEntityData.getStringValueForField("OccupationDropDown");
		if ((OccupationDropDown != null) && (!OccupationDropDown.isEmpty())) {
			selectValueFromList(occupationDropDown,
					proposalForm_IntermediaryEntityData.getStringValueForField("OccupationDropDown"));
		}
		String OccupationMem;
		OccupationMem = proposalForm_IntermediaryEntityData.getStringValueForField("OccupationMember");
		if ((OccupationMem != null) && (!OccupationMem.isEmpty())) {
			selectValueFromList(occupationMemDropDwn,
					proposalForm_IntermediaryEntityData.getStringValueForField("OccupationMember"));
		}

		String DboInsuredDatails;
		DboInsuredDatails = proposalForm_IntermediaryEntityData.getStringValueForField("DboInsuredDatails");
		if ((DboInsuredDatails != null) && (!DboInsuredDatails.isEmpty())) {
			clearAndSendKeys(dboInsuredDatails,
					proposalForm_IntermediaryEntityData.getStringValueForField("DboInsuredDatails"));
		}

		String PhysicalDisTextField;
		PhysicalDisTextField = proposalForm_IntermediaryEntityData.getStringValueForField("PhysicalDisTextField");
		if ((PhysicalDisTextField != null) && (!PhysicalDisTextField.isEmpty())) {
			clearAndSendKeys(physicalDisTextField,
					proposalForm_IntermediaryEntityData.getStringValueForField("PhysicalDisTextField"));
		}
		String janataPASumInsDD;
		janataPASumInsDD = proposalForm_IntermediaryEntityData.getStringValueForField("JanataPASumInsured ");
		if ((janataPASumInsDD != null) && (!janataPASumInsDD.isEmpty())) {
			selectValueFromList(janataPASumInsured, janataPASumInsDD);
		}

		String GrossAnnualIncome;
		GrossAnnualIncome = proposalForm_IntermediaryEntityData.getStringValueForField("GrossAnnualIncome");
		if ((GrossAnnualIncome != null) && (!GrossAnnualIncome.isEmpty())) {
			clearAndSendKeys(grossAnnualIncome,
					proposalForm_IntermediaryEntityData.getStringValueForField("GrossAnnualIncome"));
		}
		String typeOfHealthinsu = proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfHealthInsurence");
		if ((typeOfHealthinsu != null) && (!typeOfHealthinsu.isEmpty())) {
			click(typeOfHelathIn);
		}
		String addMember = proposalForm_IntermediaryEntityData.getStringValueForField("AddMemberButton");
		if ((addMember != null) && (!addMember.isEmpty())) {
			click(addMemberButton);
		}
		String anyPhysicalprb = proposalForm_IntermediaryEntityData.getStringValueForField("AnyPhysicalproblem");
		if ((anyPhysicalprb != null) && (!anyPhysicalprb.isEmpty())) {
			click(anyPhysicalprbradiobutton);
		}
		String dateofBirthmem;
		dateofBirthmem = proposalForm_IntermediaryEntityData.getStringValueForField("DateofBirthMem");
		if ((dateofBirthmem != null) && (!dateofBirthmem.isEmpty())) {
			clearAndSendKeys(dateOfBirthMemm,
					proposalForm_IntermediaryEntityData.getStringValueForField("DateofBirthMem"));
		}
		String nomineeNameMember;
		nomineeNameMember = proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNameMember");
		if ((nomineeNameMember != null) && (!nomineeNameMember.isEmpty())) {
			clearAndSendKeys(nomineenameMember,
					proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNameMember"));
		}
		String relwithNominee;
		relwithNominee = proposalForm_IntermediaryEntityData.getStringValueForField("RelationWithNominee");
		if ((relwithNominee != null) && (!relwithNominee.isEmpty())) {
			String strProductName = proposalForm_IntermediaryEntityData.getStringValueForField("ProductName");
			switch (strProductName) {
			case "Rural Laghu Bima Health": {
				PageElement RelwithNominee = new PageElement(By.name("relationship_of_Nominee_with_Insured0"),
						"Relation with nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				selectValueFromList(RelwithNominee, relwithNominee);
			}
				break;
			default: {
				selectValueFromList(relwithNomineeDropDown, relwithNominee);
			}
				break;
			}
		}
		String preExstingcond;
		preExstingcond = proposalForm_IntermediaryEntityData.getStringValueForField("PreExstingcond");
		if ((preExstingcond != null) && (!preExstingcond.isEmpty())) {
			clearAndSendKeys(preexstingCond,
					proposalForm_IntermediaryEntityData.getStringValueForField("PreExstingcond"));
		}
		String sumInsuredMem;
		sumInsuredMem = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredMember");
		if ((sumInsuredMem != null) && (!sumInsuredMem.isEmpty())) {
			selectValueFromList(sumInsuredmemDropDown, sumInsuredMem);
			// selectValueFromList(sumInsuredmemDropDown,
			// proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredMember"));

			String productname = proposalForm_IntermediaryEntityData.getStringValueForField("ProductName");
			switch (productname) {
			case "Rural Laghu Bima Personal Accident": {
				selectValueFromList(sumInsuredmemJPSB, sumInsuredMem);
			}
				break;
			default: {
				selectValueFromList(sumInsuredmemDropDown, sumInsuredMem);
			}
				break;
			}
		}
	}

	private void fillHutDetails(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) {
		String hutDetails = proposalForm_IntermediaryEntityData.getStringValueForField("HutDetails");
		if ((hutDetails != null) && (!hutDetails.isEmpty())) {
			click(hutDetailsdropdown);
		}

		String nameOfitem;
		nameOfitem = proposalForm_IntermediaryEntityData.getStringValueForField("NameOfItem");
		if ((nameOfitem != null) && (!nameOfitem.isEmpty())) {
			clearAndSendKeys(nameofItemtextfiled,
					proposalForm_IntermediaryEntityData.getStringValueForField("NameOfItem"));
		}
		String typeofHut;
		typeofHut = proposalForm_IntermediaryEntityData.getStringValueForField("TypeOfHut");
		if ((typeofHut != null) && (!typeofHut.isEmpty())) {
			click(typeOfHutRadioButton);
		}

		String sumInsuredforpukkaRCCDropDown;
		sumInsuredforpukkaRCCDropDown = proposalForm_IntermediaryEntityData
				.getStringValueForField("SumInsuredforPukkaRCC");
		if ((sumInsuredforpukkaRCCDropDown != null) && (!sumInsuredforpukkaRCCDropDown.isEmpty())) {
			selectValueFromList(sumInsuredforpukkawRCCDropDown,
					proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredforPukkaRCC"));
		}
		String suminsuredForPukka;
		suminsuredForPukka = proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredForPukka");
		if ((suminsuredForPukka != null) && (!suminsuredForPukka.isEmpty())) {
			clearAndSendKeys(sumInsuredPukkatextfiled,
					proposalForm_IntermediaryEntityData.getStringValueForField("SumInsuredForPukka"));
		}

	}

	public void fillSELF(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData, CustomAssert customAssert) {
		if ((proposalForm_IntermediaryEntityData.getStringValueForField("SelfTab") != null)
				&& (!proposalForm_IntermediaryEntityData.getStringValueForField("SelfTab").isEmpty())) {
			click(selfTab);
			if ((proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheInsuredSelf") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheInsuredSelf")
							.isEmpty())) {
				clearAndSendKeys(nameOfTheInsuredSelf,
						proposalForm_IntermediaryEntityData.getStringValueForField("NameOfTheInsuredSelf"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("OccupationOfTheMemberSelf") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("OccupationOfTheMemberSelf")
							.isEmpty())) {
				selectValueFromList(occupationOfTheMemberSelf,
						proposalForm_IntermediaryEntityData.getStringValueForField("OccupationOfTheMemberSelf"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNameSelf") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNameSelf").isEmpty())) {
				clearAndSendKeys(nomineeNameSelf,
						proposalForm_IntermediaryEntityData.getStringValueForField("NomineeNameSelf"));
			}

			if ((proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNomineeSelf") != null)
					&& (!proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNomineeSelf")
							.isEmpty())) {
				selectValueFromList(relationshipWithTheNomineeSelf,
						proposalForm_IntermediaryEntityData.getStringValueForField("RelationshipWithTheNomineeSelf"));
			}
		}
	}

	protected void switchToWindow(String windowTitle) throws InterruptedException {
		try {
			Thread.sleep(1000);
			Set<String> windows = driver.getWindowHandles();

			for (String window : windows) {
				driver.switchTo().window(window);
				// driver.manage().window().maximize();
				if (driver.getTitle().contains(windowTitle))
					break;
			}
		}

		catch (Exception e) {
					frameworkServices.logMessage("Failed due to ------->" + e.getMessage());
			throw new ScriptExecutionException("Failed to search Criteria: ", e);
		}
	}

	public void clickOnUploadFileButton(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,
			CustomAssert customAssert) throws IOException, InterruptedException, AWTException {

		/*
		 * String UploadFile; UploadFile =
		 * proposalForm_IntermediaryEntityData.getStringValueForField("UploadFile"); if
		 * ((UploadFile != null) && (!UploadFile.isEmpty())) {
		 */

		String BrowseProposerButton;
		BrowseProposerButton = proposalForm_IntermediaryEntityData.getStringValueForField("BrowseProposerButton");
		if ((BrowseProposerButton != null) && (!BrowseProposerButton.isEmpty())) {

			// switchToWindow("Alert");
			Actions actions = new Actions(driver);
			actions.click(driver.findElement(browseProposerButton.getBy())).build().perform();
			// PageElement brpwsepropbutton=new

			// click(browseProposerButton);

			// doubleClick(uploadFileButton);
			// Alert alert=driver.switchTo().alert();
			// alert.dismiss();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\nikhil\\FileUpload.exe");
			Thread.sleep(2000);
			FrameworkServices.logMessage("Click on: Browse Button");
			System.out.println("File Uploded Successfully");
			click(continueButton);
		}

		String BrowseChildButton;
		BrowseChildButton = proposalForm_IntermediaryEntityData.getStringValueForField("BrowseChildButton");
		if ((BrowseChildButton != null) && (!BrowseChildButton.isEmpty())) {
			}
	}
	private void Managequote(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData) throws InterruptedException {
		try {
			if (proposalForm_IntermediaryEntityData.getAction().equalsIgnoreCase("add")
					&& (proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR"))
					||(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MARINE"))
					||(proposalForm_IntermediaryEntityData.getStringValueForField("LOBName").equalsIgnoreCase("RURAL"))) {
				
				// Click on Manage quote 
				if ((proposalForm_IntermediaryEntityData.getStringValueForField("manageQuoteTab") != null
						&& (!proposalForm_IntermediaryEntityData.getStringValueForField("manageQuoteTab").isEmpty()))) {				
					click(manageQuote);
					Thread.sleep(2000);
					
					clearAndSendKeys(quoteNoText, proposalForm_IntermediaryEntityData.getStringValueForField("QuoteNo"));
					Thread.sleep(5000);
					click(quoteNoSearchbtn);
					Thread.sleep(5000);
					// click on collection  for the policy quote..
								
					click(collectionPremiumIcon);
									
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fillPropsalFormPage(PrpslFrm_IntrmdryEntity proposalForm_IntermediaryEntityData,CustomAssert customAssert) throws InterruptedException, IOException, AWTException {
		fillTravelDetailsforTravel(proposalForm_IntermediaryEntityData, customAssert);
		fillPolicyHolderinfo(proposalForm_IntermediaryEntityData, customAssert);// 1
		fillSELF(proposalForm_IntermediaryEntityData, customAssert);
		fillMemberInfo(proposalForm_IntermediaryEntityData, customAssert);
		fillPhysicianInfo(proposalForm_IntermediaryEntityData, customAssert);
		fillAddressOfBuildingToBeInsured(proposalForm_IntermediaryEntityData, customAssert);
		fillAddressOfOfficeToBeInsured(proposalForm_IntermediaryEntityData, customAssert);
		fillAddressOfShop(proposalForm_IntermediaryEntityData, customAssert); // 2
		fillPolicyPeriod(proposalForm_IntermediaryEntityData, customAssert); // 3
		fillHutDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillInsuredDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillFarmerRiskandFireAlliedPerilsEarthquake(proposalForm_IntermediaryEntityData, customAssert);
		fillCattleDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillStandardCovers(proposalForm_IntermediaryEntityData, customAssert); // 4
		fillAdditionalCovers(proposalForm_IntermediaryEntityData, customAssert); // 5
		fillPublicLiabilitySubTab(proposalForm_IntermediaryEntityData, customAssert);// 6
		fillMoneyInsurancSubTab(proposalForm_IntermediaryEntityData, customAssert);// 7
		fillNomineeDetails(proposalForm_IntermediaryEntityData, customAssert);
		// fillRelationDetails(proposalForm_IntermediaryEntityData, customAssert);// 8
		fillAdditionalDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillTravellerDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillLiveStockDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillTransitDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillCargoDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillStandaloneODDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillVehicleDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillPreviousInsurerDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillPolicyPeriodForTwoWheeler(proposalForm_IntermediaryEntityData, customAssert);
		fillOtherDetails(proposalForm_IntermediaryEntityData, customAssert);
		fillRelationDetails(proposalForm_IntermediaryEntityData, customAssert);// 8
		fillFinancierDetails(proposalForm_IntermediaryEntityData, customAssert);
		clickButton(proposalForm_IntermediaryEntityData);
		Managequote(proposalForm_IntermediaryEntityData);
		clickOnUploadFileButton(proposalForm_IntermediaryEntityData, customAssert);
	}

	

}
