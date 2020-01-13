package com.aqm.staf.framework.core;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.aqm.staf.library.databin.AdditionalDetailEntity;
import com.aqm.staf.library.databin.ClaimIntimateEntity;
import com.aqm.staf.library.databin.CollectionIntermediaryEntity;
import com.aqm.staf.library.databin.DetailedQuoteEntity;
import com.aqm.staf.library.databin.GenericEntity;
import com.aqm.staf.library.databin.HomeEntity;
import com.aqm.staf.library.databin.HomeEntity_Intermediary;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PaymentEntity;
import com.aqm.staf.library.databin.PrpslFrm_IntrmdryEntity;
import com.aqm.staf.library.databin.QuickHelpEntity;
import com.aqm.staf.library.databin.PremiumCalculatorEntity;
import com.aqm.staf.library.databin.ProductInsuranceEntity;
import com.aqm.staf.library.databin.SummaryEntity;
import com.aqm.staf.library.databin.UserEntity;

public class ScenarioTestData {
	Session sessionTestData;
	List<LoginEntity> loginrecords;
	List<UserEntity> userRecords;
	List<UserEntity> Records;
	List<HomeEntity> homeRecords;
	List<AdditionalDetailEntity> additionalDetailRecords;
	List<DetailedQuoteEntity> detailedQuoteRecords;
	List<SummaryEntity> SummaryQuoteRecords;
	List<PaymentEntity> PaymentQuoteRecords;
	List<HomeEntity_Intermediary>homeEntityIntermediariesRecords;
	List<PremiumCalculatorEntity> PremiumCalculatorRecords;
	List<PrpslFrm_IntrmdryEntity> ProposalForm_IntermediaryRecords;
	List<ProductInsuranceEntity> ProductInsuranceRecords;
	List<CollectionIntermediaryEntity> CollectionIntermediaryRecords;
	List<ClaimIntimateEntity> ClaimIntimateRecords;
	List<QuickHelpEntity> QuickHelpRecords;


	public ScenarioTestData (Session sessionTestData, String testScenarioReference) {
		this.sessionTestData = sessionTestData;
		loginrecords		 				= getLoginRecordsForScenario(testScenarioReference);
		homeRecords			 				= getHomeRecordsForScenario(testScenarioReference);
		additionalDetailRecords 			= getadditionalDetailRecords(testScenarioReference);
		detailedQuoteRecords 				= getdetailedQuoteRecords(testScenarioReference);
		SummaryQuoteRecords					= getSummaryPageDetailRecords(testScenarioReference);
		PaymentQuoteRecords					= getPaymentPageDetailRecords(testScenarioReference);
		homeEntityIntermediariesRecords		= getHomeEntityIntermediariesRecords(testScenarioReference);
		PremiumCalculatorRecords			= getPremiumCalculatorRecords(testScenarioReference);
		ProductInsuranceRecords				= getProductInsuranceDetailRecords(testScenarioReference);
		ProposalForm_IntermediaryRecords	= getProposalForm_IntermediaryRecords(testScenarioReference);
		CollectionIntermediaryRecords		= getCollectionIntermediaryRecords(testScenarioReference);
		ClaimIntimateRecords				= getClaimIntimateRecords(testScenarioReference);
		QuickHelpRecords					= getQuickHelpRecords(testScenarioReference);
	}


	


	private List<LoginEntity> getLoginRecordsForScenario(String testScenarioReference) {
		List<LoginEntity> loginEntityList = getAllRecordsForCriteria(LoginEntity.class, testScenarioReference);
		return loginEntityList;
	}
	public void setLoginEntityRecords(
			List<LoginEntity> loginEntityRecords) {
		this.loginrecords = loginEntityRecords;
	}
	public List<LoginEntity> getLoginEntityRecords() {
		return loginrecords;
	}

	//Home
	private List<HomeEntity> getHomeRecordsForScenario(String testScenarioReference) {
		List<HomeEntity> homeEntityList = getAllRecordsForCriteria(HomeEntity.class, testScenarioReference);
		return homeEntityList;
	}

	public List<HomeEntity> getHomeRecords() {
		return homeRecords;
	}
	public void setHomeRecords(List<HomeEntity> homeRecords) {
		this.homeRecords = homeRecords;
	}

