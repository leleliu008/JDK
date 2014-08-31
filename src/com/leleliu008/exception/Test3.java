package com.leleliu008.exception;

/**
 * 
 * @author leleliu008
 * @date 2012.12.11
 */

public class Test3 {

	public static void main(String[] args) {
		int x = test();
		System.out.println("x = " + x);
	}
	
	public static int test() {
		try {
			String xString = null;
			return xString.length();
		} finally {
			System.out.println("finally----------------------------");
		}
	}
}
