package com.nit;


class Employee{
	int id;
	String name;
	String org;
	int sal;
	String dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String org, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.org = org;
		this.sal = sal;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee setName(String name) {
		this.name = name;
		
		return this;
	}
	public String getOrg() {
		return org;
	}
	public Employee  setOrg(String org) {
		this.org = org;
		
		return this;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", org=" + org + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
	
	
}

public class Test {

	public static void main(String[] args) {
		
		/// axios.get("http://loca").then()
		// Builder Pattren
	
		//int id, String name, String org, int sal, String dept
		Employee e1 = new Employee(100,"Ramu","IBM",35000,"IT");
		
		Employee e2 = new Employee();
		
		e2.setName("Abdul").setOrg("HP").setId(120);
		
		
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
