package com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderWorking {

	public static void main(String[] args) throws IOException {

		// for working with input streams like console, system.in etc.
		// system.in reads from console

		// create buffer reader for reading
		BufferedReader br = null;
		// input stream reader for reading from console
		Reader r = new InputStreamReader(System.in);
		// new bufferreader object
		br = new BufferedReader(r);
		// initialise str to null
		String str = null;
		// use do while loop to check
		do {
			System.out.println("Enter Input, exit to quit.");
			str = br.readLine();
			System.out.println(str);
		} while (!str.equalsIgnoreCase("exit"));

		br.close();
	}

}
