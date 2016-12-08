package org.residential.usage.util.service;

import java.util.List;

public interface EntityService <T> {
	
	List<T> getEntityList();
	T getEntityDetails(String id);	
	boolean createEntity(T entity);
	boolean deleteEntity(String id);
	boolean updateEntity(T entity);

}
