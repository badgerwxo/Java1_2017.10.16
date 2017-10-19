package ru.spec.java1.lec2;

import java.math.BigInteger;
import java.util.Date;
import java.lang.Math;

public class EntryPoint {

	public static void main(String[] args) {// ����� ������������� ���������: args, a, b, etc.

		int a = 9;// ������ 1 �����
		int b = 12;// ������ 2 �����
		int c =37;// ������ 3 ����� ��� �������� �������/���������блаблабла

		int min;
		int max;
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		for (int i = min; (i > 0); i--) {
			int a1 = a / i;
			int b1 = b / i;
			double a2 = (double) a / (double) i;
			double b2 = (double) b / (double) i;
			if (a1 == a2 && b1 == b2) {
				System.out.println("��� �� ����� " + a + " � " + b + "=" + i);
				break;
			} else
				System.out.print("");
		}

		for (int i = max;i<=max*min; i++) {
			int a1 = i / a;
			int b1 = i / b;
			double a2 = (double) i / (double) a;
			double b2 = (double) i / (double) b;
			if (a1 == a2 && b1 == b2) {
				System.out.println("��� �� ����� " + a + " � " + b + "=" + i);
				break;
			} else
				System.out.print("");
		}
		int t = 0;
		for (int i = c - 1; i > 1; i--) {
			int c1 = c / i;
			double c2 = (double) c / (double) i;

			if (c1 == c2) {
				t++;
			}
		}
		if (t > 0) {
			System.out.println("����� " + c + " �� �������� �������");
		} else if (c == 73) {
			System.out.println("�� ������ ������� ������, " + c + " - ��� ����� ������ ������� �����");
		} else {

			System.out.println("����� " + c + " �������");
		}

		/*
		 * ���������� �������
		 */
		// int[] array1 = new int[2];
		// int[] array2 = new int[] { 1, 2, 3, 4, 5 };
		// int[] array3 = {1,2,3,4,5};
		// for (int i = 0; i < array2.length; i++) {
		//
		// System.out.println(i);
		// }
		// for (int i : array2) {// ����� ��������� �������
		// System.out.println(i);
		// }

		/*
		 * �������� � �������� ������� long a=1,b=1,c;
		 * 
		 * BigInteger i1=new BigInteger("1"); BigInteger i2=new BigInteger("1");
		 * BigInteger i3;
		 * 
		 * 
		 * for (int i=1;i<=100;i++) { i3=i1.add(i2);//�������� �������� ������� �����
		 * ������ BigInteger i1=i2; i2=i3;
		 * 
		 * System.out.println("("+i +")="+i1); }
		 */

		// System.out.println(Math.pow(2.5, -3.5));

		/*
		 * �������� � �����
		 */

		// Date date = new Date(Integer.MAX_VALUE);//Integer.MAX_VALUE - ������������
		// �������� int
		// System.out.println(date);
		// System.out.println(date.getTime());//������������

		/*
		 * �����
		 * 
		 */

		// for (int i = 0, j = 5; (i < 10) && (j > 0); i++, j--) {
		// System.out.println("For" + i);
		// }
		//
		// int i = 0;
		// while (i < 2) {
		// System.out.println("While" + i);
		// i++;
		// }

		// String test = "Hello world";
		// System.out.println(test);
		//
		// int i=0, j=1;
		//
		// long millisec=1000*60*60*24*365*3;

		/*
		 * ������� ����������, �� �����, ��������������
		 * 
		 */
		//
		// System.out.println(10);//10
		// System.out.println(10*1.0);//10.0
		// System.out.println(010);//8 - ������������ CC
		// System.out.println(0010);//8 - ������������ CC
		// System.out.println(001D);//double 1.0
		// System.out.println(0b10);//2 - �������� CC
		// System.out.println(0x10);//16 -����������������� �C
		//
		// System.out.println(0xDEAD_BEEF);
		// System.out.println(02e3f);//10 ^2
		//
		// long var=5;//���������� � int
		// var=5_000_000_000L;//long
		// double d=5;//int
		//
		// d=5.0;
		// d=5D;
		//
		// int a1=d>10?1:0;
		// int a2=d>10?1:0;

	}

}
