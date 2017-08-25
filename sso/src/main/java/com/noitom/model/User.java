package com.noitom.model;

import java.sql.Timestamp;
import java.io.Serializable;

//
public class User implements Serializable {

	//
	private Long id;
	//用户名
	private String accountName;
	//邮箱地址
	private String email;
	//旧密码
	private String oldPassword;
	//密码
	private String password;
	//是否可用
	private Boolean enable;
	//创建时间
	private Timestamp createTime;

	public User(){
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return this.accountName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	
	public Boolean getEnable() {
		return this.enable;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	public Timestamp getCreateTime() {
		return this.createTime;
	}



}

