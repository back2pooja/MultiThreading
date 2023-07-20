package com.nit.thread;

public class MyPrintNumberThread  extends Thread{
	
	@Override
	public void run() {
		for(int i=20;i>=1;i--) {
			System.out.println("run"+i);
		}
	}

}
class Test01_Assignment{
	public static void main(String[] args) {
		
		MyPrintNumberThread pnt = new MyPrintNumberThread();
		Thread th = new Thread(pnt);
		th.start();
		for(int j=1;j<=20; j++) {
			System.out.println("main"+j);
		}
		
		
	}
}
