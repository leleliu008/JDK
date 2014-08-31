package com.leleliu008.exception;

/**
 * 自定义异常
 * @author leleliu008
 * @date 2012.12.23
 */

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

}
