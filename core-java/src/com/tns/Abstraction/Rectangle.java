package com.tns.Abstraction;

public class Rectangle extends Shape {
	private float width,height;

		



		public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		this.width=4.5f;
		this.height=5.6f;
	}


		


		public Rectangle(float width, float height) {
			super();
			this.width = width;
			this.height = height;
		}





		void calArea() {
			// TODO Auto-generated method stud
		super.area=width*height;	
		}
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}

	}