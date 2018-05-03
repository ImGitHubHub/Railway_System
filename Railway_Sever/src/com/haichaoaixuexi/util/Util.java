package com.haichaoaixuexi.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Util {

	public static String getCurrentDate() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}
	public static String getImageStr(String imgFile) {// ��ͼƬ�ļ�ת��Ϊ�ֽ������ַ��������������Base64���봦��  
		//String imgFile = "d:\\111.jpg";// �������ͼƬ  
		InputStream in = null;  
		byte[] data = null;  
		// ��ȡͼƬ�ֽ�����  
		try {  
		in = new FileInputStream(imgFile);  
		data = new byte[in.available()];  
		in.read(data);  
		in.close();  
		} catch (IOException e) {  
		e.printStackTrace();  
		}  
		// ���ֽ�����Base64����  
		BASE64Encoder encoder = new BASE64Encoder();  
		return encoder.encode(data);// ����Base64��������ֽ������ַ���  
		}  
		  
		/** 
		* ���ַ���תΪͼƬ 
		* @param imgStr 
		* @return 
		*/  
		public static boolean generateImage(String imgStr,String imgFile)throws Exception {// ���ֽ������ַ�������Base64���벢����ͼƬ  
		if (imgStr == null) // ͼ������Ϊ��  
		return false;  
		BASE64Decoder decoder = new BASE64Decoder();  
		try {  
		// Base64����  
		byte[] b = decoder.decodeBuffer(imgStr);  
		for (int i = 0; i < b.length; ++i) {  
		if (b[i] < 0) {// �����쳣����  
		b[i] += 256;  
		}  
		}  
		// ����jpegͼƬ  
		String imgFilePath = imgFile;// �����ɵ�ͼƬ  
		OutputStream out = new FileOutputStream(imgFilePath);  
		out.write(b);  
		out.flush();  
		out.close();  
		return true;  
		} catch (Exception e) {  
		throw e;  
		}  
		}  
/*		public static void main(String[] args) {
			String string = getImageStr("D:\\������\\������\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Railway_Sever\\upload\\1522744940114.png");
			System.out.println(string);
			try {
				generateImage(string, "D:\\1.png");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
}
