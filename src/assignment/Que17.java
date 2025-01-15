package assignment;

/*
 * 	WAP to create one thread by implementing Runnable interface in Class.
 */

class Rundemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is runable Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Que17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Rundemo rd = new Rundemo();
		Thread td = new Thread(rd);
		
		td.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Main Thread");
			Thread.sleep(2000);
			
		}
		
	}

}
