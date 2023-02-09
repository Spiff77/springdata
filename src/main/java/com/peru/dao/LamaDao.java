package com.peru.dao;

import java.util.List;

import com.peru.model.Lama;

public interface LamaDao extends GenericDao<Lama, Long> {
	public List<Lama> getAllByName(String name);
}
