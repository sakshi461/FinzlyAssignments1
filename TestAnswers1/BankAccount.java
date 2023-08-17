package com.javabysakshi.TestAnswers1;

class BankAccount {
		private int  accountNumber;
		private double balance;
		private String ownerName;
		
		public BankAccount(int accountNumber, double balance, String ownerName) {
			//super();
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.ownerName = ownerName;
		}
		
		
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
	public void deposit(double amount)
	{
		if(amount>=0)
		{
		balance+=amount;
		System.out.println("Deposit successful");
		}
		else
		{
			System.out.println("Invalid amount entered");
		}
	}
	
	public void withdraw(double amount)
	{
	if(amount<=balance  && balance>0)
	{
		balance-=amount;
		System.out.println("withdraw successful-------------->"+"Amount withdrawn is "+amount);
	}
	else
	{
		System.out.println("cannot withdraw insufficient amount entered!!!!!!!!!!");
	}
	}
	public void getBalanceDetails()
	{
		System.out.println("Your Balance is   "+getBalance());
	}
	
}
