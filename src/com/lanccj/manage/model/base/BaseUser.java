package com.lanccj.manage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Integer userId) {
		set("USER_ID", userId);
	}

	public java.lang.Integer getUserId() {
		return get("USER_ID");
	}

	public void setUserName(java.lang.String userName) {
		set("USER_NAME", userName);
	}

	public java.lang.String getUserName() {
		return get("USER_NAME");
	}

	public void setUserPwd(java.lang.String userPwd) {
		set("USER_PWD", userPwd);
	}

	public java.lang.String getUserPwd() {
		return get("USER_PWD");
	}

	public void setUserNick(java.lang.String userNick) {
		set("USER_NICK", userNick);
	}

	public java.lang.String getUserNick() {
		return get("USER_NICK");
	}

}