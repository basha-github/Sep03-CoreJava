package com.nit;

class Student{
	String name;
	int rollNo;
	int maths;
	int sci;
	int eng;
	String college;
	public Student(String name, int rollNo, int maths, int sci, int eng,
			String college) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.college = college;
	}
	
	
	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", maths=" + maths + ", sci=" + sci + ", eng=" + eng
				+ ", college=" + college + "]";
	}
	
	
	
	
	
	
}

