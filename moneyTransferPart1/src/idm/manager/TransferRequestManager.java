package idm.manager;

import java.util.ArrayList;

import idm.entities.Account;

public interface TransferRequestManager {
 
//	public boolean getVelocity(Persons persons, String amount);
	
	public void transferResult(String credit,String debit,double amount,ArrayList<Account> accounts);
}
