package com.leleliu008.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 异常处理过程测试——一般情况
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test6 {

	public static void main(String[] args) {
		readFile();
	}
	
	public static void readFile() {
		File file = new File("D:/");
		try {
			System.out.println("-------->>try block");
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("-------->>FileNotFoundException");
		} catch (IOException e) {
			System.out.println("-------->>IOException");
		} catch (Exception e) {
			System.out.println("-------->>Exception");
		} finally {
			System.out.println("-------->>finally block");
		}
		System.out.println("-------->>after finally");
	}
}
