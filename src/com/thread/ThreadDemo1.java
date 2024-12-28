package com.thread;

/*
 * life cycle
 * 
 * 		newborn
 * 		rannable
 * 		running
 * 		block
 * 		dead
 * 
 * 	class ==> extend Thread
 * 	interface ==> implements Runnable
 */

class t1 extends Thread{
	
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("This is class T1 Thread");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		t1 t11 = new t1();
		t11.start();
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("This is Main class Thread");
			Thread.sleep(1000);
		}
	}

}
