package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bank")
public class Bank extends FinancialInstitution {
	
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
