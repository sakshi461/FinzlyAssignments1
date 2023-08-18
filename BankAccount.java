package com.javabysakshi.AbstractionHw;

public abstract class BankAccount {
protected String accountNumber;
protected String accountHolderName;
protected double balance;

 public BankAccount(String accountNumber, String accountHolderName, double balance) {
	//super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public abstract String getAccountNumber();
 public abstract String getAccountHolderName();
 public abstract double getBalance();
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
}
