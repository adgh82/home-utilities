package org.residential.usage.util.service;

import org.residential.usage.util.model.Address;
import org.residential.usage.util.model.FinancialInstitution;
import org.residential.usage.util.model.Member;

public interface FinancialInstitutionService extends EntityService<FinancialInstitution>{
	
	boolean associateFinancialInstitutionAddress(Member member, Address address);

}
