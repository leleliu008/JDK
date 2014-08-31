package com.leleliu008.jdk5;

/**
 * 可变参数测试版
 * @author leleliu008
 * @date 2012.12.08
 */

public class Test1 {

	public static void main(String[] args) {
		String fileName = Test1.class.getSimpleName();
		int lineNumber = 0;
		try {
			throw new Exception("xxx");
		} catch (Exception e) {
			System.out.printf("%s:%d:%s%n", fileName, lineNumber, e.getMessage());
		}
	}
}
