package com.javabysakshi.AbstractionHw;

public class SavingAcccount extends BankAccount {
private double interestRate;

public SavingAcccount(String accountName,String accountHolderNumber ,double balance,double interestRate) {
	super(accountName, accountHolderNumber,balance);
	this.setInterestRate(interestRate);
}
@Override
public String getAccountNumber() {
	//System.out.println();
	return accountNumber;
}

@Override
public String getAccountHolderName() {
return accountHolderName;	
}


@Override
public double getBalance() {
	return balance;
}

@Override
public void deposit(double amount) {
	if(amount>0)
	{
		balance=balance+amount;
		System.out.println("deposit of"+amount+" is successfull!!!!");

	}
	else
	{
		System.out.println("Invalid amount entered!!!!!");
	}
	
}
@Override
public void withdraw(double amount) {
	// TODO Auto-generated method stub
	if(amount>0&&amount<=balance)
	{
		balance=balance-amount;
		System.out.println("withdraw of"+amount+" is successfull!!!!");
	}
	else
	{
		System.out.println("Invalid amount entered!!!!!");
	}
}
public double getInterestRate() {
	return interestRate;
}
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}
}
