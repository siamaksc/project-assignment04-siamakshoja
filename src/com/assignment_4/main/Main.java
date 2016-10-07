package com.assignment_4.main;

import com.assignment_4.subclasses.*; //impports all subclasses
import com.assignment_4.superclasses.BankAccount; //import the superclass

public class Main {
	public static void main(String[] args) {
		String account = "";
		//instantiate bc from BAnkCustomer and put name and age in it.
		BankCustomer bc = new BankCustomer("Rafael", 30);
		//adds three accountTypes to the ArrayList using addAccount method.
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString()); //prints initial information for all accounts. 
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber(); //gets the first accountNumber from arrayList
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0); //Deposit the amount to that account number
		System.out.println(bc.toString());  //Prints all information
		
		System.out.println("Withdrawing 200.0 of the second account"); //gets the second accountNumber from arrayList
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);  //Deposit the amount to that account number
		System.out.println(bc.toString());  //Prints all information.
		
		System.out.println("Depositing 200.0 to the third account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();  //gets the third accountNumber from arrayList
		bc.depositToAccount(account, 200.0);  //Deposit the amount to that account number
		System.out.println(bc.toString());
	}
}
