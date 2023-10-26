package com.tns.exception;
//program to demonstrate nested try block
public class NestedTry {
	public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("the length of string is"+ slength);
	String anotherstring="hello";
	int y=6;
	try {//outer try
		int z=y/0;//exception occurs
		try {//inner try
			System.out.println(str.charAt(y));//exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {//inner catch
			System.out.println("Indexout of bound"+ex.getMessage());
		}
	}
		catch(ArithmeticException ex) {//inner catch
			System.out.println("Arithmetic exception"+ex.getMessage());
	}
	
	}


}

	
