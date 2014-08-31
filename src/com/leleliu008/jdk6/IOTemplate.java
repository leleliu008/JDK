package com.leleliu008.jdk6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模板测试
 * @author leleliu008
 * @date 2012.07.17
 */

public class IOTemplate {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
			String lineStr = null;
			while ((lineStr = bufferedReader.readLine()) != null) {
				System.out.println(lineStr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
