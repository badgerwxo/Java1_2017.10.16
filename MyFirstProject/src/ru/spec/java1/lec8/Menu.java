package ru.spec.java1.lec8;

public enum Menu implements Runnable{
	MAIN ("Главная"),
	PROJECTS ("Проекты"){
	@Override//переопределение метода
	public void run() {
		System.out.println("Hello World!");
}
	},
	PROJECTS_1 ("Проект_1", PROJECTS),//создание подменю после основного меню
	PROJECTS_1_1 ("Проект_1_1", PROJECTS_1),//создание подменю после основного меню
	PROJECTS_2 ("Проект_2", PROJECTS),//создание подменю после основного меню
	PROJECTS_3 ("Проект_3", PROJECTS),//создание подменю после основного меню
	
	ABOUT ("О нас"),
	CONTACTS ("Контакты");
	
	
	String title;
	Menu parent;
	
	//задаём поля ниже через конструктор
	private Menu(String title, Menu parent) {
		this.title=title;
		this.parent=parent;
	}
	
	private Menu(String title) {
		this(title,null);
	}
	
	

	
	
	
	
	@Override//переопределение метода
	public String toString() {
		return (parent==null?"":parent.toString()+" >> "+title);
		


}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}}


