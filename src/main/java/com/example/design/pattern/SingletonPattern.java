package com.example.design.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private static Singleton singleton;

	private Singleton() {
//		if (singleton != null) {
//			throw new RuntimeException("You were trying to break sigleton pattern");
//		}
	}

	public static Singleton getInstance() {
			if (singleton == null) {
				singleton = new Singleton();
			}
		return singleton;
	}
	
	public Object readResolve() {
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}
	
}

public class SingletonPattern {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException,
			IOException, ClassNotFoundException, CloneNotSupportedException {

		Singleton instance = Singleton.getInstance();
		System.out.println("Singleton instance hashcode : "+instance.hashCode());

		// (1) breaking singleton pattern in none thread safe environment

//		multiple threads can operate on it, to create multiple objects

		// Solution: to prevent make method synchronize or put object creation code in
		// synchronize block

		// (2) breaking singleton pattern using reflection

		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton singleton = constructor.newInstance();
		System.out.println("Reflection instance hashcode : "+singleton.hashCode());

		// Solution: to prevent that throw exception on condition in constructor

		// (3) breaking singleton pattern suing serialization

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		outputStream.writeObject(instance);
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
		Singleton singleton2 = (Singleton) inputStream.readObject();
		System.out.println("Serialized instance hashcode : "+singleton2.hashCode());
		
		outputStream.close();
		inputStream.close();

		// Solution: to prevent that implement object readResolve() method
		
		//(4) breaking singleton pattern using clone method
		
		Singleton singleton3 = (Singleton) instance.clone();
		System.out.println("Cloned instance hashcode : "+singleton3.hashCode());
		
		//Solution: to prevent return same object from overridden clone method
		
	}

}
