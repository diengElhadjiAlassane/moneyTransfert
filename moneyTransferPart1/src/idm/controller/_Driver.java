package idm.controller;

import java.util.Scanner;

import idm.impl.service.TransferRequestServiceImpl;
import idm.service.TransferRequestService;

public class _Driver {

	public static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
 
		TransferRequestService transferRequestService = new TransferRequestServiceImpl();	
		
		System.out.println("entrée le montant : ");
		double amount = scanner.nextInt();
		
		System.out.println("Numeros D'envoie : ");
		String sender = scanner.nextLine();
		
		System.out.println("Numeros De reception : ");
		String sending= scanner.nextLine();
				
		System.out.println("Commentaire : ");
		String description = scanner.nextLine();
		
		
//		transferRequestService.transfer(900.00, "Test de transfer","771235678","771235679");
		
		transferRequestService.transfer(amount, description,sender,sending);

 	}
}
