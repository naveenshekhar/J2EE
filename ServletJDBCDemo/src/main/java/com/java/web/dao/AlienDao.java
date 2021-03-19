package com.java.web.dao;

import com.java.web.model.Alien;

//STEP 1 : import the packages
import java.sql.*;

public class AlienDao {

	public Alien getAlien(int aid) {

		Alien a = new Alien();
//Static data just for example not coming from database
		/*
		 * a.setAid(101); a.setAname("Naveen"); a.setTech("java");
		 */
		try {
			// STEP 2 : Loding Driver
			Class.forName("com.mysql.jdbc.Driver");
			// STEP 3 : Connecting with database(url/database_name,user,password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naveen", "root", "root");
			// STEP 4 : Create Statement
			Statement st = con.createStatement();
			// STEP 5 : Execute the Query
			ResultSet rs = st.executeQuery("SELECT * FROM alien where aid = " + aid);
			if (rs.next()) {
				
				a.setAid(rs.getInt(aid));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));

			}
		} catch (Exception e) {

		}
		return a;

	}

}
