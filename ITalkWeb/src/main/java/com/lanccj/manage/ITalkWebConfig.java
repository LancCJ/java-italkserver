package com.lanccj.manage;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.lanccj.handler.MyUrlSkipHandler;
import com.lanccj.manage.controller.IndexController;
import com.lanccj.manage.controller.MenuController;
import com.lanccj.manage.controller.ServiceController;
import com.lanccj.manage.model._MappingKit;

public class ITalkWebConfig extends JFinalConfig{


	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		// 加载少量必要配置，随后可用PropKit.get(...)获取值
		PropKit.use("Jfinalconfig.txt");
		me.setDevMode(PropKit.getBoolean("devMode", true));
		me.setError403View("/common/403.jsp");
	    me.setError404View("/common/404.jsp");
	    me.setError500View("/common/500.jsp");
	    me.setViewType(ViewType.JSP);
	    me.setEncoding("utf-8");
	    me.setBaseViewPath("WEB-INF/content/");
	    me.setMaxPostSize(20971520);
	}

	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		me.add("/", IndexController.class);	
		me.add("/Service", ServiceController.class,"/service");	
		me.add("/Menu", MenuController.class,"/menu");	
	}
	
	public C3p0Plugin createC3p0Plugin() {
		return createC3p0Plugin("jdbcUrl", "user", "password","driver");
	}
	
	public C3p0Plugin createC3p0Plugin(String jdbcUrl,String user,String password,String driver) {
		return new C3p0Plugin(PropKit.get(jdbcUrl).trim(), PropKit.get(user).trim(), PropKit.get(password).trim(),PropKit.get(driver).trim());
	}

	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
				// 配置C3p0数据库连接池插件
				C3p0Plugin C3p0Plugin = createC3p0Plugin();
				me.add(C3p0Plugin);
		
				// 配置ActiveRecord插件
				ActiveRecordPlugin arp = new ActiveRecordPlugin(C3p0Plugin);
				arp.setShowSql(true);
				me.add(arp);
				
				// 所有配置在 MappingKit 中搞定
				_MappingKit.mapping(arp);
	}

	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		
	}

	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		me.add(new MyUrlSkipHandler("/api/*", false));//将api的请求直接放过 交给接口Servlet API处理
		me.add(new ContextPathHandler("BASE_PATH"));
	}


}
