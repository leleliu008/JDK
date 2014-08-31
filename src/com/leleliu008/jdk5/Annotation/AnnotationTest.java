package com.leleliu008.jdk5.Annotation;


/**
 * Annotation测试
 * @author leleliu008
 * @date 2012.10.06
 */

public class AnnotationTest {

	@XXAnnotation3(age = 18, name = "leleliu008", sex = Sex.male)
	public static void main(String[] args) {
		
	}
}

class Parent {
	
	@Deprecated
	public void method() {
		
	}
}

class Son extends Parent {
	
	@Override
	public void method() {
		super.method();
	}
}