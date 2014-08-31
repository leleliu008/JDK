package com.leleliu008.exception;

import java.lang.Thread.UncaughtExceptionHandler;


/**
 * 未被catch的异常的处理方式，在JVM处理前的一次过滤
 * @author leleliu008
 * @date 2013.01.16
 */

public class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread thread, Throwable e) {
		System.out.println("----->> uncaughtException()");
		System.out.println("threadName: " + thread.getName());
		e.printStackTrace();
	}
	
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		
		throw new NullPointerException();
	}

}
