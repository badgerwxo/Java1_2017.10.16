package ru.spec.java1.lec5;

public class Employee {
	String name;

	String title;
	
	{
		age=5;//инициализатор объекта
		System.out.println("init");
	}
int age;


final int MAX;//константы должны быть заданы до окончания работы конструктора

static {
	System.out.println("Static init");
	System.exit(0);
}
	
	
	public Employee(String name, int age, String title) {
		super();
		
		this.name = name;
		this.age = age;
		this.title = title;
		MAX=200;
		
	}

	public Employee(String name, int age) {
		this(name,age,null);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Employee("Name", 23, "title");
		Employee employee = new Employee("Name", 23);
		System.out.println(employee.age);		
		
		

	}

}
