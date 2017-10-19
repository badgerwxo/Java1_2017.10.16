package ru.spec.java1.lec4;

import java.util.Date;

public class TimeTest {
public static void main(String[] args) {
	for (int i=0;i<100;i++) {
	test();
	}
	
}

private static void test() {
	long millis=System.currentTimeMillis();
	long nano = System.nanoTime()/1_000_000;//время с момента включения компьютера!!!
	
	long nano2 = System.nanoTime();
	long startTime=millis-nano;
	System.out.println(new Date(startTime));
	System.out.println(System.currentTimeMillis()-millis +" ms");//время работы программы в мс
	System.out.println(System.nanoTime()-nano2 + " ns");//время работы программы в мс
	System.out.println();
}
}
