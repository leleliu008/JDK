package com.leleliu008.jdk5.Enum;

/**
 * 测试反射枚举
 * @author leleliu008
 * @date 2012.12.10
 */

public class Non_Refact {

	public static void main(String[] args) {
		Class<SS> clazz = SS.class;
		try {
			Object object = clazz.newInstance();
			System.out.println(object);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

enum SS {
	a
}

