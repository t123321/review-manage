package com.object.mapper;

import java.io.Serializable;
import java.util.List;

import com.object.pojo.Admin;

/**
 * 操作管理员表的数据层
 * @author Administrator
 *
 */
public interface AdminMapper extends BaseMapper<Admin> {

	@Override
	List<Admin> queryAll();
	
	@Override
	Admin queryByKey(Serializable id);

	@Override
	void update(Admin t);

	@Override
	void insert(Admin t);

	@Override
	void deleteByKey(Serializable id);

    
}