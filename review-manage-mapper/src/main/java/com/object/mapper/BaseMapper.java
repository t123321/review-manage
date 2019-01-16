package com.object.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * 公共的Mapper接口父类
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseMapper<T> {

	/**
	 * 功能： 查询所有信息
	 * 
	 */
	public List<T> queryAll();
	
	/**
	 * 功能： 通过主键(id)查询信息
	 * 
	 */
	public T queryByKey(Serializable id);

	/**
	 * 功能： 修改信息
	 * 
	 */
	public void update(T t);

	/**
	 * 功能： 保存信息
	 * 
	 */
	public void insert(T t);

	/**
	 * 功能： 根据主键(id)删除信息
	 * 
	 */
	public void deleteByKey(Serializable id);

}