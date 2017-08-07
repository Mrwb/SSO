package com.noitom.dao;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class MybatisDaoImpl extends SqlSessionTemplate  implements MybatisDao {
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	public MybatisDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}
	public int deleteObj(String key) {
		return delete(key);
	}
	public int deleteObj(String key, Object obj) {
		return delete(key, obj);
	}
	public int insertObj(String key) {
		return insert(key);
	}
	public int insertObj(String key, Object obj) {
		return insert(key, obj);
	}
	public List queryForList(String key) {
		return selectList(key);
	}
	public List queryForList(String key, Object obj) {
		return selectList(key,obj);
	}
	public List queryForList(String key, Object obj, int pageStart,int pageSize) {
		return selectList(key,obj,new RowBounds(pageStart, pageSize));
	}
	
	public Map queryForMap(String key, Object obj, String column) {
		return selectMap(key, obj,column);
	}
	
	public Map queryForMap(String key, Object obj, String column,
			int pageStart,int pageSize) {
		return selectMap(key, obj,column,new RowBounds(pageStart, pageSize));
	}
	
	public Map queryForMap(String key, String column) {
		return selectMap(key, column);
	}
	
	public Object queryForObject(String key) {
		return selectOne(key);
	}
	
	public Object queryForObject(String key, Object obj) {
		return selectOne(key,obj);
	}
	
	public int updateObj(String key) {
		return update(key);
	}
	
	public int updateObj(String key, Object obj) {
		return update(key,obj);
	}
	
	public Object queryForId(String key, String id) {
		return selectOne(key,id);
	}
	
    public int queryForCount(String key, Object obj) {
	    return selectOne(key, obj);
	}
    
    public int deleteObjById(String key, Object obj) {
        return delete(key, obj);
    }
}
