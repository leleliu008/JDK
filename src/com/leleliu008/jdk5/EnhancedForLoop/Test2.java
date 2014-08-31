package com.leleliu008.jdk5.EnhancedForLoop;

import java.util.ArrayList;

/**
 * 使用增强的for循环实现Test1
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		names.add("王五");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
