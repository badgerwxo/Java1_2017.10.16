package ru.spec.java1.lec8;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class ErrorTest {

	public static void main(String[] args) {
		
		//блок1
//		System.out.println("Start");
//		int i = 5/0;
//		System.out.println("end");
//		// TODO Auto-generated method stub
		System.out.println(m1());
		
		System.out.println("login: ");
		try(Scanner scanner = new Scanner(System.in)){
			String nextLine = scanner.nextLine();
			System.out.println(nextLine);
		}
		
		
		//блок2
		//System.err.println("Start");
//
//		try {
//			int i=5/0;
//			System.out.println("---");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("end");
		
//		try {
//			m1();
//			//throw new RuntimeException("My exception");
//			//System.out.println("---");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//			//throw new RuntimeException();
//		}finally {//гарантированное выполнение
//			//
//		}
		//System.out.println("end");
	}
	
	
	
	private static int m1() { //throws Exception{
			File f = new File ("C:/java/new.txt");
			
			try (FileOutputStream fos=new FileOutputStream(f)){
				
				fos.write("hello world".getBytes());
				return 3;
				//throw new Exception("My exception");
			}catch (Exception e) {
				//return 2;
				
			}finally {
				
//				try {
//					
//					fos.close();
//					
//				}catch (Exception e){
//					e.printStackTrace();
//				}

			}
			return 1;
				
			}
		
		

		
		
		
		
		
			
}

