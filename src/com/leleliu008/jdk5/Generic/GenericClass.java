package com.leleliu008.jdk5.Generic;

import java.util.ArrayList;

/**
 * 
 * @author leleliu008
 * @date 2012.
 */

public class GenericClass<T extends Item> {

	public ArrayList<T> m;
	
	public GenericClass(ArrayList<T> m) {
		this.m = m;
	}
	
	public static void main(String[] args) {

		ArrayList<AItem> aItems = new ArrayList<AItem>();
		GenericClass<AItem> genericClass = new GenericClass<AItem>(aItems);
		genericClass.m.add(new AItem());
	}
}

interface Item {
	
}

class AItem implements Item {
	
}