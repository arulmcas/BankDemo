package com.bank.balance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Balance {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "balance_ammount", nullable = false)
	private int balance_ammount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance_ammount() {
		return balance_ammount;
	}
	public void setBalance_ammount(int balance_ammount) {
		this.balance_ammount = balance_ammount;
	}
	
}
