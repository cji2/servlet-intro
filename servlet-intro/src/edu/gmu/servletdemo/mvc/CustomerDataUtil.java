package edu.gmu.servletdemo.mvc;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataUtil {
	
	public static List<Customer> getCustomers() {
		
		// create an empty list.
		List<Customer> customers = new ArrayList<>();
		
		// add sample data.
		customers.add(new Customer("Abraham", "Kim", "akim@gmail.com"));
		customers.add(new Customer("Issac", "Lee", "ilee@gmail.com"));
		customers.add(new Customer("David", "Ji", "dji@gmail.com"));
		
		// return the list
		return customers;
	}
}
