package com.lanccj.services.response;

import com.lanccj.services.framework.Responce;

public class TestResponce extends Responce{
	private String time;
	private String user_id;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
