package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class FilesTest {

	public static void main(String[] args) throws FileNotFoundException   {
		System.out.println("Enter any string");
		InputStream in = 		System.in;
		
		File file = new File("C:/java/java1.txt");
		in = new FileInputStream(file);
		//in  = new URL("http://specialist.ru").openStream();
		
		
		Scanner scanner = new Scanner(in);
		
		
		Map<String,Integer> stat = new HashMap<>();
		
		ArrayList<String> strings = new ArrayList<>();
		strings.listIterator().previousIndex();
		TreeSet<String> set = new TreeSet<>();
		
		
		for (;scanner.hasNextLine();) {
		//String nextLine = scanner.nextLine();
<<<<<<< HEAD
			String [] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");
			for (String word:nextLine) {
				if(!word.isEmpty()) {
				Integer count = stat.get(word);
				count=count==null?1:count+1;
				stat.put(word,count);
				}
			}
			
		//System.out.println("Your string is " + nextLine);
		}// TODO Auto-generated method stub
		stat.forEach((key,val)-> System.out.println(key+" = " +val));
=======
		String [] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");
			strings.addAll(Arrays.asList(nextLine));
			
			
			
			
		//System.out.println(nextLine);
		}
		set.addAll(strings);
		for (String word : set) { // добавляет уникальные значения
			
			System.out.print (word + "(" +" "+ ")");
		}
///
		//System.out.println(split.length);
		System.out.println(set.size());
>>>>>>> branch 'master' of https://github.com/badgerwxo/Java1_2017.10.16
	}

}
