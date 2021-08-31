package idm.impl.manager;

import java.util.ArrayList;

import idm.entities.Account;
import idm.entities.Persons;
import idm.manager.TransferRequestManager;

public class TransferRequestManagerImpl implements TransferRequestManager {


	
	@Override
	public void transferResult(String credit,String debit, double amount,ArrayList<Account> accounts) {
 		
		//check velocity
		try {
			getVelocity(debit, amount, accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//check Otp		
		
		
		//make transfer
		
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
		
		
	}

}
