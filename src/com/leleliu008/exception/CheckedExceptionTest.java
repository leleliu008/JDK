package com.leleliu008.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 编译时异常测试
 * @author leleliu008
 * @date 2012.12.03
 */

public class CheckedExceptionTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			new CheckedExceptionTest().readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		new CheckedExceptionTest().readFile();
		
		
		//特例
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				File file = new File("D:/");
				try {
					FileReader fileReader = new FileReader(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	public void readFile() throws FileNotFoundException {
		File file = new File("D:/");
		FileReader fileReader = new FileReader(file);
	}
}