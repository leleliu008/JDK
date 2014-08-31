package com.leleliu008.jdk5.VarArgs;

import java.util.Arrays;
import java.util.List;

/**
 * 可变参数测试
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		new Util().write();
		new Util().write(1);
		new Util().write(1, "2");
		new Util().write(1, "2", false);
		new Util().write((Object)new String[]{"", "", ""});
		
		System.out.println("----------------------");
		
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
		for (int i : ls) {
			System.out.println(i);
		}
	}
}

class Util {
	public void write(Object... objs){ 
		for(Object obj : objs){
			System.out.println(obj); 
		}
	}
}
