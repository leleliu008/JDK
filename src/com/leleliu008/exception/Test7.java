package com.leleliu008.exception;

/**
 * try块或catch块中出现return语句
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test7 {

	public static void main(String[] args) {
		readText();
	}
	
	public static String readText() {
		String source = null;
		try {
			System.out.println("-------->>try block");
			return replaceText(source);
		} catch (Exception e) {
			System.out.println("-------->>Exception");
		} finally {
			System.out.println("-------->>finally block");
		}
		System.out.println("-------->>>after finally");
		return source;
	}
	
	public static String replaceText(String source) throws NullPointerException {
		System.out.println("-------->>replaceText");
		if (null == source) {
			throw new NullPointerException();
		}
		return source.replace(".", "");
	}
}
