package com.tns.Abstraction;

public class Square extends Shape{
private float side;

	


	public Square() {
	super();
	// TODO Auto-generated constructor stub
	side=2.0f;
}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	

}
