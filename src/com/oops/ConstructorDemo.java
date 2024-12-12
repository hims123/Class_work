package com.oops;


class Box{
	double length,width,depth;
	
	public Box()
	{
		System.out.println("In Dedfault constructor");
		length = 1;
		width = 2;
		depth = 3;
	}
	
	public Box(double l,double w,double d)
	{
		System.out.println("In parameterized constructor");
		length = l;
		width = w;
		depth = d;
	}
	
	public Box(Box b)
	{
		System.out.println("In Copy constructor");
		length = b.length;
		width = b.width;
		depth = b.depth;
	}
	
	public void volOfBox() {
		
		System.out.println("the volume of box is : "+(length*width*depth));
	}
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Box dc = new Box();
		dc.volOfBox();
		Box pc = new Box(10, 20, 30);
		pc.volOfBox();
		Box cc = new Box(pc);
		cc.volOfBox();
		
	}

	/*private static Box Box() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
