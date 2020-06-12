package fileHandling;

import java.io.*;

public class DirectoryExample {

	public static void main(String[] args) {
		boolean dirFlag = false;

		// create File object
		File stockDir = new File("f://Stocke/stockDire");

		try {
			dirFlag = stockDir.mkdirs();
		} catch (SecurityException Se) {
			System.out.println("Error while creating directory in Java:" + Se);
		}

		if (dirFlag)
			System.out.println("Directory created successfully and avalable space:"+stockDir.getFreeSpace());
		else
			System.out.println("Directory was not created successfully");
	}
}
