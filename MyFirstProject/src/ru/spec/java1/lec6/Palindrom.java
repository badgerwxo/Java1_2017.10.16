package ru.spec.java1.lec6;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println(isPalindrom1("65iseughvseugrfiuseycrgiuseynrcgtoeuirgyoianwuenrycopqaiwerucy56"));

		for (int i = 0; i < 100000; i++) {
			if (isPalindrom(i, 7) && isPalindrom(i, 17)) {
				System.out.println("(" + i + ")" + Long.toString(i, 7) + " " + Long.toString(i, 17));
			}

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("A");

		}
		for (int i = 0; i < 10; i++) {
			test2();
			test1();
			test3();

		}

	}

	static int MAX = 100000;
	static String testString = "sioehgroiueyrgo";
	//testString = sb.toString();

	private static void test2() {
		long ts = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			isPalindrom2(testString);
		}
		System.out.println((System.nanoTime() - ts / 1000 / 1000d + " ms -2-"));
	}

	private static void test1() {
		long ts = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			isPalindrom1(testString);
		}
		System.out.println((System.nanoTime() - ts / 1000 / 1000d + " ms -1-"));
	}

	private static void test3() {
		long ts = System.nanoTime();

		for (int i = 0; i < MAX; i++) {
			isPalindrom3(testString);
		}
		System.out.println((System.nanoTime() - ts / 1000 / 1000d + " ms -3-"));
	}

	// int age;
	// public void setAge(int age) {
	// this.age=age;
	//
	// }
	//
	// public Palindrom withAge(int age) {
	// this.age=age;
	// return this;
	//
	// }

	private static boolean isPalindrom(long m, int r) {
		String string;
		string = Long.toString(m, r);
		return isPalindrom1(string);
	}

	private static boolean isPalindrom2(String string) {
		boolean isPal;

		int length = string.length() / 2;

		for (int i = 0; i < length; i++) {

			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrom1(String string) {
		char[] charArray = string.toCharArray();
		int length = charArray.length / 2;

		for (int i = 0; i < length; i++) {
			if (charArray[i] != charArray[string.length() - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrom3(String string) {// намного более краткая запись предыдущего метода
		return new StringBuilder(string).reverse().equals(string);
	}

}
