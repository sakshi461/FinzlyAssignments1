package bank.pojo;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {
	 public static void main(String[] args) {
	        ArrayList<Account> accounts = new ArrayList<>();
             Scanner s=new Scanner (System.in);
	       	   
	       while (true) {
	            System.out.println("\nBank Application");
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Check Balance");
	            System.out.println("5. List All Accounts");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = s.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Account Number: ");
	                    int accountNumber = s.nextInt();
	                    s.nextLine(); // Consume the newline
	                    System.out.print("Enter Account Holder's Name: ");
	                    String accountHolder = s.nextLine();
	                    System.out.print("Enter Initial Balance: ");
	                    double initialBalance = s.nextDouble();

	                    Account account = new Account(accountHolder, accountNumber, initialBalance);
	                    accounts.add(account);
	                    System.out.println("Account created successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    int depositAccountNumber = s.nextInt();
	                    System.out.print("Enter Deposit Amount: ");
	                    double depositAmount = s.nextDouble();

	                    for (Account acc : accounts) {
	                        if (acc.getAccountNumber() == depositAccountNumber) {
	                            acc.deposit(depositAmount);
	                            break;
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    int withdrawAccountNumber = s.nextInt();
	                    System.out.print("Enter Withdrawal Amount: ");
	                    double withdrawAmount = s.nextDouble();

	                    for (Account acc : accounts) {
	                        if (acc.getAccountNumber() == withdrawAccountNumber) {
	                            acc.withdraw(withdrawAmount);
	                            break;
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter Account Number: ");
	                    int balanceAccountNumber = s.nextInt();

	                    for (Account acc : accounts) {
	                        if (acc.getAccountNumber() == balanceAccountNumber) {
	                            System.out.println("Account Balance: " + acc.getBalance());
	                            break;
	                        }
	                    }
	                    break;

	                case 5:
	                    System.out.println("List of All Accounts:");
	                    for (Account acc : accounts) {
	                        System.out.println(acc);
	                    }
	                    break;

	                case 6:
	                    System.out.println("Exiting program.");
	                    s.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	      
	 
	       }
	 
	 
	 }

}
