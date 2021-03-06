package com.lanccj.manage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseState<M extends BaseState<M>> extends Model<M> implements IBean {

	public void setStateId(java.lang.Integer stateId) {
		set("STATE_ID", stateId);
	}

	public java.lang.Integer getStateId() {
		return get("STATE_ID");
	}

	public void setStateMsg(java.lang.String stateMsg) {
		set("STATE_MSG", stateMsg);
	}

	public java.lang.String getStateMsg() {
		return get("STATE_MSG");
	}

}
