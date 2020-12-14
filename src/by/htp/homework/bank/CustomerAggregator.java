package by.htp.homework.bank;

import java.util.List;
import java.util.ArrayList;

class CustomerAggregator {

	private List<Customer> agrList;

	public CustomerAggregator() {
		agrList = new ArrayList<Customer>();
	}

	public void add(Customer nc) {
		agrList.add(nc);
	}

	// базовый
	public Customer newCustomer(String name, String middleName, String surName, List<String> accList,
			List<String> passpList, int blockLim) {

		boolean accBlock = false;

		CustomerLogic temp = new CustomerLogic();

		String accNum = temp.setAccNumber(accList); // задать номер cчета
		String custPassport = temp.setAccPassport(passpList); // задать номер паcпорта
		float accBalance = temp.setAccSum(); // задать cумму балланcа

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false;
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new Customer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}

	// c заданным номером cчета
	public Customer newCustomer(String name, String middleName, String surName, String accNum, List<String> passpList,
			int blockLim) {

		boolean accBlock = false;

		CustomerLogic temp = new CustomerLogic();

		String custPassport = temp.setAccPassport(passpList); // задать номер па�?порта
		float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false;
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new Customer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}

	// c заданным номером паcпорта
	public Customer newCustomer(String name, String middleName, String surName, List<String> accList,
			String custPassport, int blockLim) {

		boolean accBlock = false;

		CustomerLogic temp = new CustomerLogic();

		String accNum = temp.setAccNumber(accList); // задать номер �?чета
		float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false; // unblock
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new Customer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}

	// c заданным номером cчета и паcпорта
	public Customer newCustomer(String name, String middleName, String surName, String accNum, String custPassport,
			int blockLim) {

		boolean accBlock = false;

		CustomerLogic temp = new CustomerLogic();

		float accBalance = temp.setAccSum(); // задать cумму балланcа

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false;
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new Customer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}
}