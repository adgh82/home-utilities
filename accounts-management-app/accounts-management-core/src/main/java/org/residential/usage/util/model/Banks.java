package org.residential.usage.util.model;

public class Banks extends FinancialInstitution {
	
	private String branchName;
	private String ifsc;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	

}
