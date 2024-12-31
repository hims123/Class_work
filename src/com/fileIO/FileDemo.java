package com.fileIO;

import java.io.File;
import java.io.IOException;

class Fdemo{
	
	File f1;
	public Fdemo() {
		// TODO Auto-generated constructor stub
		f1 = new File("file3.txt");
		
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			Display(); 
	}
	
	public void Display() {
		
		System.out.println("check if it is file or not : "+f1.isFile());
		System.out.println("check if it is Directory or not : "+f1.isDirectory());
		System.out.println("check if it can read or not : "+f1.canRead());
		System.out.println("check if it can write or not : "+f1.canWrite());
		System.out.println("check if it can exicute or not : "+f1.canExecute());
		System.out.println("File name : "+f1.getName());
		System.out.println("File path : "+f1.getPath());
		System.out.println("File absolute path : "+f1.getAbsolutePath());
		
		
	}
	
}

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Fdemo();
	}

}
