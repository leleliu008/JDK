package com.leleliu008.jdk5.Enum;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 用此类来模拟enum
 * @author leleliu008
 * 2012.12.05
 */
public class EnumMock implements Comparable<EnumMock>, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final EnumMock SUN = new EnumMock(0, "SUN");
	public static final EnumMock MON = new EnumMock(1, "MON");
	public static final EnumMock TUES = new EnumMock(2, "TUES");
	public static final EnumMock WED = new EnumMock(3, "WED");
	public static final EnumMock THUR = new EnumMock(4, "THUR");
	public static final EnumMock FRI = new EnumMock(5, "FRI");
	public static final EnumMock SAT = new EnumMock(6, "SAT");
	
	//星期是顺序，星期日为0，依次类推
	private int order;
	//星期名称
	private String name;
	
	
	//私有化构造方法，防止外部调用
	private EnumMock(){}
	
	private EnumMock(int order, String name) {
		this.order = order;
		this.name = name;
	}
	
	//取得名称
	public String name() {
		return name;
	}
	
	//取得顺序
	public int ordinal() {
		return order;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static EnumMock valueOf(String name) throws Exception {
		if (null != name) {
			if ("SUN".equals(name)) {
				return SUN;
			} else if ("MON".equals(name)) {
				return MON;
			} else if ("TUES".equals(name)) {
				return TUES;
			} else if ("WED".equals(name)) {
				return WED;
			} else if ("THUR".equals(name)) {
				return THUR;
			} else if ("FRI".equals(name)) {
				return FRI;
			} else if ("SAT".equals(name)) {
				return SAT;
			}
		} 
		throw new Exception();
	}
	
	@Override
	public int compareTo(EnumMock weekDay) {
		if (this == weekDay) {
			return 0;
		} else {
			if (this.order < weekDay.order) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	//不能进行克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone()");
		throw new CloneNotSupportedException();
	}

	//不能进行序列化
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("readObject()");
        throw new InvalidObjectException("can't deserialize enum");
	}
	
	private void readObjectNoData() throws ObjectStreamException {
		System.out.println("readObjectNoData()");
	    throw new InvalidObjectException("can't deserialize enum");
	}
	
	private void readResolve() throws InvalidObjectException {
		System.out.println("readResolve()");
		throw new InvalidObjectException("can't deserialize enum");
	}
	
}
