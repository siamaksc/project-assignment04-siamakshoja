package com.assignment_4.superclasses;

import java.util.UUID; //imports the UUID
import com.assignment_4.interfaces.BankOperations; //imports BnkOperation interface,since this class implement the interface. 

public class BankAccount implements BankOperations {
	//Below are the attributes.
	private String accountNumber;
	private String accountType;
	private double balance;
	
	/* This constructor takes no parameter.
	 *It generates a random UUID with 6 characters.
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}
	//Getters and setters to the attributes for this class.
	public String getAccountNumber() {
	return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*
	 * This method controls if the amount that is going to be
	 * withdrawn is not negative value.
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() - amount); //or setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
	}
	/*
	 * This method controls if the amount that is going to be
	 * deposited is not negative value and prints a message if it is.
	 */
	public void depositMoney(double amount) {
		if (amount>=0){
		setBalance(getBalance() + amount);//The amount will be added to the balance and will be set to new balance.
		}else{
			System.out.println("You cannot deposit a negative value!");
		}
	}
	//Method toString which returns the information below.
	public String toString(){
		return "BankAccount [accountNumber = "+ getAccountNumber()+ ", Balance = " + getBalance()+ " , AccountType = " + getAccountType()+"]";
	}

}
