package idm.entities;

import java.util.ArrayList;

public class Account {

	private Persons persons;
	private String accountNumber;
	private String displayAccountNumber;
	private double currentBalance;
		
	
	public Account() {}
	public Account(Persons persons, String accountNumber, String displayAccountNumber, double currentBalance) {
		super();
		this.persons = persons;
		this.accountNumber = accountNumber;
		this.displayAccountNumber = displayAccountNumber;
		this.currentBalance = currentBalance;
	}
	public Persons getPersons() {
		return persons;
	}
	public void setPersons(Persons persons) {
		this.persons = persons;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDisplayAccountNumber() {
		return displayAccountNumber;
	}
	public void setDisplayAccountNumber(String displayAccountNumber) {
		this.displayAccountNumber = displayAccountNumber;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public ArrayList<Account> init() {
		ArrayList<Account> accounts = new ArrayList<Account>();
		Persons persons = new Persons();

		for(Persons persons2 : persons.init()) {
			Account account = new Account(persons2,persons2.getNumBerPhone() , "Disp-"+persons2.getNumBerPhone(), 1000.00);
			accounts.add(account);
		}
		
 
		return accounts;
	}
	
}
