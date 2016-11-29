package com.lanccj.util;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


public class MyUtils {
	/**
	 * 获取请求bodu主体JSON数据
	 * @param request
	 * @return
	 */
	public static String getBodyContent(HttpServletRequest request)  
	{  
		String str = "";
		try {
			BufferedReader br=request.getReader();
			String inputLine;

			while ((inputLine = br.readLine()) != null) {
				str += inputLine;
			}
			br.close();
		} catch (IOException e) {
			System.out.println("获取请求BodyContent发生异常IOException: " + e);
		}
		return str;
	}
}
