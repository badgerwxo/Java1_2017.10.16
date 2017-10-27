package ru.spec.java1.lecFinal;

import java.util.List;

public class Page <K /*extends Comparable*/> { 
	//<K,V>, 
	//<K extends Comparable&Runnable>, 
	// <K> implements List <String> для сохранения параметра
	List <K> list;
	K example;
	long total;
	int current;
	int prePAge;
	
	static <T> T  create(Class<T> clz) throws InstantiationException, IllegalAccessException {//параметризуем метод
		
		return clz.newInstance();
	}
	
	K example() {
	//	example.run();
		return example;
	}
	
//	K create(Class<K> clz) throws InstantiationException, IllegalAccessException {
//		return clz.newInstance();
//	}
	
	public List<K> getList() {
		return list;
	}
	public void setList(List<K> list) {
		this.list = list;
	}
	public long getLongTotal() {
		return total;
	}
	@Deprecated
	public int getTotal() {
		return (int) total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getPrePAge() {
		return prePAge;
	}
	public void setPrePAge(int prePAge) {
		this.prePAge = prePAge;
	}
	



}
