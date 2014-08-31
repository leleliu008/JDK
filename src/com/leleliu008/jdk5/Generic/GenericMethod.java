package com.leleliu008.jdk5.Generic;

/**
 * 
 * @author leleliu008
 * @date 2012.12.09
 */

public class GenericMethod {
	
	public <T extends RuntimeException> GenericMethod(Class<T> clazz) {
		
	}
	
	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod(ClassCastException.class);
	}
}
