package com.leleliu008.exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * @author leleliu008
 * @date 2012.12.22
 */

public class Test10 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fin = new FileInputStream("D:/a.txt");
			InputStreamReader isReader = new InputStreamReader(fin);
			br = new BufferedReader(isReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
