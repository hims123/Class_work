package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// to create and open file
			FileOutputStream fos = new FileOutputStream("file1.txt",true);
			String str = "\n This is Himanshu Patel from Tops...";
			byte[] b1 = str.getBytes();
			//to write data into file
			fos.write(b1);
			//to flush object
			fos.flush();
			//to close file
			System.out.println("Data is Written...");
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
			int x;
			while ((x=fis.read())!=-1) {
				
				System.out.print((char)x);
				
			}
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
