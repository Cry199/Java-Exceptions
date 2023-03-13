package model.entities;

import model.exceptions.Exceptions;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws Exceptions
	{
		if(withdrawLimit < amount)
		{
			throw new Exceptions("The amount exceeds withdraw limit");
		}
		if(balance < amount)
		{
			throw new Exceptions("Not enough balance");
		}
		
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + balance;
	}
}
