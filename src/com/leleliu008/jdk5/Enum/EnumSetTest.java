package com.leleliu008.jdk5.Enum;

import java.util.EnumSet;

/**
 * EnumSet测试
 * @author leleliu008
 * @date 2012.12.07
 */

public class EnumSetTest {

	public static void main(String[] args) {
		//EnumSet的noneOf方法创建指定枚举类型的空EnumSet  
        EnumSet<WeekDay> weekDay = EnumSet.noneOf(WeekDay.class);  
        weekDay.add(WeekDay.MON);  
        System.out.println(weekDay);  
        
        //EnumSet的of方法创建包含指定枚举类型元素的EnumSet  
        weekDay.addAll(EnumSet.of(WeekDay.THU, WeekDay.WED, WeekDay.THU));  
        System.out.println(weekDay);  
        
        //EnumSet的allOf方法创建包含指定枚举类型所有元素的EnumSet  
        weekDay = EnumSet.allOf(WeekDay.class);  
        System.out.println(weekDay);  
        weekDay.removeAll(EnumSet.of(WeekDay.FRI, WeekDay.SAT, WeekDay.SUN));  
        System.out.println(weekDay);
        
		//EnumSet的range方法创建包含指定枚举类型两个元素之间的EnumSet  
		weekDay.removeAll(EnumSet.range(WeekDay.MON, WeekDay.WED));  
		System.out.println(weekDay);  
		
		//EnumSet的complementOf方法创建指定EnumSet所不包含元素的EnumSet  
		weekDay.removeAll(EnumSet.complementOf(weekDay));  
		System.out.println(weekDay);  
	}
}
