package com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



class Demo{
	
	public static void main(String[] args) {


		List<Student> nitList = Arrays.asList(
				new Student("S1",1000,78,87,66,"NIT"),
				new Student("S2",1001,18,87,66,"NIT"),
				new Student("S3",1002,78,7,66,"NIT"),
				new Student("S4",1003,48,99,66,"NIT"),
				new Student("S5",1004,88,87,99,"NIT")
				);
		List<Student> necList = Arrays.asList(
				new Student("S1",1000,78,87,66,"NEC"),
				new Student("S2",1001,18,87,66,"NEC"),
				new Student("S3",1002,78,7,66,"NEC"),
				new Student("S4",1003,48,99,66,"NEC"),
				new Student("S5",1004,88,87,99,"NEC")
				);
		
		List<List> uniList = new ArrayList<List>();
		
		uniList.add(nitList);
		uniList.add(necList);
		
		for(int i=0;i<uniList.size();i++) {
			List collegeList = uniList.get(i);
			
			for(int j=0;j<collegeList.size();j++) {
				System.out.println(collegeList.get(j));
			}
			
		}
		
		
	}
}