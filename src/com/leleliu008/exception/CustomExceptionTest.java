package com.leleliu008.exception;

/**
 * 自己定义异常
 * @author leleliu008
 * @date 2012.12.03
 */

public class CustomExceptionTest {

	public static void main(String[] args) {
		new Foo2().test();
	}
}

class Foo2 {
	
	public void test() throws XXException {
		boolean condition = true;
		if (condition) {
			throw new XXException("xxxxxxxxxx");
		}	
	}
}

class XXException extends RuntimeException {
	
	public XXException() {
		super();
	}
	
	public XXException(String message) {
		super(message);
	}
}