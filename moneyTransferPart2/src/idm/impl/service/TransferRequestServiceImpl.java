package idm.impl.service;

import java.util.Random;

import idm.entities.Account;
import idm.entities.GenerateOtp;
import idm.impl.manager.TransferRequestManagerImpl;
import idm.manager.TransferRequestManager;
import idm.service.TransferRequestService;

public class TransferRequestServiceImpl implements TransferRequestService {

	GenerateOtp generateOtp = new GenerateOtp();
 	@Override
	public void transfer(double amount, String description, String debit, String credit) {

 		TransferRequestManager transferRequestManager = new TransferRequestManagerImpl();
 		String otp = generatedOtp(debit, amount);
 		generateOtp.setOtp(otp);
 		Account accounts = new Account();
 		for(Account account : accounts.init()) {
			if(account.getAccountNumber().equals(credit)) generateOtp.setPersons(account.getPersons());

		}
 		 		
 		System.out.println("Voous balalalal votre code de confirmation est : "+otp+" relatif au transfer de "+amount);
 		try {
			transferRequestManager.transferResult(credit, debit, amount,accounts.init(),generateOtp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 	
 	public String generatedOtp(String debit, double amount) {
 		Random random = new Random();
 		  char[] CHARSET_AZ_09 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
 		    char[] result = new char[6];
 		    for (int i = 0; i < result.length; i++) {
 		        int randomCharIndex = random.nextInt(CHARSET_AZ_09.length);
 		        result[i] = CHARSET_AZ_09[randomCharIndex];
 		    }
 		return new String(result);
 	}

}
