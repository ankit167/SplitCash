package com.dao;

import java.util.List;

import com.entity.Product;
import com.entity.User;

public interface ValidationDaoI {

	
	public User validateUser(String name,String pass);
	public List<Product> proDetails();
}
