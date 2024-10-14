package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWorking {

	public static void main(String[] args) throws IOException {

		// good practice to close the files when writing and reading
		FileReader fr = new FileReader("E:/Files/ABC.txt");
		BufferedReader br = new BufferedReader(fr);
		// readline will give line by line in string format.
		String s = br.readLine();
		// till all strings are not read, keep printing them.
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		// there is no flush method for reading.
	}
}
