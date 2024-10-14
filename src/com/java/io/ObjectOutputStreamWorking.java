package com.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamWorking {

	public static void main(String[] args) throws IOException {

		String s = "Object Output Stream Demo";
		int i = 897648764;

		File files = new File("E:/Files/DEF.txt");
		FileOutputStream out = new FileOutputStream(files);
		ObjectOutputStream oout = new ObjectOutputStream(out);

		// write something in the file
		oout.writeObject(s);
		oout.writeObject(i);

		// close the stream
		oout.close();
	}

}
