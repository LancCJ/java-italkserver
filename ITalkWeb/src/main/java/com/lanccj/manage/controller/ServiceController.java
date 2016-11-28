package com.lanccj.manage.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.lanccj.manage.model.Service;

public class ServiceController extends Controller{
	public void list() {
		Service service = getModel(Service.class);
		Page<Service> page=Service.dao.paginate(getParaToInt("pageCurrent", 1), getParaToInt("pageSize",10), service);
		setAttr("page", page);
		render("list.jsp"); 
	}
}
