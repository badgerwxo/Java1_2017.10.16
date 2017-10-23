package ru.spec.java1.lec6;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println(isPalindrom("6556"));
		
		
		for (int i=0;i<100000;i++) {
			if(isPalindrom(i, 7)&& isPalindrom(i, 17)) {
				System.out.println("("
						+i
						+")"
						+Long.toString(i,7)
						+" "
						+Long.toString(i,17));
			}
			
		}
			
		}
		
		
	private static boolean isPalindrom(long m, int r) {	
		String string;
		string = Long.toString(m,r);
		return isPalindrom (string);
		}
	
	
	
	
	
	
	
	private static boolean isPalindrom(String string) {
		boolean isPal;
		
		int lengh = string.length() / 2;
		for (int i = 0; i < lengh; i++) {

			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;

			}

		}
		return true;
	}

}
