package com.leleliu008.exception;

/**
 * 利用Throwable的构造方法的特点进行代码追踪
 * @author leleliu008
 * @date 2012.12.23
 */

public class ThrowableTest3 {

	public static void main(String[] args) {
		ThrowableTest3 instance = new ThrowableTest3();
		boolean condition = true;
		if (condition) {
			instance.a();
		} else {
			instance.c();
		}
	}
	
	public void a() {
		b();
	}
	
	public void b() {
		d();
	}
	
	public void c() {
		d();
	}
	
	public void d() {
		new Throwable().printStackTrace();
	}
}
