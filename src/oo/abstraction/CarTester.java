package oo.abstraction;

import oo.test.Member;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA", "ALTIS", 1800);
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA", "WISH", 2000);
		Member member = new Member();
//		member.
		
		int[] n = new int[5];
		System.out.println(n[2]);

		Car[] cars = new Car[3];

		System.out.println(cars[0]);

		cars[0] = new Car("TOYOTA", "ALTIS", 1800);
		cars[1] = new Car("HONDA", "ACCORD", 2000);
		cars[2] = new Car("TOYOTA", "WISH", 2000);
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[0].name);
		int i=0;
		for (i=0; i<3; i++){
			System.out.println(cars[i].name);
			int x = 0;
		}
		System.out.println(i);
		for (i=1; i<=9; i=i+2){
			System.out.println(i);
		}
		System.out.println(i);
		
		class AA{
			
		}
		AA a = new AA();
		
	}
	
}
