package com.leleliu008.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 序列化测试
 * @author leleliu008
 * @date 2012.12.04
 */

public class SerializableTest {

	public static void main(String[] args) {
//		Person oldPerson = Person.getInstance();
//		oldPerson.setName("leleliu008");
//		oldPerson.setAge(18);
//		oldPerson.setSex(Sex.MALE);
//		
//		System.out.println("序列化前：" + oldPerson);
		String fileName = "D:/xx.txt";
		
		SerializableUtil.writeObject(Sex.MALE, fileName);
		
		Sex sex = (Sex) SerializableUtil.readObject(fileName);
		System.out.println("序列化后：" + sex);
		
//		System.out.println("序列化前后的对象是否相等：" + (newPerson == oldPerson));
	}
}
class SerializableUtil {
	public static void writeObject(Object object, String fileName) {
		ObjectOutputStream objectOutputStream = null;
		try {
			File file = new File(fileName);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(object);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != objectOutputStream) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static Object readObject(String fileName) {
		Object object = null;
		ObjectInputStream objectInputStream = null;
		try {
			File file = new File(fileName);
			FileInputStream fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			object = objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != objectInputStream) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return object;
	}
}
class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static Person INSTANCE;
	
	private String name;
	
	private int age;
	
	private Sex sex;

	private Person() {}
	
	public String getName() {
		return name;
	}

	public static Person getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

	private Object writeReplace() throws ObjectStreamException { 
//		System.out.println("Person.writeReplace() invoked"); 
		return INSTANCE; 
	} 
	
//	private void writeObject(ObjectOutputStream out) throws IOException {
//		out.defaultWriteObject();
//		System.out.println("Person.writeObject()  invoked");
//	}
//	
//	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//		in.defaultReadObject();
//		System.out.println("Person.readObject()  invoked");
//	}
	
//	private void readObjectNoData() throws ObjectStreamException {
//		System.out.println("Person.readObjectNoData()  invoked");
//	}
	
	private Object readResolve() throws ObjectStreamException {
//		System.out.println("Person.readResolve()  invoked");
		return INSTANCE;
	}
	
}

enum Sex {
	MALE,
	FEMALE;
	private Object writeReplace() throws ObjectStreamException { 
		System.out.println("Sex.writeReplace() invoked"); 
		return FEMALE; 
	} 
	private Object readResolve() throws ObjectStreamException {
		System.out.println("Sex.readResolve()  invoked");
		return FEMALE;
	}

}