package com.entity;

public class Wallet{
	
	private int id;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Wallet(int id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public Wallet() {
		super();
	}
	
	
}