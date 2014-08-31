package com.leleliu008.exception;

/**
 * 异常链截断了，或异常丢失
 * @author leleliu008
 * @date 2012.12.23
 */

public class ThrowableTest4 {

	public static void main(String[] args) {
		try {
			new ThrowableTest4().a();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void a() throws MyException {
		try {
			b();
		} catch (MyException e) {
//			e.printStackTrace();
//			throw new MyException("重新抛出的异常",e);
			try {
				throw new MyException("重新抛出的异常").initCause(e);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void b() throws MyException {
		c();
	}
	
	public void c() throws MyException {
		throw new MyException("原始异常");
	}
}
