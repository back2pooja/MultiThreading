package com.nit.thread;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("This is extends from Thread class");
	}
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		mt.run();
		System.out.println("This is the main method");
		
	}
	

}
