package com.sss.util;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptographyUtil {

	/**
	 * base64����
	 * @param str
	 * @return
	 */
	public static String encBase64(String str){
		return Base64.encodeToString(str.getBytes());
	}
	
	/**
	 * base64����
	 * @param str
	 * @return
	 */
	public static String decBase64(String str){
		return Base64.decodeToString(str);
	}
	
	/**
	 * Md5����
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="345";
		System.out.println("Base64���ܣ�"+CryptographyUtil.encBase64(password));
		System.out.println("Base64���ܣ�"+CryptographyUtil.decBase64(CryptographyUtil.encBase64(password)));
		
		System.out.println("Md5���ܣ�"+CryptographyUtil.md5(password, "csh"));
	}
}
