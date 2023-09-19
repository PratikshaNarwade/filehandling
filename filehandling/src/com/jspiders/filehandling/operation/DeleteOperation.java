package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class DeleteOperation {
	public static void main(String[] args) throws IOException {
	File file = new File("Demo.txt");
	if(file.exists()) {
		System.out.println("File found");
		file.delete();
		System.out.println("File Deleted");
	}else {
		file.createNewFile();
		System.out.println("File Created");
		file.delete();
		System.out.println("File Deleted");
		}
	}
}
