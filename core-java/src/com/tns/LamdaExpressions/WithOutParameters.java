package com.tns.LamdaExpressions;

public class WithOutParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m=() -> {return "hello ! how are you";};
		System.out.println(m.greet());

	}

}
