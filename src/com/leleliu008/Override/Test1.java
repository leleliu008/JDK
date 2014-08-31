package com.leleliu008.Override;

/**
 * 
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		System.out.println(new Son().get());
	}
}

class Parent {
	public Object get() {
		return "1";
	}
}

class Son extends Parent {
	@Override
	public String get() {
		return (String)super.get();
	}
}
