package com.tns.ThreadPrograms;

public class CreateThread extends Thread {
	public void run() {
    	System.out.println("hi");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread t=new CreateThread();
		t.start();
		t.run();
	
	}

}
