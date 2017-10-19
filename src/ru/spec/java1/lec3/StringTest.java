package ru.spec.java1.lec3;

public class StringTest {
public static void main(String[] args) {
	System.out.println("Hello world".toUpperCase());
	System.out.println("Hello world  ".replaceAll("//s+", "_"));//замена всех пробелов на 1 проблел
	System.out.println("Hello world  ".trim().replaceAll("//s", "111"));
}
}
