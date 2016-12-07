package org.residential.usage.util.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ppf")
public class PPFAccount extends BankAccount {
	
	private Date dateOfCommencement;
	
	public Date getDateOfCommencement() {
		return dateOfCommencement;
	}
	public void setDateOfCommencement(Date dateOfCommencement) {
		this.dateOfCommencement = dateOfCommencement;
	}
	

}
