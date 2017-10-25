package ru.spec.java1.lec6;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.omg.CORBA.portable.InputStream;

import ru.spec.java1.lec4.WordsCount;


public class FileHW {

	public static void main(String[] args) throws FileNotFoundException   {
		//System.out.println("Enter any string");
		InputStream in = 		System.in;
		
		File file = new File("C:/java/java1.txt");
		in = new FileInputStream(file);
		//in  = new URL("http://specialist.ru").openStream();
		
		
		Scanner scanner = new Scanner(in);
		
		ArrayList<String> strings = new ArrayList<>();
		
		//strings.listIterator().previousIndex();
		TreeSet<String> set = new TreeSet<>();
		
		Map<Long, String> map = new TreeMap<>();
		
		
		for (;scanner.hasNextLine();) {
		//String nextLine = scanner.nextLine();
		String [] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");
			//strings.addAll(Arrays.asList(nextLine));
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
		
			for (String word : set){
	            long count = 0;
	            for (String w : strings){
	                if (word.equals(w)) count++;
	            }
	            map.put(count, word);
	            //System.out.println(word + " - "+count);
	            //map.forEach((val,key)-> System.out.println(val+" слов " +key));
	        }
	
			map.forEach((val,key)-> System.out.println(val+" слов " +key));
			
		
///
		//System.out.println(split.length);
		//System.out.println("Уникальных слов: "+set.size());
	}


}
