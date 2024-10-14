package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWorkingSecondExample {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E:/Files/ABC.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null) {
			// first read line and then print
			// it already read the first line in line 13 but we didnt print it inside.
			// here it reads from second line, then prints and goes to new line, so when
			// software is reached, it will read software and print it and go to the next
			// line which is blank. so it will read blank as null and then print it.
			s = br.readLine();
			System.out.println(s);

		}
		br.close();
	}
}
