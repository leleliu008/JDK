package com.leleliu008.net.test;

import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.TestCase;

import com.leleliu008.net.HttpRequestManager;
import com.leleliu008.net.RequestMethod;

public final class HttpTest extends TestCase {

	private HttpRequestManager httpRequestManager;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		httpRequestManager = new HttpRequestManager();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		httpRequestManager = null;
	}
	
	/* 使用HttpUrlConnection下载图片 */
	public void test1() throws IOException {
		//保存为文件，一般会保存为零时文件，等下载完成后再改成正常的后缀名
		FileOutputStream fos = null;
		try {
			String url = "http://www.baidu.com/img/bdlogo.png";
			//String url = "http://localhost:8080/asf-logo.png";
			byte[] result = httpRequestManager.request(RequestMethod.HttpUrlConnection, url);
			if (result != null) {
				fos = new FileOutputStream("a.png");
				fos.write(result);
				fos.flush();
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}
	
	/* 使用HttpUrlConnection下载html */
	public void test2() throws IOException {
		//保存为文件，一般会保存为零时文件，等下载完成后再改成正常的后缀名
		FileOutputStream fos = null;
		try {
			String url = "http://www.baidu.com";
			byte[] result = httpRequestManager.request(RequestMethod.HttpUrlConnection, url);
			if (result != null) {
				fos = new FileOutputStream("a.html");
				fos.write(result);
				fos.flush();
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}
}
