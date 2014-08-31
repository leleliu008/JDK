package com.leleliu008.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * throws关键字单独使用的情况示例
 * @author leleliu008
 * @date 2012.12.18
 */

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		new Test1().readFile();
	}
	
	
	public void readFile() throws FileNotFoundException {
		File file = new File("D:/");
		FileReader fileReader = new FileReader(file);
	}
}
