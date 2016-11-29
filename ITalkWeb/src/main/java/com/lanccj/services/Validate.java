package com.lanccj.services;

import org.apache.commons.lang.StringUtils;
import com.alibaba.fastjson.JSON;
import com.lanccj.services.framework.StateCodes;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.login.LoginParams;

public class Validate {
	/**
	 * 检测 登录参数
	 * @param ParamsJson
	 * @param responce
	 */
	public static boolean checkLoginParams(String ParamsJson,Responce responce) {
		boolean flag=false;
        //是否无参数
		if(("{}".equals(ParamsJson)) || ParamsJson==null || (StringUtils.isEmpty(ParamsJson) && ParamsJson!=null)){
			responce.setCode(StateCodes.USER_LOGIN_NO_PARAMS);
		}else {
			LoginParams loginParams=JSON.parseObject(ParamsJson, LoginParams.class);
			if(StringUtils.isEmpty(loginParams.getUserName())){
				responce.setCode(StateCodes.USER_LOGIN_PARAMS_NO_USERNAME);
			}else if(StringUtils.isEmpty(loginParams.getUserPwd())){
				responce.setCode(StateCodes.USER_LOGIN_PARAMS_NO_USERPWD);
			}else{
				flag=true;
			}
		}
		return flag;
	}
}
