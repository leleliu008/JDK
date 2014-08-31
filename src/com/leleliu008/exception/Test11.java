package com.leleliu008.exception;

import java.io.IOException;

/**
 * 覆盖于异常
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test11 {

	public static void main(String[] args) {
		
	}
}

class Parent {
	public Parent() throws IOException {
		
	}
	
	public void xx() throws IOException {
		
	}
}

class Son extends Parent {

	public Son() throws IOException, ClassNotFoundException {
		super();
		throw new ClassNotFoundException();
	}
	
	@Override
	public void xx() throws IOException {
		super.xx();
		throw new NullPointerException();
	}
}