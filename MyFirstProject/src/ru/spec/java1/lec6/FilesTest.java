package ru.spec.java1.lec6;

import java.io.InputStream;
import java.util.Scanner;


public class FilesTest {

	public static void main(String[] args) {
		System.out.println("Enter any string");
		InputStream in = 		System.in;
		Scanner scanner = new Scanner(in);
		
		for (;scanner.hasNextLine();) {
		String nextLine = scanner.nextLine();
		
		System.out.println("Your string is " + nextLine);
		}// TODO Auto-generated method stub

	}

}
