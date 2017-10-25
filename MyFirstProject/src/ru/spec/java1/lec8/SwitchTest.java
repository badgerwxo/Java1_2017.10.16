package ru.spec.java1.lec8;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SwitchTest {
static final String type = "asd";
	public static void main(String[] args) throws InterruptedException { //ищет, откуда начинать код
		int i=5;
		switch (i){
		case 1:
			System.out.println(1);
			break; //- нужно стаивть break, чтобы не выводились следующие строки
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default: 
				System.out.println("def");
				break;
		}
		
		switch (new SwitchTest().getClass().getName()) {
		default: 
			System.out.println("def");
			break;
		case type:
			System.out.println(type);
		
		}
		
		Menu item = Menu.PROJECTS_1_1;//обращение к классу Menu
		
		System.out.println(item);
		select (item);
		Menu.PROJECTS.run();
		
		TimeUnit.SECONDS.sleep(5);//переопределение времени ожидания в секунды
	}
		public static void select (Menu item) {
			switch (item) {
			case ABOUT:
				System.out.println(item.ordinal());//ordinal() порядковый номер, compareto - сравнивает порядок
				System.out.println(item.toString());//переопределил метод, теперь он делает toLowerCAse
				break;
			case CONTACTS:
				break;
			case MAIN:
				System.out.println("Hi");
				break;
			case PROJECTS:
				System.out.println(item.toString());
				break;
			case PROJECTS_1_1:
				System.out.println(item.toString());
				break;
			}
		}
		

	}


