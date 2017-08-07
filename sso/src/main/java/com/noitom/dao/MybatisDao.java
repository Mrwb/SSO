package com.noitom.dao;

import java.util.List;
import java.util.Map;

public interface MybatisDao {
	/**
	 * 返回多个内容，并用List封装
	 * @author wangbo
	 * @date 2015-04-17 下午12:37:12
	 * @description
	 * @param key 
	 * @return
	 */
	public List queryForList(String key);
	/**
	 * 带参数查询多个内容，并用List封装
	 * @author wangbo
	 * @date 2015-04-17 下午12:37:38
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public List queryForList(String key, Object obj);
	/**
	 * 带分页机制的查询多个内容方法
	 * @author wangbo
	 * @date 2013-8-14 上午10:34:39
	 * @description
	 * @param key
	 * @param obj
	 * @param rowBounds
	 * @return
	 */
	public List queryForList(String key, Object obj,int pageStart,int pageSize);
	/**
	 * 查询出一个对象
	 * @author wangbo
	 * @date 2015-04-17 下午12:33:53
	 * @description
	 * @param key
	 * @return
	 */
	public Object queryForObject(String key);
	/**
	 * 带参数查询对象
	 * @author wangbo
	 * @date 2015-04-17 下午12:34:27
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public Object queryForObject(String key, Object obj);
	
	/**
	 * 根据ID查询对象
	 * @author wangbo
	 * @date 2015-04-17 下午12:34:27
	 * @description
	 * @param key
	 * @param ID
	 * @return
	 */
	public Object queryForId(String key, String id);
	/**
	 * 带参数查询，返回内容按照map封装返回，需指定返回map里的key值
	 * @author wangbo
	 * @date 2015-04-17 下午01:44:03
	 * @description 注意！map里的key值必须是不能重复的
	 * @param key
	 * @param obj
	 * @param column 以哪一列作为key
	 * @return
	 */
	public Map queryForMap(String key, Object obj, String column);
	/**
	 * 带分页机制，带参数查询，返回内容按照map封装返回，需指定返回map里的key值
	 * @author wangbo
	 * @date 2013-8-14 上午10:44:48
	 * @description
	 * @param key
	 * @param obj
	 * @param column
	 * @param rowBounds
	 * @return
	 */
	public Map queryForMap(String key, Object obj, String column,int pageStart,int pageSize);
	/**
	 * 不带参数，返回内容按照map封装返回，需指定返回map里的key值
	 * @author wangbo
	 * @date 2013-8-14 上午10:46:27
	 * @description
	 * @param key
	 * @param column
	 * @return
	 */
	public Map queryForMap(String key, String column);
	/**
	 * 不带参数内容，插入数据方法
	 * @author wangbo
	 * @date 2015-04-17 下午01:53:33
	 * @description
	 * @param key
	 * @return
	 */
	public int insertObj(String key);
	/**
	 * 按照传参内容，插入数据
	 * @author wangbo
	 * @date 2015-04-17 下午01:51:37
	 * @description 
	 * @param key
	 * @param obj
	 * @return
	 */
	public int insertObj(String key, Object obj);
	/**
	 * 更新数据
	 * @author wangbo
	 * @date 2015-04-17 下午01:54:37
	 * @description
	 * @param key
	 * @return
	 */
	public int updateObj(String key);
	/**
	 * 传参数更新数据
	 * @author wangbo
	 * @date 2015-04-17 下午01:54:54
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public int updateObj(String key, Object obj);
	/**
	 * 删除数据
	 * @author wangbo
	 * @date 2015-04-17 下午02:08:41
	 * @description
	 * @param key
	 * @return
	 */
	public int deleteObj(String key);
	/**
	 * 传参数删除数据
	 * @author wangbo
	 * @date 2015-04-17 下午02:08:52
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public int deleteObj(String key, Object obj);
	/**
	 * 根据id删除数据
	 * @author wangbo
	 * @date 2016-09-06 下午02:08:52
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public int deleteObjById(String key, Object obj);
	/**
	 * 统计计数
	 * @author wangbo
	 * @date 2016-09-06 下午02:08:52
	 * @description
	 * @param key
	 * @param obj
	 * @return
	 */
	public int queryForCount(String key, Object obj);
}
