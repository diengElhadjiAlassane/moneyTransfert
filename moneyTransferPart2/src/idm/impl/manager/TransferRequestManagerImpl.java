package idm.impl.manager;

import java.util.ArrayList;
import java.util.Scanner;

import idm.entities.Account;
import idm.entities.GenerateOtp;
import idm.manager.TransferRequestManager;

public class TransferRequestManagerImpl implements TransferRequestManager {

 Scanner sc = new Scanner(System.in);
	
	@Override
	public void transferResult(String credit,String debit, double amount,ArrayList<Account> accounts,GenerateOtp generateOtp) throws Exception {
 		
		//check velocity
		try {
			getVelocity(debit, amount, accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//check Otp		
		System.out.println("enntrez l'otp");
		String otp = sc.nextLine();
		
		if(generateOtp.getOtp().equals(otp) && generateOtp.getPersons().getId()==1) {
			//make transfer

			Account accountDebit = new Account() ;
			Account accountCredit = new Account() ;

			for(Account account : accounts) {
				if(account.getAccountNumber().equals(debit)) accountDebit = account;
				if(account.getAccountNumber().equals(credit)) accountCredit = account;

			}
			enrichTransaction(amount, accountDebit, accountCredit);
		}
		
		
		
	}
	
	public boolean getVelocity(String debitAccountNumber, double amount,ArrayList<Account> accounts) throws Exception {
				
		for(Account account : accounts ) {
			if(debitAccountNumber.equals(account.getAccountNumber())) {
				if(amount > account.getCurrentBalance()) {
					throw new Exception("Le montant saisie est sup a votre balance actuelle ");
				}
			}
		}
		
		return true;
	}
	
	public void enrichTransaction(double amount , Account debit ,Account credit) {
		 
		Account accountToDebit = new Account(debit.getPersons(),
											debit.getAccountNumber(),
											debit.getDisplayAccountNumber(),
											debit.getCurrentBalance()-amount); // avec le calcul des banque ignorer
		Account accountToCredit = new Account(credit.getPersons(),
											credit.getAccountNumber(),
											credit.getDisplayAccountNumber(),
											credit.getCurrentBalance()+amount); // avec le calcul des banque ignorer

		 System.out.println("Success");

		
	}

}
