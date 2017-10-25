package ru.spec.java1.lec8;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ErrorTest {

	public static void main(String[] args) {
		
		//блок1
//		System.out.println("Start");
//		int i = 5/0;
//		System.out.println("end");
//		// TODO Auto-generated method stub
		
		
		
		
		
		
		//блок2
		System.err.println("Start");
//
//		try {
//			int i=5/0;
//			System.out.println("---");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("end");
		
		try {
			throw new RuntimeException("My exception");
			//System.out.println("---");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {//гарантированное выполнение
			//
		}
		System.out.println("end");
		
		
		
		
	}

}
