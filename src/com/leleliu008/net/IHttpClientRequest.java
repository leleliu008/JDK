package com.leleliu008.net;

import java.io.IOException;
import java.net.HttpURLConnection;

/* 使用HttpClient协议请求网络连接 */
interface IHttpClientRequest {
	
	byte[] request(HttpURLConnection httpURLConnection) throws IOException;
}
