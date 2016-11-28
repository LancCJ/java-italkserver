package com.lanccj.services.framework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

public class ResourceApi extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解析出接口的请求路径
		String[] path=request.getRequestURI().toString().split("/");
		String action="";
		for (int i = 2; i < path.length; i++) {
			if(i!=2)action+="/";
			action+=path[i];
		}
		try {
			HandlerElements handlerElements=Initor.initor.getHandler(action);
			if(handlerElements!=null){
				Responce responce=(Responce)handlerElements.handle(request, response);
				ResponseUtil.response(JSON.toJSONString(responce),request, response);
			}
		} catch (ServerException e) {
			ResponseUtil.response(e.getCode(), response);
		}catch (Exception e) {
			ResponseUtil.response(-1, response);
		}
	}

	@Override
	public void init() throws ServletException {
		//Initor.initor.init();//初始化配置文件中的接口服务 加载中系统中
		Initor.initor.initDB();//初始化数据库配置的接口服务 加载到系统中
	}


}
