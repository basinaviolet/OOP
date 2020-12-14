package by.htp.homework.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import by.htp.homework.taskOOP.BankCustomerAgregator;

//import by.htp.classwork.book.Book;

public class CustomerMain {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		int blockSum = 0;
		List<String> accNumList = new ArrayList<String>();
		List<String> passportList = new ArrayList<String>();
		
		String acc1 = "211558521";
		String acc2 = "238654371";
		String acc3 = "23865437";
		
		String account[] = {acc1, acc2};
		String passport = "PU395530";
		
		for (int i = 0; i < account.length ; i++) {
			accNumList.add(account[i]);
		}
		passportList.add(passport);
		
		CustomerAggregator customerListAgr = new CustomerAggregator();
		CustomerLogic logicList = new CustomerLogic();
		CustomerView printList = new CustomerView();
		
		
		//(String accountNum, String name, String middleName, String surName, String custPassport, float accBalance, boolean accBlock)
		//newCustomer (String name, String middleName, String surName, List<String> accList, List<String> passpList, int blockLim)
		customerList.add(customerListAgr.newCustomer("Oscar", "No1", "Wilde", acc1, passportList, blockSum)); //acc1
		customerList.add(customerListAgr.newCustomer("Bram", "No", "Stoker", acc2, passport, blockSum)); //acc2 + passport
		customerList.add(customerListAgr.newCustomer("Newmark", "No", "Twain", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Mark", "No", "Twain", accNumList, passport, blockSum)); //passport
		customerList.add(customerListAgr.newCustomer("Agatha", "No", "Christie", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Jerome", "K", "Jerome", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Scott", "No", "Fitzgerald", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("George", "No", "Orwell", accNumList, passportList, blockSum));

		
			printList.print(customerList, "\nFirst preview: ");
		
		Collections.sort(customerList);
		printList.print(customerList, "\nSorted by default preview: ");
		
		Collections.sort(customerList, new BankCustomerCompAccount());
		printList.print(customerList, "\nSorted by account preview: ");
		
		
		System.out.println ("\nSerch a customer with account number: " + acc1);
		Customer customerAcc = logicList.serchByAcc (acc1, customerList);
		if (customerAcc == null) {
			System.out.print("Can`t find account: " + acc1);
		} else {
		printList.print (customerAcc, "the custimer is");
		}
		
		System.out.println ("\nSerch a customer with account number: " + acc3);
		customerAcc = logicList.serchByAcc (acc3, customerList);
		if (customerAcc == null) {
			System.out.print("Can`t find account: " + acc3);
		} else {
		printList.print (customerAcc, "changing unblock. befor: ");
		}

		float sum;
		sum = logicList.summaBal (-1, customerList); //-1 - балланc отрицательных cчетов. 
		System.out.println ("\nSum of negative account balances: " + sum);
		
		sum = logicList.summaBal (1, customerList); //-1 - балланc отрицательных cчетов. 
		System.out.println ("Sum of positive account balances: " + sum);
		
		sum = logicList.summaBal (0, customerList); //0 - балланc вcех cчетов. 
		System.out.println ("Sum of all balances: " + sum);
		
		
		System.out.println ("\n\nBlock - unblick: ");
		boolean result;
		result = logicList.block (acc1, customerList);
		if(result) {
			System.out.println("account " + acc1 + "boked");
		};	
		result = logicList.unblock (acc2, customerList);	
		if(result) {
			System.out.println("account " + acc2 + "unboked");
		};
		
		printList.print(customerList, "\nSorted after un-/ blocked: ");
}
	
}
