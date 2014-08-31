package com.leleliu008.jdk6.WebService;

import javax.xml.ws.Endpoint;

/**
 * WebServices测试
 * @author leleliu008
 * @date 2012.09.13
 */

public class WebServicesTest {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/HelloService", new Hello());
	}
}

class Hello {
	public String sayHello() {
		return "Hello World !";
	}
}
