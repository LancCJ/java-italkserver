package com.lanccj.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.response.TestResponce;

public class SystemServices {
	public Responce getCurrentTime(HttpServletRequest request, HttpServletResponse response){
		checkParams(response);
		TestResponce testResponce=new TestResponce();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		testResponce.setTime(simpleDateFormat.format(new Date()));
		testResponce.setUser_id("1001");
		return testResponce;
	}

	private void checkParams(HttpServletResponse response) {
		
	}
}
