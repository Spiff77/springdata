package com.peru.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.peru.model.Lama;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LamaDaoJpa implements LamaDao{

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Lama> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lama findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lama add(Lama obj) {
		this.em.persist(obj);
		return obj;
	}

	@Override
	public void remove(Lama obj) {
		// TODO Auto-generated method stub
		
	}

}
