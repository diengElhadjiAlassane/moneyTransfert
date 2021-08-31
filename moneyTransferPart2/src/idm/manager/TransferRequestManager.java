package idm.manager;

import java.util.ArrayList;

import idm.entities.Account;
import idm.entities.GenerateOtp;

public interface TransferRequestManager {
 
//	public boolean getVelocity(Persons persons, String amount);
	
	public void transferResult(String credit,String debit,double amount,ArrayList<Account> accounts,GenerateOtp generateOtp)  throws Exception ;
}
