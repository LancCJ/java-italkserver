package com.lanccj.services.response;

import com.lanccj.services.model.User;

public class LoginResponse extends User{

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return super.toString()+"token='"+token.toString()+"'}";
    }
}
