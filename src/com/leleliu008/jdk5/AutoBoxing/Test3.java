package com.leleliu008.jdk5.AutoBoxing;

/**
 * 自动装箱的特例——超出范围
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test3 {
	
	public static void main(String[] args) {
		Integer i1 = 300;
		Integer i2 = 300;
		System.out.println(i1 == i2);
	}
}
