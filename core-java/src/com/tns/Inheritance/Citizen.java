package com.tns.Inheritance;
//demonstrate single inheritance
public class Citizen {
	private String name;
	private int adharno;
	private String address;
	private int phno;
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", address=" + address + ", phno=" + phno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public Citizen() {
		super();
	}
	public Citizen(String name, int adharno, String address, int phno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phno = phno;
	}
	
	
	}
	