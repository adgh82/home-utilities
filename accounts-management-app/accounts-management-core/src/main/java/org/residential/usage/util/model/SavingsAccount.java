package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="savingsaccount")
public class SavingsAccount extends BankAccount {
	
	private String debitCardAffiliate;

	public String getDebitCardAffiliate() {
		return debitCardAffiliate;
	}

	public void setDebitCardAffiliate(String debitCardAffiliate) {
		this.debitCardAffiliate = debitCardAffiliate;
	}

}
