package com.tns.Inheritance;

public class Student extends Citizen{
	
    private int rollno;
    private String collegename;
   
    public Student() {
		super();
    }
    
		
	public Student(String name, int adharno, String address, int phno) {
		super(name, adharno, address, phno);
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.collegename = collegename;
		
	}

	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}


	//@Override
	//public String toString() {
	//	return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	//}
	
    
    
}
