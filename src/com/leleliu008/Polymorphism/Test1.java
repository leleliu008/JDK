package com.leleliu008.Polymorphism;

/**
 * 接口与接口之间的关系只能用extends，而且一个接口可以extends多个接口
 * @author leleliu008
 * @date 2012.12.12
 */

public class Test1{ 

	public static void main(String[] args) {
		C c = new C(){
			@Override
			public void a() {
				System.out.println("a-------------");
			}
			
			@Override
			public void b() {
				System.out.println("b-------------");
			}
			
			@Override
			public void c() {
				System.out.println("c-------------");
			}
		};
		c.a();
		c.b();
		c.c();
	}
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C extends A, B {
	void c();
}
