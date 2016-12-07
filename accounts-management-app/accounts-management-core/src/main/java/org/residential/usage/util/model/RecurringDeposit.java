package org.residential.usage.util.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="recurringdeposit")
public class RecurringDeposit extends BankAccount {
	
	private Date firstInstallmentDate;
	private short tenure;
	private float installmentAmount;
	private float interestRate;
	private Date maturityDate;
	private double maturityAmount;
	
	public Date getFirstInstallmentDate() {
		return firstInstallmentDate;
	}
	public void setFirstInstallmentDate(Date firstInstallmentDate) {
		this.firstInstallmentDate = firstInstallmentDate;
	}
	public short getTenure() {
		return tenure;
	}
	public void setTenure(short tenure) {
		this.tenure = tenure;
	}
	public float getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(float installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public double getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	

}
