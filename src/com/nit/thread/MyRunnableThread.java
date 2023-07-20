package com.nit.thread;

public class MyRunnableThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Executing runnable thread in run method. ");
	}
	public static void main(String[] args) {
		MyRunnableThread mrt = new MyRunnableThread();
		
		Thread t1 = new Thread(mrt);
		t1.start();
		System.out.println("This is main method.");
		System.out.println();
		
	}

}
