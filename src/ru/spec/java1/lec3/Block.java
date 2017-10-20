package ru.spec.java1.lec3;

import java.util.Iterator;

public class Block {
	int i;
	static int count;//����, ����� ��� ���� ��������

	public Block() { // �����������
		super();// ����� ������������ �������� �������
		System.out.println("New block");
		count++;

	}

	void sayhello() {//������������� �����
		System.out.println("Hello"+i);
	}
	
	public static void main(String[] args) {
		// i=5;//
		//sayHello();//�
		
		for (int i = 0; i < 10; i++) {
			//new Block();
			new Block().sayhello();
			
		}
		System.out.println(Block.count);
	}
}
