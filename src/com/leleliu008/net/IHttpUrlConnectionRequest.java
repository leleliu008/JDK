package com.leleliu008.net;

import java.io.IOException;
import java.net.HttpURLConnection;

/* 使用Http + url协议请求网络连接 */
interface IHttpUrlConnectionRequest {
	
	byte[] request(HttpURLConnection httpURLConnection) throws IOException;
}
