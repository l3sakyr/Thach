package a00926906;
import java.util.Random;
//************************************************************
//Account.java 
//
//A bank account class with methods to deposit to, withdraw from, 
//change the name on, and get a String representation
//of the account.
//************************************************************ 
public class Account { 
	private double balance;
	private String name;
	private long acctNum; 
	//------------------------------------------------- 
	//Constructor -- initializes balance, owner, and account number
	//------------------------------------------------- 
	public Account(double initBal, String owner, long number) { 
		balance = initBal; 
		name = owner; 
		acctNum = number; }
	public Account (double initBal, String owner) {
		Random random = new Random();
		balance = initBal;
		name = owner;
		acctNum = random.nextInt(99999999);
	}
	public Account (String owner) {
		Random random = new Random();
		balance = 0;
		name = owner;
		acctNum = random.nextInt(99999999);
	}

	//------------------------------------------------- 
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount) { 
		if (balance >= amount) 
			balance -= amount; 
		else System.out.println("Insufficient funds"); } 
	public void withdraw(double amount, double fee) {
		if (balance >= amount) {
			balance -= (amount + fee);
			}
		else System.out.println("Insufficient funds");
	}
	//-------------------------------------------------
	// Adds deposit amount to balance. 
	//------------------------------------------------- 


	public void deposit(double amount) { 
		balance += amount; } 
	//------------------------------------------------- 
	// Returns balance. 
	//------------------------------------------------- 
	public double getBalance() { 
		return balance; } 
	//------------------------------------------------- 
	// Returns a string containing the name, account number, and balance. 
	//------------------------------------------------- 
	public String toString() { 
		return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance; } 
} 