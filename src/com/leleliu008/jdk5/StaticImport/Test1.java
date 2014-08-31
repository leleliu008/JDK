package com.leleliu008.jdk5.StaticImport;


/**
 * 不使用静态导入的情况下
 * 计算两点间的距离（x1,y1)——>（x0,y0)
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Math.sin(Math.PI / 2)); //无需再写Math.了
		System.out.println(Math.cos(Math.PI / 2)); //无需再写Math.了
		
		double x1 = 3;
		double y1 = 4;
		double x0 = 0;
		double y0 = 0;
		double result = Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2));
		System.out.println(result);
	}
}
