package com.object.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.object.mapper.BaseMapper;

/**
 * 公共的Service接口父类
 * @author Administrator
 *
 * @param <T>
 */
public class BaseServiceImpl<T> {

	@Autowired
	private BaseMapper<T> mapper;
	
	/**
	 * 功能： 通过主键(id)查询信息
	 * 
	 */
	public T queryByKey(Serializable id) {
		return this.mapper.queryByKey(id);
	}

	/**
	 * 功能： 查询所有信息
	 * 
	 */
	public List<T> queryAll() {
		return this.mapper.queryAll();
	}

	/*
	 * public PageInfo<T> queryPageListByWhere(Integer page, Integer rows) { //
	 * 设置分页参数 PageHelper.startPage(page, rows); List<T> list =
	 * this.mapper.findAll(); return new PageInfo<T>(list); }
	 */

	/**
	 * 功能： 保存信息
	 * 
	 */
	public void insert(T t) {
		this.mapper.insert(t);
	}

	/**
	 * 功能： 修改信息
	 * 
	 */
	public void update(T t) {
		this.mapper.update(t);
	}

	/**
	 * 功能： 根据主键(id)删除信息
	 * 
	 */
	public void deleteByKey(Serializable id) {
		this.mapper.deleteByKey(id);
	}

}
