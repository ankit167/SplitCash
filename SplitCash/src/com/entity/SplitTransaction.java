package com.entity;

import java.io.Serializable;

public class SplitTransaction implements Serializable {

	private int transaction_id;
	private int user_id;
	private int product_id;
	private int amount;
	private int paid;
	private String consent;
	private int locktime;
	
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public String getConsent() {
		return consent;
	}
	public void setConsent(String consent) {
		this.consent = consent;
	}
	public int getLocktime() {
		return locktime;
	}
	public void setLocktime(int locktime) {
		this.locktime = locktime;
	}
	
		
}
