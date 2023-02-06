package com.peru;

import org.springframework.beans.factory.annotation.Autowired;

import com.peru.dao.LamaDao;
import com.peru.model.Lama;

public class Entry {

	@Autowired
	LamaDao ljpa;
	
	public void run(String[] args) {
		ljpa.add(new Lama("Bernard"));
	}

}