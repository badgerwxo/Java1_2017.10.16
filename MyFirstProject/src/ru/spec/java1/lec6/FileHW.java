package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class FileHW {

	public static void main(String[] args) throws FileNotFoundException   {
		//System.out.println("Enter any string");
		InputStream in = 		System.in;
		
		File file = new File("C:/java/java1.txt");
		in = new FileInputStream(file);
		//in  = new URL("http://specialist.ru").openStream();
		
		
		Scanner scanner = new Scanner(in);
		
		//Map<String,Integer> stat = new HashMap<>();
		
		ArrayList<String> strings = new ArrayList<>();
		strings.listIterator().previousIndex();
		//TreeSet<String> set = new TreeSet<>();
		HashSet<String> set = new HashSet<>();
		
		
		for (;scanner.hasNextLine();) {
		//String nextLine = scanner.nextLine();
		String [] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");
			strings.addAll(Arrays.asList(nextLine));
			
		//System.out.println(nextLine);
		}
//		System.out.println(strings.size());
//		for (int i=0;i<=strings.size();i++) {
		
		
		
			set.addAll(strings);
			
			
			
//			int wordsCount=1;
//			for (String word:set) {
//				if (strings.equals(word)){
//					wordsCount++;
//					System.out.println(strings + " " + wordsCount);
//				}
//			}
//		}
		
		
		for (String word : set) { // добавляет уникальные значения
			
			System.out.println (word + "(" +word.length()+ ")");
		}
///
		//System.out.println(split.length);
		System.out.println(set.size()+ "ээ");
	}

}
