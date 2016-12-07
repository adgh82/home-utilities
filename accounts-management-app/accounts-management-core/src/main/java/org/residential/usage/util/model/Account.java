package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public abstract class Account extends AbstractEntity {
	
	//TODO create entities for create for Loan and Credit Card
	
	@DBRef
	protected Member member;
	
	@DBRef
	protected FinancialInstitution institution;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public FinancialInstitution getInstitution() {
		return institution;
	}

	public void setInstitution(FinancialInstitution institution) {
		this.institution = institution;
	}	
	

}
