package com.lanccj.services.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerElements {
	private Object object;
	private Method method;

	public HandlerElements(Object object, Method method) {
		super();
		this.object = object;
		this.method = method;
	}

	public Object handle(HttpServletRequest request, HttpServletResponse response){
		try {
			return method.invoke(object, request,response);
		} catch (IllegalArgumentException e) {
			throw new ServerException(-1);
		} catch (IllegalAccessException e) {
			throw new ServerException(-1);
		} catch (InvocationTargetException e) {
			throw new ServerException(-1);
		}
	}
}
