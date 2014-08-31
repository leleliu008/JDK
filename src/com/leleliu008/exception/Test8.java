package com.leleliu008.exception;

/**
 * try块或catch块中出现return语句
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test8 {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		try {
			System.out.println("-------->>try block");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("-------->>Exception");
			System.exit(0);
		} finally {
			System.out.println("-------->>finally block");
		}
		System.out.println("-------->>after finally");
	}
}
