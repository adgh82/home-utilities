package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public abstract class FinancialInstitution extends AbstractEntity {
	
	protected String institutionName;
	@DBRef
	protected Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

}
