package com.noitom.constants;


public interface SSOConstants {
	// ----------- CODE ----------------------------
	final static String CODE_GENERAL_SUCCESS = "0x001";
	final static String CODE_GENERAL_FAIL = "0x002";
	final static String CODE_LOGIN_FAIL = "0x003";
	final static String PARAMETER_FAIL = "0x004";
	// ----------- MESSAGE -------------------------
	final static String MSG_GENERAL_FAIL = "请求处理失败";
	//-----------login message---------
	final static String ACCOUNT_NOT_EXIST = "Account does not exist";
	final static String MSG_ACCOUNT_LOGIN_FAIL="用户名、密码错误或账户已被冻结!";
	
	final static String SQL_EXCEPTION = "x0001";
	final static String FILENOTFOUNT_EXCEPTION = "x0002";
	final static String OPERATION_IS_SUCCESSFUL="操作成功!";
	final static String PARAMETER_EMPTY="参数为空!";
	final static String THE_OPERATION_FAILURE="操作失败!";
	final static String THE_OPERATION_FAILURE_P="操作失败,没有该角色.";
	final static String USER_CHANGE_PASSWORD_SUCCESS="用户密码修改成功";
	final static String USER_SAVE_USER_SUCCESS="添加新用户成功";
	final static String USER_SAVE_USER_FAIL="添加新用户失败";
	final static String USER_CHANGE_PASSWORD_FAIL="用户原密码错误";
	final static String USER_CHANGE_STATE_SUCCESS="用户状态修改成功";
	final static String USER_CHANGE_STATE_FAIL="用户状态修改失败";
	final static String USER_CHANGE_USERINFO_SUCCESS="用户信息修改成功";
	final static String USER_CHANGE_USERINFO_FAIL="用户信息修改失败";
	
}
