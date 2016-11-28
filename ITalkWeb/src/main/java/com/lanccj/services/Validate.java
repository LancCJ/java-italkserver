package com.lanccj.services;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import com.alibaba.fastjson.JSON;
import com.lanccj.services.framework.Constant;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.login.LoginParams;

public class Validate {
	/**
	 * 检测 登录参数
	 * @param request
	 * @param loginResponse
	 */
	public static boolean checkLoginParams(HttpServletRequest request,Responce responce) {
		boolean flag=false;
		//是否无参数
		if(request.getParameter("Params")==null || (StringUtils.isEmpty(request.getParameter("Params")) && request.getParameter("Params")!=null)){
			responce.setCode(Constant.USER_LOGIN_NO_PARAMS);
		}else {
			LoginParams loginParams=JSON.parseObject(request.getParameter("Params"), LoginParams.class);
			if(StringUtils.isEmpty(loginParams.getUserName())){
				responce.setCode(Constant.USER_LOGIN_PARAMS_NO_USERNAME);
			}else if(StringUtils.isEmpty(loginParams.getUserPwd())){
				responce.setCode(Constant.USER_LOGIN_PARAMS_NO_USERPWD);
			}else{
				flag=true;
			}
		}
		return flag;
	}
}
