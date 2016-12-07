package org.residential.usage.util.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mutualfund")
public class MutualFund extends Account {
	
	private String folioNumber;
	private String schemeName;
	private boolean elss;
	private String schemeCategory;
	private boolean sip;
	private double sipAmount;
	private String paymentFrequency;
	private Date sipStartDate;
	private int sipDuration; //How many installments in Months
	@DBRef
	private FinancialInstitution associatedBank;
	public String getFolioNumber() {
		return folioNumber;
	}
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public boolean isElss() {
		return elss;
	}
	public void setElss(boolean elss) {
		this.elss = elss;
	}
	public String getSchemeCategory() {
		return schemeCategory;
	}
	public void setSchemeCategory(String schemeCategory) {
		this.schemeCategory = schemeCategory;
	}
	public boolean isSip() {
		return sip;
	}
	public void setSip(boolean sip) {
		this.sip = sip;
	}
	public double getSipAmount() {
		return sipAmount;
	}
	public void setSipAmount(double sipAmount) {
		this.sipAmount = sipAmount;
	}
	public String getPaymentFrequency() {
		return paymentFrequency;
	}
	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}
	public Date getSipStartDate() {
		return sipStartDate;
	}
	public void setSipStartDate(Date sipStartDate) {
		this.sipStartDate = sipStartDate;
	}
	public int getSipDuration() {
		return sipDuration;
	}
	public void setSipDuration(int sipDuration) {
		this.sipDuration = sipDuration;
	}
	public FinancialInstitution getAssociatedBank() {
		return associatedBank;
	}
	public void setAssociatedBank(FinancialInstitution associatedBank) {
		this.associatedBank = associatedBank;
	}
	

}
