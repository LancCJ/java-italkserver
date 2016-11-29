package com.lanccj.services.model;

public class LoginResponse {

	private String userName;
    private String reaylName;
    private String phoneNum;
    private String token;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "userName='" + userName + '\'' +
                ", reaylName='" + reaylName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
