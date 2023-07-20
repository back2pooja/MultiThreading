package com.nit.thread;

public class MyRunnablePrintNumber  implements Runnable {
	@Override
	public void run() {
		for(int i=20;i>=20;i--) {
			System.out.println("run: "+i);
		}
		
	}
	

}
class Test02_MyRunnable{
	public static void main(String[] args) {
		MyRunnablePrintNumber rpn = new MyRunnablePrintNumber();
		Thread th = new Thread(rpn);
		th.start();
		for(int i=1;i<=20;i++) {
			System.out.println("main: "+i);
		}
		
		
	}
}
