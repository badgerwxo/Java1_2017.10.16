package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class FilesTest {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Enter any string");
		InputStream in = 		System.in;
		
		File file = new File("C:/java/test.txt");
		in = new FileInputStream(file);
		
		
		Scanner scanner = new Scanner(in);
		
		for (;scanner.hasNextLine();) {
		String nextLine = scanner.nextLine();
		
		System.out.println("Your string is " + nextLine);
		}// TODO Auto-generated method stub

	}

}
