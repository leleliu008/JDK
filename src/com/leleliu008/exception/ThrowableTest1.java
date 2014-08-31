package com.leleliu008.exception;

/**
 * 
 * @author leleliu008
 * @date 2012.12.23
 */

public class ThrowableTest1 {

	public static void main(String[] args) {
		try {
			new ThrowableTest1().a();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void a() throws MyException {
		try {
			b();
		} catch (MyException e) {
			for (StackTraceElement stackTraceElement : e.getStackTrace()) {
				System.out.println(stackTraceElement.getMethodName());
			}

			e.printStackTrace();

			e.printStackTrace(System.err);
//
			e.printStackTrace(System.out);
			
			throw (MyException)e.fillInStackTrace();
		}
	}
	
	public void b() throws MyException {
		c();
	}
	
	public void c() throws MyException {
		throw new MyException("原始异常");
	}
}
