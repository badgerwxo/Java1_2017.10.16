package ru.spec.java1.lec9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Start");
		int[] read = { System.in.read(), System.in.read(), System.in.read(), System.in.read(), System.in.read(),
				System.in.read()

		};
		System.out.println("Stop " + read[0]);
		System.out.println("Stop " + read[1]);
		System.out.println("Stop " + read[2]);
		System.out.println("Stop " + read[3]);
		System.out.println("Stop " + read[4]);
		// System.out.println(System.in.available());
		int available = System.in.available();
		System.out.println(available);
		byte[] buf = new byte[available];
		System.in.read(buf, 0, available);

		System.out.println(Arrays.toString(buf));
		System.in.read();

		//
//		RandomAccessFile raf = new RandomAccessFile(new File("C:/java/new.txt"), "r");
//		long length = raf.length();
//		byte[] bs = new byte[(int) length];
//		raf.read(bs);
//		System.out.println(Arrays.toString(bs));
		
		
		
		FileInputStream raf = new FileInputStream(new File("C:/java/new.txt"));
		long length = raf.available();
		byte[] bs = new byte[(int) length];
		raf.read(bs);
		System.out.println(Arrays.toString(bs));
		System.out.println(raf.read());
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.out.println(raf.read());
		System.out.println(raf.read());
		System.out.println(raf.read());

		// raf.seek(0);

	}

}
