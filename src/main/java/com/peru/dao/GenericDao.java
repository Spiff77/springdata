package com.peru.dao;

import java.util.List;

public interface GenericDao<T, K> {
	
	public List<T> findAll();
	public T findOne(K id);
	public T add(T obj);
	public void remove(T obj);

}
