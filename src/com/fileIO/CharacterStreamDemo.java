package com.fileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("file2.txt",true);
			String str = "\n hi there....";
			fw.write(str);
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("file2.txt");
			int x;
			while ((x=fr.read())!=-1) {
				System.out.print((char)x);
			}
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
