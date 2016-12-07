package org.residential.usage.util.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fixeddeposit")
public class FixedDepositAccount extends BankAccount {
	
	private double principal;
	private double amount;
	private float interestRate;
	private Date depositDate;
	private Date maturityDate;
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public Date getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	

}
