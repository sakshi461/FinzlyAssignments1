package com.javabysakshi.TestAnswers1;

public class BankMain {
	
	 public static void main(String[] args) {
			
		
		 BankAccount a=new BankAccount(12345,20000,"SAKSHI");
		 a.deposit(200.00);
		 a.getBalanceDetails();
		 
		 BankAccount a1=new BankAccount(1234556,2500000,"Rani");
		 a.deposit(200000.00);
		 a.withdraw(50000);
		 a.getBalanceDetails();
		 
		 }
	 }


