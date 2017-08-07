package com.noitom.model;

import java.io.Serializable;

import com.noitom.constants.SSOConstants;


public class Json implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8196453207907708910L;
	public boolean success = false;
	public String code = SSOConstants.CODE_GENERAL_FAIL;
	public String message = SSOConstants.MSG_GENERAL_FAIL;
	public Object object;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
}
