package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimIntimateEntity;

public class ClaimIntimateDetailpage extends BasePage{

	private PageElement policyNumber;
	private PageElement dateOfLoss;
	private PageElement timeOfLoss;
	private PageElement typeOfLoss;
	private PageElement natureOfLoss;
	private PageElement placeOfLoss;
	private PageElement estimatedLoss;
	private PageElement cancelButton;
	private PageElement resetButton;
	private PageElement intimateButton;
	
	public ClaimIntimateDetailpage(WebDriver driver, String pageName) {
		super(driver, pageName);
		
		policyNumber = new PageElement(By.xpath("//select[@id='policyNo']"), "Policy No", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfLoss = new PageElement(By.xpath("//input[@name='accidentDate']"), "dateofloss", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		timeOfLoss = new PageElement(By.xpath("//input[@name='accidentTime']"), "timeeofloss", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfLoss = new PageElement(By.xpath("//select[@id='typeOfLoss']"), "typeeofloss", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLoss= new PageElement(By.xpath("//select[@id='natureOfLoss']"), "natureeofloss", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfLoss = new PageElement(By.xpath("//input[@name='pincodeInd']"), "placeeofloss", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedLoss = new PageElement(By.xpath("//input[@name='estimatedLoss']"), "placeeofloss", false,WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cancelButton = new PageElement(By.xpath("//button[@class='btn btn-grey wid25 mr-10']"), "cancelButton", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		resetButton = new PageElement(By.xpath("//button[@class='btn btn-blue wid25']"), "resetButton", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		intimateButton = new PageElement(By.xpath("//button[@class='btn submit-button wid25 ml-10']"), "intimateButton", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		
	}
		public void fillAndSubmitIntimateClaim(ClaimIntimateEntity claimIntimateEntityData, CustomAssert assertReference) throws InterruptedException {
			if(claimIntimateEntityData.getAction().equalsIgnoreCase("add") 
					/*&& claimIntimateEntityData.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")*/) {
				//	switchToWindow("The New India Assurance Co. Ltd.");
				//click(additionalVehicleDetails);	
				String PolicyNumber;
				PolicyNumber = claimIntimateEntityData.getStringValueForField("policyNumberDropdown");
				if ((PolicyNumber!=null)&&(!PolicyNumber.isEmpty())){
					click(policyNumber);
					selectValueFromIndex(policyNumber);
				}

				String DateOfLoss;
				DateOfLoss = claimIntimateEntityData.getStringValueForField("DateOfLoss");
				if ((DateOfLoss!=null)&&(!DateOfLoss.isEmpty())){
					clearAndSendKeys(dateOfLoss,claimIntimateEntityData.getStringValueForField("DateOfLoss"));
				}		
				
				String TimeOfLoss;
				TimeOfLoss = claimIntimateEntityData.getStringValueForField("TimeOfLoss");
				if ((TimeOfLoss!=null)&&(!TimeOfLoss.isEmpty())){
					clearAndSendKeys(timeOfLoss,claimIntimateEntityData.getStringValueForField("TimeOfLoss"));
				}	
				
				String TypeOfLoss;
				TypeOfLoss = claimIntimateEntityData.getStringValueForField("TypeOfLoss");
				if ((TypeOfLoss!=null)&&(!TypeOfLoss.isEmpty())){
					selectValueFromList(typeOfLoss,claimIntimateEntityData.getStringValueForField("TypeOfLoss"));	
				}
				
				String NatureOfLoss;
				NatureOfLoss = claimIntimateEntityData.getStringValueForField("NatureOfLoss");
				if ((NatureOfLoss!=null)&&(!NatureOfLoss.isEmpty())){
					selectValueFromList(natureOfLoss,claimIntimateEntityData.getStringValueForField("NatureOfLoss"));
				}	
				
				String PlaceOfLoss;
				PlaceOfLoss = claimIntimateEntityData.getStringValueForField("PlaceOfLoss");
				if ((PlaceOfLoss!=null)&&(!PlaceOfLoss.isEmpty())){
					clearAndSendKeys(placeOfLoss,claimIntimateEntityData.getStringValueForField("PlaceOfLoss"));
				}	
			     
				String EstimatedLoss;
				EstimatedLoss = claimIntimateEntityData.getStringValueForField("EstimatedLoss");
				if ((EstimatedLoss!=null)&&(!EstimatedLoss.isEmpty())){
					clearAndSendKeys(estimatedLoss,claimIntimateEntityData.getStringValueForField("EstimatedLoss"));
				}	
				
				String CancelButton;
				CancelButton = claimIntimateEntityData.getStringValueForField("CancelButton");
				if ((CancelButton!=null)&&(!CancelButton.isEmpty())){
					clearAndSendKeys(cancelButton,claimIntimateEntityData.getStringValueForField("CancelButton"));
				}	
				
				String ResetButton;
				ResetButton = claimIntimateEntityData.getStringValueForField("ResetButton");
				if ((ResetButton!=null)&&(!ResetButton.isEmpty())){
					clearAndSendKeys(resetButton,claimIntimateEntityData.getStringValueForField("ResetButton"));
				}	
				
				String IntimateButton;
				IntimateButton = claimIntimateEntityData.getStringValueForField("IntimateButton");
				if ((IntimateButton!=null)&&(!IntimateButton.isEmpty())){
					click(intimateButton);
				}	
				
			}
	}
}