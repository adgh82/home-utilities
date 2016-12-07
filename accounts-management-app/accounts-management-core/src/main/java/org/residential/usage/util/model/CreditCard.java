package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="creditcard")
public class CreditCard extends Account {
	
	private long cardNumber;
	private String affiliate;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAffiliate() {
		return affiliate;
	}
	public void setAffiliate(String affiliate) {
		this.affiliate = affiliate;
	}

}
