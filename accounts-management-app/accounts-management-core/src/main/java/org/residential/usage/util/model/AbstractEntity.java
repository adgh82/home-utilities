package org.residential.usage.util.model;

import org.springframework.data.annotation.Id;

public abstract class AbstractEntity {
	
	@Id
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
