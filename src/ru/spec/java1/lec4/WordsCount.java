package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class WordsCount {
	public static void main(String[] args) {
		String s1 = "	��� ��� ���  	";
		String s2 = "	��� ��� ���  drtb ervt	aiuwyet oytwb iu8yt 222 333 4444";
		s1 = s1.trim().replaceAll("\\s+", " ");
		// first, trim from both sides; second, 1 and more spaces replace with 1 space

		ArrayList<String> strings = new ArrayList<>();
		TreeSet<String> set = new TreeSet<>();//класс бинарного дерева
		
		
		strings.size();
		
		addWordsToArray(s1, strings);
		addWordsToArray(s2, strings);
		
		set.addAll(strings);

//		for (String word : strings) { // for each cycle
//			System.out.println(word);
//		}
		
		for (String word : set) { // ����� ���������� ��������
			System.out.println(word);
		}
///
		//System.out.println(split.length);
		System.out.println(set.size());//���������� ���������� ��������
	}

	private static String[] addWordsToArray(String s1, ArrayList<String> strings) {
		String[] split = s1.trim().split("\\s+");
		strings.addAll(Arrays.asList(split));
		return split;
	}

}
