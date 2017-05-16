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
//		for (int i=0; i<list.size(); i++){
//			Customer cust = list.get(i);
		for (Customer cust : list){
			if (cust instanceof SilverCustomer &&
					!(cust instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cust;
			}
			cust.print();
		}
		
		String[] array = {"aa","bb","cc"};
		for (String s : array){
			System.out.println(s);
		}
		for (int i=0; i<array.length; i++){
			String s = array[i];
			System.out.println(s);
		}
	}
}
