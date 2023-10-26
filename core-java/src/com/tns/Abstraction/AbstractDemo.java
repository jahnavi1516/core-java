package com.tns.Abstraction;

	public class  AbstractDemo {
		public float volume(float s) {
			return s*s*s;
		}
		public int volume(int l,int b,int h) {
			return l*b*h;
					
			}
		public double volume(double r) {
			return (4/3)*3.14*r*r;
		}
		public static void main (String[] agrs) {
			AbstractDemo a=new AbstractDemo();
			System.out.println("volume of cube:"+a.volume(5.0f));
			System.out.println("volume of cuboid:"+a.volume(5,2,3));
			System.out.println("volume of sphere:"+a.volume(4));
			
			
		}

		

	}


