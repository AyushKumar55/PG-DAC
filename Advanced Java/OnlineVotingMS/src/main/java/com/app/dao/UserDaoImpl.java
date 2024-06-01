package com.app.dao;

import static com.app.utils.DBUtils.openConnection;
import static com.app.utils.DBUtils.closeConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.entities.User;

public class UserDaoImpl implements UserDao {

	private Connection cn;
	private PreparedStatement pst1, pst2;

	// Default Constructor of the DAO layer
	public UserDaoImpl() throws SQLException {
		// get connection from DBUtils
		cn = openConnection();

		// pst1: SignIn(signIn)
		pst1 = cn.prepareStatement("select * from users where email = ? and password = ?");

		// pst2: SignUp(voterRegistration)
		pst2 = cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");

		System.out.println("User Dao Created...");
	}

	public User signIn(String email, String password) throws SQLException {

		// 1. set IN parameters
		pst1.setString(1, email);
		pst1.setString(2, password);

		// 2. execute Query
		try (ResultSet rst = pst1.executeQuery()) {
			// rst cursor: Before the 1st row
			if (rst.next()) {
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6),
						rst.getBoolean(7), rst.getString(8));
			}
		}
		return null;
	}

	public String voterRegistration(User newVoter) throws SQLException {

		// 1. set IN parameters
		/*
		 * int userId, String firstName, String lastName, String email, String password,
		 * Date dob, boolean status, String role
		 */
		pst2.setString(1, newVoter.getFirstName());
		pst2.setString(2, newVoter.getLastName());
		pst2.setString(3, newVoter.getEmail());
		pst2.setString(4, newVoter.getPassword());
		pst2.setDate(5, newVoter.getDob());
		pst2.setBoolean(6, newVoter.isStatus());
		pst2.setString(7, newVoter.getRole());

		int rows = pst2.executeUpdate();
		if (rows == 1)
			return "Voter Registered";
		return "Voter Registration Failed";
	}
	
	public void cleanUp() throws SQLException{
		System.out.println("User dao cleaned up");
		if(pst1 != null) {
			pst1.close();
		}
		if(pst2 != null) {
			pst2.close();
		}
		closeConnection();
	}

}
