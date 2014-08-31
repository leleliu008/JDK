package com.leleliu008.jdk5.StaticImport;

//import static java.lang.Math.*;

import static java.lang.Math.sin;//导入Math类中的sin方法
import static java.lang.Math.cos;//导入Math类中的cos方法
import static java.lang.Math.pow;//导入Math类中的pow方法
import static java.lang.Math.sqrt;//导入Math类中的sqrt方法
import static java.lang.Math.PI;;//导入Math类中的PI域

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println(sin(PI / 2)); //无需再写Math.了
		System.out.println(cos(PI / 2)); //无需再写Math.了
		
		double x1 = 3;
		double y1 = 4;
		double x0 = 0;
		double y0 = 0;
		double result = sqrt(pow((x1 - x0), 2) + pow((y1 - y0), 2));
		System.out.println(result);
	}
}
