package com.leleliu008.net;

import java.io.IOException;

/* 使用Http + url协议请求网络连接 */
interface IHttpUrlRequest {
	
	byte[] request(String urlStr) throws IOException;
}
