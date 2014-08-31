package com.leleliu008.API;

/**
 * 字符串测试
 * @author leleliu008
 * @date 2012.12.19
 */

public class StringTest {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String(a);
		String d = new String("abc");
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
	}
}
