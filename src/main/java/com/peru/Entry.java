package com.peru;

import org.springframework.beans.factory.annotation.Autowired;

import com.peru.dao.LamaDao;
import com.peru.dao.PandaDao;
import com.peru.model.Lama;
import com.peru.model.Panda;

public class Entry {

	@Autowired
	LamaDao ljpa;
	
	@Autowired
	PandaDao pdao;
	
	public void run(String[] args) {
		pdao.save(new Panda("Fiat1", 90f));
		pdao.save(new Panda("Fiat2", 95f));
		pdao.save(new Panda("Jacques", 98f));
		pdao.save(new Panda("Fiat4", 100f));
		pdao.save(new Panda("Fiat5", 102f));
		pdao.save(new Panda("Fiat6", 105f));
		
		System.out.println(pdao.findAllLamaByPoteName("iat"));
	}

}