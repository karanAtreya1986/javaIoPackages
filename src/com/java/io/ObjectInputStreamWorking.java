package com.java.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamWorking {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File files = new File("E:/Files/DEF.txt");
		FileInputStream in = new FileInputStream(files);
		ObjectInputStream ois = new ObjectInputStream(in);

		// read and print what we wrote before
		// first readobject will convert object to string and then print
		// second readobject will print the memory address
//		System.out.println("" + (String) ois.readObject());
//		System.out.println("" + ois.readObject());

		// second way is use while loop
//		Object o1 = ois.readObject();
//		// while object is not null, iterate
//		while (o1 != null) {
//			// convert object to string
//			String s1 = o1.toString();
//			System.out.println(s1);
//			// read further objects after printing first one.
//			o1 = ois.readObject();
//		}
//		// close the objects stream once done
//		ois.close();

		try {
			while (true) {
				Object o1 = ois.readObject();
				if (o1 != null) {
					// convert object to string
					String s1 = o1.toString();
					System.out.println(s1);
				}
			}
		} catch (EOFException e) {
			System.out.println("End of file is reached");
		}
		ois.close();
	}
}