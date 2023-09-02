package bank.pojo;

public class Account {
private String AccountHolder;
private int accountNumber;
private  double Initialbalance;
public Account()
{
	
}
public Account(String accountHolder, int accountNumber, double balance) {
	super();
	AccountHolder = accountHolder;
	this.accountNumber = accountNumber;
	this.Initialbalance = balance;
}
public String getAccountHolder() {
	return AccountHolder;
}
public void setAccountHolder(String accountHolder) {
	AccountHolder = accountHolder;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return Initialbalance;
}
public void setBalance(double balance) {
	this.Initialbalance = balance;
}
public void deposit(double amount) {
	if(amount>0)
	{
		Initialbalance+=amount;
		System.out.println("Deposit of "+amount+" is successful");
	}
	else {
	System.out.println("Invalid Amount entered   !!!!!!!!" );
	}
}
public void withdraw(double amount) {
	if(Initialbalance>0&&amount<=Initialbalance)
	{
		Initialbalance-=amount;
		System.out.println("withdraw of "+amount+"is successfull");
	}
	else
	{
		System.out.println("Not enough balance exists for withdraw");
	}
}
@Override
public String toString() {
	return "Account [AccountHolder=" + AccountHolder + ", accountNumber=" + accountNumber + ", balance=" + Initialbalance
			+ "]";
}

}
