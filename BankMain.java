package com.javabysakshi.AbstractionHw;

public class BankMain {
public static void main(String[] args) {
	SavingAcccount s =new SavingAcccount("saving aacount1","sakshi patel",1234566,0.5);
	s.deposit(12300);
	s.withdraw(12000);
	System.out.println("Account holder Name --->"+s.getAccountHolderName());
	System.out.println("Account Number      --->"+s.getAccountNumber());
	System.out.println("Remaining Balance   --->"+s.getBalance());
	
	System.out.println();
	System.out.println();
	CheckingAccount c=new CheckingAccount("Check account 1","RANI",14000,10000);
	c.deposit(120000);
	c.getAccountHolderName();
	c.getBalance();
	c.withdraw(1200000);
	System.out.println("Account holder Name --->"+c.getAccountHolderName());
	System.out.println("Account Number      --->"+c.getAccountNumber());
	System.out.println("Remaining Balance   --->"+c.getBalance());
	
	

}
}
