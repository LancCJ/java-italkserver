package com.lanccj.services.model;

import com.lanccj.services.framework.Responce;

public class LoginResponse extends Responce{

	private String userName;
    private String reaylName;
    private String phoneNum;

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReaylName() {
        return reaylName;
    }

    public void setReaylName(String reaylName) {
        this.reaylName = reaylName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
	
}
