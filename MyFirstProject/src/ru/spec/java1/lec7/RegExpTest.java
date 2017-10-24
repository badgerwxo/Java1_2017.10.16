package ru.spec.java1.lec7;

public class RegExpTest {

	public static void main(String[] args) {
		String [] split = "hello world	123, asd, ,,,.,., asd".split("\\s+");//=[ \t\r\n]
		for (String word : split) {
			System.out.println(word);
		}
			String [] split2 = "hello привет мир world	123, asd, ,,,.,., asd".split("[^а-яё]+");//[^а-яё]+ исключение кириллицы
			for (String word1 : split2) {
				System.out.println(word1);
		}
	}

}
