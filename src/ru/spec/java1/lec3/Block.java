package ru.spec.java1.lec3;

import java.util.Iterator;

public class Block {
	int i;
	static int count;//поле, общее для всех объектов

	public Block() { // конструктор
		super();// вызов конструктора базового объекта
		System.out.println("New block");
		count++;

	}

	void sayhello() {//нестатический метод
		System.out.println("Hello"+i);
	}
	
	public static void main(String[] args) {
		// i=5;
		//sayHello();//н
		
		for (int i = 0; i < 10; i++) {
			//new Block();
			new Block().sayhello();
			
		}
		System.out.println(Block.count);
	}
}
