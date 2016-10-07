package com.assignment_4.subclasses;
/**
 * This is a subclass to superclass Human.
 */

import com.assignment_4.superclasses.Human; //Calling the superclass that this class inherit from.
import com.assignment_4.superclasses.BankAccount; //calling the super class that this class inherit from.
import java.util.ArrayList; //Calling arrayList class

public class BankCustomer extends Human{
	//Attribute which instantiate new ArrayList
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	/**
	 * The method BankCustomer that get
	 * String name and int Age and calls the superclass.
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	/**
	 * Getters and setters to the attribute.
	 * @return : customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccount(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	//Adds variable bankAccount to the ArrayList
	public void addAccount(BankAccount bankAccount){
		customerAccounts.add(bankAccount);
	}
	/**
	 * This method gets accountNumber and amount and deposit
	 * the amount to that accountNumber.
	 */
	public void depositToAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){ //Loop continue to the length of arrayList
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){ 
				/**
				 * Controls which element of the array has the same accoutNumber
				 * and deposit the amount to that account.
				 */
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	/**
	 * This method gets accountNumber and amount and withdraw
	 * the amount from that accountNumber.
	 */
	public void withdrawFromAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			/**
			 * Controls which element of the array has the same accoutNumber
			 * and deposit the amount to that account. 
			 */
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
/**
 * Method toString that returns below information.
 */
	public String toString() {
		return "Customer: " + getName() + " Age: " + getAge()+ "\n" 
				+ customerAccounts.get(0)+"\n" + customerAccounts.get(1) + "\n" + customerAccounts.get(2) + "\n";
	}

	
	
}
