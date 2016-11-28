package com.lanccj.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import com.alibaba.fastjson.JSONObject;

/**
 * 用于测试该项目http请求
 * @author 健
 *
 */
public class MyHttpClient {
	
	public static void main(String[] args) {
		post();
	}
	
	public static void post() {  
		// 创建默认的httpClient实例.    
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		// 创建httppost    
		HttpPost httppost = new HttpPost("http://localhost/services/user/login.json"); 
		
		//JSON提交
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("userName", "lanccj");
		jsonObject.put("userPwd", "123456");
		StringEntity uefEntity=new StringEntity(jsonObject.toString(),"utf-8");
		uefEntity.setContentEncoding("UTF-8");
		uefEntity.setContentType("application/json");
		try {  
			httppost.setEntity(uefEntity);  
			System.out.println("executing request " + httppost.getURI());  
			CloseableHttpResponse response = httpclient.execute(httppost);  
			try {  
				HttpEntity entity = response.getEntity();  
				if (entity != null) {  
					System.out.println("--------------------------------------");  
					System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));  
					System.out.println("--------------------------------------");  
				}  
			} finally {  
				response.close();  
			}  
		} catch (ClientProtocolException e) {  
			e.printStackTrace();  
		} catch (UnsupportedEncodingException e1) {  
			e1.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		} finally {  
			// 关闭连接,释放资源    
			try {  
				httpclient.close();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	} 
}
