package com.leleliu008.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 将错误信息输出到特定的流中
 * @author leleliu008
 * @date 2012.12.23
 */

public class ThrowableTest2 {

	public static void main(String[] args) {
		try {
			new ThrowableTest2().a();
		} catch (MyException e) {
			PrintStream printStream = null;
			try {
				File file = new java.io.File("D:/a.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				printStream = new PrintStream(file);
				e.printStackTrace(printStream);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				if (null != printStream) {
					printStream.close();
				}
			}
		}
	}
	
	public void a() throws MyException {
		try {
			b();
		} catch (MyException e) {
			throw e;
		}
	}
	
	public void b() throws MyException {
		c();
	}
	
	public void c() throws MyException {
		throw new MyException("原始异常");
	}
}
