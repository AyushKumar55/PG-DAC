package com.app.dao;

import java.sql.SQLException;

import com.app.entities.User;

public interface UserDao {
	
	//Method for User's SignIn
	User signIn(String email, String password) throws SQLException;
	
	//Method for Voter Registration
	String voterRegistration(User newVoter) throws SQLException;

}
