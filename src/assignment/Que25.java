package assignment;
/*
 * 	W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name
	'message' that prints "This is first subclass" and "This is second subclass" respectively.
	Call the methods 'message' by creating an object for each subclass.

 */

abstract class Parent{
	
	abstract void message();
}

class sub1 extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass.");
	}
	
}

class sub2 extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass.");
	}
	
}


public class Que25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Parent parent = new Parent() {
			
			@Override
			void message() {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		Parent p1 = new sub1();
		p1.message();
		
		Parent p2 = new sub2();
		p2.message();
		
	}

}
