package assignment;
/*
 * 	WAP to create one thread by extending Thread class in another class.

 */


class t2 extends Thread{
	
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

public class Que18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		t2 t11 = new t2();
		t11.start();
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("This is Main class Thread");
			Thread.sleep(1000);
		}
		
	}

}
