package com.squadpair.java.dao;

import java.sql.Connection;

import com.squadpair.java.connection.ConnectionManager;

public class UserDAO {
	
	public Connection conn = ConnectionManager.getConnection();
	
	public boolean addUser() {
		return false;
	}
	
	public int getUserByID(){
		return null;
	}
	
	public boolean updateUsername() {
		return false;
	}
	
	public boolean updatePassword() {
		return false;
	}
	
	public boolean removeUser(){
		return false;
	}
	
}
