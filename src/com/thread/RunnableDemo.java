package com.thread;

class SecondThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Second Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public interface RunnableDemo {
public static void main(String[] args) throws InterruptedException {
	
	SecondThread st= new SecondThread();
	Thread th= new Thread(st);
	
	th.start();
	
	for (int i = 1; i <=5; i++) {
		System.out.println("This is Main Thread");
		Thread.sleep(2000);
		
	}
	
}
}
