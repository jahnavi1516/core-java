package com.tns.programs;

public class person {
	private String name;
	private int income;
	private int tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}
}
