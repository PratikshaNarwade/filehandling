package com.jspiders.filehandling.operation;

import java.io.File;

public class FileInfo {
	
	public static void main(String[] args) {
		
		File file = new File("CharStreamWrite.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		if(file.canRead()) {
			System.out.println("File is Readable.");
		}
		if(file.canWrite()) {
			System.out.println("File is Writable.");
		}
		if(file.canExecute()) {
			System.out.println("File is Executable.");
		}
	}
	

}
