package ru.spec.java1.lec3;

public class StringTest {
public static void main(String[] args) {
	System.out.println("Hello world".toUpperCase());
	System.out.println("Hello world  ".replaceAll("//s+", "_"));//���������� ��������� "������", ������ ������ � �������
	System.out.println("Hello world  ".trim().replaceAll("//s", "111"));
}
}
