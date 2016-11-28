package com.lanccj.manage.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.lanccj.manage.model.Service;

public class IndexController extends Controller {
	/**
	 *跳转到系统欢迎首页 
	 */
	public void index() {
		Service service = getModel(Service.class);
		Page<Service> page=Service.dao.paginate(getParaToInt("pageCurrent", 1), getParaToInt("pageSize",999), service);
		setAttr("page", page);
		render("/index.jsp"); 
	}
	
	public void main() {
		render("main.jsp"); 
	}
	
	/**
	 *跳转到用户登录界面
	 */
	public void toLogin(){
		render("login.jsp");
	}
	
	/**
	 * 用户登录
	 */
	public void login(){
		render("index.jsp");
	}
}





