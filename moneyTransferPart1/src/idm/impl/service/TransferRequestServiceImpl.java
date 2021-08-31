package idm.impl.service;

import idm.entities.Account;
import idm.impl.manager.TransferRequestManagerImpl;
import idm.manager.TransferRequestManager;
import idm.service.TransferRequestService;

public class TransferRequestServiceImpl implements TransferRequestService {

 	@Override
	public void transfer(double amount, String description, String debit, String credit) {

 		TransferRequestManager transferRequestManager = new TransferRequestManagerImpl();
 		Account accounts = new Account();
 		transferRequestManager.transferResult(credit, debit, amount,accounts.init());
	}}
