package ru.spec.java1.lecFinal;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(array);
		// List<Integer> result
		Integer result = list
				.stream()
				.filter(i -> (i % 2) == 0)
				.map(i -> i)
				//

				.reduce((i, j) -> i + j)
				.orElse(0);
		// .collect(Collectors.toList());//.forEach(i->System.out.println(i));
		//
		System.out.println(result);
		
		Page<Integer> page = new Page<>();
		page.setList(list);
		
		Class<Main> clz = Main.class;
		System.out.println(Page.create(clz));
		
		
		
		
//		page.list.get;

	}

}
