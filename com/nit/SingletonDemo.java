package com.nit;



public class SingletonDemo{
	
	private static SingletonDemo obj = null;
	
	
	private static int num =0;
	
	
	private SingletonDemo(){
		
	}
	
	public static SingletonDemo createObj(int max){
		
		if(num < max) {// num < 3
			 obj = new SingletonDemo();
			 num++;
		}
		
		return obj;
	}
	
	
	
}