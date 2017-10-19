package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TimeTest {
	public static void main(String[] args) {

		// for (int i=0;i<10;i++) {
		test();
		// }

	}

	private static void test() {
		long millis = System.currentTimeMillis();
		long nano = System.nanoTime() / 1_000_000;// время с момента включения компьютера!!!
		long nano2 = System.nanoTime();

		ArrayList<Integer> list = new ArrayList<>();// создание нового ArrayList
		LinkedList<Integer> list2 = new LinkedList<>();// создание нового LinkedList, каждый элемент 40 байт

		int MAX = 1000000;
		Integer[] array = new Integer[MAX];

		for (int i = 0; i < MAX; i++) {
			array[i] = 1;// добавление 1 в каждый элемент ArrayList
		}

		for (int i = 0; i < MAX; i++) {
			list.add(1);// добавление 1 в каждый элемент ArrayList
		}
		for (int i = 0; i < MAX; i++) {
			list2.add(1);// добавление 1 в каждый элемент ArrayList
		}

		// long startTime=millis-nano;
		// System.out.println(new Date(startTime));
		System.out.print(System.currentTimeMillis() - millis + " ms ");// время работы программы в мс
		System.out.println((System.nanoTime() - nano2) / 1000 / 1000d + " ns");// время работы программы в мс
		// System.out.println();
	}
}
