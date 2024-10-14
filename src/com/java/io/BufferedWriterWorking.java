package com.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWorking {

	public static void main(String[] args) throws IOException {

		// bufferedreader or bufferedwriter does not work with objects.
		// for objects we have objectinputstream and objectoutputstream.
		// file -- you tell the location of the file as parameter.
		// filewriter or filereader -- accepts file as parameter.
		// bufferedreader or bufferedwriter -- accepts filereader or filewriter as
		// parameter.

		File f = new File("E:/Files/ABC.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		// we can write anything except of type objects
		bw.write("see what happens when we dont write newline");
		bw.write(97);
		// newline is basically to add new line after earlier write statement.
		bw.newLine();
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		bw.write(ch1);
		bw.newLine();
		bw.write("TECH");
		bw.newLine();
		bw.write("software");
		// flush -- Remove everything from memory.
		bw.flush();
		// close -- Close objects once done.
		bw.close();
	}
}
