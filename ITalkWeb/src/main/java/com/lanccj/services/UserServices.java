package com.lanccj.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;
import com.lanccj.manage.model.User;
import com.lanccj.services.framework.StateCodes;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.param.LoginParams;
import com.lanccj.services.response.LoginResponse;
import com.lanccj.services.validate.Validate;
import com.lanccj.util.MyUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.UUID;

/**
 * 用户服务接口
 * @author 健
 */
public class UserServices {
    private static Logger logger = LogManager.getLogger("UserServices");
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @return
	 */
	public Responce login(HttpServletRequest request, HttpServletResponse response){
		Responce responce=new Responce();
        String ParamsJson= MyUtils.getBodyContent(request);
		if(Validate.checkLoginParams(ParamsJson,responce)){
            LoginParams loginParams=JSON.parseObject(ParamsJson, LoginParams.class);
			User user=User.dao.findFirst("select * from user where user_name=? and user_pwd=?",loginParams.getUserName(),loginParams.getUserPwd());
			if(user!=null){
				LoginResponse loginResponse=new LoginResponse();

				loginResponse.setUserId(user.getUserId().toString());
				loginResponse.setUserPhone(user.getUserPhone());
				loginResponse.setUserName(user.getUserName());
				loginResponse.setUserPwd(user.getUserPwd());
				loginResponse.setUserNick(user.getUserNick());
                loginResponse.setUserGroup(user.getUserGroup());
				loginResponse.setToken(UUID.randomUUID().toString());

				responce.setData(loginResponse);
				responce.setCode(StateCodes.SUCCESS);
			}else{
				responce.setCode(StateCodes.USER_LOGIN_PARAMS_USERNAMENOTMATCHPWD);
			}
		}
        logger.info("用户登录返回JOSN:"+responce.toString());
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
