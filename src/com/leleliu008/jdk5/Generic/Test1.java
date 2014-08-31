package com.leleliu008.jdk5.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 没有泛型的情况
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list.add(new Integer(i));
		}
		
		Integer integer = (Integer) list.get(0);
	}
}
