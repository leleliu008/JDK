package com.leleliu008.jdk5.Generic;

import java.util.ArrayList;
import java.util.List;


/**
 * 如果泛型是协变的，会发生什么
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test4 {

	public static void main(String[] args) {
		List<Number>  ln = new ArrayList<Number>();
//		List<Number>  la = new ArrayList<Number>();
//		List<Integer>  li = new ArrayList<Integer>();
//		ln = la;
//		ln = li;
		ln.add(new Float(3.1415f));
		
		
		
	}
}
