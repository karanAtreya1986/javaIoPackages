package com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderWithCatchBlocks {

	public static void main(String[] args) {

		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str = null;
		try {
			do {
				System.out.println("Enter Input, exit to quit.");
				str = br.readLine();
				System.out.println(str);
			} while (!str.equalsIgnoreCase("exit"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
	}
}

//Input stream deals with primitive data types. It cannot deal with objects.
