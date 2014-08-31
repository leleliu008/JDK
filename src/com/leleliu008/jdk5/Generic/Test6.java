package com.leleliu008.jdk5.Generic;

import java.util.ArrayList;
import java.util.List;


/**
 * 限定泛型
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test6 {

	public static void main(String[] args) {
		ArrayList<? extends Parent> ls1 = new ArrayList<Son>();
		List<? super Son> ls2 = new ArrayList<Parent>();
		List<?> ls3 = new ArrayList<Object>();
	}
}

class Parent {
	
}

class Son extends Parent {
	
}

class xx extends Son {
	
}