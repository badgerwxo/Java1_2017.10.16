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
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

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
		TreeSet<String> set = new TreeSet<>();
		Map<Long, String> map = new TreeMap<>();
		
		
		
		
//		Map<String,Integer> stat = new HashMap<>();
		//strings.listIterator().previousIndex();
//		Set<Entry<String, Integer>> entrySet = stat.entrySet();
//		TreeSet<Entry<String, Integer>> sorted 
//		= new TreeSet<>((e1,e2)->{int cmp = e1.getValue().compareTo(e2.getValue());
//		return -1* (cmp==0?e1.getKey().compareTo(e2.getKey()):cmp);
//		});
//		sorted.addAll(entrySet);
//		sorted.forEach(e->System.out.println(e.getValue()+"\t"+e.getKey()));
		//TreeSet<Entry<St
		
//		static HashMap<String,Integer> bigrams=new HashMap<>();
//		
//		static void addStringToStat (String src, int gram){ 		{
//			src=src.toLowerCase().replaceAll("[^а-яё]+", " ").trim();
//			String[] words=src.split(" ");
//
//		}
//		
//		
//		static void addWordsToStat (String word, int gram) {
//			
//			int len=word.length();
//			
//			if (maxlen<=word.length()-gram) {
//				bigrams.put(word, 1+Optional.ofNullable(bigrams.get(word)).orElse(0));
//			//	bigrams.get(word);
//			}else {
//				for(int i=0;i<maxlen;i++) {
//					String 
//				}
//			}
//			
//			
//		}
		
		
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
