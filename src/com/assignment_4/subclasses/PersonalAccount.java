package com.assignment_4.subclasses;
/**
 * This is a subclass to superclass BankAccount.
 */

import java.util.UUID;//importing the class UUID
import com.assignment_4.superclasses.BankAccount; //importing the superclass, since this class inherit from the superclass.
/**
 * The method PersonalAccount that generate a 6character random UUID
 * and set that to accountNumber and set balance to 0
 * and accountType to PersonalAccount.
 */
public class PersonalAccount extends BankAccount {

	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}