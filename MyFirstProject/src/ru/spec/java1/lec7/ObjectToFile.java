package ru.spec.java1.lec7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectToFile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6439967352727685215L;
	int i=15;
	transient String name;
	

	public static void main(String[] args) throws Exception {
		File f=new File("c:/java/obj.bin");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Date());
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
	Object d =  ois.readObject();
		System.out.println(d.getClass().getName());
		System.out.println(d);

	}
}
