package com.dao;

public interface RegistrationDaoI {
	
	public int addUser(int user_id, String username, String first_name, String last_name,String email, String password);
	public int maxKey(String table_name, String id);
}
