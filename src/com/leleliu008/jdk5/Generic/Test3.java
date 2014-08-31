package com.leleliu008.jdk5.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 没有泛型的情况，可能犯的错误，指鹿为马
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new 猪());
		list.add(new 狗());
		list.add(new 猫());
		list.add(new 人());
		list.add(new 鹿());
		list.add(new 马());
		
		猪 pig = (猪) list.get(3);
		马 ma = (马) list.get(4);
	}
}

class 猪 {
	
}

class 狗 {
	
}

class 猫 {
	
}

class 人 {
	
}

class 鹿 {
	
}

class 马 {
	
}