package com.noitom.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.noitom.dao.MybatisDao;
import com.noitom.model.User;
/**
 * @version 1.0
 * @author wangbo
 * @date 2017-03-28 15:12
 * @email 1595905476(a)qq.com
 */
@Service
public class UserService  {
	
	@Resource(name = "dao")
	private MybatisDao dao;
	/**
	 * 保存User对象
	 * @param User
	 * @return 影响条数
	 */
	public int saveUser(User user){
		return dao.insertObj("UserMapper.insert", user);
	}
	
	
	/**
	 * 修改User对象
	 * @param User
	 * @return 影响条数
	 */
	public int updatePassword(User user){
		return dao.updateObj("UserMapper.updatePasswordById", user);
	}
	
	/**
	 * 获取User对象
	 * @param User
	 * @return User对象
	 */
	public User findOneUser(User user){
		User tmpuser = (User) dao.queryForObject("UserMapper.selectOneByCondition", user);
		return tmpuser;
	}


	public User findOneUserByOldPassword(User user) {
		User tmpuser = (User) dao.queryForObject("UserMapper.selectOneByOldPassword", user);
		return tmpuser;
	}


	public void updateState(User user) {
		dao.updateObj("UserMapper.updateStateById", user);
	}
	
	public void updateUserById(User user) {
		dao.updateObj("UserMapper.updateUserById", user);
	}


	public User findOneUserById(User user) {
		User tmpuser = (User) dao.queryForObject("UserMapper.selectOneById", user);
		return tmpuser;
	}
}