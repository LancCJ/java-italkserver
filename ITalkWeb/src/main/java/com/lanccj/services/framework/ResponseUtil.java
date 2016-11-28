package com.lanccj.services.framework;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

public class ResponseUtil {
	public static void response(String jsonBody,HttpServletRequest request, HttpServletResponse response) throws  IOException{
		ByteArrayOutputStream baseOut=new ByteArrayOutputStream(512);
		OutputStream out=baseOut;
		int origSize=jsonBody.getBytes().length;
		out.write(jsonBody.getBytes("UTF8"));
		out.close();

		response.setHeader("Content-Length", String.valueOf(baseOut.size()));
		response.setHeader("Or-Content-Length", String.valueOf(origSize));

		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type","application/json");
		baseOut.writeTo(response.getOutputStream());
	}

	public static void response(int code,HttpServletResponse response)throws  IOException{
		Responce rsp=new Responce();
		rsp.setCode(code);
		response(JSON.toJSONString(rsp),null,response);
	}
}
