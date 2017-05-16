package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list =
				new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SilverCustomer(1000));
		list.add(new Customer(6000));
		for (int i=0; i<list.size(); i++){
			Customer cust = list.get(i);
			cust.print();
		}
	}
}
