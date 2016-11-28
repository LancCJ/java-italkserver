package com.lanccj.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;
import com.lanccj.manage.model.User;
import com.lanccj.services.framework.Constant;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.framework.ServerResult;
import com.lanccj.services.login.LoginParams;
import com.lanccj.services.model.LoginResponse;

/**
 * 用户服务接口
 * @author 健
 */
public class UserServices {
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @return
	 */
	public Responce login(HttpServletRequest request, HttpServletResponse response){
		Responce responce=new Responce();
		if(Validate.checkLoginParams(request,responce)){
			LoginParams loginParams=JSON.parseObject(request.getParameter("Params"), LoginParams.class);
			User user=User.dao.findFirst("select * from user where user_name=? and user_pwd=?",loginParams.getUserName(),loginParams.getUserPwd());
			if(user!=null){
				LoginResponse loginResponse=new LoginResponse();
				loginResponse.setPhoneNum(user.getUserPhone());
				loginResponse.setUserName(user.getUserName());
				loginResponse.setReaylName(user.getUserNick());
				responce.setData(loginResponse);
				responce.setCode(Constant.USER_LOGIN_SUCCESS);
			}else{
				responce.setCode(Constant.USER_LOGIN_PARAMS_USERNAMENOTMATCHPWD);
			}
		}
		return responce;
	}
	
	/**
	 * 检查用户是否存在
	 * @param userName
	 * @return
	 */
	public boolean isExist(String userName){
		boolean flag=false;
		User user=User.dao.findFirst("select * from user where user_name='"+userName+"'");
		if(user!=null)flag=true;
		return flag;
	}

	
}
