package by.htp.homework.bank;

import java.util.List;

public class CustomerView {
	public void print(List<Customer> customerList, String str) {
		System.out.println(str);
		for (Customer s : customerList) {
			System.out.println(s);
		}
	}
	
	public void print(Customer customer, String str) {
		System.out.println(str);
			System.out.println(customer);		
	}

}
