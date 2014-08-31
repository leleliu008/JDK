package com.leleliu008.jdk5.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义Annotation
 * @author leleliu008
 * @date 2012.10.06
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface XXAnnotation3 {
	//返回值是基本类型
	int age() default 20;
	
	//返回值是String类型
	String name() default "leleliu008";
	
	//返回值是enum类型
	Sex sex() default Sex.male;
	
	//返回值是Class类型
	@SuppressWarnings("unchecked")
	Class handlerClass() default String.class;
	
	//返回值是Annotation类型
	Deprecated deprecated() default @Deprecated;
	
}