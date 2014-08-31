package com.leleliu008.Clone;

/**
 * 证明所有的类的顶级父类都是Object
 * @author leleliu008
 * @date 2012-12-23
 */
public class Test1 {
	
	public static void main(String[] args) {
		Test1 cloneTest = new Test1();
		cloneTest.copy();
	}
	
	private void copy() {
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

