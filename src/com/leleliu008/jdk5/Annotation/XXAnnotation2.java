package com.leleliu008.jdk5.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface XXAnnotation2 {
	//返回值是基本类型
	int age();
	
	//返回值是String类型
	String name();
	
	//返回值是enum类型
	Sex sex();
	
	//返回值是类，这里的例子可能太特殊了，也可以是其他任何类
	Class handlerClass();
	
	//返回值是Annotation类型，注意这里不要在注解前面加@符号
	Deprecated deprecated();
}