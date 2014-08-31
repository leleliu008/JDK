package com.leleliu008.jdk5.AutoBoxing;

import java.util.ArrayList;

/**
 * 自动装箱和自动拆箱
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		//自动装箱，add方法的参数接收的是Integer类型的参数，现在是基本数据类型int
		nums.add(1);  
		nums.add(2);
		
		for (Integer num : nums) {
			//自动拆箱，num是Integer类型的，与int类型相加先拆箱
			//Integer先自动转换为int进行加法运算
			System.out.println(num + 3);		
		}
		
		for (int num : nums) {//自动拆箱，num是int类型的，而nums集合中的元素是Integer类型的
			System.out.println(num + 3);		
		}
	}
}
