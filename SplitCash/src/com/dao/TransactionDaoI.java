package com.dao;

import com.entity.User;

public interface TransactionDaoI {

	
	public int setSplit(int id,int transaction_id,String[] phone,String[] amt);
	public int setBaseTransaction(int id,int initiator_id,int product_id,boolean status);
	public int maxKey(String table_name, String id);
}
