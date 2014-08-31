package com.leleliu008.exception;

/**
 * 在catch后finally语句块中有return语句
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test9 {

	public static void main(String[] args) {
		try {
			System.out.println("-------->>try block");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("-------->>Exception");
			return;
		} finally {
			System.out.println("-------->>finally block");
		}
		//System.out.println("-------->>after finally");
	}
}
