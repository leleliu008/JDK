package com.leleliu008.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 执行命令帮助类
 * 
 * @author leleliu008
 *
 */
public final class Exec {

	public static String exec(String command) {
		BufferedReader br = null;
		try {
			Process process = Runtime.getRuntime().exec(command);
			process.waitFor();
			InputStream is = process.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			StringBuilder result = new StringBuilder();
			String lineStr = null;
			while ((lineStr = br.readLine()) != null) {
				result.append(lineStr + "\n");
			}
			return result.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
