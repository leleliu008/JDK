package com.leleliu008.jdk5.Reflect;

/**
 * 
 * @author leleliu008
 * @date 2012.11.24
 */

public class XX {

	public static void main(String[] args) {
		new Son().xx();
	}
}

class Parent {
	public void xx() {
		System.out.println(getClass().getName());
	}
}
class Son extends Parent {
	@Override
	public void xx() {
		super.xx();
//		System.out.println(getClass().getName());
	}
}
