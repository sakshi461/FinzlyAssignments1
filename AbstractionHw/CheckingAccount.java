package com.javabysakshi.AbstractionHw;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit;
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(String accountName,String accountHolderNumber ,double balance, double overdraftLimit) {
		super(accountName, accountHolderNumber,balance);
        this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getAccountNumber() {
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
			System.out.println("deposit of  "+amount+" is successfull!!!!");

			
		}
		else
		{
			System.out.println("Invalid amount entered!!!!!");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>balance)
		{
			overdraftLimit = amount - balance;
			System.out.println("Your account has "+balance+" Rs. So you are overdrafting "+overdraftLimit+" Rs from the your account!!");
		    this.setOverdraftLimit(overdraftLimit);	
			balance = 0;
			this.setBalance(balance);
			System.out.println(amount+" Rs is withdraw from your account . Now Your account has "+balance+" in your account.");
			
		}
		else if(amount<balance)
		{
			balance -= amount;
			this.setBalance(balance);
			System.out.println(amount+ " Rs is withraw from your account.");
		}
				
	}
	public void displayDetails()
	{
		System.out.println(accountHolderName+ ", Account Number- "+ accountNumber +", Your current balance is- "+balance);
	}

  
}
