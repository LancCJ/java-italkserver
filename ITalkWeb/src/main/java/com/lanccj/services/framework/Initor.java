package com.lanccj.services.framework;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.lanccj.manage.model.Service;

public class Initor {
	public static Initor initor=new Initor();
	private String path=Initor.class.getResource("/servicesconfig.xml").getPath();
	private HashMap<String,HandlerElements> map=new HashMap<String,HandlerElements>();
	
	public void initDB(){
		List<Service> list=Service.dao.find("select * from service");
		for (int i = 0; i < list.size(); i++) {
			String urlPath=list.get(i).getServiceName();
			String className=list.get(i).getServiceClass();
			String handleMethod=list.get(i).getServiceMethod();
			//读取数据库接口服务资源表
			HandlerElements handlerElements=getElement(className,handleMethod);
			map.put(urlPath,handlerElements );
		}
		
	}
	
	public void init(){
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		try {
			Document document=documentBuilderFactory.newDocumentBuilder().parse(path);
			documentMap(document);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void documentMap(Document document) {
		NodeList nodeList=document.getElementsByTagName("action");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element=(Element)nodeList.item(i);
			String urlPath=element.getAttribute("name");
			String className=element.getElementsByTagName("handleClass").item(0).getFirstChild().getNodeValue();
			String handleMethod=element.getElementsByTagName("handleMethod").item(0).getFirstChild().getNodeValue();

			HandlerElements handlerElements=getElement(className,handleMethod);

			if(handlerElements!=null){
				map.put(urlPath, handlerElements);
			}
		}
	}
	@SuppressWarnings("unchecked")
	private HandlerElements getElement(String className, String handleMethod) {
		HandlerElements handlerElements=null;
		Object object=null;
		Method method=null;
		@SuppressWarnings("rawtypes")
		Class  clazzClass=null;
		if(!map.containsKey(className)){
			try {
				clazzClass=Class.forName(className);
				if(clazzClass!=null){
					object=clazzClass.newInstance();
					method=clazzClass.getMethod(handleMethod, HttpServletRequest.class, HttpServletResponse.class);
					handlerElements=new HandlerElements(object,method);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return handlerElements;
	}

	public HandlerElements getHandler(String className){
		return map.get(className);
	}
}
