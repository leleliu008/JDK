package com.leleliu008.jdk5.Reflect;

import java.lang.reflect.Array;


/**
 * 反射相关的测试
 * @author leleliu008
 * @date 2012.08.09
 */

public class ReflectTest {
	
	
	public static void main(String[] args) {
	
		int length = 5;
		Object intArray = Array.newInstance(int.class, length);
		for (int i = 0; i < length; i++) {
			Array.setInt(intArray, i, i);
		}
		method(intArray);
		
		System.out.println("----------------------");
		
		String str = "abcd";
		method(str);
	}
	
	@SuppressWarnings("unchecked")
	static void method(Object object) {
		Class clazz = object.getClass();
		//如果是数组
		if (clazz.isArray()) {
			int length = Array.getLength(object);
			System.out.println("array length: " + length);
			for (int i = 0; i < length; i++) {
				Object obj = Array.get(object, i);
				if (i == 0) {
					String className = obj.getClass().getName();
					System.out.println("every item Class Name: " + className);
				}
				System.out.println(obj);
			}
		} else {
			System.out.println("Class Name: " + clazz.getName());
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

enum cc{
	
	dd,
	ff
}
