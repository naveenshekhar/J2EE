package com.java.web.dao;

import com.java.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Naveen");
		a.setTech("java");
		
		return a;
		
	}

}
