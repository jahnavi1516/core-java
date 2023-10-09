package com.tns.MarkerInterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"geeta");
		if(s instanceof Regestarable)
			System.out.println("student regestarable");
		else
			System.out.println("student Not regestarable");
			
	}

}