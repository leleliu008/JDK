package com.leleliu008.jdk5.Enum;

/**
 * 最简单的枚举
 * @author leleliu008
 * @date 2012.12.10
 */
public enum WeekDay2 {
	SUN {
		@Override
		public WeekDay2 next() {
			return MON;
		}
	},  //星期日
	MON {
		@Override
		public WeekDay2 next() {
			return TUES;
		}
	},  //星期一
	TUES {
		@Override
		public WeekDay2 next() {
			return WED;
		}
	}, //星期二
	WED {
		@Override
		public WeekDay2 next() {
			return THU;
		}
	},  //星期三
	THU {
		@Override
		public WeekDay2 next() {
			return FRI;
		}
	},  //星期四
	FRI {
		@Override
		public WeekDay2 next() {
			return SAT;
		}
	},  //星期五
	SAT {
		@Override
		public WeekDay2 next() {
			return SUN;
		}
	};  //星期六
	
	//抽象方法，在子类中实现
	public abstract WeekDay2 next();
	
	
	public static void main(String[] args) {
		WeekDay2 weekDay = WeekDay2.SUN;
		
		//输出当前星期的名称
		System.out.println(weekDay.name());
		
		//输出当前星期的位置
		System.out.println(weekDay.ordinal());
		
		//输出当前星期的名称，toString方法的值与name方法的值是相同的
		System.out.println(weekDay.toString());
		
		//比较当前星期与另一星期比较，返回值是当前星期的位置减去另一星期的位置的结果
		System.out.println(weekDay.compareTo(WeekDay2.SAT));
		
		//此方法是我们自己加入的方法，第二天是星期几
		System.out.println(weekDay.next());
		
		System.out.println("-------------------------------");
		
		//values静态方法返回所有的星期的集合，可以使用在增强的for循环中
		for (WeekDay2 weekDay2 : WeekDay2.values()) {
			System.out.println(weekDay2);
		}
       
		System.out.println("-------------------------------");
		
		//枚举也可以用在switch语句中
		switch (weekDay) {
		case SUN:
			System.out.println("星期日");
			break;
		case MON:
			System.out.println("星期一");
			break;
		default:
			break;
		}
		
		System.out.println("-------------------------------");
		
		//也可以通过一个字符串构造一个枚举值
		WeekDay weekDay3 = WeekDay.valueOf("FRI");
		System.out.println(weekDay3);
	}

}
