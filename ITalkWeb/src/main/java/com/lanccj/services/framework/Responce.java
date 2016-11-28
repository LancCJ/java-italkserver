package com.lanccj.services.framework;

import java.util.HashMap;
import java.util.List;
import com.lanccj.manage.model.State;

public class Responce {
	private Integer code;
	private String message;
	private Object data;

	public static HashMap<Integer, String> resultCodeHashMap = new HashMap<Integer, String>();
	// 此处数据来源改成数据库来源
	static {
		List<State> list=State.dao.find("select * from state");
		for (int i = 0; i < list.size(); i++) {
			resultCodeHashMap.put(list.get(i).getStateId(), list.get(i).getStateMsg());
		}
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
		this.message = resultCodeHashMap.get(code);
	}
	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
