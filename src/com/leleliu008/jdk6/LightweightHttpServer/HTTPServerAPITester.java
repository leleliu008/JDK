package com.leleliu008.jdk6.LightweightHttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import sun.net.www.protocol.http.HttpURLConnection;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


/**
 * 轻量级Http Server测试
 * @author leleliu008
 * @date 2012.09.10
 */
public class HTTPServerAPITester {
	
	public static void main(String[] args) {
		try {
			//设置HttpServer的端口为8888
			InetSocketAddress address = new InetSocketAddress(8889);
			HttpServer httpServer = HttpServer.create(address, 0);
			//用MyHandler类内处理到/chinajash的请求
			httpServer.createContext("/Home", new MyHandler());
			//creates a default executor
			httpServer.setExecutor(null); 
			httpServer.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class MyHandler implements HttpHandler {
	
	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		StringBuilder response = new StringBuilder();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(HTTPServerAPITester.class.getResourceAsStream("index.html")));
		String linStr = null;
		while ((linStr = bufferedReader.readLine()) != null) {
			response.append(linStr);
		}
		httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 
										 response.toString().getBytes().length);
		OutputStream os = httpExchange.getResponseBody();
		os.write(response.toString().getBytes());
		os.close();

	}
	
}
