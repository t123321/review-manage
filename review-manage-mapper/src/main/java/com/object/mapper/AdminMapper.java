package com.object.mapper;

import java.io.Serializable;
import java.util.List;

import com.object.pojo.Admin;

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