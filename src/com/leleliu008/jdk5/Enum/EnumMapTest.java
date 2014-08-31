package com.leleliu008.jdk5.Enum;

import java.util.EnumMap;
import java.util.Map;

/**
 * EnumMap测试
 * @author leleliu008
 * @date 2012.12.07
 */

public class EnumMapTest {

	public static void main(String[] args) {
		EnumMap<WeekDay, Command> enumMap = new EnumMap<WeekDay, Command>(WeekDay.class);
		enumMap.put(WeekDay.MON, new Command() {
			
			@Override
			public void doAction() {
				System.out.println("星期一是红色的，充满激情，加班");
			}
		});
		enumMap.put(WeekDay.TUES, new Command() {
			
			@Override
			public void doAction() {
				System.out.println("星期二是橙色的，过度到金色的心情，仔细想想");
			}
		});
		enumMap.put(WeekDay.WED, new Command() {
			
			@Override
			public void doAction() {
				System.out.println("星期三是金色的，一周中最黄金的时间，好好学习");
			}
		});
		enumMap.put(WeekDay.THU, new Command() {
			
			@Override
			public void doAction() {
				System.out.println("星期四是咖啡色，幽香的咖啡，看看书");
			}
		});
		enumMap.put(WeekDay.FRI, new Command() {
			
			@Override
			public void doAction() {
				System.out.println("星期五是绿色的，一周结束，放松下心情，看电影");
			}
		});
		
		for (Map.Entry<WeekDay, Command> entry: enumMap.entrySet()) {
			System.out.print(entry.getKey() + ":");
			entry.getValue().doAction();
		}
		
		try {
			enumMap.get(WeekDay.SUN).doAction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

interface Command {
	void doAction();
}
