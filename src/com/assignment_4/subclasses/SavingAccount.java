package com.assignment_4.subclasses;
/*
 * This a subclass to supperclass BankAccount.
 */
import java.util.UUID;
import com.assignment_4.superclasses.BankAccount; //import the superclass BankAccount which this class inherit from.

public class SavingAccount extends BankAccount {
	/*
	 * The method SavingAccount that generate a 6character random UUID
	 * and set that to accountNumber and set balance to 0
	 * and accountType to Saving account.
	 */
	public SavingAccount() { //Constructor
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
