package com.aqm.staf.library.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.SummaryEntity;

public class SummaryPage extends BasePage{
	private PageElement submitQuoteButton;
	private PageElement paymentLabel;

	public SummaryPage(WebDriver driver,String pageName) {
		super(driver,pageName);
		submitQuoteButton=new PageElement(By.xpath("//button[contains(text(),'Submit Quote')]"), "Submit Quote Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentLabel=new PageElement(By.xpath("//label[contains(text(),'Payment')]"), "Payment Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	}

	public void clickOnSubmitQuoteButton(SummaryEntity summaryEntity) {
		if(summaryEntity.getAction().equalsIgnoreCase("add")){
			String submitQuote	;
			submitQuote = summaryEntity.getStringValueForField("SubmitQuoteButton");
			if ((submitQuote!=null)&&(!submitQuote.isEmpty())){
				waitForPageElement(submitQuoteButton);
				click(submitQuoteButton);
				waitForPageElement(paymentLabel);
				isElementDisplayed(paymentLabel);
			}
		}
	}

	public void fillSummaryPagePage(SummaryEntity summaryEntity,CustomAssert customAssert){
		clickOnSubmitQuoteButton(summaryEntity);
	}
}
