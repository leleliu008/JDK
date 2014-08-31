package com.leleliu008.jdk5.EnhancedForLoop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * JDK5.0之前，遍历集合的典型代码代码
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		names.add("王五");
		
		for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ){
			String name = iterator.next();
			System.out.println(name);
		}
		
		for (int i = 0; i < names.size(); i++){
			String name = names.get(i);
			System.out.println(name);
		}
	}
}
