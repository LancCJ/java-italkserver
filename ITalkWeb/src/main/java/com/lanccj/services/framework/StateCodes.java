package com.lanccj.services.framework;

/**
 * 系统状态码
 * */
public class StateCodes {
    public static final Integer INTERNAL_ERROR = -1;//内部错误
    public static final Integer SUCCESS = 0;//请求成功
	public static final Integer ERROR = 1;//响应失败

	//登录状态码
	public static final Integer USER_LOGIN_NO_PARAMS = 103;//缺少参数
	public static final Integer USER_LOGIN_PARAMS_NO_USERNAME = 104;//缺少用户名
	public static final Integer USER_LOGIN_PARAMS_NO_USERPWD = 105;//缺少密码
	public static final Integer USER_LOGIN_PARAMS_USERNAMENOTMATCHPWD = 106;//用户密码不匹配

}