	//AdditonalDetail 
	//*********************************    pravina start ****************************************************************************************************88
	private List<AdditionalDetailEntity> getadditionalDetailRecords(String testScenarioReference) {
		List<AdditionalDetailEntity> additionalDetailEntitylist = getAllRecordsForCriteria(AdditionalDetailEntity.class, testScenarioReference);
		return additionalDetailEntitylist;
	}
	public List<AdditionalDetailEntity> getAdditionalDetailRecords() {
		return additionalDetailRecords;
	}
	public void setAdditionalDetailRecords(List<AdditionalDetailEntity> additionalDetailRecords) {
		this.additionalDetailRecords = additionalDetailRecords;
	}
	//pravina end
	//*********************************    pravina end ****************************************************************************************************88

	//DetailQutoe
	//*********************************   uday start *********************************
	private List<DetailedQuoteEntity> getdetailedQuoteRecords(String testScenarioReference) {
		List<DetailedQuoteEntity> detailedQuoteEntitylist = getAllRecordsForCriteria(DetailedQuoteEntity.class, testScenarioReference);
		return detailedQuoteEntitylist;		
	}
	public List<DetailedQuoteEntity> getdetailedQuoteRecords() {
		return detailedQuoteRecords;
	}

	public void setdetailedQuoteRecords(List<DetailedQuoteEntity> detailedQuoteRecords) {
		this.detailedQuoteRecords = detailedQuoteRecords;
	}
	//uday end
	//SummaryEntity
	private List<SummaryEntity> getSummaryPageDetailRecords(String testScenarioReference) {
		List<SummaryEntity> SummaryDetailEntitylist = getAllRecordsForCriteria(SummaryEntity.class, testScenarioReference);
		return SummaryDetailEntitylist;
	}


	public List<SummaryEntity> getSummaryPageDetailRecords() {
		return SummaryQuoteRecords;
	}

	public void setSummaryPageDetailRecords(List<SummaryEntity> SummaryDetailRecords) {
		this.SummaryQuoteRecords = SummaryDetailRecords;
	}

	//PaymentEntity
	private List<PaymentEntity> getPaymentPageDetailRecords(String testScenarioReference) {
		List<PaymentEntity> paymentDetailEntitylist = getAllRecordsForCriteria(PaymentEntity.class, testScenarioReference);
		return paymentDetailEntitylist;
	}

	public List<PaymentEntity> getPaymentPageDetailRecords() {
		return PaymentQuoteRecords;
	}

	public void setPaymentPageDetailRecords(List<PaymentEntity> PaymentDetailRecords) {
		this.PaymentQuoteRecords = PaymentDetailRecords;
	}

	//PremiumCalculatorEntity
	private List<PremiumCalculatorEntity> getPremiumCalculatorRecords(String testScenarioReference) {
		List<PremiumCalculatorEntity> premiumCalculatorlist = getAllRecordsForCriteria(PremiumCalculatorEntity.class, testScenarioReference);
		return premiumCalculatorlist;
	}

	public List<PremiumCalculatorEntity> getPremiumCalculatorRecords() {
		return PremiumCalculatorRecords;
	}
	public void setPremiumCalculatorRecords(List<PremiumCalculatorEntity> premiumCalculatorRecords) {
		PremiumCalculatorRecords = premiumCalculatorRecords;
	}




	private List<ProductInsuranceEntity> getProductInsuranceDetailRecords(String testScenarioReference) {
		List<ProductInsuranceEntity> ProductInsuranceDetailEntitylist = getAllRecordsForCriteria(ProductInsuranceEntity.class, testScenarioReference);
		return ProductInsuranceDetailEntitylist;
	}


	public List<ProductInsuranceEntity> getProductInsuranceDetailRecords() {
		return ProductInsuranceRecords;
	}

	public void setProductInsuranceDetailRecords(List<ProductInsuranceEntity> ProductInsuranceDetailRecords) {
		this.ProductInsuranceRecords = ProductInsuranceDetailRecords;
	}

	//Pravina ProposalForm

	private List<PrpslFrm_IntrmdryEntity> getProposalForm_IntermediaryRecords(String testScenarioReference) {
		List<PrpslFrm_IntrmdryEntity> ProductInsuranceDetailEntitylist = getAllRecordsForCriteria(PrpslFrm_IntrmdryEntity.class, testScenarioReference);
		return ProductInsuranceDetailEntitylist;
	}


	public List<PrpslFrm_IntrmdryEntity> getProposalForm_IntermediaryRecords() {
		return ProposalForm_IntermediaryRecords;
	}



