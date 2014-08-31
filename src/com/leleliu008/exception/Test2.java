package com.leleliu008.exception;

import java.io.File;
import java.io.FileNotFoundException;


/**
 * throws关键字与throw关键字组合使用的情况示例
 * @author leleliu008
 * @date 2012.12.18
 */

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		new Test2().readFile();
	}
	
	public void readFile() throws FileNotFoundException {
		File file = new File("D:/");
		if (!file.exists()) {
			throw new FileNotFoundException("文件不存在！");
		}
	}
}
