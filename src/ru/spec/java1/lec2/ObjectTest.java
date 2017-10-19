package ru.spec.java1.lec2;

import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) {
		System.out.println(ObjectTest.class.getName());
//
//		// обЄртки
//		int i = 5;
//		Integer i1 = 5;
//		Boolean b = null;// дополнительное одно значение дл€ примитивных типов, если объ€вить как объект
//		// System.out.println(5/0);ошибка делени€ на 0, точка разрыва гиперболы
//		System.out.println(5d / 0);// infinity - бесконечность
//		System.out.println(0d / 0);// NaN-нисколько
//
//		double d1 = 5d / 0, d2 = 5d / 0;
//		System.out.println(d1 == d2);// бесконечность равна бесконечности
//		double d3 = 0d / 0, d4 = 0d / 0;
//		System.out.println(d3 == d4);// "нисколько" всегда не равно "нисколько"
//		System.out.println(Double.isNaN(d1));
//		System.out.println((-5) / 3);// -1
//		System.out.println((5) / 3);// 1
//		System.out.println((-5) % 3);// -2, как -1 - (2/3)
//		System.out.println((5) % 3);// 2, как 1+(2/3)
//		System.out.println((5) % 2);// 1, как 1+(1/2)

		
		
		
		
//		byte b1=10;
//		byte b2=20;
//		byte b3=127;
//		byte b4=1;
//		System.out.println(b1+b2);//всЄ, что менее int,  в операци€х приводитс€ к int
//		System.out.println(b3);//127
//		System.out.println(b3+1);//128
//		System.out.println(b3+b4);//128
//		System.out.println(b3++);//127, сначала вывод потом сложение
//		System.out.println(++b3);//-127, потому что byte
//		
		
		
		
		
		
		char c='A';
		System.out.println(c);//char
		System.out.println(c+0);//int
		System.out.println((char)(c+1));//char a+1=b
		
		System.out.println(c+" A");//string
		System.out.println(c+'='  + 'A');//int
		
		
		
		
		
		
		// Object o = new Date();

		// методы любого объекта

		// System.out.println(o.getClass().getName());// название класса объекта
		// System.out.println(o.hashCode());// хэш-код
		// Object[] array = { new Date(), 5, "asd", new int[] { 1, 2, 3 } };// создаЄтс€
		// массив любых значений
		// System.out.println(array.length);// размер массива
		// System.out.println(((int[]) array[3])[2]);
		// Object[][] matrix = new Object[5][4];// массив ссылок на массивы, массив
		// массивов
		// Object[][][] cube = new Object[5][][];// об€зательно обозначать размер
		// первого массива
		//
		// String s = "hello";
		// String s1 = new String("hello");
		//
		// Integer i1 = 1000;// 1000-примитивный литерал
		// Integer i2 = 1000;
		// Integer i3 = i2;
		// System.out.println("i1==i2?" + (i1 == i2));// сравниваем объекты
		// System.out.println("i1==i2?" + ((i1 + 0) == i2));// приведение объекта к типу
		// int
		//
		// System.out.println("i2==i3?" + (i2 == i3));// сравниваем объекты, а не числа
		// System.out.println("i2==i3?" + (1000 == 1000));
		// System.out.println(s == s1);// сравнение строки и объекта даЄт false
		// System.out.println("Hello world" == ("Hello " + "world"));
		// System.out.println("hello world" == (s + " world"));// s неизвестна до вызова
		// строки
		// System.out.println("hello world" == (s + " world").intern());// вызов s до
		// компил€ции, поэтому true
		// System.out.println(1 + 2 + " hello");// 3 hello, т.к. сначала идЄт сложение
		// интов
		// System.out.println("hello " + 2 + 1);// hello 21, т.к. сначала идЄт строка и
		// присоединение к ней
		//
		// System.out.println("i1==i2?" + (i1.equals(i2)));// сравниваем объекты
		// i1 = 123;
		// i2 = 123;
		// for (int i = 200; i > -200; i--) {
		// i1 = i;
		// i2 = i;
		// System.out.println(i + " i1==i2?" + (i1 == i2));// ћЌќ√ќ false в рамках 1
		// байта
		// }
		//
		// for (int i = 200; i > -200; i--) {
		// i1 = i;
		// i2 = i;
		// System.out.println(i + " i1==i2?" + (i1 + 0 == i2));// true
		// }

	}

}
