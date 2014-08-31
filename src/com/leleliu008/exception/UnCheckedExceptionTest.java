package com.leleliu008.exception;

/**
 * 运行时异常测试
 * @author leleliu008
 * @date 2012.12.03
 */

public class UnCheckedExceptionTest {

	public static void main(String[] args) {
		new Foo().test();
	}
}
class Foo {
	
	public void test() {
		throw new NullPointerException();
	}
}
