package com.nit;

public class SingletonTest {

	public static void main(String[] args) {
	
		
		SingletonDemo obj1 = SingletonDemo.createObj(3);

		SingletonDemo obj2 = SingletonDemo.createObj(3);
		SingletonDemo obj3 = SingletonDemo.createObj(3);
		SingletonDemo obj4 = SingletonDemo.createObj(3);
		
		
		
		if(obj3 == obj4) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal...");
		}
	}

}
