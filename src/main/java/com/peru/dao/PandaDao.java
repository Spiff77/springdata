package com.peru.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.peru.model.Panda;

public interface PandaDao extends JpaRepository<Panda, Long>{
	public List<Panda> findByNomContainingAndPoidsGreaterThan(String nom, float poids);
	public Long countByNomContainingAndPoidsGreaterThan(String nom, float poids);
	
	@Query("select p from Panda p where p.pote.name = :nom")
	public Long findAllLamaByPoteName(@Param("nom") String name);


}
