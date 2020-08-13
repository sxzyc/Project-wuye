package com.room.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * @ClassName: MD5Util
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:42:13
 * @param:
 */
public class MD5Util {
	
	public static String encode(String orgStr){
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] dest = md.digest(orgStr.getBytes());
		BASE64Encoder base = new BASE64Encoder();
		return base.encode(dest);
	}
	
}