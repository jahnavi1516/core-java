package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee("janu",28);
		System.out.println(ob);
		Employee companyName;// accessing the static variable using classname
		ob=new Employee("ramya",29);
		System.out.println(ob);


	}

}
