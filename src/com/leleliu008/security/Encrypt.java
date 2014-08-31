package com.leleliu008.security;

import java.io.InputStream;
import java.security.cert.X509Certificate;

import sun.security.pkcs.PKCS7;

/**
 * RSA加密解密
 * 
 * @author leleliu008
 * @date 2013-7-21
 */
public class Encrypt {

	public static void main(String[] args) throws Exception {
		InputStream inputStream = Encrypt.class.getResourceAsStream("CERT.RSA");
		PKCS7 pkcs7 = new PKCS7(inputStream);
		X509Certificate publicKey = pkcs7.getCertificates()[0];

		System.out.println("issuer:" + publicKey.getIssuerDN());
		System.out.println("subject:" + publicKey.getSubjectDN());
		System.out.println("serialNumber:" + publicKey.getSerialNumber());
		System.out.println(publicKey.getPublicKey());
	}
}
