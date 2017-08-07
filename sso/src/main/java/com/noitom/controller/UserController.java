package com.noitom.controller;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.noitom.constants.SSOConstants;
import com.noitom.model.Json;
import com.noitom.model.User;
import com.noitom.service.UserService;
import com.noitom.util.JsonValidator;
import com.noitom.util.RSAUtil;
import com.noitom.util.SnowflakeIdWorker;

/**
 * <p>
 * </p>
 * 
 * @author Eric.wang
 * @date 2017年3月28日
 * @version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Resource
	private UserService userService;
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String saveUser(String jsonData) {
		Json json = new Json();
		if(jsonData!=null){
			String userJson;
			try {
				userJson = RSAUtil.decryptByPrivateKey(jsonData);
				if(JsonValidator.validate(userJson)){
					User user = new User();
					try {
						user = JSON.parseObject(userJson, User.class);
						user.setId(SnowflakeIdWorker.getId());
						user.setCreateTime(new Timestamp(System.currentTimeMillis()));
						userService.saveUser(user);
						json.setSuccess(true);
						json.setMessage(SSOConstants.USER_SAVE_USER_SUCCESS);
						json.setCode(SSOConstants.CODE_GENERAL_SUCCESS);
						json.setObject(user.getId().toString());
					} catch (Exception e) {
						e.printStackTrace();
						json.setSuccess(false);
						json.setMessage(SSOConstants.USER_SAVE_USER_FAIL);
						json.setCode(SSOConstants.CODE_GENERAL_FAIL);
					}
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return JSON.toJSONString(json);
	}

	@RequestMapping(value="/changePwd",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String changePwd(String jsonData) {
		Json json = new Json();
		if(jsonData!=null){
			String userJson;
			try {
				userJson = RSAUtil.decryptByPrivateKey(jsonData);
				if(JsonValidator.validate(userJson)){
					User user = new User();
					user = JSON.parseObject(userJson, User.class);
					User tmpUser = userService.findOneUserByOldPassword(user);
					if(tmpUser!=null){
						userService.updatePassword(user);
						json.setSuccess(true);
						json.setMessage(SSOConstants.USER_CHANGE_PASSWORD_SUCCESS);
						json.setCode(SSOConstants.CODE_GENERAL_SUCCESS);
					}else{
						json.setSuccess(false);
						json.setMessage(SSOConstants.USER_CHANGE_PASSWORD_FAIL);
						json.setCode(SSOConstants.CODE_GENERAL_FAIL);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value="/changePwdByAdmin",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String changePwdByAdmin(String jsonData) {
		Json json = new Json();
		if(jsonData!=null){
			String userJson;
			try {
				userJson = RSAUtil.decryptByPrivateKey(jsonData);
				if(JsonValidator.validate(userJson)){
					User user = new User();
					user = JSON.parseObject(userJson, User.class);
					User tmpUser = userService.findOneUserById(user);
					if(tmpUser!=null){
						userService.updatePassword(user);
						json.setSuccess(true);
						json.setMessage(SSOConstants.USER_CHANGE_PASSWORD_SUCCESS);
						json.setCode(SSOConstants.CODE_GENERAL_SUCCESS);
					}else{
						json.setSuccess(false);
						json.setMessage(SSOConstants.USER_CHANGE_PASSWORD_FAIL);
						json.setCode(SSOConstants.CODE_GENERAL_FAIL);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value="/changeState",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String changeState(String jsonData) {
		Json json = new Json();
		if(jsonData!=null){
			String userJson;
			try {
				userJson = RSAUtil.decryptByPrivateKey(jsonData);
				if(JsonValidator.validate(userJson)){
					User user = new User();
					user = JSON.parseObject(userJson, User.class);
						try {
							userService.updateState(user);
							json.setSuccess(true);
							json.setMessage(SSOConstants.USER_CHANGE_STATE_SUCCESS);
							json.setCode(SSOConstants.CODE_GENERAL_SUCCESS);
						} catch (Exception e) {
							e.printStackTrace();
							json.setSuccess(false);
							json.setMessage(SSOConstants.USER_CHANGE_STATE_FAIL);
							json.setCode(SSOConstants.CODE_GENERAL_FAIL);
						}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return JSON.toJSONString(json);
	}
}