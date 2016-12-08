package org.residential.usage.util.service;

import org.residential.usage.util.model.Address;
import org.residential.usage.util.model.Member;

public interface MemberService extends EntityService<Member>{
	
	boolean associateMemberAddress(Member member, Address address);

}
