package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {
	
	public static void main(String[] args) {
		
		//ABSOLUTE PATH
		File file = new File("C:/Users/ASUS/Desktop/WEWA7/JAVASCRIPT/Demo2.java");
		try {
			file.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File is not Created");
		}
	}

}
