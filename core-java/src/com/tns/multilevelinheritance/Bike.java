package com.tns.multilevelinheritance;

public class Bike {
	private String companyname;
//set getters and setters
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
//to string function

	@Override
	public String toString() {
		return "Bike [companyname=" + companyname + "]";
	}
	
	
	
}
