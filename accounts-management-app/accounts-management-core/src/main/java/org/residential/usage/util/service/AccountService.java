package org.residential.usage.util.service;

import java.util.List;

import org.residential.usage.util.model.Account;
import org.residential.usage.util.model.FinancialInstitution;
import org.residential.usage.util.model.Member;

public interface AccountService extends EntityService<Account>{
	
	List<Account> getAccountsByMember(Member member);
	List<Account> getAccountsByFinancialInstitution(FinancialInstitution financialInstitution);

}
