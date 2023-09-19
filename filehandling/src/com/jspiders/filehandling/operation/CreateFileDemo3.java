package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo3 {
	
	public static void main(String[] args) {
		
		File file = new File("Demo3.txt");
		if(file.exists()) {
			System.out.println("File Already Exists");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File is Created");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("File is not Created");
			}
		}
		
	}

}

//IOEXCEPTION OCCURS:because given path is not exist in the system
