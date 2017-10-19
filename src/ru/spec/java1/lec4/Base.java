package ru.spec.java1.lec4;

public class Base {
	String name="123";
	
	public Base() {
		super();
		System.out.println("Base() name="+name);
		m();
	}
	//override from Ext
	void m() {
		System.out.println("Base.m()");
	}
	//
	static String getName(String name) {
		System.out.println("getNAme("+name+")");
		return name;
		
		
	}
	
public static void main(String[] args) {
	new Ext().m();
	
}
}
