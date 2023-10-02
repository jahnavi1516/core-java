package com.tns.multilevelinheritance;

public class Bullet extends Bike{
	private String modelname;
//set getters and setters
	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
//to string function

	@Override
	public String toString() {
		return "Bullet [modelname=" + modelname + "]";
	}
	
}