	public void setProposalForm_IntermediaryRecords(List<PrpslFrm_IntrmdryEntity> proposalForm_IntermediaryRecords) {
		ProposalForm_IntermediaryRecords = proposalForm_IntermediaryRecords;
	}

//Amol 19-12-2018
	
	private List<ClaimIntimateEntity> getClaimIntimateRecords(String testScenarioReference) {
		List<ClaimIntimateEntity> ClaimIntimateEntityList = getAllRecordsForCriteria(ClaimIntimateEntity.class, testScenarioReference);
		return ClaimIntimateEntityList;
	}
	
	public List<ClaimIntimateEntity> getClaimIntimateRecords() {
		return ClaimIntimateRecords;
	}


	public void setClaimIntimateRecords(List<ClaimIntimateEntity> claimIntimateRecords) {
		ClaimIntimateRecords = claimIntimateRecords;
	}
	
	// sagar QuickRenewal
	
	public List<QuickHelpEntity> getQuickHelpRecords(String testScenarioReference) {
		List<QuickHelpEntity> QuickHelpEntityList = getAllRecordsForCriteria(QuickHelpEntity.class, testScenarioReference);
		return QuickHelpEntityList;
	}

	public List<QuickHelpEntity> getQuickHelpRecords() {
		return QuickHelpRecords;
	}

   public void setQuickHelpRecords(List<QuickHelpEntity> quickHelpRecords) {
	   QuickHelpRecords = quickHelpRecords;
	}





	// BY ADP On 27-09-2018
	// START
	//HomeEntity_Intermediary
	private List<HomeEntity_Intermediary> getHomeEntityIntermediariesRecords(String testScenarioReference) {
		List<HomeEntity_Intermediary> HomeEntity_IntermediaryEntitylist = getAllRecordsForCriteria(HomeEntity_Intermediary.class, testScenarioReference);
		return HomeEntity_IntermediaryEntitylist;
	}
	public List<HomeEntity_Intermediary> getHomeEntityIntermediariesRecords() {
		return homeEntityIntermediariesRecords;
	}

	public void setHomeEntityIntermediariesRecords(List<HomeEntity_Intermediary> homeEntityIntermediariesRecords) {
		this.homeEntityIntermediariesRecords = homeEntityIntermediariesRecords;
	}
	//END

	//Collection Start
	private List<CollectionIntermediaryEntity> getCollectionIntermediaryRecords(String testScenarioReference) {
		List<CollectionIntermediaryEntity> CollectionIntermediarylist = getAllRecordsForCriteria(CollectionIntermediaryEntity.class, testScenarioReference);
		return CollectionIntermediarylist;
	}
	public List<CollectionIntermediaryEntity> getCollectionIntermediaryRecords() {
		return CollectionIntermediaryRecords;
	}



	public void setCollectionIntermediaryRecords(List<CollectionIntermediaryEntity> collectionIntermediaryRecords) {
		CollectionIntermediaryRecords = collectionIntermediaryRecords;
	}

	//Collection End



	public <T> Object getRecordForCriteria (Class classObject, String testScenarioReference) {
		Object returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(classObject);
			criteria.add(Restrictions.eq("Reference", testScenarioReference));
			returnObject = criteria.uniqueResult();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return returnObject;
	}	






	public <T> List<T> getAllRecordsForCriteria (Class classObject, String testScenarioReference) {
		List<T> returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(classObject);
			criteria.add(Restrictions.eq("TestScenario", testScenarioReference));
			criteria.addOrder(Order.asc("RowNumber"));
			returnObject = criteria.list();
			t.commit();

		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return returnObject;
	}

	public static <T> ArrayList<T> getObjectByReference(List<T> list,String keys){
		ArrayList<T> filteredDataList=new ArrayList<T>();
		if (keys.equalsIgnoreCase("")){
			return filteredDataList;
		}
		String[] key=keys.split(",");
		for(int i=0;i<key.length;i++){
			for(T t:list){
				if(((GenericEntity)t).getReference().trim().equalsIgnoreCase(key[i].trim())){
					filteredDataList.add(t);
				}
			}
		}
		return filteredDataList;
	}

	public void updateRecordsForCriteria(Object object){
		Transaction t=sessionTestData.beginTransaction();
		try {
			sessionTestData.update(object);
			sessionTestData.persist(object);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			System.out.println("Entity Updation Error => "+e.getClass().getSimpleName());
		}
	}
}
