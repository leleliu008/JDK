package com.leleliu008.JMM;

/**
 * 
 * @author leleliu008
 * @date 2012.12、05
 */

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(getMB(runtime.totalMemory()));
		System.out.println(getMB(runtime.freeMemory()));
		System.out.println(getMB(runtime.maxMemory()));
	}
	
	public static long getMB(long x) {
		return x / (1024 * 1024);
	}
}
