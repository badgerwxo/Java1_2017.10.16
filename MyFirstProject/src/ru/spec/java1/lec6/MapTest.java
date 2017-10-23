package ru.spec.java1.lec6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.TreeMap;


public class MapTest {// интерфейс, HashMAp его реализует
	// map относится к коллекциям, но не является коллекцией

	public static void main(String[] args) {
		//HashMap<String, String> map = new HashMap<>();
		Map<String, String> map = new TreeMap<>();
		map.put("Hello", "world");
		map.put("Bye", "123");
		map.put("hello", "WORLD");
		System.out.println(map.put("hello", "WORLD!"));// озвращает предыдущее значение

		map.put("123", "1");
		map.put("234", "2");
		map.put("345", "3");

		
		System.out.println(map);
		Set <Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
			
		}
		
//		Set<String> keySet=map.keySet();
//		Collection<String> values = map.values();
		

		map.forEach((key,val)-> System.out.println(key+" =>" +val));
	}

}
