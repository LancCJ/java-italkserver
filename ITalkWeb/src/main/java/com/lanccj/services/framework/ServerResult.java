package com.lanccj.services.framework;

import com.lanccj.manage.model.State;

import java.util.HashMap;
import java.util.List;

public class ServerResult {
	private Integer code;
	private String resultMessage;
	public static HashMap<Integer, String> resultCodeHashMap = new HashMap<Integer, String>();
	// 此处数据来源改成数据库来源
		static {
			List<State> list=State.dao.find("select * from state");
			for (int i = 0; i < list.size(); i++) {
				resultCodeHashMap.put(list.get(i).getStateId(), list.get(i).getStateMsg());
			}
		}

	public static String getMsg(int code) {
		return resultCodeHashMap.get(code);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
		this.resultMessage = resultCodeHashMap.get(code);
	}
	
	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ServerResult(Integer code) {
		this.code = code;
		if(resultCodeHashMap.get(code)==null){
			this.resultMessage="服务器内部错误";
		}else{
			this.resultMessage = resultCodeHashMap.get(code);
		}
	}

	
}
