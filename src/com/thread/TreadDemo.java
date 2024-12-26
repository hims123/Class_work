package com.thread;

class FirstThread extends Thread{
	
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class TreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirstThread ft= new FirstThread();
		ft.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Main Thread");
			Thread.sleep(2000);
			
		}
		
	}

}
