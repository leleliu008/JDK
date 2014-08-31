package com.leleliu008.jdk6.LightweightHttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Http协议测试
 * @author leleliu008
 * @date 2012.07.21
 */

public class HTTPTest {

	public static void main(String[] args) {
		String urlPath = "http://www.baidu.com";
		BufferedReader bufferedReader = null;
		try {
			URL url = new URL(urlPath);
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			bufferedReader = new BufferedReader(new InputStreamReader(is));
			String lineStr = null;
			while ((lineStr = bufferedReader.readLine()) != null) {
				System.out.println(lineStr);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
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
